package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

public class fatorialIntervalo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();

        // Determina o menor e o maior número para definir o intervalo
        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        System.out.println("Fatoriais dos números no intervalo de " + inicio + " a " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            long fatorial = 1; //fatorial de 0

            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }

            System.out.println(i + "! = " + fatorial);
        }

        input.close();
    }
}
