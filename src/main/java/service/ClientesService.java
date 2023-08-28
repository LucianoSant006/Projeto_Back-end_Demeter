package service;


import java.util.List;

import org.springframework.stereotype.Service;

import entity.Clientes;
import repository.ClientesRepository;


 @Service
public class ClientesService {
	
	private ClientesRepository repository; 
	
	public ClientesService (ClientesRepository repository) {
		
		this.repository = repository;
	}
	
	public List<Clientes> listarClientes(){
		List<Clientes> lista = repository.findAll();
		return lista;
	}
	
	public Clientes criarClientes(Clientes clientes) {
		Clientes clientesNovo = repository.save(clientes);
		return clientesNovo;	
	}
	
	public Clientes editarClientes(Clientes clientes) {
		Clientes clientesNovo = repository.save(clientes);
		return clientesNovo;	
	}
	
	public Boolean excluirClientes(Long id) {
		repository.deleteById(id);
		return true;
	}
	
}
