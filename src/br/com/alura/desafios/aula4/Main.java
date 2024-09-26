package br.com.alura.desafios.aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new LinkedList<>();

        listaInteiros.add(75);
        listaInteiros.add(12);
        listaInteiros.add(396);
        listaInteiros.add(44);
        listaInteiros.add(7945);

        System.out.println("Lista não ordenada: ");
        System.out.println(listaInteiros);

        Collections.sort(listaInteiros);
        System.out.println("Lista ordenada: ");
        System.out.println(listaInteiros);


        List<Titulo> listaDeTitulos = new LinkedList<>();
        Titulo titulo1 = new Titulo("Narnia");
        Titulo titulo2 = new Titulo("Matrix");
        Titulo titulo3 = new Titulo("A era do gelo");
        Titulo titulo4 = new Titulo("Todo mundo em pânico");

        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        listaDeTitulos.add(titulo4);

        System.out.println("Lista de Titulos não ordenado: ");
        for (Titulo listaDeTitulo : listaDeTitulos) {
            System.out.println(listaDeTitulo.getNome());
        }

        Collections.sort(listaDeTitulos);

        System.out.println("Lista de Titulos ordenada: ");
        for (Titulo listaDeTitulo : listaDeTitulos) {
            System.out.println(listaDeTitulo.getNome());
        }

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
