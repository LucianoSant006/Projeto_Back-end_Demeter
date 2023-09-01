package entity;

import java.time.LocalDate;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import recursos.Prioridade;
import recursos.Status;

public class Chamado {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String comentario;
	private LocalDate dataAbertura = LocalDate.now(); 
	private LocalDate dataFechamento;
	private String observacao;
	private Status status;
	private Prioridade prioridade;

}
