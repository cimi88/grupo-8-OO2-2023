package com.unla.grupo8.models;

public class DispositivoEstacionamientoModelo extends DispositivoModelo{
	
	private LugarModelo lugar;

	public DispositivoEstacionamientoModelo(int id,String nombre, EspacioModelo espacioModelo, LugarModelo lugar) {
		super(id, nombre, espacioModelo);
		this.lugar = lugar;
	}

	public LugarModelo getLugar() {
		return lugar;
	}

	public void setLugar(LugarModelo lugar) {
		this.lugar = lugar;
	}

	
	    
	
	

}
