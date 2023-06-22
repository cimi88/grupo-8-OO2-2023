package com.unla.grupo8.converters;

import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.MedicionEstacionamiento;
import com.unla.grupo8.models.MedicionEstacionamientoModelo;

@Component("medicionEstacionamientoConverter")
public class MedicionEstacionamientoConverter {
	
	public MedicionEstacionamiento modelToEntity(MedicionEstacionamientoModelo medicionEstacionamientoModelo) {
		return new MedicionEstacionamiento(medicionEstacionamientoModelo.getId(), medicionEstacionamientoModelo.getFechaHoraRegistro(),
				medicionEstacionamientoModelo.getPatente(), medicionEstacionamientoModelo.isPresenciaVehiculo());
	}
	
	public MedicionEstacionamientoModelo entityToModel(MedicionEstacionamiento medicionEstacionamiento) {
		return new MedicionEstacionamientoModelo(medicionEstacionamiento.getId(), medicionEstacionamiento.getFechaHoraRegistro()
				, medicionEstacionamiento.getPatente(), medicionEstacionamiento.isPresenciaVehiculo());
	}
 
}
