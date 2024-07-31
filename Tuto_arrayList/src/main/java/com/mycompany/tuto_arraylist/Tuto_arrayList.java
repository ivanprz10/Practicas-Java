package com.mycompany.tuto_arraylist;

import java.util.ArrayList;

/**
 *
 * @author ivanp
 */
public class Tuto_arrayList {

    public static void main(String[] args) {
        // Crear un ArrayList
        ArrayList<String> listaDeNombres = new ArrayList<>();

        // Añadir elementos
        listaDeNombres.add("Juan");
        listaDeNombres.add("Ana");
        listaDeNombres.add("Pedro");

        // Acceder a elementos
        System.out.println("Primer elemento: " + listaDeNombres.get(0));

        // Modificar elementos
        listaDeNombres.set(1, "María");

        // Eliminar elementos
        listaDeNombres.remove(0); // Elimina "Juan"
        listaDeNombres.remove("Pedro"); // Elimina "Pedro"

        // Tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + listaDeNombres.size());

        // Iterar sobre el ArrayList
        for (String nombre : listaDeNombres) {
            System.out.println(nombre);
        }    }
}
