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
<<<<<<< HEAD
public class EspacioService implements IEspacioService{
	@Autowired 
	@Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;
	
=======
public class EspacioService implements IEspacioService {
	@Autowired
	@Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;

>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
	@Autowired
	@Qualifier("espacioConverter")
	private EspacioConverter espacioConverter;

	@Override
	public List<Espacio> getAll() {
<<<<<<< HEAD
		// TODO Auto-generated method stub
=======
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
		return espacioRepository.findAll();
	}

	@Override
	public EspacioModelo traerPorId(int id) {
<<<<<<< HEAD
		// TODO Auto-generated method stub
		return espacioConverter.entityToModel(espacioRepository.findById(id));
	}
}
=======
		return espacioConverter.entityToModel(espacioRepository.findById(id));
	}
}
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
