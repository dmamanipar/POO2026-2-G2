package pe.edu.upeu.conceptosuml.realizacion;

public class Principal {

    public static void main(String[] args) {
        Volador v=new Avion();
        v.volar();
        v=new Pajaro();
        v.volar();
    }
}
