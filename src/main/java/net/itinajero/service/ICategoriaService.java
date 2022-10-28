package net.itinajero.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.itinajero.model.Categoria;
import net.itinajero.model.Producto;

public interface ICategoriaService {
	void guardar(Categoria categoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);
	
	// Ejercicio: Implementar método
		void eliminar(Integer idCategoria);

		Page<Categoria> buscarTodas(Pageable page);
}
