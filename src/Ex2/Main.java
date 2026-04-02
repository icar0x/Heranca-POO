package Ex2;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal ");
        System.out.println(animal.caminha());

        Cachorro cachorro = new Cachorro("Rex");
        cachorro.setRaca("Labrador");
        System.out.println(cachorro.caminha());
        System.out.println(cachorro.latir());

        Gato gato = new Gato("Whiskers");
        gato.setRaca("Siamês");
        System.out.println(gato.caminha());
        System.out.println(gato.miar());

}
}
