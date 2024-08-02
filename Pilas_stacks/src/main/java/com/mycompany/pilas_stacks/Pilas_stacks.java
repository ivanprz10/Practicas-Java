package com.mycompany.pilas_stacks;

import java.util.Stack;

/**
 *
 * @author ivanp
 */
//estructura de datos que siguen el principio LIFO (Last In, First Out)
//lo que significa que el último elemento en entrar es el primero en salir.
public class Pilas_stacks {

    public static void main(String[] args) {

        Stack <Integer> pila= new Stack<>();
        
        
        //con el metodo .push agregamos elementos a la pila--------------------------------------------------------------------------------
        pila.push(12);
        pila.push(15);
        pila.push(2);
        pila.push(1);
        pila.push(4);
        pila.push(2);
        
        System.out.println("la pila original es: "+pila);
        
        //Eliminar elementos de la pila----------------------------------------------------------------------------------------------------
        
        int del=pila.pop();
        
        System.out.println("elemento eliminado = "+del);
        System.out.println(pila);
        
        
        
         // Ver el elemento en la cima de la pila (peek)-------------------------------------------------------------------------------------------
         
        System.out.println("Elemento en la cima: " + pila.peek());
        
        //buscar elementos en la pila---------------------------------------------------------------------------------------------------------------
        
        int sea=pila.search(2);
        System.out.println("el elemento esta en la posicion: "+sea);
        
        //Para verificar si una pila está vacía o no, usamos el método empty(). Por ejemplo,
        
        System.out.println("la pila esta vacia?\n"+pila.empty());

        
        
        
        
    }
}
