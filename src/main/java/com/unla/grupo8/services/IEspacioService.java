package com.unla.grupo8.services;

import java.util.List;
<<<<<<< HEAD

import org.springframework.stereotype.Service;

import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.models.EspacioModelo;



@Service("espacioService")
public interface IEspacioService {
	public List<Espacio>getAll();
	public EspacioModelo traerPorId(int id);
	public EspacioModelo insertOrUpdate(EspacioModelo espacioModelo);
	 
}
=======
import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.models.EspacioModelo;

public interface IEspacioService {
	public List<Espacio>getAll();
	public EspacioModelo traerPorId(int id);
}

>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
