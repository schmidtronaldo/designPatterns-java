package strategy;

public class CartaoCredito implements MetodoPagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento com cartão de crédito realizado.");
    }
}