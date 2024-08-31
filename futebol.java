package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

// Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
// Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
// calcule e mostre:

// • a quantidade de jogadores com idade inferior a 18 anos;
// • a média das idades dos jogadores de cada time;
// • a média das alturas de todos os jogadores do campeonato;
// • a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato.

public class futebol {
    public static void main(String[] args) {
        //entrada
        //idade
        //peso
        //altura

        //saida
        //qtd idade inferior a 18
        //media da idade de cada time
        //media das alturas de todos os jogadores
        //% de jogadores com mais de 80kg entre todos os jogadores do campeonato
        Scanner input = new Scanner(System.in);
        
        final int numTimes = 5;
        final int jogadoresPTime = 11;
        int totalJogadores = numTimes * jogadoresPTime;

        int[] idades = new int[totalJogadores];
        double[] pesos = new double[totalJogadores];
        double[] alturas = new double[totalJogadores];

        int jogadoresMenorDe18 = 0;
        double somaAlturas = 0;
        int jogadoresAcimaDe80kg = 0;
        double[] mediaIdadesTime = new double[numTimes];

        int index = 0;

        for (int i = 0; i < numTimes; i++) {
            clearScreen();
            System.out.println("Digite os dados dos jogadores do time " + (i + 1) + ":");
            
            int somaIdadesTime = 0;

            for (int j = 0; j < jogadoresPTime; j++) {
                System.out.println(String.format("\nJogador %d: ", j+1));
                
                System.out.print("Idade: ");
                idades[index] = input.nextInt();
                
                System.out.print("Peso (kg): ");
                pesos[index] = input.nextDouble();
                
                System.out.print("Altura (m): ");
                alturas[index] = input.nextDouble();

                somaIdadesTime += idades[index];
                somaAlturas += alturas[index];

                if (idades[index] < 18) {
                    jogadoresMenorDe18++;
                }

                if (pesos[index] > 80) {
                    jogadoresAcimaDe80kg++;
                }
                
                index++;
            }

            mediaIdadesTime[i] = (double) somaIdadesTime / jogadoresPTime;
            
        }

        double mediaAlturas = somaAlturas / totalJogadores;
        double porcentagemAcimaDe80kg = (double) jogadoresAcimaDe80kg / totalJogadores * 100;

        clearScreen();

        for(int i=0; i<numTimes; i++){
            System.out.println("\nMédia das idades dos jogadores do time " + (i + 1) + ": " + mediaIdadesTime[i]);
        }

        System.out.println("\nQuantidade de jogadores com idade inferior a 18 anos: " + jogadoresMenorDe18);
        System.out.println("Média das alturas de todos os jogadores do campeonato: " + mediaAlturas);
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porcentagemAcimaDe80kg + "%");
        
        input.close();
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
