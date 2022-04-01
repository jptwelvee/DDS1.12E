public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual tamanho, em metros quadrado, que voce quer");
        double tamanhoDoMetrosQuadrados = scanner.nextDouble();
        byte quantidadeLitrosPorMetros = 3;
        byte precoDaTinta = 80;
        byte quantidadeDelataporTinta= 18;
        double coberturaDaTintaEmLata = tamanhoDoMetrosQuadrados/ quantidadeDelataporTinta;
        double quantidadeDeLata = coberturaDaTintaEmLata/ quantidadeDelataporTinta;
        double quantidadePagaPorLata = quantidadeDeLata * precoDaTinta;
        double quantidadeDeTintaPorGalao = 3.6;
        int preçoDoGalao = 25;
        double coberturaDaTintaEmGalao = tamanhoDoMetrosQuadrados/quantidadeDeTintaPorGalao;
        double quantidadePagaPorGalao = quantidadeDeTintaPorGalao * preçoDoGalao;
        double quantidadeDePagaPorGalao = quantidadeDeTintaPorGalao *preçoDoGalao;
        double quantidadePagaPorLataArredondado = Math.ceil(quantidadePagaPorLata);
        double quantidadePagaPorGalaoArrendado = Math.ceil(quantidadePagaPorGalao);
        System.out.println("O preço pago em latas é: " + quantidadePagaPorLataArredondado);
        System.out.println("A quantidade de lata é: " + quantidadeDeLata);
        System.out.println("O preço pago em galão é: " + quantidadePagaPorGalaoArrendado);
        System.out.println("A quantidade de galão é: " + quantidadeDePagaPorGalao);
        double misturado = quantidadePagaPorLataArredondado + quantidadePagaPorGalaoArrendado;
        double quantidadePagaPorMistura = misturado * tamanhoDoMetrosQuadrados;
        double misturadoLata = misturado / quantidadePagaPorLataArredondado;
        double restoDivisao = misturado % quantidadePagaPorLataArredondado;
        double misturadoGalao = restoDivisao / quantidadePagaPorGalaoArrendado;
        double misturadoLataArredondado = Math.ceil(misturadoLata);
        double misturadoGalaoArredondado = Math.ceil(misturadoGalao);
        System.out.println("O preço pago misturando latas e galão é: " + misturado);
        System.out.println("A quantidade de lata usada quando se mistura os dois é: " + misturadoLataArredondado);
        System.out.println("A quantidade de galão usada quando se mistura os dois é: " + misturadoGalaoArredondado);
        scanner.close();
    }
}
