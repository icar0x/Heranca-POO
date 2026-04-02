package Ex2;

public class Animal {
    private String nome;
    private String raca;

    public Animal() {
        this.nome = "Sem nome";
        this.raca = "Sem raça";
    }

    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Sem raça";
    }

    public String caminha() {
        return nome + " está caminhando";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
