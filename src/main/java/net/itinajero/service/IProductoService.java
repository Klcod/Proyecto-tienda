package net.itinajero.service;

import java.util.List;

import net.itinajero.model.Producto;

public interface IProductoService {
	List<Producto> buscarTodas();
	Producto buscarPorId(Integer idProducto);
	void guardar (Producto producto);

}
