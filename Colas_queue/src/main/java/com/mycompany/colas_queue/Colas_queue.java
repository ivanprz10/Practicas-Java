package com.mycompany.colas_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ivanp
 */
public class Colas_queue {

    public static void main(String[] args) {
   
        // Crea una cola usando la LinkedList
        Queue<Integer> numeros = new LinkedList<>();
        // agrega elementos a la cola
        numeros.offer(1);
        numeros.offer(2);
        numeros.offer(3);
        System.out.println("Cola: " + numeros);
        //accede a los elementos de la cola
        int numeroAccedido = numeros.peek();
        System.out.println("Elemento accedido: " + numeroAccedido);
        // quita elementos de la cola
        int numeroRemovido = numeros.poll();
        System.out.println("Elemento removido: " + numeroRemovido);
        System.out.println("Cola actualizada: " + numeros);
        System.out.println("la cola esta vacia?"+numeros.isEmpty());


    }
}
