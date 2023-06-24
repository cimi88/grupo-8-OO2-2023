package com.unla.grupo8.services.implementations;

import java.util.List;
import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.EventoConverter;
import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;
import com.unla.grupo8.repositories.IEventoRepository;
import com.unla.grupo8.services.IEventoService;

@Service("eventoService")
public class EventoService implements IEventoService{

	@Autowired 
	@Qualifier("eventoRepository")
	private IEventoRepository eventoRepository;

	@Autowired
	@Qualifier("eventoConverter")
	private EventoConverter eventoConverter;

	@Override
	public List<Evento> getAll() {
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
		return eventoConverter.entityToModel(eventoRepository.findById(id));
	}

	@Override
	public EventoModelo insertOrUpdate(EventoModelo eventoModelo) {
		Evento evento = eventoRepository.save(eventoConverter.modelToEntity(eventoModelo));

		return eventoConverter.entityToModel(evento);
	}

}