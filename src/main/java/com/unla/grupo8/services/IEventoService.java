package com.unla.grupo8.services;

<<<<<<< HEAD


import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoBasuraModelo;

import java.util.List;


public interface IEventoService {

	public List<Evento> getAll();
	public EventoBasuraModelo insertOrUpdate(EventoBasuraModelo eventoModelo);
	public EventoBasuraModelo traerPorId(int id); 
}
=======
import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;

import java.util.List;

public interface IEventoService {
	public List<Evento> getAll();
	public EventoModelo insertOrUpdate(EventoModelo eventoModelo);
	public EventoModelo traerPorId(int id); 
}
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
