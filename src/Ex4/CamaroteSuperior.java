package Ex4;

public class CamaroteSuperior extends CamaroteInferior {
    private double valorExtra;  // valor adicional por ser superior (mais caro)

    public CamaroteSuperior(double valor, double valorAdicional, String localizacao, double valorExtra) {
        super(valor, valorAdicional, localizacao);
        this.valorExtra = valorExtra;
    }


    public double getValorCamaroteSuperior() {
        return getValorVIP() + valorExtra;
    }

    public double getValorExtra() {
        return valorExtra;
    }
    public void setValorExtra(double valorExtra) {
        this.valorExtra = valorExtra;
    }
}
