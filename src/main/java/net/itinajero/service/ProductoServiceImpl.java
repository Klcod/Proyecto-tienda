	package net.itinajero.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.text.ParseException;  
//import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.itinajero.model.Producto;

@Service 
public class  ProductoServiceImpl implements IProductoService{

private List<Producto> lista = null;
	
public ProductoServiceImpl() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	lista = new LinkedList<Producto>();
	
		
	//Creamos el producto 1
	Producto producto1 = new Producto();
	producto1.setId(1);
	producto1.setNombre("Apple MacBook Air");
	producto1.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
	producto1.setPrecio(100000.0);
	producto1.setDescuento("15%");
	producto1.setCategoria("Laptops");
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
	producto2.setCategoria("Audifonos");
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
		producto3.setCategoria("Laptops");
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
		producto4.setCategoria("Laptops");
		producto4.setOferta("4");
		producto4.setImagen("product04.png");
		producto4.setDisponible(1);
		producto4.setNew(1);
		
		//Creamos el producto 5
		Producto producto5 = new Producto();
		producto5.setId(5);
		producto5.setNombre("Jabra Elite Sport");
		producto5.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		producto5.setPrecio(1700.0);
		producto5.setDescuento("5%");
		producto5.setCategoria("Audifonos");
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
		producto6.setCategoria("Laptops");
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
		producto7.setCategoria("Celular");
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
		producto8.setCategoria("Laptops");
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
		producto9.setCategoria("Camaras");
		producto9.setOferta("9");
		producto9.setImagen("product09.png");
		producto9.setDisponible(0);
		producto9.setNew(1);
		
		
		//Creamos el producto 10
	   Producto producto10 = new Producto();
	   producto10.setId(10);
	   producto10.setNombre("MacBook Pro de 14 pulgadas");
	   producto10.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
	   producto10.setPrecio(917300.0);
	   producto10.setDescuento("8%");
	   producto10.setCategoria("laptop");
	   producto10.setOferta("10");
	   producto10.setImagen("product10.png");
	   producto10.setDisponible(0);
	   producto10.setNew(1);
				
				
	   //Creamos el producto 11
	   Producto producto11 = new Producto();
	   producto11.setId(11);
	   producto11.setNombre("IPhone 13 Pro Max");
	   producto11.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
	   producto11.setPrecio(23000.0);
	   producto11.setDescuento("8%");
	   producto11.setCategoria("celular");
	   producto11.setOferta("11");
	   producto11.setImagen("product11.png");
	   producto11.setDisponible(0);
	   producto11.setNew(1);
							
							
	   //Creamos el producto 12
	   Producto producto12 = new Producto();
	   producto12.setId(12);
	   producto12.setNombre("Sony Audífonos inalámbricos WH-CH510");
	   producto12.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
	   producto12.setPrecio(917300.0);
	   producto12.setDescuento("17%");
	   producto12.setCategoria("Audifonos");
	   producto12.setOferta("12");
	   producto12.setImagen("product12.png");
	   producto12.setDisponible(0);
	   producto12.setNew(1);
										
										
										
	  //Creamos el producto 13
	   Producto producto13 = new Producto();
	   producto13.setId(13);
	   producto13.setNombre("CANON EOS 4000D");
	   producto13.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
	   producto13.setPrecio(917300.0);
	   producto13.setDescuento("8%");
	   producto13.setCategoria("camara");
	   producto13.setOferta("13");
	   producto13.setImagen("product13.png");
	   producto13.setDisponible(0);
	   producto13.setNew(1);
		
	   
	 //Creamos el producto 14
	   Producto producto14 = new Producto();
	   producto14.setId(14);
	   producto14.setNombre("NIKON D750");
	   producto14.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
	   producto14.setPrecio(27000.0);
	   producto14.setDescuento("8%");
	   producto14.setCategoria("camara");
	   producto14.setOferta("14");
	   producto14.setImagen("product14.png");
	   producto14.setDisponible(0);
	   producto14.setNew(1);
		
	   
	 //Creamos el producto 15
	   Producto producto15 = new Producto();
	   producto15.setId(15);
	   producto15.setNombre("Samsung Galaxy S22 Ultra");
	   producto15.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
	   producto15.setPrecio(917300.0);
	   producto15.setDescuento("9%");
	   producto15.setCategoria("celular");
	   producto15.setOferta("15");
	   producto15.setImagen("product15.png");
	   producto15.setDisponible(0);
	   producto15.setNew(1);
		
	   
	   
	   
	   
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
		lista.add(producto10);
		lista.add(producto11);
		lista.add(producto12);
		lista.add(producto13);
		lista.add(producto14);
		lista.add(producto15);
	
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
		@Override
		public void guardar(Producto producto) {
			lista.add(producto);
			
		}

}
