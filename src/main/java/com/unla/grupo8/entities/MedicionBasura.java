package com.unla.grupo8.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

//Aca creo la tabla
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
//Le decimos que su clave primaria sera tambien foranea de la clase padre
//Por tanto heredara el id
@PrimaryKeyJoinColumn(referencedColumnName="id")
//le asigno el nombre a la tabla
@Table(name = "medicion_basura")

public class MedicionBasura extends Medicion{

	private float litrosOcupados;
	
	public MedicionBasura() {}

	public MedicionBasura(int id,Dispositivo dispositivo, LocalDateTime fechaHoraRegistro, float litrosOcupados) {
		super(id, dispositivo, fechaHoraRegistro);
		// TODO Auto-generated constructor stub
		this.litrosOcupados = litrosOcupados;
	}

	public float getLitrosOcupados() {
		return litrosOcupados;
	}

	public void setLitrosOcupados(float litrosOcupados) {
		this.litrosOcupados = litrosOcupados;
	}
	
	

	
	
}
