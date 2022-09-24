package net.itinajero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

	
	
	@GetMapping("/")
	public String mostrarIndex() {
		
		
		return "index";
	}
	
	@GetMapping("/store")
	public String mostrarstore() {
		
		
		return "store";
	}
	
	@GetMapping("/product")
	public String mostrarProduct() {
		
		
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
