package com.company.comecando;

import java.util.Scanner;

public class CELSIUS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a temperatura em celsius: ");
        double temperaturaEmCelsius = scanner.nextDouble();
        double fator_Conversao = 1.8;
        double fator_Soma = 32;
        double fahrenheit = (temperaturaEmCelsius / fator_Conversao) + fator_Soma;
        System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
        scanner.close();

    }


}
