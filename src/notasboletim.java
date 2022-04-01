package com.company.comecando;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        Double numero2 = scanner.nextDouble();
        System.out.print("Digite sua terceira nota: ");
        Double numero3 = scanner.nextDouble();
        System.out.print("Digite sua quarta nota ");
        Double numero4 = scanner.nextDouble();
        Double somaDeNotas = numero1 + numero2 + numero3 + numero4;
        int divisor = 4;
        Double somaDeNotasDivididoPorQuatro = somaDeNotas / divisor;
        System.out.print("Sua media é: " + somaDeNotasDivididoPorQuatro);
    }
}
