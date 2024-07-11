package com.mycompany.break_y_continue;

public class Break_y_Continue {

    public static void main(String[] args) {
        
        for (int i = 1; i <=10; i++) {//Bucle for normal conteo desde 1 a 10            
            System.out.println("("+i+")");            
        }
        
             //BREAK-------------------------------------------------------------------------------------------------------
        for (int i = 1; i <=10; i++) {  //for declarado normalmente con conteo de uno a 10  
            System.out.println("("+i+")");//imprimiendo la variable iteradora i 
            if (i==4) {//condicional si la varaible es igual a 4 se ejecutara esta condicional
                break;//determinando que se rompera el bucle
            }
        }
        
        int i=0; 
        while(i<=10){//mismo ejemplo de uso de Break pero con while
            i++;
            System.out.println("("+i+")");
            if (i==4) {
                break;
            }
        }
        //CONTINUE------------------------------------------------------------------------------------------------------
         for (int j = 1; j <=10; j++) {      
            if (j==4) {
                continue;
            }
            System.out.println("("+j+")");
        }
        
        
       
    }
}
