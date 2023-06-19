package com.unla.grupo8.services;

import org.springframework.stereotype.Service;

import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;

import java.util.List;

@Service("eventoService")
public interface IEventoService {

	public List<Evento> getAll();
	
	public EventoModelo traerPorId(int id); 
}
