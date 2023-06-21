package com.unla.grupo8.services;

import java.util.List;

import com.unla.grupo8.entities.MedicionAlumbrado;
import com.unla.grupo8.models.MedicionAlumbradoModelo;

public interface IMedicionAlumbradoService {
	
	public List<MedicionAlumbrado> getAll();
	
	public MedicionAlumbradoModelo insertOrUpdate(MedicionAlumbradoModelo medicionAluModel);
	
	public MedicionAlumbradoModelo traerPorId(int id);
	
	public boolean remove(int id);

}
