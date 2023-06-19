package com.unla.grupo8.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unla.grupo8.entities.DispositivoAlumbrado;

@Repository("dispositivoAlumbradoRepository")
public interface IDispositivoAlumbradoRepository extends JpaRepository<DispositivoAlumbrado, Serializable> {
	
	//Metodos que se pueden llamar desde el controlador :) 
	//nombres standar como findBy, Order, GroupBy

	public abstract DispositivoAlumbrado findByNombre(String nombre);
	
	public abstract DispositivoAlumbrado findById(int id);
	
	//iremos a buscar por medio de la siguiente query todos los dispositivos que se encuentran en determinado espacio
//    @Query("SELECT da FROM DispositivoAlumbrado da JOIN da.espacios e WHERE e.nombre = :nombreEspacio")
//    List<DispositivoAlumbrado> findByDispAlumbradoEnEspacios(@Param("nombreEspacio")String nombreEspacio);

}
