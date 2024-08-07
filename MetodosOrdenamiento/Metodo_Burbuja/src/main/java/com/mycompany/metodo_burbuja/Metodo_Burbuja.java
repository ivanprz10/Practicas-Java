package com.mycompany.metodo_burbuja;

import java.util.Scanner;

/**
 *
 * @author ivanp
 */
/*El ordenamiento de burbuja es un algoritmo simple para ordenar una lista de N
números en orden ascendente. El ordenamiento de burbuja compara dos elementos
adyacentes y los intercambia si están en el orden ascendente equivocado.
*/
public class Metodo_Burbuja {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        //declaramos la variable donde se almacenara el tamaño del arreglo
        //delcaramos una variable auxiliar que nos servira para el cambio de posicion del metodo burbuja
        int tam, aux;
        System.out.print("ingrese el tamaño de su arreglo: ");
        tam=sc.nextInt();
        //declaramos el arreglo con el tamaño que el usuario ingreso
        int [] arr=new int[tam];
        for (int i = 0; i < arr.length; i++) {
            //dentro de este mismo bucle for ingresamos los datos de nuestro arreglo
            System.out.print("ingrese el valor ("+i+"): ");
            arr[i]=sc.nextInt();
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //dentro de este mismo imprimimos el arreglo original
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
        
        
        //metodo burbuja-----------------------------------------------------------------------------
        //ordenamiento por medio del algoritmo burbuja
        for (int i = 0; i < (tam-1); i++) {
            for (int j = 0; j < (tam-1); j++) {
                //si el valor en la posicion j es mayo que en la posicion j+1 osea la siguiente posicion
                //se hace el intecambio de posiciones
                if (arr[j]>arr[j+1]) {
                    aux=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=aux;
                }         
            }
        }
        
        //imprimiendo arreglo ordenado
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"-");
        }
        


    }
}
