package com.unla.grupo8.models;


import java.time.LocalDateTime;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class MedicionBasuraModelo extends MedicionModelo{
	@Min(0)
	@Max(100)
	private float litrosOcupados;

	public MedicionBasuraModelo(){}

	public MedicionBasuraModelo(int id, int idDispositivo, LocalDateTime fechaHoraRegistro,float litrosOcupados) {
		super(id, idDispositivo, fechaHoraRegistro);
		// TODO Auto-generated constructor stub
		this.litrosOcupados = litrosOcupados;
	}

	public float getLitrosOcupados() {
		return litrosOcupados;
	}

	public void setLitrosOcupados(float litrosOcupados) {
		this.litrosOcupados = litrosOcupados;
	}
	
}
