//tutorial de como usar el bucle for en java
package com.mycompany.tuto_for;
import java.util.Scanner;

public class Tuto_For {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        for(int i=0; i<=10;i++){//declarando for iniciando con una variable iteradora en cero
                                   //seguida de la condicion de i menor igual a 10
                                   //seguido de el incremento
            System.out.println("EL CONTADOR ES: "+i);
        } 
        
        //------------------------------------------------------------------------------------------------
        
        //bucle for con datos ingresados por teclado
        System.out.println("Hola, ingrese un numero para hacer una cuenta: ");
        int n;
        n =sc.nextInt();
        for (int j= 0; j <= n;j++) {
            System.out.println(j);
            
        }
        
        
        
    }
}
