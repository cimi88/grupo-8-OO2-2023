package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.DispositivoEstacionamientoConverter;
import com.unla.grupo8.entities.DispositivoEstacionamiento;
import com.unla.grupo8.models.DispositivoEstacionamientoModelo;
import com.unla.grupo8.repositories.IDispositivoEstacionamientoRepository;
import com.unla.grupo8.services.IDispositivoEstacionamientoService;

import jakarta.transaction.Transactional;

@Service("dispositivoEstacionamientoService")
public class DispositivoEstacionamientoService implements IDispositivoEstacionamientoService{
	
	@Autowired
	@Qualifier("dispositivoEstacionamientoConverter")
	private DispositivoEstacionamientoConverter dispositivoEstacionamientoConverter;
	 
	@Autowired 
	@Qualifier("dispositivoEstacionamientoRepository")
	private IDispositivoEstacionamientoRepository dispositivoEstacionamientoRepository;

	@Override
	public List<DispositivoEstacionamiento> getAll() {
		// TODO Auto-generated method stub
		return dispositivoEstacionamientoRepository.findAll();
	} 

	@Override
	public DispositivoEstacionamientoModelo traerPorId(int id) { 
		// TODO Auto-generated method stub
		return dispositivoEstacionamientoConverter.entityToModel(dispositivoEstacionamientoRepository.findDispositivoEstacionamientoWithEspacioAndLugar(id));
	}

	@Override
	@Transactional 
	public DispositivoEstacionamientoModelo insertOrUpdate(DispositivoEstacionamientoModelo dispositivo) {
		DispositivoEstacionamiento dispositivoEstacionamiento = dispositivoEstacionamientoRepository.save(dispositivoEstacionamientoConverter.modelToEntity(dispositivo));
		return dispositivoEstacionamientoConverter.entityToModel(dispositivoEstacionamiento);
	}  

	

	
	

}
 