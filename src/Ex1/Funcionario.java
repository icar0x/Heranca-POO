package Ex1;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor ){
        this.salario += valor;
    }

    public double ganhoAnual(){
        return salario * 12;
    }

    public void exibirDados(){
        System.out.println("-------Funcionário--------");
        System.out.println("DADOS SALARIAIS: ");
        System.out.printf("SALÁRIO: R$ %.2f%n" + salario );
        System.out.printf("GANHOS ANUAIS: R$ %.2f%n" + ganhoAnual());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}



