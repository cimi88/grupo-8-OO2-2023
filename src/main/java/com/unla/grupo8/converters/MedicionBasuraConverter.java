package com.unla.grupo8.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.MedicionBasura;
import com.unla.grupo8.models.MedicionBasuraModelo;
import com.unla.grupo8.repositories.IDispositivoBasuraRepository;
@Component("medicionBasuraConverter")
public class MedicionBasuraConverter {
	@Autowired
	@Qualifier("dispositivoBasuraRepository")
	private IDispositivoBasuraRepository dispositivoBasuraRepository;
	
	public MedicionBasuraModelo entityToModel(MedicionBasura medBas) {
		return new MedicionBasuraModelo(medBas.getId(), medBas.getDispositivo().getId(), medBas.getFechaHoraRegistro(), medBas.getLitrosOcupados());
	}
	
	public MedicionBasura modelToEntity(MedicionBasuraModelo medBasMod) {
		return new MedicionBasura(medBasMod.getId(), dispositivoBasuraRepository.findById(medBasMod.getIdDispositivo()), medBasMod.getFechaHoraRegistro(), medBasMod.getLitrosOcupados());
	}
}
