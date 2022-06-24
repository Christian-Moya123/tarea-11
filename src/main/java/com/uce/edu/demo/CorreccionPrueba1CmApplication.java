package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class CorreccionPrueba1CmApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CorreccionPrueba1CmApplication.class, args);
	}
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaGestorService iMatriculaGestorService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("toyota");
		vehiculo.setPlaca("sts2222");
		vehiculo.setPrecio(new BigDecimal(50000));
		vehiculo.setTipo("L");
		
		this.iVehiculoService.insertarV(vehiculo);
		
		//Punto 2
		vehiculo.setPrecio(new BigDecimal(3500));
		vehiculo.setMarca("AWM");
		this.iVehiculoService.actualizarV(vehiculo);
		
		
		//Punto 3
		Propietario pro = new Propietario();
		pro.setApellido("Moya");
		pro.setNombre("Christian");
		pro.setCedula("12312312");
		pro.setFecha(LocalDateTime.now());
		this.iPropietarioService.crear(pro);
		
		//Punto 4
		this.iMatriculaGestorService.generarMaatricula("12312312", "sts2222");
		
	}

}
