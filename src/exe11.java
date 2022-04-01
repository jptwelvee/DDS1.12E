package com.company.comecando;

import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite seu numero primeiro nume");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite seu numero numero");
        int segundoNumero = scanner.nextInt();
        System.out.print("digite seu terceiro numero");
        int terceiraNumero = scanner.nextInt();
        byte dois = 2;
        byte tres = 3;
        double dobroDoPrimeiro = primeiroNumero * dois;
        double metadeDoSegundo = segundoNumero/dois;
        double oProdutoDoDobroDoPrimeiroComMetadeDoSegundo = dobroDoPrimeiro * metadeDoSegundo;
        double primeiroVezesTres = primeiroNumero * tres;
        double aSomaDoTriploDoPrimeiroComOTerceiro = primeiroNumero +terceiraNumero;
        double oTerceiroElevadoAoCubo = terceiraNumero* terceiraNumero *terceiraNumero;
        System.out.println("O produto do dobro do primeiro com metade do segundo: " +oProdutoDoDobroDoPrimeiroComMetadeDoSegundo);
        System.out.println(("a soma do triplo do primeiro com o terceiro. ") +aSomaDoTriploDoPrimeiroComOTerceiro);
        System.out.println(" o terceiro elevado ao cubo: " + oTerceiroElevadoAoCubo);
        scanner.close();

    }
}
