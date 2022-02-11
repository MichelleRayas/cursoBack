package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.categorias;

import services.categoriaService;

@RestController
@RequestMapping("/api")
public class categoriasController {
	private categoriaService categService;
	
	@Autowired
	public categoriasController(categoriaService Dem) {}
	
	@GetMapping("/categorias")
	public List<categorias> getAllcategorias() {
		return categService.getAllCategorias();
	}
	
	@PostMapping("/categorias")
	public categorias createcategoria(@RequestBody categorias categoria) {
		return categService.create(categoria);
	}
	
}
