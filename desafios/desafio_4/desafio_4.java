/*  4 . Duas variáveis (A e B) possuem valores distintos( A = 5 e B = 10). 
Crie um algoritmo que armazene estes dois valores nessas duas variáveis,
e efetue a troca dos valores de forma que a variável A passe a possuir o valor de B
e que a variável B passe a possuir o valor de A. Por fim, apresente estes valores trocados. */

package desafios.desafio_4;
import java.util.Scanner;

public class desafio_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();

        scanner.close();

        System.out.println("Os valores escolhidos foram " + A + " para A e " + B + " para B");

        int[] trocados = trocarValores(A, B);
         
        A = trocados[0];
        B = trocados[1];

        System.out.println("Após a alteração o valor de A foi para " + A + " e o valor de B foi para " + B);
        
    }

    public static int[] trocarValores(int A, int B) {
        int trocaA = A;
        int trocaB = B;

        B = trocaA;
        A = trocaB;

        return new int[] {A, B};
    }
}

