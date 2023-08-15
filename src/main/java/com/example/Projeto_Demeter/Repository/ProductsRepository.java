package com.example.Projeto_Demeter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Projeto_Demeter.entity.Products;

public interface ProductsRepository extends JpaRepository <Products, Long> {

}
