
package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,res;
        System.out.print("Hola, introduce el primer numero: ");
        x = sc.nextInt();
        System.out.print("introduce el segundo numero: ");
        y = sc.nextInt();
        res = x + y;
        System.out.println("la suma de ambos numeros es: "+ res);
    }
}
