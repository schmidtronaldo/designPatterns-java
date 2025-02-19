package strategy;

public class PayPal implements MetodoPagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento com PayPal realizado.");
    }
}