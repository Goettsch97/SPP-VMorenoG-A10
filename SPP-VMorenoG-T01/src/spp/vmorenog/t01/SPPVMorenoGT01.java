/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Victor Hugo Moreno Goettsch 1410771 IQA
package spp.vmorenog.t01;
import java.util.Scanner;
/**
 *
 * @author victo
 */
public class SPPVMorenoGT01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declarar teclado 
        Scanner kb= new Scanner (System.in);
        //declarar variables 
        double Mat, Cal1, Cal2, Cal3, Cal4, Cal5, Pro;
        
        //Pedir datos
        System.out.println("Introduzca su Matrícula");
        Mat = kb.nextDouble();
        System.out.println("Introduce la Calificacion 1");
        Cal1 = kb.nextDouble();
        System.out.println("Introduce la Calificacion 2");
        Cal2 = kb.nextDouble();
        System.out.println("Introduce la Calificacion 3");
        Cal3 = kb.nextDouble();
        System.out.println("Introduce la Califiacion 4 ");
        Cal4 = kb.nextDouble();
        System.out.println("Introduce la Calificacion 5");
        Cal5 = kb.nextDouble();
        Pro = ((Cal1+Cal2+Cal3+Cal4+Cal5)/5);
        //Definir Promedio 
        System.out.println("Su promedio es="+Pro);
        if (Pro<6.9){
            System.out.println("REPROBADO");
        } else if (Pro>7){
            System.out.println("APROBADO");
        }
    }
    
}
