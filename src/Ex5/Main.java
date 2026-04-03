package Ex5;

public class Main {
    public static void main(String[] args) {

        Imobiliaria imobiliaria = new Imobiliaria("Prime Imóveis");

        // Imóveis novos — com acréscimo
        ImovelNovo apto1 = new ImovelNovo(
                "Raul Lopes, 1500 - Apto 301", 650_000.00, 80_000.00);

        ImovelNovo casa1 = new ImovelNovo(
                "Castelo Branco, 42 - Alphaville", 1_200_000.00, 250_000.00);

        // Imóveis antigos — com desconto
        ImovelAntigo apto2 = new ImovelAntigo(
                "AV. Piauí, 88 - Apto 12", 400_000.00, 20.0);

        ImovelAntigo casa2 = new ImovelAntigo(
                "Frei Serafim, 7 - Centro", 280_000.00, 15.0);


        imobiliaria.adicionarImovel(apto1);
        imobiliaria.adicionarImovel(casa1);
        imobiliaria.adicionarImovel(apto2);
        imobiliaria.adicionarImovel(casa2);


        imobiliaria.listarImoveis();

        System.out.printf("Valor total do portfólio: R$ %.2f%n",
                imobiliaria.valorTotalPortfolio());
    }
}