package com.caretracking.ctapi.di.notificacao;

import com.caretracking.ctapi.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}