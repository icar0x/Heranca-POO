package Ex2;

public class Gato extends Animal {

    public Gato() {
        super();
    }

    public Gato(String nome) {
        super(nome);
    }

    public String miar() {
        return getNome() + " Miau!";
    }
}
