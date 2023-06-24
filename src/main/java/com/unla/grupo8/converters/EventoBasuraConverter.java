package com.unla.grupo8.converters;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoBasuraModelo;
import com.unla.grupo8.repositories.IDispositivoBasuraRepository;

@Component("eventoConverter")
public class EventoBasuraConverter {
	
	@Autowired
	@Qualifier("dispositivoBasuraRepository") 
	private IDispositivoBasuraRepository dispositivoBasuraRepository;
	
	public Evento modelToEntity(EventoBasuraModelo eventoModelo) { 
		return new Evento( dispositivoBasuraRepository.findById(eventoModelo.getIdDispositivo()),eventoModelo.getDescripcionEvento(), eventoModelo.getFechaHoraRegistro());
	}
	
	public EventoBasuraModelo entityToModel(Evento evento) {
		return new EventoBasuraModelo(evento.getDispositivo().getId(), evento.getDescripcionEvento(), evento.getFechaHoraRegistro());
	}  
	

}
