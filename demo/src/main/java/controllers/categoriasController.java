package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.categorias;

import io.swagger.annotations.ApiOperation;
import services.categoriaService;


@CrossOrigin(origins = "http://localhost:8090")
@RestController
@RequestMapping("/api")
public class categoriasController {
	private categoriaService categService;
	
	@Autowired
	public categoriasController(categoriaService Dem) {}
	
	@ApiOperation(value="GET", notes= "Obtiene todas las categorias")
	@GetMapping("/categorias")
	public List<categorias> getAllcategorias() {
		return categService.getAllCategorias();
	}
	
	@ApiOperation(value="POST", notes= "Inserta categorias")
	@PostMapping("/categorias")
	public categorias createcategoria(@RequestBody categorias categoria) {
		return categService.create(categoria);
	}
	
}
