package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>  {
	
	

}