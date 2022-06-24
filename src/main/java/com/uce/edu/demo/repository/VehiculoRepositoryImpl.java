package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println(" se a insertado el vehiculo");
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println(" se a actuaalizado el vehiculo");
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println(" se a eliminado el vehiculo");
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println(" se a buscado  el vehiculo");	
		Vehiculo vehi = new Vehiculo();
		vehi.setPlaca(placa);
		vehi.setMarca("toyota");
		vehi.setTipo("pesado");
		vehi.setPrecio(new BigDecimal(1200));
		
		return vehi;
	}

}
