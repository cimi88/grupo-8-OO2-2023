package com.unla.grupo8.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo8.entities.Evento;
<<<<<<< HEAD
import java.util.List;

@Repository("eventoRepository")
public interface IEventoRepository extends JpaRepository<Evento, Serializable>{
	
	public abstract Evento findById(int id);

}
=======

@Repository("eventoRepository")
public interface IEventoRepository extends JpaRepository<Evento, Serializable>{
	public abstract Evento findById(int id);
}
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
