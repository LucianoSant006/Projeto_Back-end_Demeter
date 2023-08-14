package com.example.Projeto_Demeter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item_pedido")
public class ItemPedido {
	

	private ItemPedidoPk id = new ItemPedidoPk();

	private Integer position;
	    
}
