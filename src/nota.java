package com.company.comecando;

import java.util.Scanner;

public class Notaluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite sua nota ");
       double suaNota = scanner.nextDouble();

     Boolean aprovado = suaNota >= 70;
        if (aprovado) {
            System.out.println("parabens voce passou ");
        }   else {
            System.out.println("parabens foi reprovado");
        }
    }
}
