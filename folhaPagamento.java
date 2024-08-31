package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

//Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. 
//Calcule e mostre o salário a receber seguindo estas regras:

//• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
//hora trabalhada;
//• o imposto equivale a 30% do salário bruto;
//• o salário a receber equivale ao salário bruto menos o imposto.

public class folhaPagamento {
    public static void main(String[] args){
        //Inicializacao variaveis
        Scanner input = new Scanner(System.in);
        float horasTrabalhadas = 0;
        float valHora = 0;
        float salBruto = 0;

        System.out.print("\nEntre com o numero de horas trabalhadas: ");
        horasTrabalhadas = input.nextFloat();

        System.out.print("\nEntre com o valor da hora: ");
        valHora = input.nextFloat();

        salBruto = horasTrabalhadas * valHora;

        clearScreen();
        System.out.println("-- Valores Finais -- ");
        System.out.println(String.format("Salário Bruto: %,.2f", salBruto));
        System.out.println(String.format("Desconto impostos: %,.2f ", (salBruto*0.3)));
        System.out.println(String.format("Salário Líquido do Funcionário: %,.2f", salBruto-(salBruto*0.3)));

        input.close();

    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

}
