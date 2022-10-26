package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Personas;


public interface PersonaServicio {

	public List <Personas> listarTodosLasPersonas();
	
	public Personas guardarPersonas(Personas personas);
	
	public Personas obtenerPersonasPorId(Long id);
	
	public Personas actualizarPersonas(Personas personas);
	
	public void eliminarPersonas(Long id);
}
