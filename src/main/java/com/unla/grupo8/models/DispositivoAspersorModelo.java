package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.Set;

import com.unla.grupo8.entities.Dispositivo;
import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.entities.Medicion;

public class DispositivoAspersorModelo extends Dispositivo{
	
	private boolean encendido; // por default como false
	private LocalDateTime fechaHoraDesde;
	private LocalDateTime fechaHoraHasta;

	
	public DispositivoAspersorModelo() {
		super();
	}

	public DispositivoAspersorModelo(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		super();
		this.encendido = false;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}
	
	public DispositivoAspersorModelo(boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		this.encendido = encendido;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}

	public DispositivoAspersorModelo(int id, String nombre, LocalDateTime createdAt, LocalDateTime updatedAt,
			Espacio espacio, Set<Medicion> mediciones, boolean encendido, LocalDateTime fechaHoraDesde,
			LocalDateTime fechaHoraHasta) {
		super(id, nombre, createdAt, updatedAt, espacio, mediciones);
		this.encendido = encendido;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}

	public DispositivoAspersorModelo(int id, String nombre, Espacio espacio, Set<Medicion> mediciones, boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		super(id, nombre, espacio, mediciones);
		this.encendido = encendido;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}

	public DispositivoAspersorModelo(int id, String nombre, boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		super(id, nombre);
		this.encendido = encendido;
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

}
 