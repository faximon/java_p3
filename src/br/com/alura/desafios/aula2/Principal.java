package br.com.alura.desafios.aula2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Max Steel", 40,87);
        Produto produto2 = new Produto("HotWheels Corrida Tubarão", 50,40);
        Produto produto3 = new Produto("Banco Imobiliário", 29,60);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("O tamanho da lista é de " + listaDeProdutos.size() + " produtos.");

        System.out.println("O segundo produto é: " + listaDeProdutos.get(1).getNome());


        System.out.println("Nossos produtos: ");
        for (Produto produtos : listaDeProdutos) {
            System.out.println(produtos);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Geleco", 35, 20, 150);
        System.out.println(produtoPerecivel);
    }
}
