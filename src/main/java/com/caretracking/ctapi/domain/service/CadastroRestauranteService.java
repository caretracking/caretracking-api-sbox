package com.caretracking.ctapi.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caretracking.ctapi.domain.exception.EntidadeNaoEncontradaException;
import com.caretracking.ctapi.domain.model.Cozinha;
import com.caretracking.ctapi.domain.model.Restaurante;
import com.caretracking.ctapi.domain.reposiroty.CozinhaRepository;
import com.caretracking.ctapi.domain.reposiroty.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		
		Cozinha cozinha = cozinhaRepository.findById(cozinhaId)
			.orElseThrow(() -> new EntidadeNaoEncontradaException(
					String.format("Não existe cadastro de cozinha com código %d", cozinhaId)));
		
		restaurante.setCozinha(cozinha);
		
		return restauranteRepository.save(restaurante);
	}
	
}