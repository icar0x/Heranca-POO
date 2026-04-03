package Ex5;

public class ImovelNovo extends Imovel {
    private double valorAdicional;  // acréscimo por localizaçao

    public ImovelNovo(String endereco, double valorBase, double valorAdicional) {
        super(endereco, valorBase);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double getValorFinal() {
        return getValorBase() + valorAdicional;
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("=== Imóvel Novo (Área Valorizada) ===");
        super.exibeDetalhes();
        System.out.printf("Acréscimo: R$ %.2f%n", valorAdicional);
    }

    public double getValorAdicional() { return valorAdicional; }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
