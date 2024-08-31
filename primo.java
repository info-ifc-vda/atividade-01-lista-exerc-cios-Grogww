package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " não é primo.");
        } else if (ePrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        input.close();
    }

    // Função para verificar se um número é primo
    public static boolean ePrimo(int num) {
        // Um número é primo se for maior que 1 e divisível apenas por 1 e por ele mesmo
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                return false; // Não é primo se for divisível por outro número além de 1 e ele mesmo
            }
        }
        return true; // É primo
    }
}
