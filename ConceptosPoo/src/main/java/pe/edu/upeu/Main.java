package pe.edu.upeu;


import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        Producto p=new Producto();
        var pp=new Producto("P001", "Televisor");
        var ppp=54.1;

        System.out.println(p.getClass());
        System.out.println(pp.getClass());
        System.out.println(pp instanceof Producto);
        System.out.println(ppp instanceof int);

        List<Producto> prod=new ArrayList<>();

        prod.add(new Producto("P001", "Televisor"));
        prod.add(new Producto("P002", "Celular", 200));
        prod.add(new Producto("P003", "Lavadora", 1800, 2));

        for (Producto px:prod){
            String pi=px.codigo+"\t"+px.nombre+"\t"+px.precio+"\t"+px.igv;
            System.out.println(pi);
        }
    }
}
