package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.Objects;

public class EventoModelo {

<<<<<<< HEAD
    private int id;
	
	private int idDispositivo;
	
	private String descripcionEvento;
	
	private LocalDateTime fechaHoraRegistro;
	
	public EventoModelo() {}

	public EventoModelo(int id, int idDispositivo, String descripcionEvento,
			LocalDateTime fechaHoraRegistro) {
		super();
=======
	private int id;

	private int idDispositivo;

	private String descripcionEvento;

	private LocalDateTime fechaHoraRegistro;

	public EventoModelo() {
	}

	public EventoModelo(int id, int idDispositivo, String descripcionEvento, LocalDateTime fechaHoraRegistro) {
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
		this.id = id;
		this.idDispositivo = idDispositivo;
		this.descripcionEvento = descripcionEvento;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
<<<<<<< HEAD
	
	public EventoModelo(int idDispositivo, String descripcionEvento,
			LocalDateTime fechaHoraRegistro) {
		super();
=======

	public EventoModelo(int idDispositivo, String descripcionEvento, LocalDateTime fechaHoraRegistro) {
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
		this.idDispositivo = idDispositivo;
		this.descripcionEvento = descripcionEvento;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
<<<<<<< HEAD
	
	
	
	public EventoModelo(int idDispositivo,
			LocalDateTime fechaHoraRegistro) {
		super();
		
		this.idDispositivo = idDispositivo;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	public EventoModelo(String descripcionEvento, LocalDateTime fechaHoraRegistro) {
		super();
		
=======

	public EventoModelo(int idDispositivo, LocalDateTime fechaHoraRegistro) {
		this.idDispositivo = idDispositivo;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
	
	public EventoModelo(String descripcionEvento, LocalDateTime fechaHoraRegistro) {
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
		this.descripcionEvento = descripcionEvento;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

<<<<<<< HEAD
	public int getIdDispositivo() { 
=======
	public int getIdDispositivo() {
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
		return idDispositivo;
	}

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
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

<<<<<<< HEAD
	
=======
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
}