package com.unla.grupo8.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.grupo8.entities.MedicionAspersor;

@Repository("medicionAspersorRepository")
public interface IMedicionAspersorRepository extends JpaRepository<MedicionAspersor, Serializable> {

	public abstract List<MedicionAspersor>findAll();
	public abstract MedicionAspersor findById(int id);
	public abstract MedicionAspersor findByHumedad(float humedad);
	
}