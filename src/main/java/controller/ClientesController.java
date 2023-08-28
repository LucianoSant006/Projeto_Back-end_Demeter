package controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Clientes;
import repository.ClientesRepository;
import service.ClientesService;




@RestController
@CrossOrigin("*")
@RequestMapping("/clientes")
public class ClientesController {

	
	
	
	
	ClientesService clientesService;
	
	public ClientesController(ClientesService clientesService) {
		this.clientesService = clientesService;
		
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
