package com.unla.grupo8.services;

import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service("eventoService")
public interface IEventoEstacionamientoService {



public interface IEventoService {
	public List<Evento> getAll();
	
	public EventoModelo traerPorId(int id); 
	
	public EventoModelo insertOrUpdate(EventoModelo eventoModelo); 
	}
}
