package com.unla.grupo8.repositories;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo8.entities.MedicionBasura;

@Repository("medicionBasuraRepository")
public interface IMedicionBasuraRepository extends JpaRepository<MedicionBasura, Serializable>{
	
	
	public abstract List<MedicionBasura> findAll();
	public abstract MedicionBasura findById(int id);
	public abstract MedicionBasura findByLitrosOcupados(float litrosOcupados);
}
