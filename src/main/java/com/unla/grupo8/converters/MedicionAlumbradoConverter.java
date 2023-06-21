package com.unla.grupo8.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.MedicionAlumbrado;
import com.unla.grupo8.models.MedicionAlumbradoModelo;
import com.unla.grupo8.repositories.IDispositivoAlumbradoRepository;

@Component("medicionAlumbradoConverter")
public class MedicionAlumbradoConverter {
	
	@Autowired
	@Qualifier("dispositivoAlumbradoRepository")
	private IDispositivoAlumbradoRepository dispositivoAlumbradoRepository;
	
	public MedicionAlumbradoModelo entityToModel(MedicionAlumbrado medAlu) {
		return new MedicionAlumbradoModelo(medAlu.getId(), medAlu.getDispositivo().getId(), medAlu.getFechaHoraRegistro(), medAlu.getLuminiscencia());
	}
	
	public MedicionAlumbrado modelToEntity(MedicionAlumbradoModelo medAluMod) {
		return new MedicionAlumbrado(medAluMod.getId(), dispositivoAlumbradoRepository.findById(medAluMod.getIdDispositivo()), medAluMod.getFechaHoraRegistro(), medAluMod.getLuminiscencia());
	}
	
}
