package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = input.nextDouble();

        System.out.print("Digite o valor pago pelo cliente: R$ ");
        double valorPago = input.nextDouble();

        // Calcula o troco
        double troco = valorPago - valorCompra;

        if (troco < 0) {
            System.out.println("O valor pago é insuficiente.");
        } else if (troco == 0) {
            System.out.println("Não há troco.");
        } else {
            System.out.println("Troco: R$ " + String.format("%.2f", troco));
            calcularCedulas(troco);
        }

        input.close();
    }
//
    public static void calcularCedulas(double troco) {
        int[] cedulas = {200, 100, 50, 20, 10, 5, 2};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        // Calcula o número de cédulas
        troco = Math.round(troco * 100); // Convertendo para centavos

        for (int cedula : cedulas) {    //foreach
            int quantidade = (int) (troco / (cedula * 100));
            if (quantidade > 0) {
                System.out.println(quantidade + " cédula(s) de R$ " + cedula);
                troco %= cedula * 100; //pega o resto da divisão para recalcular
            }
        }

        //Caso não seja possivel pagar so com cedulas
        // Calcula o número de moedas
        for (int moeda : moedas) { //foreach
            int quantidade = (int) (troco / moeda);
            if (quantidade > 0) {
                System.out.println(quantidade + " moeda(s) de " + moeda + " centavo(s)");
                troco %= moeda;
            }
        }
    }
}
