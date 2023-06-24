package com.unla.grupo8.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo8.entities.Espacio;

@Repository("espacioRepository")
public interface IEspacioRepository extends JpaRepository<Espacio,Serializable> {
	public abstract Espacio findById(int id);
}



