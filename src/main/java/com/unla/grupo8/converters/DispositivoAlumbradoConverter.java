package com.unla.grupo8.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.DispositivoAlumbrado;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;
import com.unla.grupo8.repositories.IEspacioRepository;

@Component("dispositivoAlumbradoConverter")
public class DispositivoAlumbradoConverter {
	
	@Autowired
	@Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository;
	
	//por ahora se cargara sin las listas
	public DispositivoAlumbradoModelo entityToModel(DispositivoAlumbrado dispoAlum) {
		return new DispositivoAlumbradoModelo (dispoAlum.getId(), dispoAlum.getNombre(), dispoAlum.getEspacio().getId(), dispoAlum.isEncendido(), dispoAlum.getPotencia(), dispoAlum.getSenda(), dispoAlum.getNumeracion()) ;
	}
	
	public DispositivoAlumbrado modelToEntity(DispositivoAlumbradoModelo dispoAlumModel) {
		return new DispositivoAlumbrado (dispoAlumModel.getId(), dispoAlumModel.getNombre(), espacioRepository.findById(dispoAlumModel.getIdEspacio()), dispoAlumModel.isEncendido(),
				dispoAlumModel.getPotencia(), dispoAlumModel.getSenda(), dispoAlumModel.getNumeracion());
	}

}
