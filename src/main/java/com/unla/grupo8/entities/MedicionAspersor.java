package com.unla.grupo8.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

//Creamos la tabla
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//Le decimos que su clave primaria sera tambien foranea de la clase padre
//Por tanto heredara el id
@PrimaryKeyJoinColumn(referencedColumnName = "id")
//asignamos un nombre a la tabla
@Table(name = "medicion_aspersor")
public class MedicionAspersor extends Medicion {

	private float humedad;

	public MedicionAspersor() { 
	}

	public MedicionAspersor(int id, Dispositivo dispositivo, LocalDateTime fechaHoraRegistro, float humedad) {
		super(id, dispositivo, fechaHoraRegistro);
		this.humedad = humedad;
	}

	public float getHumedad() {
		return humedad;
	}

	public void setHumedad(float humedad) {
		this.humedad = humedad;
	}

	@Override
	public String toString() {
		return "MedicionAspersor [humedad=" + humedad + "]";
	}

}