package com.unla.grupo8.repositories;
import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unla.grupo8.entities.DispositivoBasura;

@Repository("dispositivoBasuraRepository")
public interface IDispositivoBasuraRepository extends JpaRepository<DispositivoBasura, Serializable>{
		//Metodos que se pueden llamar desde el controlador 
		//nombres standar como findBy, Order, GroupBy

		public abstract DispositivoBasura findByNombre(String nombre);
		
		public abstract DispositivoBasura findById(int id);
		
		//iremos a buscar por medio de la siguiente query todos los dispositivos que se encuentran en determinado espacio
	    @Query("SELECT db FROM DispositivoBasura db JOIN FETCH db.espacio e WHERE e.nombre = (:nombreEspacio)")
	    List<DispositivoBasura> findByDispAlumbradoEnEspacios(@Param("nombreEspacio")String nombreEspacio);
}
