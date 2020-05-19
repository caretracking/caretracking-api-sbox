package com.caretracking.ctapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity(name = "telefone")
public class Telefone {
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "principal")
	private boolean principal;

	@Column(name = "codigo_pais")
	private String codigoPais;
	
	@Column(name = "ddd")
	private String ddd;
	
	@Column(name = "telefone")
	private String telefone;
}