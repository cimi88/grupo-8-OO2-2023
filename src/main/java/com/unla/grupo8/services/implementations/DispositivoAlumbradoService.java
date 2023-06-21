package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.DispositivoAlumbradoConverter;
import com.unla.grupo8.entities.DispositivoAlumbrado;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.repositories.IDispositivoAlumbradoRepository;
import com.unla.grupo8.services.IDispositivoAlumbradoService;

@Service("dispositivoAlumbradoService")
public class DispositivoAlumbradoService implements IDispositivoAlumbradoService {
	
	@Autowired
	@Qualifier("dispositivoAlumbradoRepository")
	private IDispositivoAlumbradoRepository dispositivoAlumbradoRepository;
	
	@Autowired
	@Qualifier("dispositivoAlumbradoConverter")
	private DispositivoAlumbradoConverter dispositivoAlumbradoConverter;
	
	@Override
	public List<DispositivoAlumbrado> getAll(){
		return dispositivoAlumbradoRepository.findAll();
	}
	
	public DispositivoAlumbradoModelo traerPorId(int id) {
		
		return dispositivoAlumbradoConverter.entityToModel(dispositivoAlumbradoRepository.findById(id));
		
	};
	
	@Override
	public DispositivoAlumbradoModelo insertOrUpdate(DispositivoAlumbradoModelo dispAlumbradoModelo) {
		
		DispositivoAlumbrado dispAlumbrado = dispositivoAlumbradoRepository.save(dispositivoAlumbradoConverter.modelToEntity(dispAlumbradoModelo));
		
		return dispositivoAlumbradoConverter.entityToModel(dispAlumbrado);
	}
	
	@Override
	public boolean remove(int id) {
		
		try {
			dispositivoAlumbradoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean baja(int id) {
		
		boolean aux = true;
		
		DispositivoAlumbrado dispositivoAlumbrado = dispositivoAlumbradoRepository.findById(id);
     
		if(dispositivoAlumbrado.isEnAlta() == true) {
			dispositivoAlumbrado.setEnAlta(false);
			dispositivoAlumbradoRepository.save(dispositivoAlumbrado);
        }else {
        	dispositivoAlumbrado.setEnAlta(true);
        	dispositivoAlumbradoRepository.save(dispositivoAlumbrado);
        }

		return aux;
	}

}
