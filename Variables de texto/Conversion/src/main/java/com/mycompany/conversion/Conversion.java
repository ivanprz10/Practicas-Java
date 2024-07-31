package com.mycompany.conversion;

/**
 *
 * @author ivanp
 */
public class Conversion {

    public static void main(String[] args) {
        //Declarando una variable de tipo String
        String s = "200";
        System.out.println (s + " pesos como String");
        //Convirtiendo la variable de tipo String en una de tipo int usando Integer.parseInt()
        int i = Integer.parseInt (s);
        //Imprimiendo el valor de i
        System.out.println (i);
        System.out.println (i + 300);
    }
}