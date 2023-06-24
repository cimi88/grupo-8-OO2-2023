package com.unla.grupo8.services;

import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.models.EventoModelo;

import java.util.List;

<<<<<<< HEAD:src/main/java/com/unla/grupo8/services/IEventoEstacionamientoService.java
@Service("eventoService")
public interface IEventoEstacionamientoService {
=======
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1:src/main/java/com/unla/grupo8/services/IEventoService.java



public interface IEventoService {
	public List<Evento> getAll();
<<<<<<< HEAD:src/main/java/com/unla/grupo8/services/IEventoEstacionamientoService.java
	
	public EventoModelo traerPorId(int id); 
	
	public EventoModelo insertOrUpdate(EventoModelo eventoModelo); 
=======
	public EventoModelo insertOrUpdate(EventoModelo eventoModelo);
	public EventoModelo traerPorId(int id);  
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1:src/main/java/com/unla/grupo8/services/IEventoService.java
}

