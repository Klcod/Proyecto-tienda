package net.itinajero.service;

import java.util.List;

import net.itinajero.model.Producto;

public interface ICategoriaService {
	List<Producto> buscarCategoria();
	Producto buscarPorCategoria(String categoria);

}
