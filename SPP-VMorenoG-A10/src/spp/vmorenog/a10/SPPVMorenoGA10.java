/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.vmorenog.a10;
import java.util.Scanner;
/**
 *
 * @author victo
 */
public class SPPVMorenoGA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamaño = int ("¿Cual es el tamaño de los arreglos");
        int [][] a= aMatriz("A", tamaño);
        int [][] b= aMatriz("B",tamaño);
        restaMatriz(a,b);
        multiMatriz(a,b);
    }
    public static int int(String mensaje){
     Scanner kb = new Scanner(System.in);
     int numero=0;
     boolean flag;
     
     do{
         System.out.println("Introduce" + mensaje);
         try{
             numero = kb.nextInt();
             flag=false;
             
         }
         catch (Exception ex) {
             System.out.println("Error");
             flag=true;
             kb.nextLine();
             
         }
     } while (flag);
     return numero;
    }
    public static int [][] dMatriz(String mensaje, int tamaño){
        System.out.println("Contenido de la matriz" + mensaje);
        int[][] Matrix = new int[tamaño][tamaño];
        int x;
        System.out.println("Introduce el Tamaño de la matriz");
        for (int i=0; i<Matrix.length; i++){
            for (int j=0; j<Matrix[i].length; j++){
            Matrix[i][j]= int("el valor ("+i+","+j+"): ");
    }
            return Matrix;
}
         public static void multiMatriz(int[][] a,int[][] b){
        int[][]r=new int[a.length][a.length];
        System.out.println("\nProductos");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r.length; j++){
                for (int z=0; z<r.length; z++){
                    r[i][j]+=(a[i][z]*b[z][j]);
                }  
                System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            }
        }
         }
        public static void restaMatriz(int[][] a,int[][] b){
        int[][]r=new int[a.length][a.length];
        System.out.println("\nResta");
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r[i].length; j++){
            r[i][j]=a[i][j]-b[i][j];
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            }
        }
        }
}