/**
 * Crea un programa que permita calcular un número elevado a otro, x^y, mediante 
 * el uso de una estructura de repetición. Los valores leídos "x" e "y" han de 
 * ser positivos.
 */
package Sesion03;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class Op01_Potencia2Numeros {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, exponente, resultado = 1;
        System.out.println("Potencia de dos números.");
        System.out.println("------------------------");
        do{
            System.out.print("Introduzca el valor de la base: ");
            base = teclado.nextInt();
            if(base <= 0){
                System.err.println("Error. La base tiene que ser mayor que 0");
            }
        }while(base <= 0);
        
        do{
            System.out.print("Introduzca el valor del exponente: ");
            exponente = teclado.nextInt();
            if(exponente <= 0){
                System.err.println("Error. La altura tiene que ser mayor que 0");
            }
        }while(exponente <= 0);
        
        for(int i = 0; i < exponente; i++){
            resultado *= base;
        }
        
        System.out.format("Resultado: %d^%d = %d\n",base, exponente, resultado);
    }
}
