/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.taller_4;

import java.util.Scanner;

/**
 *
 * @author OSAIS
 */
public class A_mayor_o_igual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int n1, n2;
        System.out.println("\n________________1_________________\n");
        System.out.println("Digite el numero 1");
        n1 = leer.nextInt();
        System.out.println("Digite el numero 2");
        n2 = leer.nextInt();

        if (n1 == n2) {
            System.out.println(" los valores " + n1 + " y " + n2 + " son iguales ");
        }
        if (n1 != n2) {
            if (n1 > n2) {
                System.out.println(" el valor  " + n1 + "  es mayor que " + n2 + "  ");
            } else {
                System.out.println(" el valor  " + n1 + "  es menor que " + n2 + "  ");
            }
        }
        
    }
    
}
