package com.unla.grupo8.models;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class MedicionAspersorModelo extends MedicionModelo {
	@Min(0)
	@Max(100)
	private float humedad;

	public MedicionAspersorModelo() {
	}

	public MedicionAspersorModelo(int id, int idDispositivo, LocalDateTime fechaHoraRegistro, float humedad) {
		super(id, idDispositivo, fechaHoraRegistro);
		this.humedad = humedad;
	}

	public float getHumedad() {
		return humedad;
	}

	public void setHumedad(float humedad) {
		this.humedad = humedad;
	}

	@Override
	public String toString() {
		return super.toString() + ", humedad=" + humedad + "]";
	}
}
