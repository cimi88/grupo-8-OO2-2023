package com.unla.grupo8.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.grupo8.entities.MedicionAlumbrado;

@Repository("medicionAlumbradoRepository")
public interface IMedicionAlumbradoRepository extends JpaRepository<MedicionAlumbrado, Serializable> {

	//Metodos que se pueden llamar desde el controlador :) 
	//nombres standar como findBy, Order, GroupBy
	
	public abstract List<MedicionAlumbrado>findAll();
	public abstract MedicionAlumbrado findById(int id);
	public abstract MedicionAlumbrado findByLuminiscencia(float luminiscencia);
	
}
