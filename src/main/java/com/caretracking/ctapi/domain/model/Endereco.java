package com.caretracking.ctapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Endereco {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "principal")
	private boolean principal;

	@Column(name = "cep")
	private String cep;
	
	@Column(name = "logradouro")
	private String logradouro;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "bairro")
	private String bairro;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;
	
	
	
}