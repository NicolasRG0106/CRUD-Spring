package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Personas;
import com.app.web.repositorio.PersonaRepositorio;

@Service
public class PersonaServicioImpl implements PersonaServicio {

	@Autowired
	private PersonaRepositorio repositorio;

	@Override
	public List<Personas> listarTodosLasPersonas() {
		return repositorio.findAll();
	}

	@Override
	public Personas guardarPersonas(Personas personas) {
		return repositorio.save(personas);
	}

	@Override
	public Personas obtenerPersonasPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Personas actualizarPersonas(Personas personas) {
		return repositorio.save(personas);
	}

	@Override
	public void eliminarPersonas(Long id) {
		repositorio.deleteById(id);

	}

}
