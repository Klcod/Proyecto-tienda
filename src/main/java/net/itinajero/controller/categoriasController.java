package net.itinajero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/categorias")
public class categoriasController {

	// @GetMapping("/create")
		@RequestMapping(value="/create", method=RequestMethod.GET)
		public String crear() {
		return "categorias/formCat";
		}

		@RequestMapping(value="/save", method=RequestMethod.POST)
		public String guardar(@RequestParam("nombre") String nombre, Model model) {
			model.addAttribute("nombre", nombre);
			System.out.println("Nombre es: " + nombre);
		
		return "categorias/creado";
	}
		@GetMapping("/listCategorias")
		public String vistaCategorias() {
			return "/categorias/listCategorias";
		}
	
	
}
