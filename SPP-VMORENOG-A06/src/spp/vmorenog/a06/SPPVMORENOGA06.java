/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.vmorenog.a06;
import java.util.Scanner;
/**
 *
 * @author victo
 */
public class SPPVMORENOGA06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    solicitarDato();
    
    }
    
    public static void solicitarDato(){
        int numero, suma;
        suma = 0;
        do {
            System.out.println("Introduce un numero:");
            Scanner entradaDato = new Scanner(System.in);
            numero = entradaDato.nextInt();
            if (numero < 0){
                System.out.println("La suma total de los numero positivos ingresados es: " + suma);
             System.exit(0);
            } else {
            suma = suma + numero;
            }
        } while (numero >= 0);
        System.out.println("La suma total de los numero positivos ingresados es: " + suma);
        }
    
}
