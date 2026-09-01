package pe.edu.upeu.claseinterna;

public class ClasePrincipal {

    class ClaseA{

        void informacion(){
            System.out.println("Clase A informacion");
        }

    }

    static class ClaseB{
        static void informacion(){
            System.out.println("Clase B informacion");
        }
    }

    public static void main(String[] args) {
        ClasePrincipal cp = new ClasePrincipal();
        ClaseA cA=cp.new ClaseA();
        cA.informacion();

        ClaseB.informacion();
    }

}
