package com.unla.grupo8.services;

import java.util.List;

import com.unla.grupo8.entities.MedicionAspersor;
import com.unla.grupo8.models.MedicionAspersorModelo;

public interface IMedicionAspersorService {
	
	public List<MedicionAspersor> getAll();

	public MedicionAspersorModelo insertOrUpdate(MedicionAspersorModelo medicionAluModel);

	public MedicionAspersorModelo traerPorId(int id);

	public boolean remove(int id);
}
