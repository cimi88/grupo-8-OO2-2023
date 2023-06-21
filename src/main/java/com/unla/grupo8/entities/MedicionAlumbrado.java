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
@PrimaryKeyJoinColumn(referencedColumnName="id")
//asignamos un nombre a la tabla
@Table(name = "medicion_alumbrado")
public class MedicionAlumbrado extends Medicion {
	
	private float luminiscencia;
	
	public MedicionAlumbrado () {}

	public MedicionAlumbrado(int id, Dispositivo dispositivo, LocalDateTime fechaHoraRegistro, float luminiscencia) {
		super(id, dispositivo, fechaHoraRegistro);
		this.luminiscencia = luminiscencia;
	}

	public float getLuminiscencia() {
		return luminiscencia;
	}

	public void setLuminiscencia(float luminiscencia) {
		this.luminiscencia = luminiscencia;
	}
	
	@Override
	public String toString() {
		return "MedicionAlumbrado [luminiscencia=" + luminiscencia + "]";
	}
	
	

}
