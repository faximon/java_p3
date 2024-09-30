package br.com.alura.desafios.DesafioFinal;

import java.util.Scanner;

public class discardedCompras {
    private String descricao;
    private double valor;
    private double limiteCartaoCredito;
    private Scanner input = new Scanner(System.in);
    private int escolhaMenu = 0;

    public void defineLimiteCartao(){
        System.out.println("============= ============ ============");
        System.out.println("Informe o limite do cartão de crédito abaixo!");
        limiteCartaoCredito = input.nextDouble();
        System.out.println("O limite do cartão foi definido!");
        System.out.println("============= ============ ============");
        System.out.println("Hora de gastar!");
    }

    public void realizaCompra() {
        System.out.println("============= ============ ============");
        System.out.println("Digite a descrição da compra:");
        descricao = input.next();
        System.out.println("Digite o valor da compra:");
        valor = input.nextDouble();
        System.out.println("Compra realizada!");
    }

    public void continuarOuFinalizar() {
        System.out.println("""
                Escolha uma opção: 
                0) Sair
                1) Continuar compras""");
        escolhaMenu = input.nextInt();

        switch (escolhaMenu){
            case 0:
                System.out.println("Finalizando as compras.");
                System.out.println("...");
                System.out.println("============= ============ ============");
                break;
            case 1:
                realizaCompra();
                break;
            case 2:
                if (escolhaMenu != 0 && escolhaMenu != 1) {
                    System.out.println("Opção invalida!");
                    break;
                }
        }
    }

    public void listarCompra() {
        System.out.println("#Item: {Descrição: " + this.descricao + "}{Valor" + this.valor + "}");
    }

    public void loopDasCompras() {
        defineLimiteCartao();
        realizaCompra();
        continuarOuFinalizar();
        listarCompra();
    }
}
