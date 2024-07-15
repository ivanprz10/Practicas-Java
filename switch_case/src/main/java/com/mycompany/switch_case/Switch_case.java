package com.mycompany.switch_case;
/*TUTORIAL DE COMO ENTENDER Y ESCRIBIR DE MANERA CORRECTA CONDICIONAL SWITCH-CASE*/
public class Switch_case {

    public static void main(String[] args) {

    String opc1="hola";
    
    int opc = 1;//declaramos nuestra variable a la que va a estar asociada nuestro switch, esta puede venir desde teclado
    
    switch(opc){//declaramos nuestro flujo de control indicandose que se va a guiar de acuerdo a una variable
        case 1://caso 1 en caso que nuestra variable asociada a nuestro switch de "1" esta ejecutara lo que este dentro
            System.out.println("opcion1");
            int suma= 5+3;
            System.out.println("la suma es: "+suma);
            break;//rompemos el caso 1
        case 2:
            System.out.println("opcion2");
            int resta= 5+3;
            System.out.println("la resta es: "+resta);
            break;
        case 3:
            System.out.println("opcion3");
            int mul= 5+3;
            System.out.println("la multiplicacion es: "+mul);
            break;
    }
    
    //---------------------------------------------------------------------------------------------------------------------------------------
    switch(opc){//declaramos una forma distinta de hacer un flujo de control switch
        case 1 -> System.out.println("opcion1");//apuntando a la accion a realiazar
        case 2 -> System.out.println("opcion2");
        case 3 -> System.out.println("opcion3");
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
    switch(opc){
                 case 1 -> {
                     System.out.println("opcion1");
                     int suma= 5+3;
                     System.out.println("la suma es: "+suma);
            }
                 case 2 -> {
                     System.out.println("opcion2");
                     int resta= 5+3;
                     System.out.println("la resta es: "+resta);
            }
                 case 3 -> {
                     System.out.println("opcion3");
                     int mul= 5+3;
                     System.out.println("la multiplicacion es: "+mul);
            }
             }
    
        //---------------------------------------------------------------------------------------------------------------------------------------
        //tambien acepta String
        switch(opc1){
            case "hola":
                System.out.println("hola:)");
                break;
            case "adios":
                System.out.println("adios");
                break;
            default:
                System.out.println("no reconocido");
        }
    
    
    
    



    }
}
