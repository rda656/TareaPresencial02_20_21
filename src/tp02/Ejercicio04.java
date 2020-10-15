/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp02;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Ejercicio04 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, altura;
        
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
