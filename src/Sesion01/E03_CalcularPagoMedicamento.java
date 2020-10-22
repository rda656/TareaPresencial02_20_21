/**
 * Escribe un programa que permita calcular el precio que ha de pagar una persona 
 * por el medicamento, por tanto, necesitaremos dos datos para leer desde teclado: 
 * por un lado la edad de la persona y el precio del medicamento (recuerda que no 
 * se puede introducir un valor inferior a cero ya que ni la edad ni el precio de 
 * un artículo pueden ser negativos). Si la persona tiene 65 años o más solo tiene 
 * que pagar el 10% del valor del producto. Muestra por pantalla el valor del 
 * artículo y el precio final que ha de abonar el usuario.
 */
package Sesion01;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class E03_CalcularPagoMedicamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        float precio;
        
        System.out.println("Precio de un medicamento.");
        System.out.println("-------------------------");
        
        do{
            System.out.print("Introduzca la edad del usuario: ");
            edad = teclado.nextInt();
            if(edad < 0)
                System.err.println("Error. Una persona no puede tener menos de 0 años.");
        }while(edad < 0);
        do{
            System.out.print("Introduzca el precio del medicamento: ");
            precio = teclado.nextFloat();
            if(precio <= 0)
                System.err.println("Error. El precio del medicamento tiene que ser positivo.");
        }while(precio <= 0);
        
        if(edad >= 65)
            System.out.format("El precio del medicamento es %.2f€ pero el usuario tiene que"
                    + "pagar %.2f€ ya que tiene más de 65 años.\n", precio, precio * 0.1f);
        else
            System.out.format("El precio del medicamento es %.2f€. El usuario tiene que"
                    + " pagar esa cantidad ya que no tiene más de 65 años.\n", precio);
    }
}
