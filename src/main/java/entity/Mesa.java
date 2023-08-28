package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import recursos.MesaSituacao;

@Entity
@Table(name = "Mesa")
public class Mesa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private  String situacao;
	@ManyToOne
	private Cadeira cadeira;
	
	@Enumerated(EnumType.STRING)
	private MesaSituacao mesaSituacao;
	;
	
	public Long getId() {
		return Id;
	}
	
	public MesaSituacao getMesaSituacao() {
		return mesaSituacao;
	}
	public void setSituacao(MesaSituacao mesaSituacao) {
		this.mesaSituacao = mesaSituacao;
	}
	public Cadeira getCadeira() {
		return cadeira;
	}
	public void setCadeira(Cadeira cadeira) {
		this.cadeira = cadeira;
	}
	
	

}

