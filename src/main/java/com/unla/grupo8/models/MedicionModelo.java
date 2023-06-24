package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.Objects;

<<<<<<< HEAD
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
	 
	
	private LocalDateTime fechaHoraRegistro;
	
	private EventoModelo eventoModelo;
	
	private int idDispositivo;
	
	public MedicionModelo() {} 

	public MedicionModelo(int id, LocalDateTime fechaHoraRegistro, EventoModelo eventoModelo, int idDispositivo) {
		super();
		this.id = id;
	    this.eventoModelo = eventoModelo;
		this.fechaHoraRegistro = fechaHoraRegistro;
		this.idDispositivo = idDispositivo;
	}
	
	 
	  
	

	public MedicionModelo(int id, LocalDateTime fechaHoraRegistro, int idDispositivo) {
		super();
		this.id = id;
		this.fechaHoraRegistro = fechaHoraRegistro;
		this.idDispositivo = idDispositivo;
=======
public abstract class MedicionModelo {

	protected int id;
	protected int idDispositivo;
	protected LocalDateTime fechaHoraRegistro;
	
	public MedicionModelo() {}

	public MedicionModelo(int id, int idDispositivo, LocalDateTime fechaHoraRegistro) {
		super();
		this.id = id;
		this.idDispositivo = idDispositivo;
		this.fechaHoraRegistro = fechaHoraRegistro;
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

<<<<<<< HEAD
	


	public LocalDateTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}

	public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
	
	

	public EventoModelo getEventoModelo() {
		return eventoModelo;
	}

	public void setEventoModelo(EventoModelo eventoModelo) {
		this.eventoModelo = eventoModelo;
	}

	
	 

=======
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
	public int getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

<<<<<<< HEAD
=======
	public LocalDateTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}

	public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

<<<<<<< HEAD
	

	 

}
=======
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicionModelo other = (MedicionModelo) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "MedicionModelo [id=" + id + ", idDispositivo=" + idDispositivo + ", fechaHoraRegistro="
				+ fechaHoraRegistro + "]";
	}
}

>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
