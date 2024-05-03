package com.treinar.testar.java.di.notificacao;

import com.treinar.testar.java.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail {

    public NotificadorEmail(){
        System.out.println("Construtor chamado!");
    }

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através do email %s: %s\n");
            cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
