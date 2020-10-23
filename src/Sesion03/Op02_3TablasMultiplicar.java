/**
 * Crea un programa que muestre las tablas de multiplicar de tres números 
 * consecutivos. El usuario ha de introducir el primer número de las tablas que 
 * quiere visualizar.
 */
package Sesion03;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class Op02_3TablasMultiplicar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabla;
        System.out.println("Tres tablas de multiplicar.");
        System.out.println("---------------------------");
        
        System.out.print("Introduzca el valor de la primera tabla de multiplicar que quiere mostrar: ");
            tabla = teclado.nextInt();
            
        
        for(int i = tabla; i < tabla + 3; i++){
            System.out.format("\nTabla de multiplicar del %d.\n", i);
            for(int j = 0; j <= 10; j++){
                System.out.format("%d x %d = %d\n", i, j, i*j);
            }
        }
    }
}
