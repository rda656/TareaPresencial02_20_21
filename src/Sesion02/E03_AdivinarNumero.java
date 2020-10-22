/**
 * Escribe un programa que genere un número entero aleatorio mediante la función
 * random de la clase Math y que el usuario tenga que adivinarlo. Cada vez que se
 * introduzca un número el programa a de indicar si es mayor o menor que el número 
 * que hay que descubrir. El programa finalizará una vez que el usuario escriba 
 * el número correcto.
 */
package Sesion02;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class E03_AdivinarNumero {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroBuscado, numeroLeido;
        
        // Vamos a crear un número aleatorio entre 0 y 100
        numeroBuscado = (int) (Math.random()*100);
        
        System.out.println("Adivinar un número.");
        System.out.println("-------------------");
        System.out.println("Adivine el número secreto. Está comprendido entre 0 y 100.");
        do{
            System.out.print("Introduzca un número: ");
            numeroLeido = teclado.nextInt();
            
            if(numeroLeido > numeroBuscado)
                System.out.println("El número que tiene que adivinar es más pequeño.");
            else if(numeroLeido < numeroBuscado)
                System.out.println("El número que tiene que adivinar es más grande.");
        }while (numeroLeido != numeroBuscado);
        System.out.println("¡Muy bien! Ha encontrado el número.");
    }
}
