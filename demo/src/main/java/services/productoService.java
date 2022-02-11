package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.*;

import repository.productoRepository;

@Service
public class productoService {
	
	@Autowired
	private productoRepository productoRepository;
	
	public productos create (productos producto) {
		return productoRepository.save(producto);
	}
	
	public List<productos> getAllproductos() {
		return productoRepository.findAll();
	}

}
