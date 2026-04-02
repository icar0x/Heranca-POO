package Ex1;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    public double getAdicionalNoturno() { return adicionalNoturno; }
    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        double salarioMensal = getSalario();

        if (turno.equalsIgnoreCase("noite")) {
            salarioMensal += adicionalNoturno;
        }
        return salarioMensal * 12;
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Assistente Administrativo ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getNumeroMatricula());
        System.out.printf("Salário: R$ %.2f%n", getSalario());
        System.out.println("Turno: " + turno);
        System.out.printf("Adicional noturno: R$ %.2f%n", adicionalNoturno);
        System.out.printf("Ganho anual: R$ %.2f%n", ganhoAnual());
    }
}
