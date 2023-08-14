package com.example.Projeto_Demeter.entity;



	import javax.xml.crypto.Data;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	@Entity
	@Table(name = "tb_Pedidos")
	public class Pedido {
		@Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private Data date;
		private String situacao;
		
		
		
		public Pedido() {
			
	}
		
		
		
		

}
