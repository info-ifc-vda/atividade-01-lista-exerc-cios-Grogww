package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

// Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
// que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
// residência, calcule e mostre:
// • o valor de cada quilowatt;
// • o valor a ser pago por essa residência;

//salMinimo
//qtdKWatts
//valor quilowatt
//valor pago

public class energia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float salMinimo = 0;
        float qtdKWatts = 0;
        float valKWatts = 0;

        System.out.print("\nEntre com o valor do salario Minimo: ");
        salMinimo = input.nextFloat();
        System.out.print("\nEntre com a quantidade de Quilowatts consumidos: ");
        qtdKWatts = input.nextFloat();

        valKWatts = salMinimo / 100;

        clearScreen();
        System.out.println(String.format("\n\nO valor do Quilowatt é: R$%,.2f", valKWatts));
        System.out.println(String.format("O valor a ser pago pela residencia é: R$%,.2f", (valKWatts*qtdKWatts)));

        input.close();
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
