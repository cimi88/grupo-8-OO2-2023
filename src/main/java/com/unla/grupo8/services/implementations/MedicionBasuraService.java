package com.unla.grupo8.services.implementations;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;


import com.unla.grupo8.converters.MedicionBasuraConverter;

import com.unla.grupo8.entities.MedicionBasura;

import com.unla.grupo8.models.MedicionBasuraModelo;
import com.unla.grupo8.repositories.IMedicionBasuraRepository;
import com.unla.grupo8.services.IMedicionBasuraService;


@Service("medicionBasuraService")
public class MedicionBasuraService implements IMedicionBasuraService {
	
	@Autowired
	@Qualifier("medicionBasuraRepository")
	private IMedicionBasuraRepository medicionBasuraRepository;
	
	@Autowired
	@Qualifier("medicionBasuraConverter")
	private MedicionBasuraConverter medicionBasuraConverter;
	
	@Override
	public List<MedicionBasura> getAll() {
		return medicionBasuraRepository.findAll();
	}
	
	public MedicionBasuraModelo traerPorId(int id) {
		
		return medicionBasuraConverter.entityToModel(medicionBasuraRepository.findById(id));
		
	}

	public MedicionBasuraModelo insertOrUpdate(MedicionBasuraModelo medBasModelo) {
		
		MedicionBasura medBasura = medicionBasuraRepository.save(medicionBasuraConverter.modelToEntity(medBasModelo));
		
		return medicionBasuraConverter.entityToModel(medBasura);
		
	}
	
	
	public boolean remove(int id) {
		
		try {
			medicionBasuraRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
