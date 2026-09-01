package pe.edu.upeu.enums;


enum Genero{MASCULINO, FEMININO}

public class Principal {

    public static void main(String[] args) {
        System.out.println(Genero.FEMININO);
        for (Genero a:Genero.values()){
            System.out.println(a);
        }
        for (Mes m: Mes.values()){
            System.out.println(m);
        }
        for (Estado e:Estado.values()){
            System.out.println(e.getDescripcion()+"\t"+e.name());
        }

        for (EstadoCivil ec: EstadoCivil.values()){
            System.out.println(ec.descripcion+"\t"+ec.name());
        }


    }
}
