package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.Objects;



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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventoModelo other = (EventoModelo) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "EventoModelo [id=" + id + ", dispositivo=" + dispositivo + ", descripcionEvento=" + descripcionEvento
				+ ", fechaHoraRegistro=" + fechaHoraRegistro + "]";
	}
	
	
	
	
	
	
	
}
