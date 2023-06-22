package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.unla.grupo8.entities.Dispositivo;
import com.unla.grupo8.entities.Medicion;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public abstract class MedicionModelo {
	
	
	private int id;
	 
	
	private DispositivoModelo dispositivoModelo;
	
	private LocalDateTime fechaHoraRegistro;
	
	public MedicionModelo() {} 

	public MedicionModelo(int id,DispositivoModelo dispositivoModelo, LocalDateTime fechaHoraRegistro) {
		super();
		this.id = id;
		this.dispositivoModelo = dispositivoModelo;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
	
	
	 
	

	public MedicionModelo(int id, LocalDateTime fechaHoraRegistro) {
		super();
		this.id = id;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public DispositivoModelo getDispositivoModelo() {
		return dispositivoModelo;
	}

	public void setDispositivoModelo(DispositivoModelo dispositivoModelo) {
		this.dispositivoModelo = dispositivoModelo;
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

	

	 

}
