import java.util.Scanner;

public class trabalho15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite O quanto voce ganha por hora: ");
        double ganhoPorHora = scanner.nextDouble();
        System.out.print("quantas horas voce trabalhou no mes? ");
        double horasTrabalhadasNoMes = scanner.nextDouble();
        double salarioBruto = ganhoPorHora * horasTrabalhadasNoMes;
        double impostoDeRenda = (salarioBruto * 11) / 100;
        double inss = (salarioBruto * 8 ) / 100;
        double sindicato = (salarioBruto * 5) / 100;
        double descontos = impostoDeRenda + inss + sindicato;
        double salarioLiquido = salarioBruto - descontos;
        System.out.println("salario bruto: R$ " + salarioBruto);
        System.out.println("imposto de renda(11%) : R$" + impostoDeRenda);
        System.out.println("inss (8%) : " + inss);
        System.out.println("sindicato(5%): " + sindicato);
        System.out.println("salario liquido : " + salarioLiquido);
        scanner.close();
