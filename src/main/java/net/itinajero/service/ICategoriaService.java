package net.itinajero.service;

import java.util.List;

import net.itinajero.model.Categoria;
import net.itinajero.model.Producto;

public interface ICategoriaService {
	void guardar(Categoria categoria);
	List<Categoria> buscarTodas();
	Categoria buscarPorId(Integer idCategoria);
	

}
