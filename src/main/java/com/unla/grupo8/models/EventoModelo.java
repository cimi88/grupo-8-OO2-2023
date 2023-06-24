package com.unla.grupo8.models;

import java.time.LocalDateTime;
<<<<<<< HEAD
import java.util.Objects;
=======
>>>>>>> rama_santander

public class EventoModelo {

    private int id;
	
	private int idDispositivo;
	
	private String descripcionEvento;
	
	private LocalDateTime fechaHoraRegistro;
	
	public EventoModelo() {}

<<<<<<< HEAD
	public EventoModelo(int id, int idDispositivo, String descripcionEvento, LocalDateTime fechaHoraRegistro) {

=======
	public EventoModelo(int id, int idDispositivo, String descripcionEvento,
			LocalDateTime fechaHoraRegistro) {
		super();
>>>>>>> rama_santander
		this.id = id;
		this.idDispositivo = idDispositivo;
		this.descripcionEvento = descripcionEvento;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
<<<<<<< HEAD


	public EventoModelo(int idDispositivo, String descripcionEvento, LocalDateTime fechaHoraRegistro) {
=======
	
	public EventoModelo(int idDispositivo, String descripcionEvento,
			LocalDateTime fechaHoraRegistro) {
		super();
>>>>>>> rama_santander

		this.idDispositivo = idDispositivo;
		this.descripcionEvento = descripcionEvento;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
<<<<<<< HEAD

	
	
	
	public EventoModelo(int idDispositivo, LocalDateTime fechaHoraRegistro) {
=======
	
	public EventoModelo(int idDispositivo,
			LocalDateTime fechaHoraRegistro) {
>>>>>>> rama_santander
		super();
		
		this.idDispositivo = idDispositivo;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
<<<<<<< HEAD
	
	public EventoModelo(String descripcionEvento, LocalDateTime fechaHoraRegistro) {

=======

	public EventoModelo(String descripcionEvento, LocalDateTime fechaHoraRegistro) {
		super();
		
>>>>>>> rama_santander
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
>>>>>>> rama_santander
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

	
>>>>>>> rama_santander
}