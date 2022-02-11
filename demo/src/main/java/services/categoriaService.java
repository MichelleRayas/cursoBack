package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.*;

import repository.categoriaRepository;

@Service
public class categoriaService {
	
	@Autowired
	private categoriaRepository categoriaRepository;
	
	public categorias create (categorias categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public List<categorias> getAllCategorias() {
		return categoriaRepository.findAll();
	}

}
