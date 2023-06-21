//package com.unla.grupo8.entities;
//
//import java.time.LocalDateTime;
//
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.PrimaryKeyJoinColumn;
//import jakarta.persistence.Table;
//import lombok.EqualsAndHashCode;
//
////Aca creo la tabla
//@Entity
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
////Le decimos que su clave primaria sera tambien foranea de la clase padre
////Por tanto heredara el id
//@PrimaryKeyJoinColumn(referencedColumnName="id")
////le asigno el nombre a la tabla
//@Table(name = "medicion_basura")
//public class MedicionBasura extends Medicion{
//
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int idMedicionBasura;
//	
//	@Column
//	private boolean tachoCompleto;
//	
//	@Column
//	private LocalDateTime fechaHora;
//	
//	@Column(name="createdat")
//	@CreationTimestamp
//	private LocalDateTime createdAt;
//	
//	@Column(name="updateat")
//	@UpdateTimestamp
//	private LocalDateTime updateAt;
//
//	public MedicionBasura(int idMedicionBasura, boolean tachoCompleto, LocalDateTime fechaHora) {
//		super();
//		this.idMedicionBasura = idMedicionBasura;
//		this.tachoCompleto = tachoCompleto;
//		this.fechaHora = fechaHora;
//	}
//
//	public int getIdMedicionBasura() {
//		return idMedicionBasura;
//	}
//
//	public void setIdMedicionBasura(int idMedicionBasura) {
//		this.idMedicionBasura = idMedicionBasura;
//	}
//
//	public boolean isTachoCompleto() {
//		return tachoCompleto;
//	}
//
//	public void setTachoCompleto(boolean tachoCompleto) {
//		this.tachoCompleto = tachoCompleto;
//	}
//
//	public LocalDateTime getFechaHora() {
//		return fechaHora;
//	}
//
//	public void setFechaHora(LocalDateTime fechaHora) {
//		this.fechaHora = fechaHora;
//	}
//
//	public LocalDateTime getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(LocalDateTime createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public LocalDateTime getUpdateAt() {
//		return updateAt;
//	}
//
//	public void setUpdateAt(LocalDateTime updateAt) {
//		this.updateAt = updateAt;
//	}
//	
//}
