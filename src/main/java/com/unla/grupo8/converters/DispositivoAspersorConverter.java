package com.unla.grupo8.converters;

import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.DispositivoAspersor;
import com.unla.grupo8.models.DispositivoAspersorModelo;

@Component("dispositivoAspersorConverter")
public class DispositivoAspersorConverter {
	
	public DispositivoAspersorModelo entityToModel(DispositivoAspersor aspersor) {
		return new DispositivoAspersorModelo(aspersor.getId(), aspersor.getNombre(), aspersor.isEncendido(), aspersor.getFechaHoraDesde(), aspersor.getFechaHoraHasta());
	}
	
	public DispositivoAspersor modelToEntity(DispositivoAspersorModelo aspersorModelo) {
		return new DispositivoAspersor(aspersorModelo.getId(), aspersorModelo.getNombre(), aspersorModelo.isEncendido(), aspersorModelo.getFechaHoraDesde(), aspersorModelo.getFechaHoraHasta());
	}
}
 