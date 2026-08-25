package pe.edu.upeu.conceptosuml.generalizacion;

public class General {
    public static void main(String[] args) {
        Coche c=new Coche("Toyota", 160, 4);
        c.abrirMaletero();
        c.acelerar();
        c.frenar();
    }
}
