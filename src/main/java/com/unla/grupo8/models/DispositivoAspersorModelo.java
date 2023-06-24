package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.Set;

import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.entities.Medicion;

public class DispositivoAspersorModelo extends DispositivoModelo{
	
	private boolean encendido; // por default como false
	private LocalDateTime fechaHoraDesde;
	private LocalDateTime fechaHoraHasta;

	
	public DispositivoAspersorModelo() {
	}

	public DispositivoAspersorModelo(LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		this.encendido = false;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta; 
	}
	
	public DispositivoAspersorModelo(boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		this.encendido = false;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}	
	
	public DispositivoAspersorModelo(int id, String nombre, int idEspacio, boolean encendido, LocalDateTime fechaHoraDesde, LocalDateTime fechaHoraHasta) {
		super(id, nombre, idEspacio);
		this.encendido = false;
		this.fechaHoraDesde = fechaHoraDesde;
		this.fechaHoraHasta = fechaHoraHasta;
	}
	
	public DispositivoAspersorModelo(int id, String nombre, boolean enAlta, int idEspacio, Set<Medicion> mediciones, Set<Evento> eventos) {
		super(id, nombre, enAlta, idEspacio, mediciones, eventos);
	}
	
	public DispositivoAspersorModelo(int id, String nombre, int idEspacio) {
		super(id, nombre, idEspacio);
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
 