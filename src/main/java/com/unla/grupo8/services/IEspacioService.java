package com.unla.grupo8.services;

import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.models.EspacioModelo;




public interface IEspacioService {
	public List<Espacio>getAll();
	public EspacioModelo traerPorId(int id);
}
=======
import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.models.EspacioModelo;

public interface IEspacioService {
	public List<Espacio> getAll();
	public EspacioModelo traerPorId(int id);
}
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
