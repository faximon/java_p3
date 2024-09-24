package br.com.alura.desafios.aula1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa ("Vitor", 28);
        Pessoa pessoa2 = new Pessoa ("Artur", 27);
        Pessoa pessoa3 = new Pessoa ("Yoiti", 29);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        System.out.println("Primeira Pessoa: " + listaDePessoas.getFirst());

        System.out.println("Lista de Pessoas: ");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
