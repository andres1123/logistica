package com.logistica.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_MEDIO_ALMACENAMIENTO")
public class MedioAlmacenamiento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdMedioAlmacenamiento;

	@Column(name="nombre" ,length=100)
   private String nombre; 
	@Column(name="ubicacion" ,length=100)
	private String ubicacion;
	@Column(name="tipoAlmacenamiento" ,length=10)
	private String tipoAlmacenamiento;
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente idCliente ;
	
	/*Getters y Setters*/

	public Integer getIdMedioAlmacenamiento() {
		return IdMedioAlmacenamiento;
	}
	public void setIdMedioAlmacenamiento(Integer idMedioAlmacenamiento) {
		IdMedioAlmacenamiento = idMedioAlmacenamiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTipoAlmacenamiento() {
		return tipoAlmacenamiento;
	}
	public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
		this.tipoAlmacenamiento = tipoAlmacenamiento;
	}
	public Cliente getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
	

}
