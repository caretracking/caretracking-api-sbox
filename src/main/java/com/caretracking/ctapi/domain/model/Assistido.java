package com.caretracking.ctapi.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("assistido")
public class Assistido extends Pessoa {
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pessoa_id",referencedColumnName = "id", nullable = false)
	private List<Intercorrencia> intercorrencias = new ArrayList<>();
	
	@ManyToMany
    @JoinTable(name = "assitido_assistente", joinColumns = @JoinColumn(name = "assistido_id"),
            inverseJoinColumns = @JoinColumn(name = "assistente_id"))
	private List<Assistente> assistentes = new ArrayList<>();
	
	@ManyToMany
    @JoinTable(name = "assitido_responsavel", joinColumns = @JoinColumn(name = "assistido_id"),
            inverseJoinColumns = @JoinColumn(name = "responsavel_id"))
	private List<Responsavel> responsaveis = new ArrayList<>();
	
	
	

}
