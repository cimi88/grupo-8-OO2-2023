package com.unla.grupo8.services;



import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoBasuraModelo;

import java.util.List;


public interface IEventoService {

	public List<Evento> getAll();
	public EventoBasuraModelo insertOrUpdate(EventoBasuraModelo eventoModelo);
	public EventoBasuraModelo traerPorId(int id); 
}
