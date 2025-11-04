package org.model.Pagamento;

public class CartaoCredito implements MetodoPagamento{

    private String numeroCartao;
    private String nomeTitular;
    private String validade;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Pagamento com cartão de crédito processado.");
            System.out.println("Número do cartão: " + numeroCartao);
            System.out.println("Titular: " + nomeTitular);
            System.out.println("Valor: R$" + valor);
            return true;
        } else {
            System.out.println("Falha no pagamento: valor inválido.");
            return false;
        }
    }
}
