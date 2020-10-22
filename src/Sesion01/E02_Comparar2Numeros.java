/**
 * Vamos a realizar unas modificaciones sobre el ejercicio anterior. Ahora debes 
 * de distinguir si qué número de los introducidos es mayor o si son iguales.
 */
package Sesion01;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class E02_Comparar2Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Comparar de dos números.");
        System.out.println("------------------------");
        
        System.out.print("Introduzca el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduzca el segundo número: ");
        numero2 = teclado.nextInt();
        
        if(numero1 == numero2)
            System.out.println("Los dos números son iguales");
        else if(numero1 > numero2)
            System.out.format("%d es mayor que %d\n", numero1, numero2);
        else
            System.out.format("%d es menor que %d\n", numero1, numero2);
    }
}
