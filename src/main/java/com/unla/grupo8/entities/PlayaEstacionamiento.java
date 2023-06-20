package com.unla.grupo8.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "playa_estacionamiento")
public class PlayaEstacionamiento {
	
	private int id;
	
	private String nombreString;
	
	private boolean playaLlena;
	
    private Set<Lugar> lugares;

}
