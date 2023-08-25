package com.example.Projeto_Demeter.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {
	
    @EmbeddedId
	private ItemPedidoPk id = new ItemPedidoPk();

	private Integer position;
	
		public void setProducts(Products products) {
		id.setProducts(products);
	}

	public Products getPrpducts() {
		return id.getProducts();
	}

	public void setList(ProductsList list) {
		id.setList(list);
	}

	public ProductsList getList() {
		return id.getList();
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	
	    
}
