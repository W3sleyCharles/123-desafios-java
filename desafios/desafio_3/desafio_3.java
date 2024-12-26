// 3 . Leia dois números, efetue as 4 operações matemáticas básicas e mostre os resultados.
package desafios.desafio_3;

import java.util.Scanner;


public class desafio_3 {
    public static void main(String[] args) {

        // Inicio do Scanner para definir os números de entrada
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroDado = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundoDado = scanner.nextInt();

        // Final do Scanner
        scanner.close();

        // Executando a função "calculadora"
        calculadora(primeiroDado, segundoDado);


    }
    // Função que realiza as 4 operações pedidas no desafio
    public static void calculadora(int primeiroDado, int segundoDado) {
            System.out.println("Soma: " + (primeiroDado + segundoDado));
            System.out.println("Subtração: " + (primeiroDado - segundoDado));
            System.out.println("Multiplicação: " + (primeiroDado * segundoDado));
            System.out.println("Divisão: " + (primeiroDado / segundoDado));
            
    }
}
