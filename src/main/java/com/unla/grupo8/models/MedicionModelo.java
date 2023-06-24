package com.unla.grupo8.models;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class MedicionModelo {
<<<<<<< HEAD
=======

>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
	protected int id;
	protected int idDispositivo;
	protected LocalDateTime fechaHoraRegistro;
	
	public MedicionModelo() {}

	public MedicionModelo(int id, int idDispositivo, LocalDateTime fechaHoraRegistro) {
		super();
		this.id = id;
		this.idDispositivo = idDispositivo;
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdDispositivo() {
		return idDispositivo;
	}

	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}

	public LocalDateTime getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}

	public void setFechaHoraRegistro(LocalDateTime fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}
<<<<<<< HEAD
	
=======

>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

<<<<<<< HEAD
}
=======
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicionModelo other = (MedicionModelo) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "MedicionModelo [id=" + id + ", idDispositivo=" + idDispositivo + ", fechaHoraRegistro="
				+ fechaHoraRegistro + "]";
	}
	
	
	
}
>>>>>>> cfe32ad8aa0fa464265a36a3bc5259a659a0f665
