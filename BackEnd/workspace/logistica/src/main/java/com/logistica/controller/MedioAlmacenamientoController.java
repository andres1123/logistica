package com.logistica.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.logistica.model.MedioAlmacenamiento;
import com.logistica.service.IMedioAlmacenamientoService;

@RestController
@RequestMapping("/medioAlmacenamiento")
public class MedioAlmacenamientoController {
	@Autowired
	IMedioAlmacenamientoService service;
	@GetMapping
	public ResponseEntity<List<MedioAlmacenamiento>> listar(){
		List<MedioAlmacenamiento> obj = service.Listar();
		return new ResponseEntity<List<MedioAlmacenamiento>>(obj,HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<Void> crear(@RequestBody MedioAlmacenamiento medioAlmacenamiento){
		
		MedioAlmacenamiento obj = service.crear(medioAlmacenamiento);
		URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdMedioAlmacenamiento()).toUri();
		return  ResponseEntity.created(uri).build();
	}
	@PutMapping
	public ResponseEntity<MedioAlmacenamiento> actualizar(@RequestBody MedioAlmacenamiento MedioAlmacenamiento){
		MedioAlmacenamiento obj = service.actualizar(MedioAlmacenamiento);
		return new ResponseEntity<MedioAlmacenamiento>(obj,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id")Integer id) throws Exception{
		MedioAlmacenamiento obj = service.listarPorId(id);
		if(obj ==null) {
			throw new Exception("No se encontro el ID");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	@GetMapping("/{id}")
	public ResponseEntity<MedioAlmacenamiento>listarPorId(@PathVariable("id")Integer codigo)throws Exception{
		MedioAlmacenamiento obj = service.listarPorId(codigo);
		if(obj ==null) {
			throw new Exception("No se encontro el ID");
		}
		return new ResponseEntity<MedioAlmacenamiento>(obj,HttpStatus.OK);
	}
}
