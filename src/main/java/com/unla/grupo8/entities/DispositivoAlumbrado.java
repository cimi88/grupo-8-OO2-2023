package com.unla.grupo8.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "dispositivo_alumbrado")
public class DispositivoAlumbrado extends Dispositivo {
	
	private boolean encendido;
	
	private int potencia;
	
	private String senda;

	private int numeracion;
	
	public DispositivoAlumbrado () {}

	public DispositivoAlumbrado(int id, String nombre, boolean enAlta, LocalDateTime createdAt, LocalDateTime updatedAt,
			Set<Espacio> espacios, Set<Medicion> mediciones) {
		super(id, nombre, enAlta, createdAt, updatedAt, espacios, mediciones);
		// TODO Auto-generated constructor stub
	}

	public DispositivoAlumbrado(int id, String nombre, boolean enAlta, Set<Espacio> espacios,
			Set<Medicion> mediciones) {
		super(id, nombre, enAlta, espacios, mediciones);
		// TODO Auto-generated constructor stub
	}

	public DispositivoAlumbrado(int id, String nombre, boolean enAlta, 
			boolean encendido,  int potencia, String senda, int numeracion) {
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

	@Override
	public String toString() {
		return super.toString()+"DispositivoAlumbrado [encendido=" + encendido + ", potencia=" + potencia + ", senda=" + senda
				+ ", numeracion=" + numeracion + "]";
	}
	
	

}
