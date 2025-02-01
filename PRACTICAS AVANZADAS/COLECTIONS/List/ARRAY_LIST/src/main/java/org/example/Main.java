package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(1,22,"Ivan"));
        lista.add(new Persona(2,21,"Jessica"));
        lista.add(new Persona(3,23,"Pedro"));
        lista.add(new Persona(4,24,"Jose"));

        //for NORMAL
        for (int i = 0; i<lista.size();i++){
            System.out.print("prueba: "+ lista.get(i).getNombre());
            System.out.print(" "+lista.get(i).getEdad()+" años"+ "\n");
        }

        //for each
        System.out.println("---------------------FOR EACH--------------------------");
        for (Persona persona:lista){
            System.out.print("prueba: "+ persona.getNombre());
            System.out.print(" "+persona.getEdad()+" años"+ "\n");
        }

        System.out.println("---------------------------------------------------------------");

        System.out.println(lista);//con toString

        System.out.println("-------------------------------con un foreach en una linea------------------------------------------");

        lista.forEach(System.out::println);//una forma eficiente de imprimir una lista con un Foreach :)

        System.out.println("lista actualizada............:");
        lista.set(3,new Persona(4,25,"Enrique"));//lista con cambios
        lista.forEach(System.out::println);


        System.out.println(lista.get(0).equals(lista.get(1)));//verificamos si algun objeto en su posicion cero esta repetido nos mostrara true
        //caso contrario nos mostrara false, metodo "equals" esta implementado en la clase persona :)


    }
}