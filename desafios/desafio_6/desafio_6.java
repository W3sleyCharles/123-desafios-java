/*6 . Um motorista deseja colocar no seu tanque X reais de gasolina. 
Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento,
e exiba quantos litros ele conseguiu colocar no tanque.*/

import java.util.Scanner;

public class desafio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        System.out.print("Digite o valor do pagamento: ");
        double valorPagamento = scanner.nextDouble();

        double litros = valorPagamento / precoLitro;

        System.out.printf("Você conseguiu colocar %.2f litros no tanque.%n", litros);

        scanner.close();
    }
}