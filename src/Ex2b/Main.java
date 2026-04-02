package Ex2b;

public class Main {
    public static void main(String[] args) {

        Veiculo carro = new CarroDePasseio("Prata", "ABC-1234");
        Veiculo moto = new Motocicleta("Preta", "XYZ-5678");
        Veiculo suv = new UtilitarioEsportivo("Branco", "DEF-9012");
        Veiculo caminhonete = new Caminhonete("Vermelho", "GHI-3456");
        Veiculo caminhao = new Caminhao("Azul", "JKL-7890");

        Lavajato lavajato = new Lavajato();

        lavajato.atender("Lavagem Completa", carro);
        lavajato.atender("Polimento", moto);
        lavajato.atender("Higienização Interna", suv);
        lavajato.atender("Lavagem Simples", caminhonete);
        lavajato.atender("Lavagem de Chassi", caminhao);

        System.out.println("\n--- Executando serviços ---");
        lavajato.executarProximoServico();
        lavajato.executarProximoServico();

        System.out.println("\nAtendimentos restantes: " + lavajato.getAtendimentos().size());
    }
}
