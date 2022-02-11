package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.productos;

import io.swagger.annotations.Api;
import services.productoService;

@CrossOrigin(origins = "http://localhost:8090")
@RestController
@RequestMapping("/api")
@Api(value = "Producto")
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
