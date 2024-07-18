/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tuto_arrays_unidimensionales;

import java.util.Scanner;

/**
 *
 * @author ivanp
 */
public class Tuto_Arrays_unidimensionales {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//ARRAY´S DECLARADOS CON TIPOS DE DATOS, VEMOS SU CORRECTA SINTAXIS
        int [] arrayInt;
        double []arrayDouble;
        float []arrayFloat;
        boolean []arrayBoolean;
        char []arrayChar;
        String []arrayString;
        
        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //ARRAY´S CON VALORES DENTRO YA DECLARADOS
        int [] array_Int={2,4,6,42,64,20,9};
        double []array_Double = {4.444, 55.52323, 235.523524,23532.53333};
        float []array_Float = {43.343f, 32.544f, 54.34f };
        boolean []array_Boolean = {true,false,false,true};
        char []array_Char = {'f', '-','d','#','$'};
        String []array_String = {"hola","adios","si","no"};
        
        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //PODEMOS IMPRIMIR UN VALOR ESPECIFICO DE NUESTRO ARREGLO, DEPENDIENDO SU POSICION
        //RECUERDA QUE LA PRIMERA POSICION DE UN ARRAY ES CERO, ES DECIR QUE LA SEGUNDA ES 1 Y ASI CONSECUTIVAMENTE
        int [] array1Int={2,4,6,42,64,20,9};//tenemos un arreglo declarado con valores
        System.out.println(array1Int[3]);//imprimimos un valor especifico de nuestro arreglo este caso la posicion 3
                                        //salida: [42]
        
        String []array1String = {"hola","adios","si","no"};//array de tipo String con 4 valores declarado
        System.out.println(array1String[4]);//en este caso nos dara un error de salida ya que esa posicion no existe, unicamente hasta la 3ra

        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //OTRA FORMA DE DECLARAR ARREGLOS CON UN TAMAÑO FIJO, ASI COMO INSERTAR VALORES
        
        int [] array2Int = new int [5];//declaramos un array indicandole que solo tendra un limite de 5 
        array2Int [0] = 2;//y para insertar valores es nuestro array en la posicion que querramos que ingrese ese dato y el valor
        array2Int [1] = 3;
        array2Int [2] =4;
        System.out.println(array_Int[1]);//imprimimos en pantalla el array con su posicion
        
        
        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //MANERA DE CONOCER LA MEDIDA DE NUESTRO ARRAY CON (LENGTH)
        //ESTA MANERA ES UNA FORMA EFICIENTE DE CONOCER LA DIMENSION DE NUESTRO ARRAY ES DECIR CUANTOS DATOS ALMACENARA
        
        int [] array3Int ={1,2,3,4,6,3,1,3,6};//declaramos un array con 9 datos enteros
        System.out.println(array3Int.length);
        
        //---------------------------------------------------------------------------------------------------------------------------------------------------------
        //APLICACION DIRECTA USANDO BUCLE FOR
        int [] array4Int ={1,2,3,4,6,3,1,3,6};//declaramos un array con 9 datos enteros
        for (int i = 0; i < array4Int.length; i++) {//usando un for para que este llegue a la cantidad de los elementos en el array
            System.out.println(i);//se imprime el numero de veces que contenga el arreglo
        }
        
        //---------------------------------------------------------------------------------------------------------------------------------------------------------
       //IMPRIMIR TODAS LAS POSICIONES DEL ARREGLO USANDO FOR Y FOR EACH
       //for
       int [] arr1 = {1,2,5,3,2};//nuestro arreglo principal
       
        for (int i = 0; i < arr1.length; i++) {//declarando for, con variable iteradora y que llegue a la medida de nuestro arreglo 
            System.out.println(arr1[i]);   //imprimira nuestro array en la posicion i
        }
        
        //for each
        for (int i : arr1) {// para cada (for each) elemento int (llamado i) en el arreglo arr1, imprime el valor de i.

            System.out.print("("+i+") ");
        }
        
       //---------------------------------------------------------------------------------------------------------------------------------------------------------
       //INTRODUCIR VALORES POR TECLADO A UN ARREGLO CON FOR
       int tamaño;
        System.out.print("ingrese la cantidad de elementos de su arreglo: ");
        tamaño=sc.nextInt();
        
        int[]arr = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            System.out.print("ingrese el valor de la posicion ["+i+"]:");
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
