/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.vmorenog.t2p1;
import java.util.Scanner;
/**
 *
 * @author victo
 */
public class SPPVMorenoGT2P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb =new Scanner(System.in);
        int count;
        System.out.println("¿Cuantos salarios revisara?");
        count = kb.nextInt();
        
        
        while(count>0){switch(pedirDatos("La categoria")){
            case 1:
                Pago(30);
            case 2:
                Pago(38);
            case 3:
                Pago(50);
            case 4:
                Pago(70);
            break;
                
            default:
                System.out.println("Ingrese un numero del 1 al 4");
                
        }
        count= count-1;
    }
    }
    static int pedirDatos(String data){
    Scanner kb = new Scanner (System.in);
    int x;
    System.out.print("Ingrese " + data + ": ");
    x = kb.nextInt();
    return x;
}
static void Pago(double ex){
    double pay,he,sue;
     
    sue = pedirDatos("El salario normal");
    he = pedirDatos("Horas extras");
            
    pay = sue + (he * ex);
    System.out.println("El pago al trabajador es de: $" + pay + "\n");
}   
}