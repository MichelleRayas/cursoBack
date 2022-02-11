package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.productos;

import services.productoService;

@RestController
@RequestMapping("/api")
public class productosController {
	private productoService categService;
	
	@Autowired
	public productosController(productoService Dem) {}
	
	@GetMapping("/productos")
	public List<productos> getAllProductos() {
		return categService.getAllproductos();
	}
	
	@PostMapping("/productos")
	public productos createProducto(@RequestBody productos producto) {
		return categService.create(producto);
	}
	
}
