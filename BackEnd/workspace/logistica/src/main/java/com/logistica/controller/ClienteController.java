package com.logistica.controller;

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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.logistica.model.Cliente;
import com.logistica.service.IClienteService;
import java.util.*;

@RestController
/*@RequestMapping("/cliente")*/
public class ClienteController {
	@Autowired
	private IClienteService service;
	
	@GetMapping
	/*public List<Cliente> listar(){
		return service.Listar();
	}*/
	public ResponseEntity<List<Cliente>> listar(){
		List<Cliente> obj = service.Listar();
		return new ResponseEntity<List<Cliente>>(obj,HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<Cliente> crear(@RequestBody Cliente cliente){
		Cliente obj = service.crear(cliente);
		return new ResponseEntity<Cliente>(obj,HttpStatus.OK);
	}	
	@PutMapping
	public ResponseEntity<Cliente> actualizar(@RequestBody Cliente cliente){
		Cliente obj = service.actualizar(cliente);
		return new ResponseEntity<Cliente>(obj,HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id")Integer id) throws Exception{
		Cliente obj = service.listarPorId(id);
		if(obj ==null) {
			throw new Exception("No se encontro el ID");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Cliente>listarPorId(@PathVariable("id")Integer codigo)throws Exception{
		Cliente obj = service.listarPorId(codigo);
		if(obj ==null) {
			throw new Exception("No se encontro el ID");
		}
		return new ResponseEntity<Cliente>(obj,HttpStatus.OK);
	}
}
