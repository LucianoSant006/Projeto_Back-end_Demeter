package entity;


import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private Long id;
		@Column(name = "name", length = 200,nullable = true)
		private String name;
		@Column(name = "email", length = 50,nullable = true)
		private String email;
		@Column(name = "senha",columnDefinition = "TEXT",nullable = true)
		private String senha;
		@Column(name = "telefone", length = 15,nullable = true)
		private Integer telefone;
		@Column(name = "dataRegistro", length = 8,nullable = true)
		private LocalDate dataRegistro;
		
		private String imagem;
		
		
		
		public String getImagem() {
			return imagem;
		}
		public void setImagem(String imagem) {
			this.imagem = imagem;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		public Integer getTelefone() {
			return telefone;
		}
		public void setTelefone(Integer telefone) {
			this.telefone = telefone;
		}
		public LocalDate getDataRegistro() {
			return dataRegistro;
		}
		public void setDataRegistro(LocalDate dataRegistro) {
			this.dataRegistro = dataRegistro;
		}

}
