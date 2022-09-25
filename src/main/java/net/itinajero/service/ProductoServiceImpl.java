package net.itinajero.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.itinajero.model.Producto;

@Service 
public class  ProductoServiceImpl implements IProductoService{

private List<Producto> lista = null;
	
public ProductoServiceImpl() {
   
	lista = new LinkedList<Producto>();
	
	//Creamos el producto 1
	Producto producto1 = new Producto();
	producto1.setId(1);
	producto1.setNombre("Apple MacBook Air");
	producto1.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
	producto1.setPrecio(100000.0);
	producto1.setDescuento("15%");
	producto1.setCategoria(1);
	producto1.setOferta("1");
	producto1.setImagen("product01.png");
	producto1.setDisponible(1);
	producto1.setNew(1);
	
	//Creamos el producto 2
	Producto producto2 = new Producto();
	producto2.setId(2);
	producto2.setNombre("Sony LinkBuds");
	producto2.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
	producto2.setPrecio(1500.0);
	producto2.setDescuento("10%");
	producto2.setCategoria(2);
	producto2.setOferta("2");
	producto2.setImagen("product02.png");
	producto2.setDisponible(1);
	producto2.setNew(0);
	
	//Creamos el producto 3
		Producto producto3 = new Producto();
		producto3.setId(3);
		producto3.setNombre("Dell XPS 15");
		producto3.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		producto3.setPrecio(140000.0);
		producto3.setDescuento("25%");
		producto3.setCategoria(1);
		producto3.setOferta("3");
		producto3.setImagen("product03.png");
		producto3.setDisponible(0);
		producto3.setNew(1);

		//Creamos el producto 4
		Producto producto4 = new Producto();
		producto4.setId(4);
		producto4.setNombre("Lenovo Yoga Tab 13");
		producto4.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		producto4.setPrecio(20000.0);
		producto4.setDescuento("30%");
		producto4.setCategoria(3);
		producto4.setOferta("4");
		producto4.setImagen("product04.png");
		producto4.setDisponible(1);
		producto4.setNew(1);
		
		//Creamos el producto 4
		Producto producto5 = new Producto();
		producto5.setId(5);
		producto5.setNombre("Jabra Elite Sport");
		producto5.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		producto5.setPrecio(1700.0);
		producto5.setDescuento("5%");
		producto5.setCategoria(2);
		producto5.setOferta("5");
		producto5.setImagen("product05.png");
		producto5.setDisponible(0);
		producto5.setNew(1);
		
		//Creamos el producto 6
		Producto producto6 = new Producto();
		producto6.setId(6);
		producto6.setNombre("Asus ROG Zephyrus G14");
		producto6.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		producto6.setPrecio(70000.0);
		producto6.setDescuento("35%");
		producto6.setCategoria(1);
		producto6.setOferta("6");
		producto6.setImagen("product06.png");
		producto6.setDisponible(1);
		producto6.setNew(1);

		//Creamos el producto 7
		Producto producto7 = new Producto();
		producto7.setId(7);
		producto7.setNombre("Huawei");
		producto7.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		producto7.setPrecio(20000.0);
		producto7.setDescuento("22%");
		producto7.setCategoria(4);
		producto7.setOferta("7");
		producto7.setImagen("product07.png");
		producto7.setDisponible(0);
		producto7.setNew(0);

		//Creamos el producto 8
		Producto producto8 = new Producto();
		producto8.setId(8);
		producto8.setNombre("LG Gram 17");
		producto8.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		producto8.setPrecio(280000.0);
		producto8.setDescuento("18%");
		producto8.setCategoria(1);
		producto8.setOferta("8");
		producto8.setImagen("product08.png");
		producto8.setDisponible(1);
		producto8.setNew(0);
		
		//Creamos el producto 9
		Producto producto9 = new Producto();
		producto9.setId(9);
		producto9.setNombre("Cámaras Reflex");
		producto9.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		producto9.setPrecio(2500.0);
		producto9.setDescuento("8%");
		producto9.setCategoria(5);
		producto9.setOferta("9");
		producto9.setImagen("product09.png");
		producto9.setDisponible(0);
		producto9.setNew(1);
		
		/**
		 * Agregamos los 4 objetos de tipo Vacante a la lista ...
		 */
		lista.add(producto1);			
		lista.add(producto2);
		lista.add(producto3);
		lista.add(producto4);
		lista.add(producto5);			
		lista.add(producto6);
		lista.add(producto7);
		lista.add(producto8);
		lista.add(producto9);
     
}
public List<Producto> buscarTodas() {
	return lista;
}

public Producto buscarPorId(Integer idProducto) {
for(Producto v : lista) {
	if(v.getId()==idProducto) {
		return v;
	}
}

return null;
}

}
