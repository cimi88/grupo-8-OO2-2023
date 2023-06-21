package com.unla.grupo8.services;
import java.util.List;

import com.unla.grupo8.entities.DispositivoAlumbrado;
import com.unla.grupo8.models.DispositivoAlumbradoModelo;

public interface IDispositivoAlumbradoService {
	
	public List<DispositivoAlumbrado> getAll();
	
	public DispositivoAlumbradoModelo insertOrUpdate(DispositivoAlumbradoModelo dispAlumbrado);
	
	public DispositivoAlumbradoModelo traerPorId(int id);
	
	public boolean remove(int id);
	
	public boolean baja(int id);

}
