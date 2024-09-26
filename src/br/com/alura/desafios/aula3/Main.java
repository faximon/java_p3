package br.com.alura.desafios.aula3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("Ai calica");
        listaStrings.add("É isso aí");
        listaStrings.add("Como é que é");

        for (String elemento : listaStrings) {
            System.out.println(elemento);
        }


        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        if (animal instanceof Cachorro) {
            Cachorro cachorro1 = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Sabonete", 5);
        Produto produto2 = new Produto("Amaciante", 17);
        Produto produto3 = new Produto("Papel Toalha", 14);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaTotal = 0;
        for (Produto produto : listaProdutos) {
            somaTotal += produto.getPreco();
        }

        double precoMedio = somaTotal / listaProdutos.size();
        System.out.println("O preço médio dos produtos é: " + precoMedio);


        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);

        for (Forma forma : listaFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }


        ArrayList<ContaBancaria> contasBancarias = new ArrayList<>();
        ContaBancaria conta1 = new ContaBancaria(1, 5430);
        ContaBancaria conta2 = new ContaBancaria(2, 56874);
        ContaBancaria conta3 = new ContaBancaria(3, 660);
        ContaBancaria conta4 = new ContaBancaria(4, 998745);
        ContaBancaria conta5 = new ContaBancaria(5, 2670);
        contasBancarias.add(conta1);
        contasBancarias.add(conta2);
        contasBancarias.add(conta3);
        contasBancarias.add(conta4);
        contasBancarias.add(conta5);

        ContaBancaria maiorSaldoDasContas = contasBancarias.getFirst();
        for (ContaBancaria conta : contasBancarias) {
            if (conta.getSaldo() > maiorSaldoDasContas.getSaldo()) {
                maiorSaldoDasContas = conta;
            }
        }
        System.out.println("A conta com maior saldo - Número: " + maiorSaldoDasContas.getNumeroConta() +
                ", Saldo: R$" + maiorSaldoDasContas.getSaldo());
    }
}
