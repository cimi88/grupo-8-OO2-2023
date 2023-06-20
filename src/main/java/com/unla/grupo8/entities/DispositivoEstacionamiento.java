package com.unla.grupo8.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@PrimaryKeyJoinColumn(referencedColumnName="id")
@Table(name = "dispositivo_alumbrado")
public class DispositivoEstacionamiento extends Dispositivo {
	
	private Lugar lugar;
	

}
