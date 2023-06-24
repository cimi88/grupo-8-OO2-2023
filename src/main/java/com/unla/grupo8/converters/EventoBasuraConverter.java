package com.unla.grupo8.converters;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;


import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;

@Component("eventoConverter")
public class EventoBasuraConverter {
	
	public Evento modelToEntity(EventoModelo eventoModelo) {
		return new Evento(eventoModelo.getId() ,eventoModelo.getDescripcionEvento(), eventoModelo.getFechaHoraRegistro());
	}
	
	public EventoModelo entityToModel(Evento evento) {
		return new EventoModelo(evento.getId(), evento.getDescripcionEvento(), evento.getFechaHoraRegistro());
	}
	
//	este metodo pasa de entidad a modelo toda una lista de entidades Evento
public Set<EventoModelo> entityToModelSet(Set<Evento> eventos){
		
		Set<EventoModelo>  lista = new HashSet<>();
		
		for(Evento e: eventos) {
			
			lista.add(entityToModel(e));
			
		}
		return lista;
	}
	
//	Este metodo convierte toda una lista de EventoModelo en Evento(ENTITY)
	public Set<Evento> modelToEntitySet(Set<EventoModelo> eventosM){
		
		Set<Evento>  lista = new HashSet<>();
		
		for(EventoModelo eM : eventosM) {
			
			lista.add(modelToEntity(eM));	
		}
		
		return lista;
	}

}
