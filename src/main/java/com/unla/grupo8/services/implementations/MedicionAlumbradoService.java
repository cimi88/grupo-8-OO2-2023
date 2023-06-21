package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.MedicionAlumbradoConverter;
import com.unla.grupo8.entities.MedicionAlumbrado;
import com.unla.grupo8.models.MedicionAlumbradoModelo;
import com.unla.grupo8.repositories.IMedicionAlumbradoRepository;
import com.unla.grupo8.services.IMedicionAlumbradoService;

@Service("medicionAlumbradoService")
public class MedicionAlumbradoService implements IMedicionAlumbradoService{

	@Autowired
	@Qualifier("medicionAlumbradoRepository")
	private IMedicionAlumbradoRepository medicionAlumbradoRepository;
	
	@Autowired
	@Qualifier("medicionAlumbradoConverter")
	private MedicionAlumbradoConverter medicionAlumbradoConverter;

	@Override
	public List<MedicionAlumbrado> getAll() {
		return medicionAlumbradoRepository.findAll();
	}

	@Override
	public MedicionAlumbradoModelo insertOrUpdate(MedicionAlumbradoModelo medAluMod) {
		
		MedicionAlumbrado medAlu = medicionAlumbradoRepository.save(medicionAlumbradoConverter.modelToEntity(medAluMod));
		
		return medicionAlumbradoConverter.entityToModel(medAlu);
		
	} 

	@Override
	public MedicionAlumbradoModelo traerPorId(int id) {
		return medicionAlumbradoConverter.entityToModel(medicionAlumbradoRepository.findById(id));
	}
	
	@Override
	public boolean remove(int id) {
		
		try {
			medicionAlumbradoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
