package com.mycompany.series_de_numeros_imparespositivos;
/*PROGRAMA PARA HACER SERIES DE NUMEROS IMPARES POSITIVOS CON BUCLE WHILE Y FOR*/
public class Series_de_numeros_imparesPositivos {

    public static void main(String[] args) {

        //WHILE---------------------------------------------------------------------------------------------------------
         int n=20,i=0;//declarando nuestra variable iteradora i, y nuestra variable "tope" hasta el valor donde terminara   
      while(i<=n){//mientras que i sea menor igual a "n" se repetira el bucle while
          if (i%2==1) {//sabiendo que los numeros impares cuando se dividen entre 2 dejan un residuo de uno
              System.out.print("("+i+")");//imprimimos variable cada que se cumpla la condicion anterior
          }
          i++;//variable iteradora, evita que nuestro bucle se vuelva infinito
      }
      
      
      //FOR-----------------------------------------------------------------------------------------------------------------------
     int x=20;//declarando variable que nos va a servir como limite para nuestro for
      for (int j = 1; j < x; j++) {//inicializando for hasta que llegue a "n" e ira en incremento 
            if (j%2==1) {//sabiendo que los numeros impares cuando se dividen entre 2 dejan un residuo de uno
                System.out.print("("+j+")");//imprimimos variable cada que se cumpla la condicion anterior
          }
        }

    }
}
