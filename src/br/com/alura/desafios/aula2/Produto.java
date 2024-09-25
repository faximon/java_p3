package br.com.alura.desafios.aula2;

public class Produto {
    private String nome;
    private int preco;
    private int quantidade;

    public Produto(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "O produto " + nome + " tem valor individual de R$ " + preco + ". " +
                "Atualmente temos " + quantidade + " deste produto em estoque. ";
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
