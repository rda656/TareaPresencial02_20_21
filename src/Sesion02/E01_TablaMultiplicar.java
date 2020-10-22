/*
 * Escribe un programa que muestre la tabla de multiplicar de un número dado 
 * por teclado. El número que debe aceptar es del 1 al 10 y la tabla debe de 
 * ir desde el 0 al 10.
 */
package Sesion02;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class E01_TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero, resultado;
        
        System.out.println("Tabla de multiplicar.");
        System.out.println("---------------------");
        do{
            System.out.print("Introduzca el valor de la tabla de multiplicar que quiere mostrar: ");
            numero = teclado.nextInt();
            if(numero < 1 || numero > 10){
                System.err.println("Error. El valor tiene que estar comprendido entre 1 y 10.");
            }
        }while(numero < 1 || numero > 10);
        
        System.out.println("La tabla de multiplicar del " + numero + " es la siguiente:");
       
        for(int i = 0; i <= 10; i++){ // i++, i = i+1
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        boolean r;
        do{
            System.out.println("");
            r = false;
        }while(r == true);
               
    }
    
}
