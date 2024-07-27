package com.mycompany.poo;

/**
 *
 * @author ivanp
 */
public class Automovil {
    //ATRIBUTOS
    String nombre;
    String color;
    int km;
    
    
    public  Automovil(String nom,String col, int k){
        nombre=nom;
        color=col;
        km=k;
    }
    
    public void mostrarValores(){
        System.out.println("la marca del automovil es: "+nombre);
        System.out.println("el color del"+nombre+"es: "+color);
        System.out.println("el km es: "+km);
    }
}
