package com.logistica.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.logistica.model.Cliente;
import com.logistica.repository.IClienteRepository;
import com.logistica.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	IClienteRepository repo;
	@Override
	public List<Cliente> Listar() {
		
		return repo.findAll();
		
		 

	}

	@Override
	public Cliente crear(Cliente cliente) {

		return repo.save(cliente);
	}

	@Override
	public Cliente actualizar(Cliente cliente) {

		return repo.save(cliente);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Cliente listarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

}
