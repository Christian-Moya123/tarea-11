package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Propietario;

public interface IPropietarioRepository {
	public void crear(Propietario propietario);
	public void eliminar(String cedula);
	public Propietario consultar(String cedula);

}
