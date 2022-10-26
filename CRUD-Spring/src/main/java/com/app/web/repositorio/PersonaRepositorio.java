package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Personas;

@Repository
public interface PersonaRepositorio extends JpaRepository<Personas, Long>{

}
