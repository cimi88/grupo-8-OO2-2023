package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.unla.grupo8.entities.Espacio;
import com.unla.grupo8.entities.Evento;
import com.unla.grupo8.entities.Medicion;



public abstract class DispositivoModelo {
	
		
		private int id;
		
		private String nombre;
 
		private boolean enAlta;
		
		private EspacioModelo espacioModelo;
		
		
		private Set<Medicion> mediciones = new HashSet<>();
		
		private Set<Evento> eventos = new HashSet<>();
		
		public DispositivoModelo() {}

		public DispositivoModelo(String nombre, boolean enAlta, EspacioModelo espacioModelo) {
			super();
			this.nombre = nombre;
			this.enAlta = enAlta;
			this.espacioModelo = espacioModelo;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public boolean isEnAlta() {
			return enAlta;
		}

		public void setEnAlta(boolean enAlta) {
			this.enAlta = enAlta;
		}

		
		

		public EspacioModelo getEspacioModelo() {
			return espacioModelo;
		}

		public void setEspacioModelo(EspacioModelo espacioModelo) {
			this.espacioModelo = espacioModelo;
		}

		public Set<Medicion> getMediciones() {
			return mediciones;
		}

		public void setMediciones(Set<Medicion> mediciones) {
			this.mediciones = mediciones;
		}

		public Set<Evento> getEventos() {
			return eventos;
		}

		public void setEventos(Set<Evento> eventos) {
			this.eventos = eventos;
		}

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}