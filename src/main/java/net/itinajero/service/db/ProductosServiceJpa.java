package net.itinajero.service.db;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import net.itinajero.model.Producto;
import net.itinajero.repository.ProductosRepository;
import net.itinajero.service.IProductoService;

@Service
@Primary
public class ProductosServiceJpa implements IProductoService {

	@Autowired
	private ProductosRepository productosRepo;
	
	@Override
	public List<Producto> buscarTodas() {
		return productosRepo.findAll();
	}

	@Override
	public Producto buscarPorId(Integer idProducto) {
		Optional<Producto> optional = productosRepo.findById(idProducto);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Producto producto) {
		productosRepo.save(producto);
	}

	@Override
	public List<Producto> buscarDestacadas() {
		return productosRepo.findByNuevoAndDisponibleOrderByIdDesc(2, 2);
	}

	@Override
	public void eliminar(Integer idProducto) {
		productosRepo.deleteById(idProducto);
	}

	@Override
	public Page<Producto> buscarTodas(Pageable page) {
		return productosRepo.findAll(page);
	}

}
