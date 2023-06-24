package com.unla.grupo8.services.implementations;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.EventoBasuraConverter;
import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;
import com.unla.grupo8.repositories.IEventoBasuraRepository;
import com.unla.grupo8.services.IEventoBasuraService;

@Service("eventoService")
public class EventoBasuraService implements IEventoBasuraService{
	
	@Autowired 
	@Qualifier("eventoRepository")
	private IEventoBasuraRepository eventoRepository;

	@Autowired
	@Qualifier("eventoConverter")
	private EventoBasuraConverter eventoConverter;

	@Override
	public List<Evento> getAll() {
		// TODO Auto-generated method stub
		return eventoRepository.findAll();
	}
	public List<Evento> traerEventosIdDispositivo(int idDispositivo) {
		 List<Evento> eventos = new ArrayList<Evento>();
		 for(Evento e : getAll()) {
			 if(e.getDispositivo().getId() == idDispositivo) {
				 eventos.add(e);
			 }
		 } 
		return eventos; 
	}
	@Override
	public EventoModelo traerPorId(int id) {
		// TODO Auto-generated method stub
		return eventoConverter.entityToModel(eventoRepository.findById(id));
	}

	@Override
	public EventoModelo insertOrUpdate(EventoModelo eventoModelo) {
		Evento evento = eventoRepository.save(eventoConverter.modelToEntity(eventoModelo));

		return eventoConverter.entityToModel(evento);
	}
}
