package Ex1;

public class Main {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario("Ícaro Ryan", 2500.00);
        funcionario.exibirDados();
        funcionario.addAumento(500.00);
        System.out.println(" aumento de R$ 500,00:");
        funcionario.exibirDados();

        System.out.println();

        Assistente assistente = new Assistente("Maria Julia", 2500.00, 0002);
        funcionario.exibirDados();

        System.out.println();


        Tecnico tecnico = new Tecnico("Artur", 4000.00, 0003, 800.00);
        tecnico.exibirDados();

        System.out.println();


        Administrativo adNoite = new Administrativo(
                "Fernanda Reis", 3200.00, 3033, "noite", 600.00);
        adNoite.exibirDados();

        System.out.println();


        Administrativo adDia = new Administrativo(
                "Marcos Pinto", 3200.00, 3044, "dia", 600.00);
        adDia.exibirDados();
    }
}