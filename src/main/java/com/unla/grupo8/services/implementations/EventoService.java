package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.unla.grupo8.converters.EventoConverter;
import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;
import com.unla.grupo8.repositories.IEventoRepository;
import com.unla.grupo8.services.IEventoService;

public class EventoService implements IEventoService{
	
	@Autowired 
	@Qualifier("eventoRepository")
	private IEventoRepository eventoRepository;
	
	@Autowired
	@Qualifier("eventoConverter")
	private EventoConverter eventoConverter;

	@Override
	public List<Evento> getAll() {
		// TODO Auto-generated method stub
		return eventoRepository.findAll();
	}

	@Override
	public EventoModelo traerPorId(int id) {
		// TODO Auto-generated method stub
		return eventoConverter.entityToModel(eventoRepository.findById(id));
	}
  
}
