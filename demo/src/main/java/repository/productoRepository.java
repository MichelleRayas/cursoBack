package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.*;

public interface productoRepository extends JpaRepository <productos, Long> {

}
