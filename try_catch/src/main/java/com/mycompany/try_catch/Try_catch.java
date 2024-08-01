package com.mycompany.try_catch;

/**
 *
 * @author ivanp
 */
public class Try_catch {
    /*manejo de excepciones se utiliza para manejar excepciones, que son eventos que interrumpen el flujo normal de un programa.
    Estos eventos pueden ser errores del sistema, errores de lógica en el código, o situaciones inesperadas durante la ejecución 
    del programa*/

    public static void main(String[] args) {

        try {
            
            int resultado = 10 / 0; // Esto lanzará ArithmeticException
            System.out.println("El resultado es " + resultado);
        } 
        catch (ArithmeticException e) {
            // Código para manejar la excepción
            System.out.println("Error: División por cero.");
        }

    }
}
