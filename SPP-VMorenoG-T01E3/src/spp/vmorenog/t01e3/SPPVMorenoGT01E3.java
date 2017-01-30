/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Victor Hugo Moreno Goettsch 1410771 IQA
package spp.vmorenog.t01e3;
import java.util.Scanner;
/**
 *
 * @author victo
 */
public class SPPVMorenoGT01E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar Teclado
        Scanner kb = new Scanner (System.in);
        //Declarar Variables
        int X1,X2,Y1,Y2;
        double D;
        //Pedir Datos    
        System.out.println(" Introduce X1");
        X1 = (int) kb.nextDouble();
        System.out.println("Introduce Y1");
        Y1 = (int) kb.nextDouble();
        System.out.println(" Introduce X2");
        X2 = (int) kb.nextDouble();
        System.out.println(" Introduce Y2");
        Y2 = (int) kb.nextDouble();
        //Declarar la Ecuacion
        D = Math.sqrt(Math.pow((X1-X2,2)+ Math.pow(Y2, Y1),2));
        System.out.println(" La distancia entre las 2 coordenadas es" + D);
    }
    
}
