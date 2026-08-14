import java.util.*;

public class Main {

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
    public static int[][] rellenarMf5(int tm, int numI){
      int [][] m=new int[tm][tm];
      for (int f=0;f< m.length;f++ ){
        for (int c=m[0].length-1; c>=m[0].length-1-f;c--){
            m[f][c]=numI;
            numI++;
        } 
      } 
      return m;
    }

    public static int[][] rellenarMf6(int tm, int numI){
      int [][] m=new int[tm][tm];
       for (int f=0;f<m.length ;f++){//2
          for (int c=0;c<=f;c++){
            m[f][c]=numI;
            numI++;
          } 
       } 
      return m;
    }

    public static void main(String[] args) {
      //int [][] a={ {1,2},{3,2}, {4,2} };
      imprimeMatriz(rellenarMf5(5,1));
      System.out.print("");
      imprimeMatriz(rellenarMf6(5,1));
    }
}
