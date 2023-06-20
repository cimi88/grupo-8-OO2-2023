package com.unla.grupo8.entities;

import java.util.Set;



import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "playa_estacionamiento")
public class PlayaEstacionamiento {
	
	private int id;
	
	private String nombre;
	
	private boolean playaLlena;
	
	@OneToMany(mappedBy = "playa_estacionamiento", cascade = CascadeType.ALL)
	@JsonManagedReference
    private Set<Lugar> lugares;

	public PlayaEstacionamiento(int id, String nombreString, boolean playaLlena) {
		super();
		this.id = id;
		this.nombre = nombreString;
		this.playaLlena = playaLlena;
	}

	public PlayaEstacionamiento(String nombreString, boolean playaLlena) {
		super();
		this.nombre = nombreString;
		this.playaLlena = playaLlena;
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

	public void setNombre(String nombreString) {
		this.nombre = nombreString;
	}

	public boolean isPlayaLlena() {
		return playaLlena;
	}

	public void setPlayaLlena(boolean playaLlena) {
		this.playaLlena = playaLlena;
	}

	public Set<Lugar> getLugares() {
		return lugares;
	}

	public void setLugares(Set<Lugar> lugares) {
		this.lugares = lugares;
	}
	
	

}
