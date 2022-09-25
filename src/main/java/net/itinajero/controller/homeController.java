package net.itinajero.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.itinajero.model.Producto;
import net.itinajero.service.IProductoService;

@Controller
public class homeController {

	@GetMapping("/listado")
	public String mostrarlistado(Model model) {
		List<String> producto = new LinkedList<String>();
		producto.add("product name goes here");
		producto.add("product name goes here");
		producto.add("product name goes here");
		producto.add("product name goes here");
		producto.add("product name goes here");
		producto.add("product name goes here");
		
		model.addAttribute("producto", producto);
		
		return "listado";
	}
	
	@GetMapping("/")
	public String mostrarIndex() {
		
		 
		return "index";
	}
	
	@GetMapping("/store")
	public String mostrarstore() {
		
		
		return "store";
	}
	
	@Autowired
	private IProductoService serviceProducto;
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Producto> lista = serviceProducto.buscarTodas();
		model.addAttribute("producto", lista);
		return "tabla";
		
	}
	
	@GetMapping("/product")
	public String mostrarProduct(Model model) {
		Producto producto = new Producto();
		producto.setNombre("PRODUCT NAME GOES HERE");
		producto.setPrecio(980.00);
		producto.setDescripcion("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.");
		
		model.addAttribute("producto", producto);
		
		return "product";
	}
	
	@GetMapping("/checkout")
	public String mostrarCheckout() {
		
		
		return "checkout";
	}
	
	@GetMapping("/blank")
	public String mostrarBlank() {
		
		
		return "blank";
	}
	
	
	@GetMapping("/hotdeals")
	public String mostrarDeals() {
		
		
		return "hotdeals";
	}
	
	@GetMapping("/categories")
	public String mostrarCategories() {
		
		
		return "categories";
	}
	
	@GetMapping("/laptobs")
	public String mostrarLaptobs() {
		
		
		return "laptobs";
	}
	
	@GetMapping("/smartphones")
	public String mostrarSmartphones() {
		
		
		return "smartphones";
	}
	
	@GetMapping("/cameras")
	public String mostrarCameras() {
		
		
		return "cameras";
	}
	
	@GetMapping("/accessories")
	public String mostrarAccessories() {
		
		
		return "accessories";
	}
	
	@GetMapping("/deseos")
	public String mostrarDeseos() {
		
		
		return "deseos";
	}
	
	@GetMapping("/carro")
	public String mostrarCarro() {
		
		
		return "carro";
	}
	
	@GetMapping("/acerca")
	public String mostrarAcerca() {
		
		
		return "acerca";
	}
	
	@GetMapping("/micuenta")
	public String mostrarMicuenta() {
		
		
		return "micuenta";
	}
	
	@GetMapping("/contacto")
	public String mostrarContacto() {
		
		
		return "contacto";
	}
		
	}

