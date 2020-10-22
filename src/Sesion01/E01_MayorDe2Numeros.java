/**
 * Crea un programa que pida por teclado dos números. A continuación, ha de indicar 
 * por pantalla qué número es el mayor, si el primero o el segundo.
 */
package Sesion01;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class E01_MayorDe2Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;
        
        System.out.println("Mayor de dos números.");
        System.out.println("---------------------");
        
        System.out.print("Introduzca el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduzca el segundo número: ");
        numero2 = teclado.nextInt();
        
        if(numero1 > numero2)
            System.out.format("%d es mayor que %d\n", numero1, numero2);
        else
            System.out.format("%d es menor que %d\n", numero1, numero2);
    }
}
