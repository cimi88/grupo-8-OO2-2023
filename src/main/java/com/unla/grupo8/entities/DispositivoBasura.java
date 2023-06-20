package com.unla.grupo8.entities;
import java.time.LocalDateTime;
import java.util.Set;

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
@Table(name = "dispositivo_basura")
public class DispositivoBasura extends Dispositivo{


		private boolean lleno;
		
		private float capacidadLitros;
		
		public DispositivoBasura () {}

		public DispositivoBasura(int id, String nombre, Espacio espacio, Set<Medicion> mediciones, boolean lleno, float capacidadLitros) {
			super(id, nombre, espacio, mediciones);
			// TODO Auto-generated constructor stub
			this.lleno = lleno;
			this.capacidadLitros = capacidadLitros;
		}

		public DispositivoBasura(int id, String nombre, boolean enAlta, LocalDateTime createdAt,
				LocalDateTime updatedAt, Espacio espacio, Set<Medicion> mediciones, boolean lleno, float capacidadLitros) {
			super(id, nombre, createdAt, updatedAt, espacio, mediciones);
			// TODO Auto-generated constructor stub
			this.lleno = lleno;
			this.capacidadLitros = capacidadLitros;
		}

		public DispositivoBasura(int id, String nombre,  boolean lleno, float capacidadLitros) {
			super(id, nombre);
			// TODO Auto-generated constructor stub
			this.lleno = lleno;
			this.capacidadLitros = capacidadLitros;
		}

		public boolean isLleno() {
			return lleno;
		}

		public void setLleno(boolean lleno) {
			this.lleno = lleno;
		}

		public float getCapacidadLitros() {
			return capacidadLitros;
		}

		public void setCapacidadLitros(float capacidadLitros) {
			this.capacidadLitros = capacidadLitros;
		}
		
}
