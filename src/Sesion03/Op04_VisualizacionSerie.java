/**
 * Escribe un programa que solicite al usuario un valor no negativo n (si 
 * introduce un valor negativo le volveremos a pedir el número hasta que 
 * introduzca uno positivo), y visualice una serie de número de forma escalonada.
 * Por ejemplo, para n=6 debe de mostrar la siguiente salida:
    123456 
    12345 
    1234 
    123 
    12 
    1
 */
package Sesion03;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class Op04_VisualizacionSerie {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int serie;
        System.out.println("Serie de números.");
        System.out.println("-----------------");
        do{
            System.out.print("Introduzca el valor más grande de la serie: ");
            serie = teclado.nextInt();
            if(serie <= 0){
                System.err.println("Error. El valor introducido ha de ser positivo.");
            }
        }while(serie <= 0);
        
        for(int i = serie; i > 0; i--){
            for(int j = 1; j <= i; j++ )
                System.out.print(j + " ");
            System.out.println("");
        }
    }
}
