package com.company.comecando;

import java.util.Scanner;

public class mulher13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        double altura = scanner.nextDouble();
        double fatorMultiplicadorHomem = 72.7;
        byte fatorSubtracaoHomem = 58;
        double pesoIdealHomem = (fatorMultiplicadorHomem * altura) - fatorSubtracaoHomem;
        System.out.print("Seu peso ideal é masculino" + pesoIdealHomem);
        double fatorMultiplicadorMulher = 62.1;
        double fatorSubtracaoMulher = 44.7;
        double pesoIdealMulher =(fatorMultiplicadorMulher *altura) - fatorSubtracaoMulher;
        System.out.print("Seu peso ideal é feminino: " + pesoIdealMulher);
        scanner.close();

    }
}
