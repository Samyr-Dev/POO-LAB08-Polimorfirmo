package org.principal;

import org.model.Pagamento.Boleto;
import org.model.Pagamento.CartaoCredito;
import org.model.Pagamento.MetodoPagamento;
import org.model.Pagamento.Pix;

public class Main_Pagamento {
    public static void realizarPagamento (MetodoPagamento metodo,double valor){
        System.out.println("=== Processando pagamento ===");
        boolean sucesso = metodo.processarPagamento(valor);
        if (sucesso) {
            System.out.println("Pagamento realizado com sucesso!\n");
        } else {
            System.out.println("Pagamento falhou.\n");
        }
    }

    public static void main (String[]args){
        // Criação das instâncias dos métodos de pagamento
        MetodoPagamento cartao = new CartaoCredito("1234 5678 9012 3456", "João Silva", "12/28");
        MetodoPagamento boleto = new Boleto("23793.38127 60002.345678 90123.456789 1 12340000005000", "10/11/2025");
        MetodoPagamento pix = new Pix("joao@banco.com");

        // Teste de pagamentos com diferentes métodos
        realizarPagamento(cartao, 250.75);
        realizarPagamento(boleto, 500.00);
        realizarPagamento(pix, 100.00);

        // Exemplo de valor inválido
        realizarPagamento(pix, -10.0);
    }
}
