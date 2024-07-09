/*TUTORIAL PARA ENTENDER EL BUCLE WHILE Y DO WHILE*/
package com.mycompany.tuto_while_y_dowhile;
import java.util.Scanner;
public class Tuto_while_y_dowhile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("EN ESTE TUTORIAL ENTENDERAS COMO FUNCIONA EL BUCLE WHILE Y DO WHILE");
        
        int i = 0;//declarando una variable que nos va ayudar a controlar el bucle
        while(i<=5){//bucle while cuidando la condicion y si da como resultado verdadero se ejecuta
            System.out.print("("+i+")-");//imprimiendo la variable entre parentesis
            i++;//aumentando en 1 la variable iteradora para controlar el bucle
        }
          //A CONTINUACION EJEMPLO DE BUCLE INFINITO-----------------------------------------------------------------
          /*int j=4;  //declaramos una variable dando un valor, no es necesario
          while(j<5){ //aqui la condicion evalua que es verdadero pero cuidado, no existe nada que dentenga este bucle
              System.out.println("CUIDADO \nHAZ HECHO UN BUCLE INFINITO!!!!");//y.... se hizo infinito
          }*/
          
          //------------------------------------------------------------------------------------------------------
          //BUCLE WHILE CON SOLO UNA VARIABLE BOOLEANA Y CONDICIONAL IF ANIDADA
          boolean k = true;
          
          while(k){
              
              System.out.println("Variable booleana?");
              if (k==true) {
                  k=false;
              }   
          }
          //------------------------------------------------------------------------------------------------------
          //DO-WHILE
          int l=0;
          do{
              System.out.println("repitiendo por ("+l+") vez");
              l++;
          }while(l<5);
        //--------------------------------------------------------------------------------------------------------
        //programa que evalua la opcion del usuario y si no contesta bien se hace bucle
           int opc,n1,n2,res;
        do{
        System.out.println("ingrese una opcion");
        System.out.println("1)suma \n2)resta\n3)multiplicacion\n4)division\ningrese:");
        opc = sc.nextInt();
            if (opc>4 || opc<1) { 
                 System.out.println("ERROR\n has ingresado mal");
            }       
        }while(opc>4 || opc<1);
        
        //-----------------------------------------------------------------------------------------------------------
        //realiza un programa en java que tenga una variable declarada con valor, 
        //y el usuario tenga que adivinar el valor del uno al 10, si acierta aparece un mensaje que lo felicite,
        //de lo contrario que se repita hasta que acierte.
         int opc1;
       int num=6;
       
        System.out.println("PROGRAMA PARA ADIVINAR NUMERO DEL 1 AL 10");
        do{
            System.out.print("ingrese numero a adivinar: ");
            opc1=sc.nextInt();
            
        }while(opc1!=num);


    }
}
