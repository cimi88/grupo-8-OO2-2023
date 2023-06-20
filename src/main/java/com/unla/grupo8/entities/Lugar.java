package com.unla.grupo8.entities;

import java.time.LocalDateTime;



import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "lugar")
public class Lugar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombreLugar;
	
	private boolean lugarLibre;
	

	@Column(name="creado")
	@CreationTimestamp 
	private LocalDateTime createdAt;
	
	@Column(name="actualizado")
	@UpdateTimestamp
	private LocalDateTime updatedAt;
	
	@OneToOne(mappedBy = "lugar")
	private DispositivoEstacionamiento dispositivoEstacionamiento;
	
	@ManyToOne
	@JoinColumn(name = "persona_id")
	@JsonBackReference
	private PlayaEstacionamiento playa;

	public Lugar(int id, String nombreLugar, boolean lugarLibre, PlayaEstacionamiento playa) {
		super();
		this.id = id;
		this.nombreLugar = nombreLugar;
		this.lugarLibre = lugarLibre;
		this.playa = playa;
	}

	public Lugar(String nombreLugar, boolean lugarLibre, PlayaEstacionamiento playa) {
		super();
		this.nombreLugar = nombreLugar;
		this.lugarLibre = lugarLibre;
		this.playa = playa;
	}

	public Lugar(String nombreLugar, boolean lugarLibre) {
		super();
		this.nombreLugar = nombreLugar;
		this.lugarLibre = lugarLibre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) { 
		this.id = id;
	}

	public String getNombreLugar() {
		return nombreLugar;
	}

	public void setNombreLugar(String nombreLugar) {
		this.nombreLugar = nombreLugar;
	}

	public boolean isLugarLibre() {
		return lugarLibre;
	}

	public void setLugarLibre(boolean lugarLibre) {
		this.lugarLibre = lugarLibre;
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

	public DispositivoEstacionamiento getDispositivoEstacionamiento() {
		return dispositivoEstacionamiento;
	}

	public void setDispositivoEstacionamiento(DispositivoEstacionamiento dispositivoEstacionamiento) {
		this.dispositivoEstacionamiento = dispositivoEstacionamiento;
	}

	public PlayaEstacionamiento getPlaya() {
		return playa;
	}

	public void setPlaya(PlayaEstacionamiento playa) {
		this.playa = playa;
	}
	
	
	
	
	
}
