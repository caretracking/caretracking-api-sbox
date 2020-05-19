package com.caretracking.ctapi.domain.reposiroty;

import java.math.BigDecimal;
import java.util.List;

import com.caretracking.ctapi.domain.model.Restaurante;

public interface RestauranteRepositoryQueries {

	List<Restaurante> find(String nome, BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal);
	
	List<Restaurante> findComFreteGratisNomeSemelhante(String nome);
}
