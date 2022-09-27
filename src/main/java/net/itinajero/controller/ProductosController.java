package net.itinajero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.itinajero.model.Producto;
import net.itinajero.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	private IProductoService serviceProducto;
	
	@GetMapping("/delete")
	public String eliminar (@RequestParam("id") int idProductos, Model model) {
		System.out.println("Borrando producto con ID: " + idProductos);
		model.addAttribute("id", idProductos);
		return "mensaje";
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idProductos, Model model) {
		Producto producto = serviceProducto.buscarPorId(idProductos);
		System.out.println("Producto: " + producto);
		model.addAttribute("producto", producto);
		
		//Buscar los detalles de los productos en la BD...
		return "detalle";
	}
}
