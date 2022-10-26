package com.app.web.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.web.entidad.Personas;
import com.app.web.servicio.PersonaServicio;

@Controller
public class PersonaControlador {

	@Autowired
	private PersonaServicio servicio;

	@GetMapping("/personas")
	public String listarPersonas(Model modelo) {
		modelo.addAttribute("personas", servicio.listarTodosLasPersonas());
		return "personas";
	}

	@GetMapping("/personas/nuevo")
	public String MostrarFormularioDeRegistrarPersonas(Model modelo) {
		Personas persona = new Personas();
		modelo.addAttribute("personas", persona);
		return "crear_personas";

	}

	@PostMapping("/personas")
	public String guardarPersonas(@ModelAttribute("personas") Personas personas) {
		servicio.guardarPersonas(personas);
		return "redirect:/personas";
	}

	@GetMapping("/personas/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("personas", servicio.obtenerPersonasPorId(id));
		return "editar_personas";
	}

	@PostMapping("/personas/{id}")
	public String actualizarPersonas(@PathVariable Long id, @ModelAttribute("personas") Personas personas,Model modelo) {
		Personas pesonasExistente = servicio.obtenerPersonasPorId(id);
		pesonasExistente.setId(id);
		personas.setNombre(personas.getNombre());
		personas.setApellido(personas.getApellido());
		personas.setEmail(personas.getEmail());

		servicio.actualizarPersonas(personas);
		return "redirect:/personas";
	}

	@GetMapping("/personas/{id}")
	public String eliminarPersonas(@PathVariable Long id) {
		servicio.eliminarPersonas(id);
		return "redirect:/personas";
	}
	
	

}
