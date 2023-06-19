package com.unla.grupo8.services.implementations;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.DispositivoBasuraConverter;
import com.unla.grupo8.entities.DispositivoBasura;
import com.unla.grupo8.models.DispositivoBasuraModelo;
import com.unla.grupo8.repositories.IDispositivoBasuraRepository;
import com.unla.grupo8.services.IDispositivoBasuraService;

@Service("dispositivoBasuraService")
public class DispositivoBasuraService implements IDispositivoBasuraService {
	@Autowired
	@Qualifier("dispositivoBasuraRepository")
	private IDispositivoBasuraRepository dispositivoBasuraRepository;
	
	@Autowired
	@Qualifier("dispositivoBasuraConverter")
	private DispositivoBasuraConverter dispositivoBasuraConverter;
	
	@Override
	public List<DispositivoBasura> getAll(){
		return dispositivoBasuraRepository.findAll();
	}
	
	public DispositivoBasuraModelo traerPorId(int id) {
		
		return dispositivoBasuraConverter.entityToModel(dispositivoBasuraRepository.findById(id));
		
	};
	
	@Override
	public DispositivoBasuraModelo insertOrUpdate(DispositivoBasuraModelo dispAlumbradoModelo) {
		
		DispositivoBasura dispAlumbrado = dispositivoBasuraRepository.save(dispositivoBasuraConverter.modelToEntity(dispAlumbradoModelo));
		
		return dispositivoBasuraConverter.entityToModel(dispAlumbrado);
	}
	
	@Override
	public boolean remove(int id) {
		
		try {
			dispositivoBasuraRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
