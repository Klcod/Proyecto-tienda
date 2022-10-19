package net.itinajero.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.itinajero.model.Producto;
import net.itinajero.service.ICategoriaService;
import net.itinajero.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService serviceProducto;
	
	
	@Autowired
	private ICategoriaService serviceCategorias;
	
	
	@GetMapping("/index")
	public String mostrarIndex(Model model) {
		List<Producto> lista = serviceProducto.buscarTodas();
		model.addAttribute("productos", lista);
		return "productos/listProduc";
	}
	
	 		@GetMapping("/create")
			public String crear(Producto producto, Model model) {
	 			model.addAttribute("categorias", serviceCategorias.buscarTodas() );
	 		return "productos/FormPr";
			}

	 		
			@PostMapping("/save")
			public String guardar(Producto producto, BindingResult result, RedirectAttributes attributes) {
				if (result.hasErrors()) {
					for (ObjectError error: result.getAllErrors()) {
						System.out.println("Ocurrio un error:" + error.getDefaultMessage());
					}
					return "productos/FormPr";
				}
			serviceProducto.guardar(producto);
			attributes.addFlashAttribute("msg", "Registro Guardado");
			System.out.println("Producto: " + producto);
			return "productos/listProduc";
		}
	
			
			
			@GetMapping("/listProduc")
			public String vistaProductos() {
				return "/productos/listProduc";
			}
			
			
			

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

