package com.treinar.testar.java.di.service;

import com.treinar.testar.java.di.modelo.Cliente;
import com.treinar.testar.java.di.notificacao.NotificadorEmail;

public class AtivacaoClienteService {

    private NotificadorEmail notificar;

    public void ativar(Cliente cliente){
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
