package Ex4;

public class Vip extends Ingresso {
    private double valorAdicional;

    public Vip (double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVIP() {
        return getValor() + valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
