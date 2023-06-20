package com.unla.grupo8.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "dispositivo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Dispositivo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nombre;

	private boolean enAlta;

	@Column(name = "creado")
	@CreationTimestamp
	private LocalDateTime createdAt;

	@Column(name = "actualizado")
	@UpdateTimestamp
	private LocalDateTime updatedAt;

	// la relacion en esta tabla es bidireccional
	// y diremos que muchos dispositivos van a perteneces a un espacio
	// la entidad propietaria la tendra espacio
	@ManyToOne()
	@JoinColumn(name = "espacio_id")
	private Espacio espacio;

	// Relacion Bidireccional con medicion
	@OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonManagedReference
	private Set<Medicion> mediciones = new HashSet<>();

	@JsonManagedReference
	@OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Evento> eventos = new HashSet<>();

	public Dispositivo() {
	}

	public Dispositivo(int id, String nombre, LocalDateTime createdAt, LocalDateTime updatedAt, Espacio espacio,
			Set<Medicion> mediciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.enAlta = true;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.espacio = espacio;
		this.mediciones = mediciones;
	}

	public Dispositivo(int id, String nombre, Espacio espacio, Set<Medicion> mediciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.enAlta = true;
		this.espacio = espacio;
		this.mediciones = mediciones;
	}

	public Dispositivo(int id, String nombre, boolean enAlta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.enAlta = enAlta;
	}

	public Dispositivo(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.enAlta = true;
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

	public Espacio getEspacios() {
		return espacio;
	}

	public void setEspacio(Espacio espacio) {
		this.espacio = espacio;
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
				+ ", updatedAt=" + updatedAt + ", espacio=" + espacio + ", mediciones=" + mediciones + "]";
	}
}
 