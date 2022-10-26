package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Personas;
import com.app.web.repositorio.PersonaRepositorio;

@SpringBootApplication
public class CrudSpringApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Autowired
	private PersonaRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
	/*	
		Personas persona1 = new Personas("nicolas", "rivera", "nico@gmail.com");
		repositorio.save(persona1);
		
		Personas persona2 = new Personas("juan", "jochimilca", "jochi@gmail.com");
		repositorio.save(persona2);*/
		
	}
	

}
