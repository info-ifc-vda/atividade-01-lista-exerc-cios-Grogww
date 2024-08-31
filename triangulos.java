package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

// Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
// obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.

public class triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] angulos = new float[3];
        float[] lados = new float[3];

        for(int i=0; i<3; i++){
            System.out.print(String.format("Entre com o %dº angulo do triangulo: ", i+1));
            angulos[i] = input.nextFloat();
        }
        for(int i=0;i<3;i++){
            System.out.print(String.format("Entre com o %dº lado do triangulo: ", i+1));
            lados[i] = input.nextFloat();
        }

        clearScreen();
        
        if((angulos[0]+angulos[1]+angulos[2]) != 180){
            System.out.println("Os angulos inseridos não correspondem aos de um Triangulo!");
        }else{
            System.out.println(String.format("Os valores do triangulo correspondem a um Triangulo classificado como %s e %s", verificaAngulo(angulos), verificaLado(lados)));
        }

        input.close();
    }    

    public static String verificaAngulo(float[] ang){
        // se soma ang != 180 n é triangulo

        //Ret - 1 angulo de 90
        //obtusangulo - 1 angulo > 90
        //acutângulo - 3 angulos < 90
        if(ang[0]==90 || ang[1]==90 || ang[2]==90){
            return "Retângulo";
        }else if(ang[0]>90 || ang[1]>90 || ang[2]>90){
            return "Octusângulo";
        }else{
            return "Acutângulo";
        }
        
    }

    public static String verificaLado(float[] lad){
        //equilatero - 3 lados iguais
        //escaleno - 3 lados diferentes
        //isoceles - 2 lados iguais
        if(lad[0]==lad[1] || lad[0]==lad[2]){
            return "Equilátero";
        }else if(lad[0]==lad[1] || lad[0]==lad[2] || lad[1]==lad[2]){
            return "Isósceles";
        }else{
            return "Escaleno";
        }
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
