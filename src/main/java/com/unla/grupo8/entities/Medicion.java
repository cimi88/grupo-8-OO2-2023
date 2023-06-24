package com.unla.grupo8.entities;

import java.time.LocalDateTime;
<<<<<<< HEAD

=======
import java.util.Objects;
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
=======
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "medicion")
<<<<<<< HEAD
@Inheritance(strategy = InheritanceType.JOINED)
=======
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
public abstract class Medicion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
	protected int id;
	
	@ManyToOne()
	@JoinColumn( name = "dispositivo_id")
	@JsonBackReference
	protected Dispositivo dispositivo;
	
	protected LocalDateTime fechaHoraRegistro;
=======
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "dispositivo_id")
	@JsonBackReference
	private Dispositivo dispositivo;
	
	private LocalDateTime fechaHoraRegistro;
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
	
	public Medicion() {}

	public Medicion(int id, Dispositivo dispositivo, LocalDateTime fechaHoraRegistro) {
		super();
		this.id = id;
		this.dispositivo = dispositivo;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

	public LocalDateTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}

	public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

<<<<<<< HEAD
	
}
=======
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
		Medicion other = (Medicion) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Medicion [id=" + id + ", dispositivo=" + dispositivo + ", fechaHoraRegistro=" + fechaHoraRegistro + "]";
	}

}
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
