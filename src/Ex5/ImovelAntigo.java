package Ex5;

public class ImovelAntigo extends Imovel {
    private double percentualDesconto;  //  15.0 representa 15%

    public ImovelAntigo(String endereco, double valorBase, double percentualDesconto) {
        super(endereco, valorBase);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double getValorFinal() {
        double desconto = getValorBase() * (percentualDesconto / 100);
        return getValorBase() - desconto;
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("=== Imóvel Antigo (Com Desconto) ===");
        super.exibeDetalhes();
        System.out.printf("Desconto: %.1f%% (R$ %.2f)%n",
                percentualDesconto,
                getValorBase() * (percentualDesconto / 100));
    }

    public double getPercentualDesconto() { return percentualDesconto; }
    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
