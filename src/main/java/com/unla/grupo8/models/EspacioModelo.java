package com.unla.grupo8.models;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import com.unla.grupo8.entities.Dispositivo;


public class EspacioModelo {
	
	private int id;
	//nombre del espacio
	private String nombre;
<<<<<<< HEAD
	 
=======
	
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
	private Set<Dispositivo> dispositivos = new HashSet<>();

	public EspacioModelo() {}

	public EspacioModelo(int id, String nombre, Set<Dispositivo> dispositivos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dispositivos = dispositivos;
	}
	

	public EspacioModelo(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	public Set<Dispositivo> getDispositivos() {
		return dispositivos;
	}

	public void setDispositivos(Set<Dispositivo> dispositivos) {
		this.dispositivos = dispositivos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

