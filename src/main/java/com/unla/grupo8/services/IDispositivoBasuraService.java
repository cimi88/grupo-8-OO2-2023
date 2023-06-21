package com.unla.grupo8.services;

import java.util.List;

import com.unla.grupo8.entities.DispositivoBasura;
import com.unla.grupo8.models.DispositivoBasuraModelo;

public interface IDispositivoBasuraService {

	public List<DispositivoBasura> getAll();
	
	public DispositivoBasuraModelo insertOrUpdate(DispositivoBasuraModelo dispBasura);
	
	public boolean remove(int id);
	
	public DispositivoBasuraModelo traerPorId(int id);
}
