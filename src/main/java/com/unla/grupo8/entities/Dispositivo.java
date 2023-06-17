package com.unla.grupo8.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;

import jakarta.persistence.JoinColumn;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "dispositivo")
public abstract class Dispositivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	
	private boolean enAlta;
	
	@Column(name="creado")
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@Column(name="actualizado")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	//la relacion en esta tabla es bidireccional
	@ManyToMany(cascade = {
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
		@JoinTable(name = "dispositivo_espacio",
		joinColumns = @JoinColumn(name = "dispositivo_id"),
		inverseJoinColumns = @JoinColumn(name = "espacio_id")
		)
	private Set<Espacio> espacios = new HashSet<>();
	
	//Relacion Bidireccional con medicion
	@OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Medicion> mediciones;
	
	@OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Evento> eventos;
	
	public Dispositivo () {}

	public Dispositivo(int id, String nombre, boolean enAlta, LocalDateTime createdAt, LocalDateTime updatedAt,
			Set<Espacio> espacios, Set<Medicion> mediciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.enAlta = enAlta;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.espacios = espacios;
		this.mediciones = mediciones;
	}

	public Dispositivo(int id, String nombre, boolean enAlta, Set<Espacio> espacios, Set<Medicion> mediciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.enAlta = enAlta;
		this.espacios = espacios;
		this.mediciones = mediciones;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Set<Espacio> getEspacios() {
		return espacios;
	}

	public void setEspacios(Set<Espacio> espacios) {
		this.espacios = espacios;
	}

	public Set<Medicion> getMediciones() {
		return mediciones;
	}

	public void setMediciones(Set<Medicion> mediciones) {
		this.mediciones = mediciones;
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
		Dispositivo other = (Dispositivo) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Dispositivo [id=" + id + ", nombre=" + nombre + ", enAlta=" + enAlta + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", espacios=" + espacios + ", mediciones=" + mediciones + "]";
	}
	
	

}
