import java.util.Scanner;

public class centimetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.print("Digite um numero em metros para ser convertido para centimetros");
  double seuNumero = scanner.nextDouble();
  double multiplicador = 100;
  double resultado = seuNumero * multiplicador;

  System.out.print("seu numero é: " + resultado + "cm");
  scanner.close();

    }
}
