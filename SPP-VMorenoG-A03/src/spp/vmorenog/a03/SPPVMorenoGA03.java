/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.vmorenog.a03;
import java.util.Scanner;
/**
 *
 * @author victo
 */
public class SPPVMorenoGA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Programa para calcular hipotenusa
        double cateto1, cateto2, hipotenusa;
        cateto1 = solicitarCateto1();
        cateto2 = solicitarCateto2();
        hipotenusa = calcularHipotenusa(cateto1, cateto2);
        respuesta(hipotenusa);
    }
    
    public static double solicitarCateto1(){
        double cateto1;
        System.out.println("Ingrese el valor del cateto #01");
        Scanner entradaCateto1 = new Scanner(System.in);
        cateto1 = entradaCateto1.nextDouble();
        return cateto1;
    }
    
    public static double solicitarCateto2(){
        double cateto2;
        System.out.println("Ingrese el valor del cateto #02");
        Scanner entradaCateto2 = new Scanner(System.in);
        cateto2 = entradaCateto2.nextDouble();
        return cateto2;
    }
    public static double calcularHipotenusa(double cateto1, double cateto2){
        double hipotenusa, cuadrados;
        cuadrados = (Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        hipotenusa = Math.sqrt(cuadrados);
        return hipotenusa;
    }
    
    public static void respuesta(double hipotenusa){
        System.out.println("HIPOTENUSA = " + hipotenusa);
    }
}

    
}
