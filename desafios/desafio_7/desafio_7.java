/* O restaurante self-service BOMPRATO cobra R$14,00 por cada quilo de refeição. 
Escreva um algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. 
Assuma que a balança já desconta o peso do prato (tara). */

package desafios.desafio_7;

import java.util.Scanner;

public class desafio_7 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        double precoPorQuilo = 14.00;

        System.out.print("Digite o peso do prato (em kg): ");
        double peso = scanner.nextDouble();

        double valorPagar = precoPorQuilo * peso;

        System.out.printf("Valor a pagar: R$ %.2f\n", valorPagar);

        scanner.close();
}}

