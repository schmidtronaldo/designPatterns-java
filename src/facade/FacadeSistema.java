package facade;

public class FacadeSistema {
    private SistemaPagamento sistemaPagamento;
    private SistemaNotificacao sistemaNotificacao;

    public FacadeSistema() {
        this.sistemaPagamento = new SistemaPagamento();
        this.sistemaNotificacao = new SistemaNotificacao();
    }

    public void processarPagamento(String metodoPagamento) {
        sistemaPagamento.processar(metodoPagamento);
    }

    public void enviarNotificacao(String mensagem) {
        sistemaNotificacao.enviar(mensagem);
    }
}