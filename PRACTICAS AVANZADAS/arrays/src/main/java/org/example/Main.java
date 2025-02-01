package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tam = reader("ingrese el tamaño de su arreglo: ");
        int[]arr = new int[tam];

        for (int i = 0; i< arr.length; i++){

            arr[i] = reader("ingrese el valor "+(i+1)+": ");

        }
        System.out.print("los valores de su arreglo son: ");
        for (int j : arr) {
            System.out.print(" " + j + ",");

        }


    }
    public static int reader(String msj){
        System.out.print (msj);
        return new Scanner(System.in).nextInt();
    }
}