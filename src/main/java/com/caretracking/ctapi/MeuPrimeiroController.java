package com.caretracking.ctapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.caretracking.ctapi.di.modelo.Cliente;
import com.caretracking.ctapi.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente j = new Cliente("João","as@asd","154444");
		
		ativacaoClienteService.ativar(j);
		
		return "Hello!";
	}
	
}
