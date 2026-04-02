package Ex1;

public class Assistente extends Funcionario {
    private int numeroMatricula;

    public Assistente(String nome, double salario, int numeroMatricula){
        super (nome,salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    @Override

    public void exibirDados(){
        System.out.println("=== Assistente ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + numeroMatricula);
        System.out.printf("Salário: R$ %.2f%n", getSalario());
        System.out.printf("Ganho anual: R$ %.2f%n", ganhoAnual());
    }
}


