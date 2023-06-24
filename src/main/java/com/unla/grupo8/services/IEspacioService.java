package com.unla.grupo8.services;

import java.util.List;

import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.models.EspacioModelo;

public interface IEspacioService {
	public List<Espacio> getAll();
	public EspacioModelo traerPorId(int id);
}