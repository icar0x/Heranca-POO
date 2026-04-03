package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Imobiliaria {
    private String nome;
    private List<Imovel> imoveis;

    public Imobiliaria(String nome) {
        this.nome = nome;
        this.imoveis = new ArrayList<>();
    }

    public void adicionarImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void listarImoveis() {
        System.out.println("========================================");
        System.out.println("  Imobiliária: " + nome);
        System.out.println("  Total de imóveis: " + imoveis.size());
        System.out.println("========================================");
        for (Imovel imovel : imoveis) {
            imovel.exibeDetalhes();
            System.out.println("----------------------------------------");
        }
    }

    public double valorTotalPortfolio() {
        double total = 0;
        for (Imovel imovel : imoveis) {
            total += imovel.getValorFinal();
        }
        return total;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }
    public String getNome() {
        return nome;
    }
}
