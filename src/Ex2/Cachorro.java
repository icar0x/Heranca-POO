package Ex2;

public class Cachorro extends Animal {

    public Cachorro() {
        super();
    }

    public Cachorro(String nome) {
        super(nome);
    }

    public String latir() {
        return getNome() + " Au au!";
    }
}

