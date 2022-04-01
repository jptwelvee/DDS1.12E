package com.company.comecando;

import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("soma de dois numeros");
        System.out.println("numero1:");
        Double numero1 = scanner.nextDouble();
        System.out.println("numero2:");
        Double numero2 = scanner.nextDouble();
        System.out.println("digite o numero");
        Double numero = numero1 + numero2;
        System.out.println("o resultado e: " + numero);
        scanner.close();
    }
}
