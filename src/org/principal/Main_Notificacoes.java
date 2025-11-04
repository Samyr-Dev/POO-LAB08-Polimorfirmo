package org.principal;

import org.model.Notificacoes.EmailNotificacao;
import org.model.Notificacoes.Notificacao;
import org.model.Notificacoes.PushNotificacao;
import org.model.Notificacoes.SMSNotificacao;

import java.util.ArrayList;

public class Main_Notificacoes {
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        // Adicionando diferentes tipos de notificações à lista
        notificacoes.add(new EmailNotificacao("usuario@email.com"));
        notificacoes.add(new SMSNotificacao("+55 11 91234-5678"));
        notificacoes.add(new PushNotificacao("TOKEN-ABC-123"));

        // Mensagem a ser enviada
        String mensagem = "Bem-vindo! Seu pedido foi processado com sucesso.";

        // Iterando sobre as notificações e enviando a mensagem (polimorfismo)
        for (Notificacao n : notificacoes) {
            n.enviar(mensagem);
        }
    }
}