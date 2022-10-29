package net.itinajero.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import net.itinajero.model.Producto;

public interface IProductoService {
	List<Producto> buscarTodas();
	Producto buscarPorId(Integer idProducto);
	void guardar (Producto producto);
	List<Producto> buscarDestacadas();
	void eliminar(Integer idProducto);
	Page<Producto> buscarTodas(Pageable page);
}
