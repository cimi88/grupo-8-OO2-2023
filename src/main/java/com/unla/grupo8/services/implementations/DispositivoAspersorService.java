package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.DispositivoAspersorConverter;
import com.unla.grupo8.entities.DispositivoAspersor;
import com.unla.grupo8.models.DispositivoAspersorModelo;
import com.unla.grupo8.repositories.IDispositivoAspersorRepository;
import com.unla.grupo8.services.IDispositivoAspersorService;

@Service("dispositivoAspersorService")
public class DispositivoAspersorService implements IDispositivoAspersorService {
	
	@Autowired @Qualifier("dispositivoAspersorRepository")
	private IDispositivoAspersorRepository dispositivoAspersorRepository;
	
	@Autowired @Qualifier("dispositivoAspersorConverter")
	private DispositivoAspersorConverter dispositivoAspersorConverter;

	
	public DispositivoAspersorModelo traerPorId(int id) {
		return dispositivoAspersorConverter.entityToModel(dispositivoAspersorRepository.findById(id));
	}
	
	@Override
	public List<DispositivoAspersor> getAll() {
		return dispositivoAspersorRepository.findAll();
	}

	@Override
	public DispositivoAspersorModelo insertOrUpdate(DispositivoAspersorModelo aspersorModelo) {
		DispositivoAspersor dispAspersor = dispositivoAspersorRepository.save(dispositivoAspersorConverter.modelToEntity(aspersorModelo));
		return dispositivoAspersorConverter.entityToModel(dispAspersor);
	}

	@Override
	public boolean remove(int id) {
		boolean res;
		try {
			res = true;
			dispositivoAspersorRepository.deleteById(id);
		} catch (Exception e){
			res = false;
		}
		return res;
	}

	@Override
	public boolean baja(int id) {
		boolean res = true;
		DispositivoAspersor dispositivoAspersor = dispositivoAspersorRepository.findById(id);
		
		if(dispositivoAspersor.isEnAlta()) {
			dispositivoAspersor.setEnAlta(false);
			dispositivoAspersorRepository.save(dispositivoAspersor);
		} else {
			dispositivoAspersor.setEnAlta(true);
			dispositivoAspersorRepository.save(dispositivoAspersor);
		}
		
		return res;
	}
}
