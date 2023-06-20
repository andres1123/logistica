package com.logistica.service.impl;
import com.logistica.service.IMedioAlmacenamientoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.logistica.model.MedioAlmacenamiento;
import com.logistica.repository.IMedioAlmacenamientoRepository;

@Service
public class MedioAlmacenamientoServiceImpl implements IMedioAlmacenamientoService{
	@Autowired
	IMedioAlmacenamientoRepository repo;
	@Override
	public List<MedioAlmacenamiento> Listar() {
		return repo.findAll();
	}

	@Override
	public MedioAlmacenamiento crear(MedioAlmacenamiento medioAlmacenamiento) {
		return repo.save(medioAlmacenamiento);
	}

	@Override
	public MedioAlmacenamiento actualizar(MedioAlmacenamiento medioAlmacenamiento) {
		return repo.save(medioAlmacenamiento);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
	}

	@Override
	public MedioAlmacenamiento listarPorId(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

}
