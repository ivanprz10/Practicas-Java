package com.mycompany.entrada_datos_scanner;
/**
 *
 * @author ivanp
 */
import java.util.Scanner;
public class Entrada_Datos_Scanner {

    public static void main(String[] args) {
        // Crea un objeto a partir de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        // captura la entrada del teclado
        String nombre = entrada.nextLine();
        //imprime el nombre
        System.out.println("Mi nombre es " + nombre);
        // cierra la clase Scanner
        entrada.close();   
    }
}
