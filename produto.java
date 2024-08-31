package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

// . Faça um programa que receba
// • O código do produto comprado;
// • A quantidade comprada do produto
// Calcule e mostre:
// • O preço unitário do produto comprado, seguindo a Tabela I;
// • O preço total da nota;
// • O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
// • O preço final da nota depois do desconto.

// Tabela I
// Código Preço
// 1 a 10 - R$ 10,00
// 11 a 20 - R$ 15,00
// 21 a 30 - R$ 20,00
// 31 a 40 - R$ 40,00


// Tabela II
// Preço Total da Nota % de Desconto
// Até R$ 250,00 - 5%
// Entre R% 250,00 e R$ 500,00 - 10%
// Acima de R$ 500,00 - 15%

public class produto {
    public static void main(String[] args){
        //Entrada
        int cod = 0;
        int qtd = 0;

        //Controle
        boolean codValido = false;

        //Saida
        float valUnitario = 0;
        float precoTotalNota = 0;
        float valDesconto = 0;
        float precoDescontado = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite o codigo do produto: ");
        cod = input.nextInt();
        System.out.print("\nDigite a quantidade do produto: ");
        qtd = input.nextInt();

        if(cod>=1 && cod<=10){
            valUnitario = 10;
            codValido = true;
        }else if(cod>=11 && cod<=20){
            valUnitario = 15;
            codValido = true;
        }else if(cod>=21 && cod<=30){
            valUnitario = 20;
            codValido = true;
        }else if(cod>=31 && cod<=40){
            valUnitario = 40;
            codValido = true;
        }else{
            System.out.println("\nCódigo inválido");
            codValido = false;
        }

        if(!codValido){
            input.close();
            return;
        }

        //Calcula precoTotal
        precoTotalNota = qtd * valUnitario;

        if(precoTotalNota<250.0){
            valDesconto = 5;
        }else if(precoTotalNota<=500){
            valDesconto = 10;
        }else if(precoTotalNota>500){
            valDesconto = 15;
        }else{
            valDesconto = 0;
        }

        precoDescontado = precoTotalNota - (precoTotalNota*valDesconto/100);

        clearScreen();

        System.out.println(String.format("Preço unitário do produto: %f", valUnitario));
        System.out.println(String.format("Preço total da Nota: %f", precoTotalNota));
        System.out.println(String.format("Taxa de Desconto da Compra: %f\n", valDesconto));
        System.out.println(String.format("Preço final da Nota Fiscal: %f", precoDescontado));

        input.close();
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}