package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Service;
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1

import com.unla.grupo8.converters.EspacioConverter;

import com.unla.grupo8.entities.Espacio;
<<<<<<< HEAD
import com.unla.grupo8.entities.Lugar;
import com.unla.grupo8.models.EspacioModelo;
import com.unla.grupo8.models.LugarModelo;
import com.unla.grupo8.repositories.IEspacioRepository;
import com.unla.grupo8.services.IEspacioService;


public class EspacioService implements IEspacioService{
	@Autowired 
	@Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;
	
=======
import com.unla.grupo8.models.EspacioModelo;
import com.unla.grupo8.repositories.IEspacioRepository;
import com.unla.grupo8.services.IEspacioService;

@Service("espacioService")

public class EspacioService implements IEspacioService {
	@Autowired
	@Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;


>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
	@Autowired
	@Qualifier("espacioConverter")
	private EspacioConverter espacioConverter;

	@Override
	public List<Espacio> getAll() {
		// TODO Auto-generated method stub
		return espacioRepository.findAll();
<<<<<<< HEAD
	} 
=======
	}
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1

	@Override
	public EspacioModelo traerPorId(int id) {
		// TODO Auto-generated method stub
		return espacioConverter.entityToModel(espacioRepository.findById(id));
	}
<<<<<<< HEAD

	@Override
	public EspacioModelo insertOrUpdate(EspacioModelo espacioModelo) {
		Espacio espacio = espacioRepository.save(espacioConverter.modelToEntity(espacioModelo));
		return espacioConverter.entityToModel(espacio);
	}
	
	
}
=======
}

>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
