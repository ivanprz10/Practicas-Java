package com.mycompany.metodo_insercion;

import java.util.Arrays;

/**
 *
 * @author ivanp
 */
public class Metodo_insercion {

    public static void main(String[] args) {

        int[] arr = { 9, 5, 1, 4, 3 };
        System.out.println("Arreglo desordenado: "+Arrays.toString(arr));
        
        for (int i = 0; i < arr.length; i++) {
            int aux=arr[i];
            int j=i-1;
            while (j >= 0 && aux < arr[j]) { 
                
                arr[j+1]=arr[j];
                --j;  
            }
            // Coloca a key después del elemento más pequeño que este
            arr[j + 1] = aux;
        }
                System.out.println("Arreglo ordenado: "+Arrays.toString(arr));


    }
}
