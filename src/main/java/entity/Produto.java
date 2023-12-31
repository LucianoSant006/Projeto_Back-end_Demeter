package entity;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

    @Entity
	@Table(name = "tb_products")
	public class Produto {
		private static int count = 1;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String imgUrl; 
		private String name;
		private String description;
		private double price;
		@Temporal(TemporalType.TIMESTAMP)
		private Date dataCriacao;
		 
		@Temporal(TemporalType.TIMESTAMP)
		private Date dataAtualizacao;

		private Produto() {
			
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

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}
		

		public String getImgUrl() {
			return imgUrl;
		}

		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}

		

		public void setPrice(double price) {
			this.price = price;
		}

		public Date getDataCriacao() {
			return dataCriacao;
		}

		public void setDataCriacao(Date dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		public Date getDataAtualizacao() {
			return dataAtualizacao;
		}

		public void setDataAtualizacao(Date dataAtualizacao) {
			this.dataAtualizacao = dataAtualizacao;
		}

		public Produto
		(int id, String imgUrl, String name, String description, double price) {
			super();
			id = count;
			this.imgUrl = imgUrl;
			this.name = name;
			this.description = description;
			this.price = price;
			Produto.count +=1;
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
			Produto other = (Produto) obj;
			return Objects.equals(id, other.id);
		}

		public void setDataAtualizacao(java.util.Date date) {
		}

        public void setDataCriacao(java.util.Date date) {
        }
		
		
		
		
		

	}

