import java.util.Scanner;

public class pescador14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o quilo do peixe");
        double pesoDoPeixe = scanner.nextDouble();
        int multa = 4;
        int oQuiloDoPeixe = 51;

         double resultado = (pesoDoPeixe - oQuiloDoPeixe) * multa;
         System.out.print("valor de " + resultado);







    }
}
