package com.mycompany.archivos_java;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 *
 * @author ivanp
 */
public class Archivos_java {

    public static void main(String[] args) {
        String datos="<h1 style=\"color: blue;\">HOLA MUNDO</h1>";     
        try {
        // Crear un Writer usando la clase FileWriter
        Writer salida = new FileWriter("pagina.html");
        // Escribe la cadena en el archivo
        salida.write(datos);
        // cierra el Writer
        salida.close();
        }
        catch (IOException e) {
            System.out.println("ERROR");

        }

    }
}


