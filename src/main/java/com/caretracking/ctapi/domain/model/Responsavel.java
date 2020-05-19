package com.caretracking.ctapi.domain.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@PrimaryKeyJoinColumn(name="id")
public class Responsavel extends Pessoa{

	private String tiporesponsavel;
}
