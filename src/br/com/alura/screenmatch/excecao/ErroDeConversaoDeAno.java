package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAno extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAno(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
