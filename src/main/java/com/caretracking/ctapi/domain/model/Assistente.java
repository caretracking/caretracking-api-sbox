package com.caretracking.ctapi.domain.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue("assistente")
public class Assistente extends Pessoa{
	
	private String atributoAssistente;
}
