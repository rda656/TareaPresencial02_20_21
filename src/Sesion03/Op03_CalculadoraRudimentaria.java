/**
 * Escribe un programa que muestre un menú con 5 opciones: "1. Sumar. 2. Restar. 
 * 3. Multiplicar. 4. Dividir. 0. Salir". En función de la opción elegida debe 
 * realizar la operación indicada sobre dos números que ha de introducir el 
 * usuario. El programa se debe repetir hasta que se elija la opción "0".
 */
package Sesion03;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class Op03_CalculadoraRudimentaria {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        float numero1, numero2;
        
        do{
            System.out.print("Calculadora rudimentaria.\n"
                    + "-------------------------\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "0. Salir del programa\n"
                    + "Elija una opción: ");
            opcion = teclado.nextInt();
            switch(opcion){
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    System.out.print("Suma.\n-----\nIntroduzca el primer valor: ");
                    numero1 = teclado.nextFloat();
                    System.out.print("Introduzca el segundo valor: ");
                    numero2 = teclado.nextFloat();
                    System.out.format("Resultado: %.2f + %.2f = %.2f\n", numero1, numero2, numero1 + numero2);
                    break;
                case 2:
                    System.out.print("Resta.\n------\nIntroduzca el primer valor: ");
                    numero1 = teclado.nextFloat();
                    System.out.print("Introduzca el segundo valor: ");
                    numero2 = teclado.nextFloat();
                    System.out.format("Resultado: %.2f - %.2f = %.2f\n", numero1, numero2, numero1 - numero2);
                    break;
                case 3:
                    System.out.print("Multiplicación.\n---------------\nIntroduzca el primer valor: ");
                    numero1 = teclado.nextFloat();
                    System.out.print("Introduzca el segundo valor: ");
                    numero2 = teclado.nextFloat();
                    System.out.format("Resultado: %.2f x %.2f = %.2f\n", numero1, numero2, numero1 * numero2);
                    break;
                case 4:
                    System.out.print("División.\n---------\nIntroduzca el primer valor: ");
                    numero1 = teclado.nextFloat();
                    System.out.print("Introduzca el segundo valor: ");
                    numero2 = teclado.nextFloat();
                    System.out.format("Resultado: %.2f / %.2f = %.2f\n", numero1, numero2, numero1 / numero2);
                    break;
                default:
                    System.out.println("\nLa opción seleccionada no es válida.\n");
                    break;
            }
        }while(opcion != 0);
    }
}
