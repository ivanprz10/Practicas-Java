package com.mycompany.serie_fibonacci;
/*La serie de Fibonacci es una serie donde el siguiente término es la suma de los dos
términos anteriores. Los dos primeros términos de la serie de Fibonacci son 0 y 1.
*/
public class Serie_Fibonacci {

    public static void main(String[] args) {
       
        int primerTermino=0,segundoTermino=1,siguienteTermino;//Declaramos las variables que utilizaremos para remplazar
                                                              //valores en esta serie 
        for (int i = 0; i <=20; i++) {//inicializamos nuestro ciclo for indicando que llegara hasta el valor #20
            
            System.out.print("("+primerTermino+")");//la serie nos indica que imprimira el primer termino empezando con 0
            
             siguienteTermino = primerTermino + segundoTermino;//recordemos que es el primer termino mas el segundo
            primerTermino = segundoTermino;//remplazamos el primero por el segundo
            segundoTermino = siguienteTermino;//e igualamos el segundo con el termino siguiente
            
        }        
   }
}
