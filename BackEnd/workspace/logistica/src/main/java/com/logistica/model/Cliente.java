package com.logistica.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	@Column(name="numeroIdentificacionCliente" ,length=30)
	private String numeroIdentificacionCliente;
	@Column(name="tipoIdentificacionCliente" ,length=30)
	private String tipoIdentificacionCliente;
	@Column(name="nombreCliente" ,length=30)
	private String nombreCliente ;
	@Column(name="tipoProducto" ,length=100)
	private String tipoProducto;
	@Column(name="direccion" ,length=100)
	private String direccion;
	/*Getters y Setters*/
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNumeroIdentificacionCliente() {
		return numeroIdentificacionCliente;
	}
	public void setNumeroIdentificacionCliente(String numeroIdentificacionCliente) {
		this.numeroIdentificacionCliente = numeroIdentificacionCliente;
	}
	public String getTipoIdentificacionCliente() {
		return tipoIdentificacionCliente;
	}
	public void setTipoIdentificacionCliente(String tipoIdentificacionCliente) {
		this.tipoIdentificacionCliente = tipoIdentificacionCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
}
