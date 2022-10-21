package net.itinajero.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.itinajero.model.Categoria;
import net.itinajero.model.Producto;

@Service
public class CategoriasServiceImpl implements ICategoriaService {

	private List<Categoria> lista = null;
	
	public CategoriasServiceImpl() {
	lista = new LinkedList<Categoria>();
	
	
	Categoria cat1 = new Categoria();
	cat1.setId(1);
	cat1.setNombre("Laptobs");
	cat1.setDescripcion("Descripcion de la categorria");
	
	Categoria cat2 = new Categoria();
	cat2.setId(2);
	cat2.setNombre("smartphones");
	cat2.setDescripcion("Descripcion de la categorria");
	
	Categoria cat3 = new Categoria();
	cat3.setId(3);
	cat3.setNombre("seguridad");
	cat3.setDescripcion("Descripcion de la categorria");
	
	lista.add(cat1);
	lista.add(cat2);
	lista.add(cat3);
	
	
	
	}
	
	@Override
	public void guardar(Categoria categoria) {
		lista.add(categoria);
		
	}

	

	@Override
	public Categoria buscarPorId(Integer idCategoria) {
		for (Categoria cat : lista) {
			if(cat.getId()==idCategoria) {
				return cat;
			}
		}
		return null;
	}

	@Override
	public List<Categoria> buscarTodas() {
		// TODO Auto-generated method stub
		return lista;
	}
	
}
