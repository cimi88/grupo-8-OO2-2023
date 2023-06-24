package com.unla.grupo8.services.implementations;

import java.util.List;
import java.util.ArrayList; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo8.converters.EventoAlumbradoConverter;
import com.unla.grupo8.entities.DispositivoAlumbrado;
import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;
import com.unla.grupo8.repositories.IEventoAlumbradoRepository;
import com.unla.grupo8.services.IEventoAlumbradoService;

@Service("eventoService")
public class EventoAlumbradoService implements IEventoAlumbradoService{

	@Autowired 
	@Qualifier("eventoRepository")
	private IEventoAlumbradoRepository eventoRepository;

	@Autowired
	@Qualifier("eventoConverter")
	private EventoAlumbradoConverter eventoConverter;

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

	@Override
	public EventoModelo insertOrUpdate(EventoModelo eventoModelo) {
		Evento evento = eventoRepository.save(eventoConverter.modelToEntity(eventoModelo));

		return eventoConverter.entityToModel(evento);
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

}