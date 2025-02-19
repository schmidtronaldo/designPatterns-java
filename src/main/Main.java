package main;

import singleton.GerenciadorPedidos;

public class Main {
    public static void main(String[] args) {
        
        GerenciadorPedidos gerenciador = GerenciadorPedidos.getInstancia();

        gerenciador.processarPedido("Notebook", "cartao");
        gerenciador.processarPedido("Smartphone", "paypal");
    }
}