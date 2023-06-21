package com.unla.grupo8.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.DispositivoAspersor;
import com.unla.grupo8.models.DispositivoAspersorModelo;
import com.unla.grupo8.repositories.IEspacioRepository;

@Component("dispositivoAspersorConverter")
public class DispositivoAspersorConverter {
	
	@Autowired @Qualifier("espacioRepository")
	private IEspacioRepository espacioRepository; 
	
	public DispositivoAspersorModelo entityToModel(DispositivoAspersor aspersor) {
		return new DispositivoAspersorModelo(aspersor.getId(), aspersor.getNombre(), aspersor.getEspacios().getId(), aspersor.isEncendido(), aspersor.getFechaHoraDesde(), aspersor.getFechaHoraHasta());
	}
	
	public DispositivoAspersor modelToEntity(DispositivoAspersorModelo aspersorModelo) {
		return new DispositivoAspersor(aspersorModelo.getId(), aspersorModelo.getNombre(), espacioRepository.findById(aspersorModelo.getIdEspacio()), aspersorModelo.isEncendido(), aspersorModelo.getFechaHoraDesde(), aspersorModelo.getFechaHoraHasta());
	}
}
 