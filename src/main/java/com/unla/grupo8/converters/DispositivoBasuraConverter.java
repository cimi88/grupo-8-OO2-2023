package com.unla.grupo8.converters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.DispositivoBasura;
import com.unla.grupo8.models.DispositivoBasuraModelo;
import com.unla.grupo8.repositories.IEspacioRepository;

@Component("dispositivoBasuraConverter")
public class DispositivoBasuraConverter {
	
	@Autowired
	@Qualifier("espacioRepository") 
	private IEspacioRepository espacioRepository;
	

	
		public DispositivoBasuraModelo entityToModel(DispositivoBasura dispoBasura) {
			return new DispositivoBasuraModelo (dispoBasura.getId(),dispoBasura.getNombre(),dispoBasura.getEspacio().getId(),dispoBasura.isLleno(),dispoBasura.getCapacidadLitros()) ;
		}
		
		public DispositivoBasura modelToEntity(DispositivoBasuraModelo dispositivoBasuraModelo) {
			return new DispositivoBasura (dispositivoBasuraModelo.getId(), dispositivoBasuraModelo.getNombre(), espacioRepository.findById(dispositivoBasuraModelo.getIdEspacio()),dispositivoBasuraModelo.isLleno(), 
					dispositivoBasuraModelo.getCapacidadLitros());
		}
}
