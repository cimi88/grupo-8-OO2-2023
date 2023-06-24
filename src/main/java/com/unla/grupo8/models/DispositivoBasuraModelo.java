package com.unla.grupo8.models;

import java.util.Set;

import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.entities.Medicion;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class DispositivoBasuraModelo extends DispositivoModelo{

	//false o true dependiendiendo si el tacho de basura esta vacio o lleno
	//por default lo cargamos vacio.
	private boolean lleno;

	@Min(value = 10, message = "La capacidad mínima debe ser de al menos 10 litros")
    @Max(value = 100, message = "La capacidad máxima no puede superar los 100 litros")
	private float capacidadLitros;
	
	
	public DispositivoBasuraModelo() {}


	
	public DispositivoBasuraModelo(int id, String nombre, int idEspacio, boolean lleno, float capacidadLitros) {
		super(id, nombre, idEspacio);
		// TODO Auto-generated constructor stub
		this.lleno = lleno;
		this.capacidadLitros = capacidadLitros;
	}



	public boolean isLleno() {
		return lleno;
	}


	public void setLleno(boolean lleno) {
		this.lleno = lleno;
	}


	public float getCapacidadLitros() {
		return capacidadLitros;
	}


	public void setCapacidadLitros(float capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}
	
		
}
