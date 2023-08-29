package controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import entity.Clientes;
import recursos.Perfil;
import repository.ClientesRepository;
import service.ClientesService;
import util.UploadUtil;




@RestController
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClientesController {
	
	ClientesService clientesService;
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	public ClientesController(ClientesService clientesService) {
		this.clientesService = clientesService;
		
		
	}
	
	 @GetMapping("cadastro")
	    public ModelAndView cadastro(Clientes clientes){
	        ModelAndView mv = new ModelAndView("cliente/cadastro");
	        mv.addObject("usuario", new Clientes());
	        Perfil[] perfilClientes = {Perfil.CLIENTE};
	        mv.addObject("perfils", perfilClientes);
	        return mv;
	    }
	 @GetMapping("/inicio")
	    public ModelAndView home(){
	        ModelAndView mv =  new ModelAndView("home/index");
	        return mv;
	    }
	
	
	
	
	@GetMapping("/clientes")
	public ResponseEntity <List<Clientes>> ListaClientes() {
		 return ResponseEntity.status(200).body(clientesService.listarClientes());
	} 
	
	@PostMapping
	public ResponseEntity <Clientes> criarClientes (@RequestBody Clientes clientes) {
		return ResponseEntity.status(2001).body(clientesService.criarClientes(clientes));
		
	}
	@PutMapping
	public  ResponseEntity <Clientes> editarClientes (@RequestBody Clientes clientes) {
		return ResponseEntity.status(200).body(clientesService.editarClientes(clientes));
	}
		@DeleteMapping("{id}")
		public ResponseEntity <?> excluirClientes (@PathVariable Long id) {
			clientesService.excluirClientes(id);
			return ResponseEntity.status(2004).build();
		}
	
	
	
	

}
