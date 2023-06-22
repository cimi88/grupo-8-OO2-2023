package com.unla.grupo8.services;

import java.util.List;


import com.unla.grupo8.entities.MedicionBasura;

import com.unla.grupo8.models.MedicionBasuraModelo;

public interface IMedicionBasuraService {

	public List<MedicionBasura> getAll();
	
	public MedicionBasuraModelo insertOrUpdate(MedicionBasuraModelo medBasura);
	
	public boolean remove(int id);
	
	public MedicionBasuraModelo traerPorId(int id);
	
}
