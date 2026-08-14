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

    public static int[][] rellenarMf7(int tm, int numI){
      int [][] m=new int[tm][tm];
       for (int c=0;c<m.length ;c++){
          for (int f=0;f<=c;f++){
            m[f][c]=numI;
            numI++;
          } 
       } 
      return m;
    }
    public static int[][] rellenarMf17(int tm, int numI){
      int [][] m=new int[tm][tm];
       for (int c=m[0].length-1;c>=0;c--){
          for (int f=0;f<=c;f++){
            m[f][c]=numI;
            numI++;
          } 
       } 
      return m;
    }
    public static int[][]rellenarMf9(int tm, int numI){
      int [][] m=new int [tm][tm];
      for (int c=0;c<m.length ;c++){
        for(int f=0;f<=c;f++){
          m[f][c]=numI;
            numI++;
        }
      }
      return m;
    }
  public static int[][] rellenarMf16(int tm, int numI){
      int [][] m=new int[tm][tm];
      for (int c=0;c< m.length;c++ ){
        for (int f=m[0].length-1; f>=m[0].length-1-c;f--){
            m[f][c]=numI;
            numI++;
        } 
      } 
      return m;
    }
    public static void main(String[] args) {
      //int [][] a={ {1,2},{3,2}, {4,2} };
      imprimeMatriz(rellenarMf5(5,1));
      System.out.println("");
      imprimeMatriz(rellenarMf6(5,1));
      System.out.println("");
      imprimeMatriz(rellenarMf7(5,1));
      System.out.println("");
      imprimeMatriz(rellenarMf17(5,1));
      System.out.println("");
      imprimeMatriz(rellenarMf9(5,1));
        System.out.println("");
      System.out.println("");
      imprimeMatriz(rellenarMf16(5,1));
    }
}
