package net.itinajero.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import net.itinajero.model.Perfil;
import net.itinajero.model.Producto;
import net.itinajero.model.Usuario;
import net.itinajero.service.ICategoriaService;
import net.itinajero.service.IProductoService;
import net.itinajero.service.IUsuariosService;

@Controller
public class homeController {
	
	@Autowired
	private ICategoriaService serviceCategorias;
	
	@Autowired
	private IProductoService serviceProducto;
	
	@Autowired
    private IUsuariosService serviceUsuarios;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping("/signup")
	public String registrarse(Usuario usuario,Model model) {
		return "usuarios/formRegistro";
	}  
	
	@GetMapping("/index")
	public String mostrarIndex(Authentication auth, HttpSession session) {
		String username = auth.getName();
		System.out.println("Nombre del usuario: " + username);
		
		for (GrantedAuthority rol: auth.getAuthorities()) {
			System.out.println("ROL: " + rol.getAuthority());
		}
		
		if (session.getAttribute("usuario") == null) {
			Usuario usuario = serviceUsuarios.buscarPorUsername(username);
			usuario.setPassword(null);
			System.out.println("Usuario: " + usuario);
			session.setAttribute("usuario", usuario);
		}	
		return "redirect:/";
	}
	
	@PostMapping("/signup")
	public String guardarRegistro(Usuario usuario, RedirectAttributes attributes) {
		
		String pwdPlano = usuario.getPassword();
		String pwdEncriptado = passwordEncoder.encode(pwdPlano);
		usuario.setPassword(pwdEncriptado);
		
		 //Ejercicio.
		usuario.setEstatus(1);
		usuario.setFechaRegistro(new Date());
		 
		 Perfil perfil = new Perfil();
		 perfil.setId(3);
		 usuario.agregar(perfil);
		 
		serviceUsuarios.guardar(usuario);
		attributes.addFlashAttribute("msg", "El registrado fue guardado exitosamente");		
		
		return "redirect:/usuarios/index";
	}
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
	
	@GetMapping("/login" )
	public String mostrarLogin() {
		return "formLogin";
	}
	
	@GetMapping("/logout")
	public String logout(HttpServletRequest request){
		SecurityContextLogoutHandler logoutHandler =
		new SecurityContextLogoutHandler();
		logoutHandler.logout(request, null, null);
		return "redirect:/index";
	}
	
	@GetMapping("/bcrypt/{texto}")
	@ResponseBody
	public String encriptar(@PathVariable("texto") String texto) {
		return texto + " Encriptado en Bcrypt: " + passwordEncoder.encode(texto);
	}
	
	@GetMapping("/")
	public String mostrarIndex(Model model) {	
		return "index";
	}
		@ModelAttribute
	public void setGenericos(Model model) {
			model.addAttribute("producto", serviceProducto.buscarDestacadas());
	}
	
	
	
	
	
	@GetMapping("/store")
	//  @RequestMapping(value="/store", method=RequestMethod.POST)
		public String mostrarstore(Model model) {
			List<Producto> lista = serviceProducto.buscarTodas();
			model.addAttribute("producto", lista);	
			
			return "store";
		}
		
	
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Producto> lista = serviceProducto.buscarTodas();
		model.addAttribute("producto", lista);
		
		return "tabla";
		
	}
	
	@GetMapping("/product")
	public String mostrarProduct(Model model) {
		Producto producto = new Producto();
		producto.setNombre("PRODUCT NAME GOES HER");
		producto.setPrecio(90.00);
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

