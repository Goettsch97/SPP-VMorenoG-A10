/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.vmorenog.a09;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class SPPVMorenoGA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa que sume dos matrices
       
         int matriz1[][] = new int [3][3];
         int matriz2[][] = new int [3][3];
        int i,j;
    }
    public static int pedir(){
        Scanner kb = new Scanner(System.in);
        boolean flag;
        int numero=0;
        do {
            System.out.println("Introduce un entero");
            try{
               numero=kb.nextInt();
               flag=false;
        } catch(Exception er){
                System.out.println("Introduce un numero entero");
                flag=true;
                kb.next();
        }
    }while(flag);
    return numero;
    }
}