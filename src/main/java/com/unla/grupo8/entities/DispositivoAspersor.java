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
//Le decimos que su clave primaria sera tambien foranea de la clase padre, por tanto heredara el id
@PrimaryKeyJoinColumn(referencedColumnName = "id")
//asignamos un nombre a la tabla
@Table(name = "dispositivo_aspersor")
public class DispositivoAspersor extends Dispositivo {
	private boolean encendido; // por default como false
	private LocalDateTime fechaHoraDesde;
	private LocalDateTime fechaHoraHasta;

	public DispositivoAspersor() {
	}

	public DispositivoAspersor(int id, String nombre, boolean enAlta, LocalDateTime createdAt, LocalDateTime updatedAt, Espacio espacio, Set<Medicion> mediciones, boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		super(id, nombre, createdAt, updatedAt, espacio, mediciones);
		this.encendido = false;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}

	public DispositivoAspersor(int id, String nombre, boolean enAlta, Espacio espacio, Set<Medicion> mediciones, boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		super(id, nombre, espacio, mediciones);
		this.encendido = false;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}

	public DispositivoAspersor(int id, String nombre, boolean enAlta, boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		super(id, nombre, enAlta);
		this.encendido = false;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}

	public DispositivoAspersor(int id, String nombre, boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		super(id, nombre);
		this.encendido = false;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}
	
	public DispositivoAspersor(int id, String nombre, Espacio espacio, boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		super(id, nombre, espacio);
		this.encendido = false;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public LocalDateTime getFechaHoraDesde() {
		return fechaHoraDesde;
	}

	public void setFechaHoraDesde(LocalDateTime fechaHoraDesde) {
		this.fechaHoraDesde = fechaHoraDesde;
	}

	public LocalDateTime getFechaHoraHasta() {
		return fechaHoraHasta;
	}

	public void setFechaHoraHasta(LocalDateTime fechaHoraHasta) {
		this.fechaHoraHasta = fechaHoraHasta;
	}

	@Override
	public String toString() {
		return "DispositivoAspersor [encendido=" + encendido + ", fechaHoraDesde=" + fechaHoraDesde
				+ ", fechaHoraHasta=" + fechaHoraHasta + "]";
	}
}
 