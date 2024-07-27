package com.mycompany.encapsulamiento_poo;

/**
 *
 * @author ivanp
 */
/*EJEMPLO DE UN PILAR EN LA PROGRAMACION ORIENTADA A OBJETOS, SABEMOS QUE EL ENCAPSULAMIENTO PROTEGE 
ATRIBUTOS Y METODOS IMPIDIENDO ACCESO Y MODIFICACION DE OTROS OBJETOS O CLASES FUERA DE LA CLASE PRINCIPAL*/
public class Encapsulamiento_POO {

    public static void main(String[] args) {

        encapsulamiento celular=new encapsulamiento("Samsung A33 5G", 6, "Snapdragon", 5000);
        
        celular.apagar();
        
        
        
    }
}
