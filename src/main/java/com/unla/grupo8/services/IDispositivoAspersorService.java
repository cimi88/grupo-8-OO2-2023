package com.unla.grupo8.services;

import java.util.List;

import com.unla.grupo8.entities.DispositivoAspersor;
import com.unla.grupo8.models.DispositivoAspersorModelo;

public interface IDispositivoAspersorService {
	public List<DispositivoAspersor> getAll();

	public DispositivoAspersorModelo insertOrUpdate(DispositivoAspersorModelo dispAspersor);

	public DispositivoAspersorModelo traerPorId(int id);

	public boolean remove(int id);

	public boolean baja(int id);
}
