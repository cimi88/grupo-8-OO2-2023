package com.unla.grupo8.services;

import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;

import java.util.List;

public interface IEventoService {
	public List<Evento> getAll();
	public EventoModelo insertOrUpdate(EventoModelo eventoModelo);
	public EventoModelo traerPorId(int id); 
}