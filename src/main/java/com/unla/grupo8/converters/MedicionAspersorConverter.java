package com.unla.grupo8.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.MedicionAspersor;
import com.unla.grupo8.models.MedicionAspersorModelo;
import com.unla.grupo8.repositories.IDispositivoAspersorRepository;

@Component("medicionAspersorConverter")
public class MedicionAspersorConverter {
	@Autowired
	@Qualifier("dispositivoAspersorRepository")
	private IDispositivoAspersorRepository dispositivoAspersorRepository;
	
	public MedicionAspersorModelo entityToModel(MedicionAspersor medAsp) {
		return new MedicionAspersorModelo(medAsp.getId(), medAsp.getDispositivo().getId(), medAsp.getFechaHoraRegistro(), medAsp.getHumedad());
	}
	
	public MedicionAspersor modelToEntity(MedicionAspersorModelo medAspMod) {
		return new MedicionAspersor(medAspMod.getId(), dispositivoAspersorRepository.findById(medAspMod.getIdDispositivo()), medAspMod.getFechaHoraRegistro(), medAspMod.getHumedad());
	}
}
