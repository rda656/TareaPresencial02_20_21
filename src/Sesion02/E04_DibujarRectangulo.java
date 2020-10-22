/**
 * Escribe un programa que dibuje un rectángulo de X x Y, teniendo que ser ambos mayores que 0.
 * Ejemplo: el usuario ha introducido que un lado es 4 y el otro 6. Debe de mostrar:
           ****
           ****
           ****
           ****
           ****
           ****
 */
package Sesion02;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class E04_DibujarRectangulo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, altura;
        System.out.println("Dibujando un rectángulo.");
        System.out.println("-----------------------");
        do{
            System.out.print("Introduzca el valor de la base: ");
            base = teclado.nextInt();
            if(base <= 0){
                System.err.println("Error. La base tiene que ser mayor que 0");
            }
        }while(base <= 0);
        
        do{
            System.out.print("Introduzca el valor de la altura: ");
            altura = teclado.nextInt();
            if(altura <= 0){
                System.err.println("Error. La altura tiene que ser mayor que 0");
            }
        }while(altura <= 0);
        
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < base; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
