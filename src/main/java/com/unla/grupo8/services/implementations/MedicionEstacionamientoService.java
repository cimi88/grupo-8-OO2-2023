package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.MedicionEstacionamientoConverter;
import com.unla.grupo8.entities.MedicionEstacionamiento;
import com.unla.grupo8.models.MedicionEstacionamientoModelo;
import com.unla.grupo8.repositories.IMedicionEstacionamientoRepository;
import com.unla.grupo8.services.IMedicionEstacionamientoService;

@Service("medicionEstacionamientoService") 
public class MedicionEstacionamientoService implements IMedicionEstacionamientoService{
	
	@Autowired
	@Qualifier("medicionEstacionamientoRepository")
	private IMedicionEstacionamientoRepository medicionEstacionamientoRepository;
	
	@Autowired
	@Qualifier("medicionEstacionamientoConverter")
	private MedicionEstacionamientoConverter medicionEstacionamientoConverter;
 
	@Override
	public MedicionEstacionamientoModelo traerPorId(int id) {
		// TODO Auto-generated method stub
		return medicionEstacionamientoConverter.entityToModel(medicionEstacionamientoRepository.findById(id));
	}

	@Override
	public List<MedicionEstacionamiento> getAll() {
		// TODO Auto-generated method stub
		return medicionEstacionamientoRepository.findAll();
	}

	@Override
	public MedicionEstacionamientoModelo insertOrUpdate(MedicionEstacionamientoModelo medicionEstacionamientoModelo) {
		// TODO Auto-generated method stub
		return medicionEstacionamientoConverter.entityToModel(medicionEstacionamientoRepository.save(medicionEstacionamientoConverter.modelToEntity(medicionEstacionamientoModelo)));
	} 
	
	

}
