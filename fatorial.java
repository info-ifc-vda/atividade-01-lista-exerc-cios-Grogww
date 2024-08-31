package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial (positivo): ");
        int numero = input.nextInt();

        long fatorial = 1; //fatorial de 0

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        
        input.close();
    }
}
