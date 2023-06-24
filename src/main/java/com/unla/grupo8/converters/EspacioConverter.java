package com.unla.grupo8.converters;

import org.springframework.stereotype.Component;

import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.models.EspacioModelo;

<<<<<<< HEAD


=======
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
@Component("espacioConverter")
public class EspacioConverter {

	public Espacio modelToEntity(EspacioModelo espacioModelo) {
		return new Espacio(espacioModelo.getId(), espacioModelo.getNombre());
	}
	
	public EspacioModelo entityToModel(Espacio espacio) {
		return new EspacioModelo(espacio.getId(), espacio.getNombre());
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
