package com.unla.grupo8.models;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class DispositivoAlumbradoModelo extends DispositivoModelo {
	
	//true o false dependiendiendo de si el poste esta apagado o prendido
	//por default lo cargaremos apagado.
	private boolean encendido;
	
	//potencia = wwt entre 50 a 200

	private int potencia;
	
	private String senda;

	//la numeracion se cargara normalmente 
    private int numeracion;
    
	public DispositivoAlumbradoModelo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DispositivoAlumbradoModelo(int id, String nombre, int idEspacio, boolean encendido,
			int potencia,  String senda, int numeracion) {
		super(id, nombre, idEspacio);
		this.encendido = encendido;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
		this.idEspacio = idEspacio;
	}
	

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getSenda() {
		return senda;
	}

	public void setSenda(String senda) {
		this.senda = senda;
	}

	public int getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(int numeracion) {
		this.numeracion = numeracion;
	}
	
}
