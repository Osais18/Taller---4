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
public class numeros_primos_ejer_venti_cinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n________________25_________________\n");
        Scanner leer = new Scanner(System.in);
        int numPrimos;
        int contador;
        boolean esPrimo;
        int divisor;
        int num;

        System.out.println("Indicanos la cantidad de los primeros números primos que deseas conocer: ");
        numPrimos = leer.nextInt();
        contador = 1;
        num = 3;
        while (contador < numPrimos) {
            esPrimo = true;
            divisor = 3;
            while ((divisor <= Math.sqrt((num))) && esPrimo) {
                if (num % divisor == 0) {
                    esPrimo = false;
                }
                divisor += 2;
            }
            if (esPrimo) {
                contador += 1;
                System.out.println(contador + ": " + num);
            }
            num += 2;
        }
    }
}
