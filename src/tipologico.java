package com.company.comecando.variaveis_e_costante;

public class tipologico {

    public static void main(String[] args) {
        Boolean variavelVerdadeira = true;
        System.out.println("Variavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;
        System.out.println("Variavel falsa: + variavelFalsa");

        System.out.println("-----------------------------");
        Integer idade = 18;
        Boolean podeTirarCarteira = idade >= 18;

// System.out.printIn ("pode tirar a carteira" + podeTirarCarteira);

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele(a) pode tirar a carteira");
        } else {
            System.out.println("Não Ele(a) não pode tirar a carteira");
        }

    }
}
