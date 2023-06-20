
package com.logistica.service;

import java.util.List;

import com.logistica.model.MedioAlmacenamiento;
public interface IMedioAlmacenamientoService {
	List<MedioAlmacenamiento> Listar();
	MedioAlmacenamiento crear(MedioAlmacenamiento medioAlmacenamiento);
	MedioAlmacenamiento actualizar(MedioAlmacenamiento medioAlmacenamiento);
	void eliminar(Integer codigo);
	MedioAlmacenamiento listarPorId(Integer codigo);
}

