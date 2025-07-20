/* 5 . O custo ao consumidor de um carro novo, é a soma do custo de fábrica com a percentagem do revendedor e com o custo dos impostos 
(aplicados ao custo de fábrica) .Supondo que a percentagem do revendedor seja 25% e que os impostos custam 45% do custo de fábrica. 
Faça um algoritmo que leia o valor de custo de fábrica e determine o preço final do automóvel (preço ao consumidor). */

package desafios.desafio_5;

import java.util.Scanner;

public class desafio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do custo de fábrica
        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        // Percentuais fixos
        double percentualRevendedor = 0.25;
        double percentualImpostos = 0.45;

        // Cálculos
        double custoImpostos = custoFabrica * percentualImpostos;
        double custoRevendedor = custoFabrica * percentualRevendedor;
        double custoFinal = custoFabrica + custoImpostos + custoRevendedor;

        // Saída
        System.out.printf("O custo final do carro ao consumidor é: R$ %.2f\n", custoFinal);

        scanner.close();
    }
}
