package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("se crea el propietario" + propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("se elimina el propietario" + cedula);	
	}
	
	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario pro = new Propietario();
		pro.setApellido(cedula);
		pro.setNombre("Alex");
		pro.setFecha(LocalDateTime.now());
		pro.setCedula(cedula);
		return pro;
	}

}
