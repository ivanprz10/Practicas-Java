package com.mycompany.leertextos;
import java.io.Reader;
import java.io.FileReader;

/**
 *
 * @author ivanp
 */
public class LeerTextos {

    public static void main(String[] args) {


        // Crea un arreglo de caracteres
        char[] arreglo= new char[400];
        try {
        // Crea un lector de texto usando FileReader
        Reader entrada = new FileReader("archivo.txt");
        // Revisa si el lector de texto está listo
        System.out.println("Hay datos en la transmision?"  + entrada.ready());
        // Lee los caracteres
        entrada.read(arreglo);
        System.out.println("Datos en la transmision:");
        System.out.println(arreglo);
        // Cierra el lector de texto
        entrada.close();
        }
        catch(Exception e) {
            System.out.println("Error de locacion:(");
        }



    }
}
