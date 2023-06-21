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
		
		private int idEspacio;
		
		
		private Set<Medicion> mediciones = new HashSet<>();
		
		private Set<Evento> eventos = new HashSet<>();
		
		public DispositivoModelo() {}

		public DispositivoModelo(String nombre, int idEspacio) {
			super();
			this.nombre = nombre;
			this.enAlta = true;
			this.idEspacio = idEspacio;
		}
		
		 

		public DispositivoModelo(int id, String nombre, int idEspacio) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.idEspacio = idEspacio;
		     this.setEnAlta(enAlta);
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

		
		
      

		public int getIdEspacio() {
			return idEspacio;
		}

		public void setIdEspacio(int idEspacio) {
			this.idEspacio = idEspacio;
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
