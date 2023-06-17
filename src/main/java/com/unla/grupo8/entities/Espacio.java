package com.unla.grupo8.entities;

import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

//Espacio hace referencia a un sector de la Universidad, siendo este zona norte, sur , este y oeste.
//para este caso contaremos con nombres como NO(noroeste), SO(suroeste) , etc.

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "espacio")
public class Espacio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//nombre del espacio
	private String nombre;
	
	@Column(name="creado")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name="actualizado")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	@ManyToMany(mappedBy = "espacios")
		public Set<Dispositivo> dispositivos = new HashSet<>();

	public Espacio () {}

	public Espacio(int id, String nombre, Set<Dispositivo> dispositivos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dispositivos = dispositivos;
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Espacio other = (Espacio) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Espacio [id=" + id + ", nombre=" + nombre + ", dispositivos=" + dispositivos + "]";
	}
}
