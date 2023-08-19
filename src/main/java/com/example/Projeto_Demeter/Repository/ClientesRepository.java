package com.example.Projeto_Demeter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto_Demeter.entity.Clientes;

public interface ClientesRepository extends JpaRepository<Clientes, Long>  {
	
	

}
