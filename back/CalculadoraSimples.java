package AW;

import java.util.Scanner;

public class CalculadoraSimples {

    public void calcular() {

        Scanner scanner = new Scanner(System.in);

        //Lê o primeiro valor para a realização do calculo.
        System.out.print("Informe o primeiro valor: ");
        Integer valorUm = scanner.nextInt();

        //Lê a operação a ser realizada conforme ao que está explícito.
        System.out.print("Selecione a operação: ( 1 = adição, 2 = subtração, 3 = mutiplicação, 4 = divisão ): ");
        Integer operacao = scanner.nextInt();

        //Compara e reage de acordo com a coerência da seleção da operação.
        if (operacao == 1) {
            System.out.print("Informe o segundo valor: " + valorUm + " + ");
        } else if (operacao == 2) {
            System.out.print("Informe o segundo valor: " + valorUm + " - ");
        } else if (operacao == 3) {
            System.out.print("Informe o segundo valor: " + valorUm + " * ");
        } else if (operacao == 4) {
            System.out.print("Informe o segundo valor: " + valorUm + " / ");
        } else if (operacao <= 0 || operacao >= 5) {
            System.out.println("\nOperação incompatível! Recomece:\n");
            calcular();
            System.out.println("\n -- Fim -- ");
            System.exit(0);
        }

        //Lê o segundo valor para a realização do calculo.
        Integer valorDois = scanner.nextInt();

        //Varíaveis de resultado
        Integer resultadoAdicao = (valorUm + valorDois);
        Integer resultadoSubitracao = (valorUm - valorDois);
        Integer resultadoMutiplicacao = (valorUm * valorDois);
        Integer resultadoDivisao = (valorUm / valorDois);

        //Compara e imprime o resultado do calculo.
        if (operacao == 1) {
            System.out.println("Resultado = " + (valorUm) + " + " + (valorDois) + " = " + (resultadoAdicao));
        } else if (operacao == 2) {
            System.out.println("Resultado = " + (valorUm) + " - " + (valorDois) + " = " + (resultadoSubitracao));
        } else if (operacao == 3) {
            System.out.println("Resultado = " + (valorUm) + " * " + (valorDois) + " = " + (resultadoMutiplicacao));
        } else if (operacao == 4) {
            System.out.println("Resultado = " + (valorUm) + " - " + (valorDois) + " = " + (resultadoDivisao));
        }
    }

    public static void main(String[] args) {

        CalculadoraSimples calculadoraSimples = new CalculadoraSimples();

        System.out.println("\n -- Calculadora simples -- \n");
        calculadoraSimples.calcular();
        System.out.println("\n -- Fim -- ");
    }
}