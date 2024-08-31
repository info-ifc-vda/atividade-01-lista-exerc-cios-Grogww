package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

public class qtdPrimos {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        int quantidadePrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = input.nextInt();

            if (ePrimo(numero)) {
                quantidadePrimos++;
            }
        }

        System.out.println("A quantidade de números primos digitados foi: " + quantidadePrimos);

        input.close();
    }

    // Função para verificar se um número é primo
    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= num-1; i++) {
            if (num % i == 0) {
                return false; // Não é primo se for divisível por outro número além de 1 e ele mesmo
            }
        }
        return true; // É primo
    }
}
