package com.example.Projeto_Demeter.entity;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ItemPedidoPk {
	
	@ManyToOne
    @JoinColumn(name = "products_id")
    private Products products;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private ProductsList list;

	public ItemPedidoPk() {
		super();
		this.products = products;
		this.list = list;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public ProductsList getList() {
		return list;
	}

	public void setList(ProductsList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(list, products);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedidoPk other = (ItemPedidoPk) obj;
		return Objects.equals(list, other.list) && Objects.equals(products, other.products);
	}

    
}
