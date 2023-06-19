package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.Set;

import com.unla.grupo8.entities.Dispositivo;
import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.entities.Medicion;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class DispositivoAlumbradoModelo extends Dispositivo {
	
	//true o false dependiendiendo de si el poste esta apagado o prendido
	//por default lo cargaremos apagado.
	private boolean encendido;
	
	//potencia = wwt entre 50 a 200
	@Min(50)
	@Max(200)
	private int potencia;
	
	@Size (min = 3, max = 15)
	private String senda;

	//la numeracion se cargara normalmente 
    @Digits(integer = Integer.MAX_VALUE, fraction = 0, message = "La numeración solo debe contener números enteros")
    @Min(value = 20, message = "La numeración debe ser un múltiplo de 20")
    private int numeracion;

	public DispositivoAlumbradoModelo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DispositivoAlumbradoModelo(@Min(50) @Max(200) int potencia, @Size(min = 3, max = 15) String senda,
			@Digits(integer = 2147483647, fraction = 0, message = "La numeración solo debe contener números enteros") int numeracion) {
		super();
		
		//en este constructor probaremos cargar el poste apenas se da de alta obviamente apagado
		this.encendido = false;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
	}

	public DispositivoAlumbradoModelo(boolean encendido, @Min(50) @Max(200) int potencia, @Size(min = 3, max = 15) String senda,
			@Digits(integer = 2147483647, fraction = 0, message = "La numeración solo debe contener números enteros") int numeracion) {
		super();
		
		this.encendido = encendido;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
	}

	public DispositivoAlumbradoModelo(int id, String nombre, boolean enAlta, LocalDateTime createdAt,
			LocalDateTime updatedAt, Espacio espacio, Set<Medicion> mediciones,boolean encendido, @Min(50) @Max(200) int potencia, @Size(min = 3, max = 15) String senda,
			@Digits(integer = 2147483647, fraction = 0, message = "La numeración solo debe contener números enteros") int numeracion) {
		super(id, nombre, enAlta, createdAt, updatedAt, espacio, mediciones);
		
		
		this.encendido = encendido;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
		
	}

	public DispositivoAlumbradoModelo(int id, String nombre, boolean enAlta, Espacio espacio,
			Set<Medicion> mediciones, boolean encendido, @Min(50) @Max(200) int potencia, @Size(min = 3, max = 15) String senda,
			@Digits(integer = 2147483647, fraction = 0, message = "La numeración solo debe contener números enteros") int numeracion) {
		super(id, nombre, enAlta, espacio, mediciones);

		this.encendido = encendido;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
	}

	public DispositivoAlumbradoModelo(int id, String nombre, boolean enAlta, boolean encendido, @Min(50) @Max(200) int potencia, @Size(min = 3, max = 15) String senda,
			@Digits(integer = 2147483647, fraction = 0, message = "La numeración solo debe contener números enteros") int numeracion) {
		super(id, nombre, enAlta);

		this.encendido = encendido;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
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
