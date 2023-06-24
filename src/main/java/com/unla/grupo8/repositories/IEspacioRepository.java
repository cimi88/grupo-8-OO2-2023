package com.unla.grupo8.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.grupo8.entities.Espacio;
<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1

@Repository("espacioRepository")
public interface IEspacioRepository extends JpaRepository<Espacio,Serializable> {
	public abstract Espacio findById(int id);
<<<<<<< HEAD
	
	public abstract Espacio findByNombre(String nombre); 
}
=======
}



>>>>>>> 0d4fe9b236b7ef52aded076436abda4f87bc9aa1
