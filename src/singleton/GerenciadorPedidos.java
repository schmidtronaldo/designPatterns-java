package singleton;

import facade.FacadeSistema;

public class GerenciadorPedidos {
    private static GerenciadorPedidos instancia;

    private GerenciadorPedidos() {
       super();
    }

    public static GerenciadorPedidos getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorPedidos();
        }
        return instancia;
    }

    public void processarPedido(String produto, String metodoPagamento) {
        System.out.println("Processando pedido para: " + produto);
        FacadeSistema facade = new FacadeSistema();
        facade.processarPagamento(metodoPagamento);
        facade.enviarNotificacao("Seu pedido de " + produto + " foi processado.");
    }
}