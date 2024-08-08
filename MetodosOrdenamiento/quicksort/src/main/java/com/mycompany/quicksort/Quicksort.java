package com.mycompany.quicksort;
import java.util.*;

/**
 *
 * @author ivanp
 */

class Quicksort {

    // Función para intercambiar dos elementos en el arreglo
    static void swap(int[] arr, int i, int j) {
        // Almacena temporalmente el valor de arr[i]
        int temp = arr[i];
        // Asigna el valor de arr[j] a arr[i]
        arr[i] = arr[j];
        // Asigna el valor almacenado en temp a arr[j]
        arr[j] = temp;
    }

    // Función para dividir el arreglo en dos subarreglos alrededor de un pivote
    static int partition(int[] arr, int s, int e) {
        // Selecciona el último elemento como pivote
        int pivot = arr[e];
        // Índice del elemento más pequeño, se inicia antes del primer elemento
        int i = (s - 1);

        // Recorre el arreglo desde el primer hasta el penúltimo elemento
        for (int j = s; j <= e - 1; j++) {
            // Si el elemento actual es menor que el pivote
            if (arr[j] < pivot) {
                // Incrementa el índice del elemento más pequeño
                i++;
                // Intercambia los elementos en las posiciones i y j
                swap(arr, i, j);
            }
        }

        // Intercambia el pivote con el primer elemento mayor
        swap(arr, i + 1, e);
        // Retorna la posición final del pivote
        return (i + 1);
    }

    // Función para aplicar QuickSort en el arreglo
    static void quickSort(int[] arr, int low, int high) {
        // Si hay más de un elemento en el subarreglo
        if (low < high) {
            // Encuentra la posición del pivote y divide el arreglo
            int pi = partition(arr, low, high);
            // Ordena los elementos antes y después del pivote recursivamente
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Función para imprimir el arreglo
    static void printArray(int[] arr, int size) {
        // Recorre e imprime cada elemento del arreglo
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Función principal que ejecuta el programa
    public static void main(String[] args) {	
        // Crea un objeto Scanner para leer datos desde la entrada
        Scanner sc = new Scanner(System.in);

        // Solicita al usuario ingresar el tamaño del arreglo
        System.out.print("Ingrese la medida de su arreglo: ");
        int p = sc.nextInt();

        // Declara un arreglo de tamaño 10 (podría ser p en lugar de 10 para generalizar)
        int[] arr = new int[10];

        // Lee los elementos del arreglo desde la entrada
        for(int i = 0; i < p; i++) {
            arr[i] = sc.nextInt();  
        }

        // Llama a la función de ordenamiento QuickSort
        quickSort(arr, 0, p - 1);

        // Imprime el arreglo ordenado
        System.out.println("Arreglo ordenado: ");
        printArray(arr, p);
    }
}

