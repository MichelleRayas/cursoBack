package com.example.demo;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import controllers.productosController;

@SpringBootTest
public class test {
	@Autowired
	private productosController productosController; 
	
	@SuppressWarnings("restriction")
	@Test
	void getAll() {
		List<productos> productos;
		productos = productosController.getAllProductos();
		
		assertNotNull(productos);
	}
	
	@SuppressWarnings("restriction")
	@Test
	void createProducto() {
		productos testProducto = new productos();
		testProducto.setId(1);
		testProducto.setName("Telefono");
		
		productos newProducto = productosController.createProducto(testProducto);
		
		assertNotNull(newProducto);
	}
}
