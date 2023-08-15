package com.example.Projeto_Demeter.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "products")
public class Products {
	private static int count = 1;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String imgUrl; 
	private String name;
	private String description;
	private double price;
	 
	private Products() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Products(int id, String imgUrl, String name, String description, double price) {
		super();
		id = count;
		this.imgUrl = imgUrl;
		this.name = name;
		this.description = description;
		this.price = price;
		Products.count +=1;
	}
	
	public String toString() {
		return "Id" +getId()+
		"\nNome: " + this.getName();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}
