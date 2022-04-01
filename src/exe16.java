import java.util.Scanner;

public class excercio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("qual o tamanho em metros quadrados, voce deseja");
        double tamanhoEmMetrosQuadrados = scanner.nextDouble();
        byte precoDaTinta = 80;
        byte quantidadeDeLitrosPorMetros = 3;
        byte quantidadeDelataPorTinta = 18;
        double coberturaDaTinta = tamanhoEmMetrosQuadrados / quantidadeDeLitrosPorMetros;
        double quantidadeDeTinta = coberturaDaTinta / quantidadeDelataPorTinta;
        double preçoTotal = quantidadeDelataPorTinta * precoDaTinta;
        double quantidadeDelataArrendodado = quantidadeDeTinta;
        System.out.println("A quantidade de latas é: " + quantidadeDelataArrendodado);
        System.out.println("O preço total e: " + preçoTotal);
        scanner.close();
    }


}
