package com.unla.grupo8.models;

import java.util.Set;

import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.entities.Medicion;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class DispositivoAlumbradoModelo extends DispositivoModelo {
	
	//true o false dependiendiendo de si el poste esta apagado o prendido
	//por default lo cargaremos apagado.
	private boolean encendido;
	
	//potencia = wwt entre 50 a 200
//	@Min(50)
//	@Max(200)
	private int potencia;
	
	@Size (min = 3, max = 30, message = "La senda debe tener al menos mas de 3 letras en su nombre")
	private String senda;

	//la numeracion se cargara normalmente 
    @Digits(integer = Integer.MAX_VALUE, fraction = 0, message = "La numeración solo debe contener números enteros")
    private int numeracion;
    
	public DispositivoAlumbradoModelo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DispositivoAlumbradoModelo(int id,String nombre,int idEspacio, boolean encendido, @Min(50) @Max(200) int potencia,
			@Size(min = 3, max = 30, message = "La senda debe tener al menos mas de 3 letras en su nombre") String senda,
			@Digits(integer = 2147483647, fraction = 0, message = "La numeración solo debe contener números enteros") int numeracion) {
		super(id, nombre, idEspacio);
		this.encendido = encendido;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
	}
	
	

	public DispositivoAlumbradoModelo(int id, String nombre, boolean enAlta, int idEspacio, Set<Medicion> mediciones,
			Set<Evento> eventos) {
		super(id, nombre, enAlta, idEspacio, mediciones, eventos);
		// TODO Auto-generated constructor stub
	}

	public DispositivoAlumbradoModelo(int id, String nombre, int idEspacio) {
		super(id, nombre, idEspacio);
		// TODO Auto-generated constructor stub
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
