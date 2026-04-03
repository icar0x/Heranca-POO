package Ex5;

public class Imovel {
    private String endereco;
    private double valorBase;

    public Imovel(String endereco, double valorBase) {
        this.endereco = endereco;
        this.valorBase = valorBase;
    }

    public double getValorFinal() {
        return valorBase;
    }

    public void exibeDetalhes() {
        System.out.println("Endereço: " + endereco);
        System.out.printf("Valor base: R$ %.2f%n", valorBase);
        System.out.printf("Valor final: R$ %.2f%n", getValorFinal());
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorBase() {
        return valorBase;
    }
    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}
