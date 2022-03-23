import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saiba a área do seu circulo");

        System.out.print("Digite o valor do raio");
        Double valorDoRaio = scanner.nextDouble();
        Double pi = 3.14;
      Double areaDoCirculo= valorDoRaio * valorDoRaio * pi;
        Double resultado = areaDoCirculo;
      System.out.println("Area do seu circulo é : " + resultado);
      scanner.close();

    }
}
