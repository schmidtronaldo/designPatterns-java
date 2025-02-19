package facade;

import strategy.MetodoPagamento;
import strategy.CartaoCredito;
import strategy.PayPal;

public class SistemaPagamento {
    private MetodoPagamento metodoPagamento;

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void processar(String metodo) {
        if (metodo.equalsIgnoreCase("cartao")) {
            setMetodoPagamento(new CartaoCredito());
        } else if (metodo.equalsIgnoreCase("paypal")) {
            setMetodoPagamento(new PayPal());
        } else {
            throw new IllegalArgumentException("Métdo de pagamento não suportado.");
        }
        metodoPagamento.pagar();
    }
}