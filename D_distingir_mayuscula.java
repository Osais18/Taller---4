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
public class D_distingir_mayuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        char n1;
        System.out.println("\n________________4_________________\n");
        System.out.println("Digite alguna letra  para distinguir las minnusculas de las mayusculas :");
        n1 = leer.next().charAt(0);
        System.out.println("Valor "+n1);
        if (Character.isUpperCase(n1)) {
             System.out.println(" la letra ingresada es mayuscula "+ n1);
        }else{
            System.out.println(" la letra ingresada es minuscula "+ n1);
        }
    }
    
}
