package com.logistica.service;
import java.util.*;
import com.logistica.model.Cliente;
public interface IClienteService {
	List<Cliente> Listar();
	Cliente crear(Cliente cliente);
	Cliente actualizar(Cliente cliente);
	void eliminar(Integer codigo);
	Cliente listarPorId(Integer codigo);
}
