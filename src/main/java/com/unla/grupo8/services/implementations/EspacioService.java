package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.EspacioConverter;

import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.models.EspacioModelo;
import com.unla.grupo8.repositories.IEspacioRepository;
import com.unla.grupo8.services.IEspacioService;

@Service("espacioService")
public class EspacioService implements IEspacioService{
	@Autowired 
	@Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;
	
	@Autowired
	@Qualifier("espacioConverter")
	private EspacioConverter espacioConverter;

	@Override
	public List<Espacio> getAll() {
		// TODO Auto-generated method stub
		return espacioRepository.findAll();
	}

	@Override
	public EspacioModelo traerPorId(int id) {
		return espacioConverter.entityToModel(espacioRepository.findById(id));
	}
}