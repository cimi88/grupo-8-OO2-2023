package com.unla.grupo8.models;

import java.time.LocalDateTime;



public class EventoModelo {

     private int id;
	
	private DispositivoModelo dispositivo;
	
	private String descripcionEvento;
	
	private LocalDateTime fechaHoraRegistro;
	
	public EventoModelo() {}

	public EventoModelo(int id, DispositivoModelo dispositivo, String descripcionEvento,
			LocalDateTime fechaHoraRegistro) {
		super();
		this.id = id;
		this.dispositivo = dispositivo;
		this.descripcionEvento = descripcionEvento;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	

	public EventoModelo(int id, String descripcionEvento, LocalDateTime fechaHoraRegistro) {
		super();
		this.id = id;
		this.descripcionEvento = descripcionEvento;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DispositivoModelo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(DispositivoModelo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public String getDescripcionEvento() {
		return descripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}

	public LocalDateTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}

	public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
	
	
	
	
	
	
	
}
