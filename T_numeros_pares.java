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
public class T_numeros_pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\n________________20_________________\n");
        int numero1, numero2, minimo, maximo;

        System.out.println("Los numero pares entre dos numeros ingresados");
        System.out.println("\nIntroduce el primer número: \n");
        numero1 = leer.nextInt();
        System.out.println("\nIntroduce el segundo número: \n");
        numero2 = leer.nextInt();

        if (numero1 < numero2) {
            minimo = numero1;
            maximo = numero2;
        } else {
            minimo = numero2;
            maximo = numero1;
        }
        for (int i = minimo + 1; i < maximo; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" . ");
            }
        }
    }
}
