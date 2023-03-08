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
public class S_vocal_noVocal {

    /**
     * @param args the command line arguments
     */
      public static boolean esVocal(char letra) {
        letra = Character.toUpperCase(letra);
        return letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("\n________________19_________________\n");
        
        Scanner lector = new Scanner(System.in);
     

        String txt;
        char caracter;

        while (true)
        {
            System.out.println("introduce un caracter  para determinar si es o no vocal: ");
            txt = lector.nextLine();

            if (txt.equals(" "))
            {
                break;
            }

            caracter = txt.charAt(0);

            if (esVocal(caracter))
            {
                System.out.println(" ES UN CARACTER VOCAL");
            } else
            {
                System.out.println("NO ES UN CARACTER  VOCAL");
            }
        }
    }
}
