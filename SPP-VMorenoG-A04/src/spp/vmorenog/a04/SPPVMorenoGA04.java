/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.vmorenog.a04;
import java.util.Scanner;
/**
 *
 * @author victo
 */
public class SPPVMorenoGA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos las variables
        int Opcion;
        double Angulo, Seno, Coseno, Tangente;
        Scanner kb = new Scanner(System.in);
        System.out.println("Ingrese la Opcion guste");
        System.out.println("1.- Calcular Seno");
        System.out.println("2.- Calcular Coseno");
        System.out.println("3.- Calcular Tangente");
        System.out.println("4.-Salir");
        Opcion= kb.nextInt();
        switch (Opcion){
            case 1: 
                System.out.println("Introduzca el Angulo entre 0°-360°");
                Angulo= kb.nextDouble();
                if (Angulo>=0 &Angulo<=360)
                {
                    Seno= Math.sin(Angulo);
                    System.out.println("El seno del angulo es" + Seno);
                    } else {
                        System.out.println("No se puede calcular");
                        }
                    break;
            case 2:
                    System.out.println("Introduzca el Angulo entre 0°-360°");
                Angulo=kb.nextDouble();
                if (Angulo>=0&Angulo<=360)
                {
                    Coseno=Math.cos(Angulo);
                    System.out.println("El coseno del angulo es" + Coseno);
                } else {
                        System.out.println("No se puede Calcular");
                        }
                         break;
            case 3:
                System.out.println("Introduzca el Angulo entre 0°-360°");
                Angulo=kb.nextDouble();
                if (Angulo>=0&Angulo<=360)
                {
                    Tangente= Math.tan(Angulo);
                    System.out.println("La tangente del angulo es " + Tangente);
                } else {
                System.out.println("No se puede calcular");
                        } break;
            case 4:
                System.out.println("Adios");
            
                }
                      
            
        }
    }
    

