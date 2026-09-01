package pe.edu.upeu.polimorfinterface;

public class Perro implements Animal {
    @Override
    public void emitirSonido() {
        System.out.println("Gua...gua...");
    }

    @Override
    public void dormir() {
        System.out.println("Zzzz...zzz");
    }
}
