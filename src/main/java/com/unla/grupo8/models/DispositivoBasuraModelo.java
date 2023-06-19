package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.Set;

import com.unla.grupo8.entities.Dispositivo;
import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.entities.Medicion;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class DispositivoBasuraModelo extends Dispositivo{
	
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


	//false o true dependiendiendo si el tacho de basura esta vacio o lleno
	//por default lo cargamos vacio.
	private boolean lleno;

	@Min(value = 10, message = "La capacidad mínima debe ser de al menos 10 litros")
    @Max(value = 100, message = "La capacidad máxima no puede superar los 100 litros")
	private float capacidadLitros;
	
	
	public DispositivoBasuraModelo() {}


	public DispositivoBasuraModelo(int id, String nombre, boolean enAlta, Espacio espacio, Set<Medicion> mediciones, boolean lleno,@Min(10) @Max(100) float capacidadLitros) {
		super(id, nombre, enAlta, espacio, mediciones);
		// TODO Auto-generated constructor stub
		this.lleno = lleno;
		this.capacidadLitros = capacidadLitros;
	}


	public DispositivoBasuraModelo(int id, String nombre, boolean enAlta, LocalDateTime createdAt,
			LocalDateTime updatedAt, Espacio espacio, Set<Medicion> mediciones, boolean lleno,@Min(10) @Max(100) float capacidadLitros) {
		super(id, nombre, enAlta, createdAt, updatedAt, espacio, mediciones);
		// TODO Auto-generated constructor stub
		this.lleno = lleno;
		this.capacidadLitros = capacidadLitros;
	}


	public DispositivoBasuraModelo(int id, String nombre, boolean enAlta, boolean lleno,@Min(10) @Max(100) float capacidadLitros) {
		super(id, nombre, enAlta);
		// TODO Auto-generated constructor stub
		this.lleno = lleno;
		this.capacidadLitros = capacidadLitros;
	}
	
	
	
}
