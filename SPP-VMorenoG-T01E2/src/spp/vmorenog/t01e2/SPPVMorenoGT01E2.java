/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Victor Hugo Moreno Goettsch 1410771 IQA
package spp.vmorenog.t01e2;
import  java.util.Scanner;
/**
 *
 * @author victo
 */
public class SPPVMorenoGT01E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar teclado
        Scanner kb = new Scanner (System.in);
        
        //Declarar las variables
        double Sup,Per,Base,Altu;
        
        //Pedir Datos
        System.out.println("Introducr la base");
        Base = kb.nextDouble();
        System.out.println("Introducir la altura");
        Altu = kb.nextDouble();
        
        //declarar ecuacion
        Sup = (Base*Altu);
        System.out.println("El area es " + Sup);
        Per = ((2*Base)*(2*Altu));
        System.out.println("El Perimetro es " + Per);
        
        
    }
    
}
