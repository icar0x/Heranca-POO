package Ex2b;

import java.util.ArrayList;
import java.util.List;

public class Lavajato {
    private List<Atendimento> atendimentos;

    public Lavajato() {
        this.atendimentos = new ArrayList<>();
    }

    public void atender(String servico, Veiculo veiculo) {
        Atendimento atendimento = new Atendimento(servico, veiculo);
        atendimentos.add(atendimento);
        System.out.println("Atendimento registrado: " + atendimento);
    }

    public void executarProximoServico() {
        if (atendimentos.isEmpty()) {
            System.out.println("Nenhum atendimento na fila.");
        } else {
            Atendimento proximo = atendimentos.remove(0);
            System.out.println("Executando: " + proximo);
        }
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}
