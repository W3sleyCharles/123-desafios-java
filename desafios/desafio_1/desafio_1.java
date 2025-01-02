// 1 . Calcule a média de duas notas e mostre a média aritmética obtida.

package desafios.desafio_1;

// Importando biblioteca para realizar um input de dados
import java.util.Scanner;

public class desafio_1 {

    public static void main(String[] args) {

    // Iniciando o Scanner para adicionar valor para as variáveis "primeiraNota e segundaNota"    
    Scanner scanner = new Scanner(System.in);

    // Definindo o valor da primeira nota via input
    System.out.println("Digita a primeira nota: ");
    int primeiraNota = scanner.nextInt();
    
    // Definindo o valor da segunda nota via input
    System.out.println("Digite a segunda nota: ");
    int segundaNota = scanner.nextInt();

    // Fechando o scanner
    scanner.close();
    
    // Entregando o resultado das notas
    System.out.println("A média de nota dos alunos é: " + calculo(primeiraNota, segundaNota));



        
    }
    // Método para realizar a soma das notas e a divisão para a média
    public static int calculo (int primeiraNota, int segundaNota) {

        // Formúla para realizar o calculo que após finalizado retorna o valor esperado
        return (primeiraNota + segundaNota) / 2;  

    }

}
