package Ex1;

public class Tecnico extends Assistente{
    private double bonus;

    public Tecnico(String nome, double salario, int numeroMatricula, double bonus){
        super(nome,salario,numeroMatricula);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public double ganhoAnual() {
        return (getSalario() + bonus) * 12;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Assistente Técnico ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getNumeroMatricula());
        System.out.printf("Salário: R$ %.2f%n", getSalario());
        System.out.printf("Bônus: R$ %.2f%n", bonus);
        System.out.printf("Ganho anual: R$ %.2f%n", ganhoAnual());
    }

}
