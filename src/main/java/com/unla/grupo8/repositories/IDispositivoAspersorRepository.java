package com.unla.grupo8.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unla.grupo8.entities.DispositivoAspersor;

@Repository("dispositivoAspersorRepository")
public interface IDispositivoAspersorRepository extends JpaRepository<DispositivoAspersor, Serializable> {

	public abstract DispositivoAspersor findByNombre(String nombre);

	public abstract DispositivoAspersor findById(int id);
	
	//iremos a buscar por medio de la siguiente query todos los dispositivos que se encuentran en determinado espacio
	@Query("SELECT da FROM DispositivoAspersor da JOIN FETCH da.espacio e WHERE e.nombre = (:nombreEspacio)")
    List<DispositivoAspersor> findByDispAspersorEnEspacios(@Param("nombreEspacio")String nombreEspacio);
}
 