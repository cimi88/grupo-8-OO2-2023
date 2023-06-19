package com.unla.grupo8.converters;
import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.DispositivoBasura;
import com.unla.grupo8.models.DispositivoBasuraModelo;

@Component("dispositivoBasuraConverter")
public class DispositivoBasuraConverter {
	//por ahora se cargara sin las listas
		public DispositivoBasuraModelo entityToModel(DispositivoBasura dispoBasura) {
			return new DispositivoBasuraModelo (dispoBasura.getId(), dispoBasura.getNombre(), dispoBasura.isEnAlta(), dispoBasura.isLleno(), 
					dispoBasura.getCapacidadLitros()) ;
		}
		
		public DispositivoBasura modelToEntity(DispositivoBasuraModelo DispositivoBasuraModelo) {
			return new DispositivoBasura (DispositivoBasuraModelo.getId(), DispositivoBasuraModelo.getNombre(), DispositivoBasuraModelo.isEnAlta(), DispositivoBasuraModelo.isLleno(), 
					DispositivoBasuraModelo.getCapacidadLitros());
		}
}
