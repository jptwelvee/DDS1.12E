package com.company.comecando;

import java.util.Scanner;

public class formadepagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor do produto");
        double valorDoProduto = scanner.nextDouble();
        System.out.print("digite a forma de pagamento [1= avista / 2 = a prazo]: ");
        Byte formaDePagamento = scanner.nextByte();
        Boolean pagamentoAvista = formaDePagamento.equals(1);
        double juros = 0.0;
        if (!pagamentoAvista);
               juros = 8.0;
        double fatorDivisor = 100;

        double acrescimoP = valorDoProduto * juros / fatorDivisor;
        double valorTotal = acrescimoP + valorDoProduto;
        System.out.println("valor total: " + valorTotal);
        scanner.close();
        
