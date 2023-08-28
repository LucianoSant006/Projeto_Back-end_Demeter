package entity;

import java.time.LocalDate;
import java.time.LocalTime;

import recursos.Perfil;

public class Pessoa {
	
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private LocalDate dataRegistro;
	private String imagem;
	private Perfil perfil;
	
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(Long id, String nome, String email, String senha, LocalDate dataRegistro, String imagem,
			Perfil perfil) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataRegistro = dataRegistro;
		this.imagem = imagem;
		this.perfil = perfil;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public LocalDate getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(LocalDate dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	

}
