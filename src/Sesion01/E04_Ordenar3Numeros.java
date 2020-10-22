/**
 * Escribe un programa que pida por teclado tres números y los muestre por 
 * pantalla de mayor a menor.
 */
package Sesion01;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class E04_Ordenar3Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        
        System.out.println("Ordenar tres números.");
        System.out.println("---------------------");
        
        System.out.print("Introduzca el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Introduzca el segundo número: ");
        numero2 = teclado.nextInt();
        System.out.print("Introduzca el tercer número: ");
        numero3 = teclado.nextInt();
        
        System.out.print("El número más grande es ");
        if(numero1 > numero2){
            if(numero1 > numero3){
                System.out.print(numero1);
                
                if(numero2 > numero3)
                    System.out.format(" luego %d y el más pequeño es el %d", numero2, numero3);
                else
                    System.out.format(" luego %d y el más pequeño es el %d", numero3, numero2);
            }
            else{
                System.out.format("%d luego %d y el más pequeño es el %d", numero3, numero1, numero2);
            }
        }
        else{
            if(numero2 > numero3){
                System.out.print(numero2);
                if(numero1 > numero3)
                    System.out.format(" luego %d y el más pequeño es el %d", numero1, numero3);
                else
                    System.out.format(" luego %d y el más pequeño es el %d", numero3, numero1);
            }
            else
                System.out.format("%d luego %d y el más pequeño es el %d", numero3, numero2, numero1);
        }
    }
}
