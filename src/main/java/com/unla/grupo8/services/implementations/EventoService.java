package com.unla.grupo8.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.unla.grupo8.converters.EventoBasuraConverter;
import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoBasuraModelo;
=======
import com.unla.grupo8.converters.EventoConverter;
import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
import com.unla.grupo8.repositories.IEventoRepository;
import com.unla.grupo8.services.IEventoService;

@Service("eventoService")
public class EventoService implements IEventoService{
<<<<<<< HEAD
	
=======

>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
	@Autowired 
	@Qualifier("eventoRepository")
	private IEventoRepository eventoRepository;

	@Autowired
	@Qualifier("eventoConverter")
<<<<<<< HEAD
	private EventoBasuraConverter eventoConverter;

	@Override
	public List<Evento> getAll() {
		// TODO Auto-generated method stub
=======
	private EventoConverter eventoConverter;

	@Override
	public List<Evento> getAll() {
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
		return eventoRepository.findAll();
	}

	@Override
<<<<<<< HEAD
	public EventoBasuraModelo traerPorId(int id) {
		// TODO Auto-generated method stub
=======
	public EventoModelo traerPorId(int id) {
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
		return eventoConverter.entityToModel(eventoRepository.findById(id));
	}

	@Override
<<<<<<< HEAD
	public EventoBasuraModelo insertOrUpdate(EventoBasuraModelo eventoModelo) {
=======
	public EventoModelo insertOrUpdate(EventoModelo eventoModelo) {
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
		Evento evento = eventoRepository.save(eventoConverter.modelToEntity(eventoModelo));

		return eventoConverter.entityToModel(evento);
	}
<<<<<<< HEAD
}
=======

}
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
