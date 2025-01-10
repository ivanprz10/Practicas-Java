package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Orden> ordenes =List.of(

                new Orden("A123",125),
                new Orden("B123",150),
                new Orden("C123",80),
                new Orden("D123",100)
        );

        List<Orden> ordenesFiltradas = ordenes.stream()
                .filter(orden -> orden.getTotal()>100)
                .toList();

        System.out.println("las ordenes filtradas son"+ordenesFiltradas);


    }
}