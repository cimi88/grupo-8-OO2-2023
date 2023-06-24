package com.unla.grupo8.converters;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;
import com.unla.grupo8.repositories.IDispositivoAlumbradoRepository;

@Component("eventoConverter")
public class EventoConverter {
	
	@Autowired
	@Qualifier("dispositivoAlumbradoRepository")
	private IDispositivoAlumbradoRepository dispositivoAlumbradoRepository;
	
	public Evento modelToEntity(EventoModelo eventoModelo) {
		return new Evento(eventoModelo.getId(), dispositivoAlumbradoRepository.findById(eventoModelo.getIdDispositivo()) ,eventoModelo.getDescripcionEvento(), eventoModelo.getFechaHoraRegistro());
	}
	
	public EventoModelo entityToModel(Evento evento) {
		return new EventoModelo(evento.getId(),evento.getDispositivo().getId(), evento.getDescripcionEvento(), evento.getFechaHoraRegistro());
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