/*
 * Escribe un programa que pida por teclado 3 números y calcule su media.
 */
package tp02;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class Ejercicio02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int repeticiones = 3;
        float numero, suma = 0;
        
        System.out.println("Calculo de la media de 3 números.");
        System.out.println("---------------------------------");
        for(int i = 0; i < repeticiones; i++){
            System.out.print("Introduzca un número: ");
            numero = teclado.nextInt();
            System.out.println("Número leído.");
            suma += numero;
        }
        
        System.out.println("La media de los 3 números introducidos es: " + suma/3);
    }
}
