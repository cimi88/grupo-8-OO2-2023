package com.unla.grupo8.models;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public class MedicionAlumbradoModelo extends MedicionModelo {

	@Min(0)
	@Max(100)
	private float luminiscencia;
	
	public MedicionAlumbradoModelo () {}

	public MedicionAlumbradoModelo(int id, int idDispositivo, LocalDateTime fechaHoraRegistro, float luminiscencia) {
		super(id, idDispositivo, fechaHoraRegistro);
		
		this.luminiscencia = luminiscencia;
	}

	public float getLuminiscencia() {
		return luminiscencia;
	}

	public void setLuminiscencia(float luminiscencia) {
		this.luminiscencia = luminiscencia;
	}

	@Override
	public String toString() {
		return super.toString()+"MedicionAlumbradoModelo [luminiscencia=" + luminiscencia + "]";
	}
	
	
}
