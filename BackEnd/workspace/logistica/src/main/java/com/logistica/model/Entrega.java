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
@Table(name="TBL_ENTREGA")
public class Entrega {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdEntrega;
	@Column()
	private Integer cantidadProducto ;
	@Column()
	private String fechaRegistro;/*AAAA-MM-DD*/
	@Column()
	private String fechaEntrega; 
	@Column()
	private String numeroGuia; 
	@Column(name="placa" , length=6,nullable = true )
	private String placa;
	@Column(name="puerto" , length=7,nullable = true )
	private String puerto ;
	@Column()
	private String  tipoProducto;
	@Column()
	private Double precioTotal;
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente idCliente ;
	/*Getters y Setters*/
	public Integer getIdEntrega() {
		return IdEntrega;
	}
	public void setIdEntrega(Integer idEntrega) {
		IdEntrega = idEntrega;
	}
	public Integer getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(Integer cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public String getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getNumeroGuia() {
		return numeroGuia;
	}
	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPuerto() {
		return puerto;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	public Double getPrecioTotal() {
		return precioTotal;
	}
	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public Cliente getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

}
