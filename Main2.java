import java.util.*;

public class Main2 {

    public static void imprimeMatriz(int[][] m){
      for (int f=0;f<m.length;f++){
        for (int c=0;c<m[0].length;c++ ) {
          if(m[f][c]!=0){
          System.out.print(m[f][c]+"\t");
          }else{
            System.out.print(" \t");
          }
        }
        System.out.println("");
      } 
    }

    public static int[][] matriz21(int tm, int numI){
      int [][] m=new int[tm][tm];
      for (int c=0;c<m.length ;c++ ){
        if(c%2==0){
          int cont=0;
          while(cont<m.length){
              m[cont][c]=numI;
              numI++;
              cont++;
          }
        }else{
          int cont=m.length-1;
            while(cont>=0){
              m[cont][c]=numI;
              numI++;
              cont--;
          }
        }
      } 
      return m;
    }
    public static void main(String[] args) {
      imprimeMatriz(matriz21(6,1));

    }
}
