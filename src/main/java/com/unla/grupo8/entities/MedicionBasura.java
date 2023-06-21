package com.unla.grupo8.entities;

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
	
	private boolean tachoCompleto;

	public MedicionBasura(boolean tachoCompleto) {
		super();
		this.tachoCompleto = tachoCompleto;
	}

	public boolean isTachoCompleto() {
		return tachoCompleto;
	}

	public void setTachoCompleto(boolean tachoCompleto) {
		this.tachoCompleto = tachoCompleto;
	}
	
	
	
}
