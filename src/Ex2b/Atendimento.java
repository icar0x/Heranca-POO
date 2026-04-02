package Ex2b;

import Ex2b.Veiculo;

public class Atendimento {
    private String servico;
    private Veiculo veiculo;

    public Atendimento(String servico, Veiculo veiculo) {
        this.servico = servico;
        this.veiculo = veiculo;
    }

    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Atendimento [serviço=" + servico + ", veículo=" + veiculo + "]";
    }
}