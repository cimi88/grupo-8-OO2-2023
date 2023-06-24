package com.unla.grupo8.services;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.unla.grupo8.entities.Usuario;
public interface IUserRepository extends JpaRepository<Usuario, Serializable> {
	@Query("SELECT u FROM Usuario u JOIN FETCH u.userRoles WHERE u.username = (:username)")
	public abstract Usuario findByUsernameAndFetchUserRolesEagerly(@Param("username") String username);
}
