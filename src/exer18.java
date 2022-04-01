import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo ");
        System.out.print("Digite a velocidade do link de internet em mbps ");
        double tamanhoDoArquivoMb = scanner.nextDouble();
        double velocidadeDaInternetMbps = scanner.nextDouble();
        byte fatorDeConversaoEmSegundos = 8;
        double velocidadeDowloadMbps = velocidadeDaInternetMbps/ fatorDeConversaoEmSegundos;
        byte fatorDeConversaoEmMinutos = 60;
        double tempoBaixadoEmSegundos = tamanhoDoArquivoMb/velocidadeDowloadMbps;
        double tempoBaixadoEmMinutos = tempoBaixadoEmSegundos/ fatorDeConversaoEmMinutos;
        System.out.print("tempo baixado que o arquivo vai ser baixado em segundos é: "  + tempoBaixadoEmSegundos);
        System.out.print("tempo baixado que o arquivo vai ser baixado em minutos  é: " + tempoBaixadoEmMinutos);
        scanner.close();



    }
}
