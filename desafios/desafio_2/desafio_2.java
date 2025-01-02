// 2 . Leia o nome de uma pessoa, a sua idade e o seu salário, e mostre essas informações.

package desafios.desafio_2;

import java.util.Scanner;

public class desafio_2 {

    public static void main(String[] args) {

        // Iniciando o Scanner para capturar os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Definindo o nome do usuário
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Definindo a idade do usuário
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Definindo o salário do usuário
        System.out.println("Digite seu salário: ");
        float salario = scanner.nextFloat();

        // Mostrando as informações
        System.out.println("\nInformações do Usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Salário: R$ " + salario);

        // Fechando o scanner
        scanner.close();
    }
}
