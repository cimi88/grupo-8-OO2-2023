package com.unla.grupo8.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.DispositivoEstacionamiento;
import com.unla.grupo8.models.DispositivoEstacionamientoModelo;


//int id, String nombre, Espacio espacio, Lugar lugar
@Component("dispositivoEstacionamientoConverter")
public class DispositivoEstacionamientoConverter {
	@Autowired
	@Qualifier("lugarConverter")
	private LugarConverter lugarConverter;
	
	@Autowired
	@Qualifier("espacioConverter")
	private EspacioConverter espacioConverter;
	
	public DispositivoEstacionamiento modelToEntity(DispositivoEstacionamientoModelo dispo) {
		return new DispositivoEstacionamiento(dispo.getId(), dispo.getNombre(), espacioConverter.modelToEntity(dispo.getEspacioModelo()), lugarConverter.modelToEntity(dispo.getLugar()));
	}
	
	public DispositivoEstacionamientoModelo entityToModel(DispositivoEstacionamiento dispo) {
		return new DispositivoEstacionamientoModelo(dispo.getId(), dispo.getNombre(), espacioConverter.entityToModel(dispo.getEspacio()), lugarConverter.entityToModel(dispo.getLugar()));
	}
 
}
 