package com.uce.edu.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	private Propietario propietario;
	private BigDecimal valorMatricula;
	private Vehiculo vehiculo;
	private LocalDateTime fechaMatricula;
	
	
	@Override
	public String toString() {
		return "Matricula [propietario=" + propietario + ", valorMatricula=" + valorMatricula + ", vehiculo=" + vehiculo
				+ ", fechaMatricula=" + fechaMatricula + "]";
	}
	
	//get y set
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	
	

}
