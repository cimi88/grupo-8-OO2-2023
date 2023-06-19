package com.unla.grupo8.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

//Creamos la tabla
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//Le decimos que su clave primaria sera tambien foranea de la clase padre
//Por tanto heredara el id
@PrimaryKeyJoinColumn(referencedColumnName="id")
//asignamos un nombre a la tabla
@Table(name = "dispositivo_alumbrado")
public class DispositivoAlumbrado extends Dispositivo {
	
	//para los demas atributos no uso la anotacion, vamos a dejar que spring
	//le asigne por defecto el mismo nombre que tienen aqui
	private boolean encendido;
	
	private int potencia;
	
	private String senda;

	private int numeracion;
	
	public DispositivoAlumbrado () {}

	public DispositivoAlumbrado(int id, String nombre, boolean enAlta, LocalDateTime createdAt, LocalDateTime updatedAt,
			boolean encendido,  int potencia, String senda, int numeracion, Espacio espacio, Set<Medicion> mediciones) {
		super(id, nombre, createdAt, updatedAt, espacio, mediciones);
		
		this.encendido = false;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
	}

	public DispositivoAlumbrado(int id, String nombre, boolean enAlta, Espacio espacio,
			Set<Medicion> mediciones, boolean encendido,  int potencia, String senda, int numeracion) {
		super(id, nombre, espacio, mediciones);
		
		this.encendido = false;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
	}

	public DispositivoAlumbrado(int id, String nombre, boolean enAlta, 
			boolean encendido,  int potencia, String senda, int numeracion) {
		super(id, nombre, enAlta);
		
		this.encendido = false;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
	}
	
	public DispositivoAlumbrado(int id, String nombre, boolean encendido,  int potencia, String senda, int numeracion) {
		super(id, nombre);
		
		this.encendido = false;
		this.potencia = potencia;
		this.senda = senda;
		this.numeracion = numeracion;
	}

	//Getters y Setters
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

	@Override
	public String toString() {
		return super.toString()+"DispositivoAlumbrado [encendido=" + encendido + ", potencia=" + potencia + ", senda=" + senda
				+ ", numeracion=" + numeracion + "]";
	}
	
	

}
