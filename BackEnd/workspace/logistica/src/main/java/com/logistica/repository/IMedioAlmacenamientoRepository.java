package com.logistica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logistica.model.MedioAlmacenamiento;

public interface IMedioAlmacenamientoRepository extends JpaRepository<MedioAlmacenamiento , Integer>{
	
}
