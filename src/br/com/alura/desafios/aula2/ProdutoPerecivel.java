package br.com.alura.desafios.aula2;

public class ProdutoPerecivel extends Produto{
    int dataValidade;

    public ProdutoPerecivel(String nome, int preco, int quantidade, int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + "É um produto perecível! Data de validade: " + dataValidade + " dias após aberto.";
    };
}
