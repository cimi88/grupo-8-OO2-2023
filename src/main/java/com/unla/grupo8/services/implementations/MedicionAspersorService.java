package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.MedicionAspersorConverter;
import com.unla.grupo8.entities.MedicionAspersor;
import com.unla.grupo8.models.MedicionAspersorModelo;
import com.unla.grupo8.repositories.IMedicionAspersorRepository;
import com.unla.grupo8.services.IMedicionAspersorService;

@Service("medicionAspersorService")
public class MedicionAspersorService implements IMedicionAspersorService {
	
	@Autowired
	@Qualifier("medicionAspersorRepository")
	private IMedicionAspersorRepository medicionAspersorRepository;
	
	@Autowired
	@Qualifier("medicionAspersorConverter")
	private MedicionAspersorConverter medicionAspersorConverter;
	
	@Override
	public List<MedicionAspersor> getAll() {
		return medicionAspersorRepository.findAll();
	}

	@Override
	public MedicionAspersorModelo insertOrUpdate(MedicionAspersorModelo medAspMod) {
		MedicionAspersor medAsp = medicionAspersorRepository.save(medicionAspersorConverter.modelToEntity(medAspMod));
		return medicionAspersorConverter.entityToModel(medAsp);
	} 

	@Override
	public MedicionAspersorModelo traerPorId(int id) {
		return medicionAspersorConverter.entityToModel(medicionAspersorRepository.findById(id));
	}
	
	@Override
	public boolean remove(int id) {
		try {
			medicionAspersorRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
