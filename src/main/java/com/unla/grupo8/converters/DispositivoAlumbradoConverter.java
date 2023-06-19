package com.unla.grupo8.converters;

import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.DispositivoAlumbrado;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;

@Component("dispositivoAlumbradoConverter")
public class DispositivoAlumbradoConverter {
	
	public DispositivoAlumbradoModelo entityToModel(DispositivoAlumbrado dispoAlum) {
		return new DispositivoAlumbradoModelo (dispoAlum.getId(), dispoAlum.getNombre(), dispoAlum.isEncendido(), dispoAlum.getPotencia(), dispoAlum.getSenda(), dispoAlum.getNumeracion()) ;
	}
	
	public DispositivoAlumbrado modelToEntity(DispositivoAlumbradoModelo dispoAlumModel) {
		return new DispositivoAlumbrado (dispoAlumModel.getId(), dispoAlumModel.getNombre(), dispoAlumModel.isEncendido(), 
				dispoAlumModel.getPotencia(), dispoAlumModel.getSenda(), dispoAlumModel.getNumeracion());
	} 
}
