package org.example;
//programa que pide el tamaño de longitud de un arreglo, almacena los valores
// y te regresa el valor maximo del mismo

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int tam = reader("Digite el tamaño de su arreglo: ");

        int [] array = new int[tam];
        for(int i = 0; i<array.length;i++){
            array[i] = reader("ingrese el valor "+(i+1)+" : ");
        }
        System.out.println("el arreglo es: ");
        for(int i : array){

            System.out.print(i+",");

        }
        int val = getMaxValue(array);
        System.out.println("\nel valor maximo de su arreglo es: "+val);

    }
    public static int reader(String msj){
        System.out.print(msj);
        return new Scanner(System.in).nextInt();
    }
    public static int getMaxValue(int []array){

        int valMax = array[0];
        for (int j : array) {
            if (valMax < j) {
                valMax = j;
            }
        }

        return valMax;
    }
}