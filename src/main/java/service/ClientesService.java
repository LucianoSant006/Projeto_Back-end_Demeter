package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Projeto_Demeter.Repository.ClientesRepository;
import com.example.Projeto_Demeter.entity.Clientes;
import jakarta.persistence.EntityNotFoundException;
@Service
public class ClientesService {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	public void deleteCliente (Long idClientes){
		
		clientesRepository.deleteById(idClientes);

}
	
	public Clientes createClientes (Clientes clientes) {
		
		return clientesRepository.save(clientes);
	}
	
	public List <Clientes> listCliente(){
		return clientesRepository.findAll();
		
	}
	
	
	
	
	public Clientes findClentesById (Long idClientes) {
		return clientesRepository.findById(idClientes)
		.orElseThrow(()-> new EntityNotFoundException("usuario não encontrado"));		
	}
	
	
	
	
	public Clientes updatedCliente ( Long idClientes,Clientes updatedClientes) {
		
		Clientes clientes = findClentesById(idClientes);
		clientes.setName(updatedClientes.getName());
		clientes.setEmail(updatedClientes.getEmail());
		clientes.setSenha(updatedClientes.getSenha());
		
		return clientesRepository.save(clientes);
		
	}

	
	
}
