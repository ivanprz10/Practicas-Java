/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamiento_poo;

/**
 *
 * @author ivanp
 */
/*en este ejemplo comprobaremos el uso de la palabra reservada private y public ya que gracias a esta protegeremos a elementos de 
la clase encapsulamiento mandando a llamar desde la clase principal que contiene el metodo main */

/*metodo privado--------------------------------------------------------------*/

public class encapsulamiento {
    
    private String modelo;
    private int RAM;
    private String procesador;
    private int precio;
    
    
     public encapsulamiento(String mod, int ram,String pro, int pre){
        
        modelo=mod;
        RAM=ram;
        procesador=pro;
        precio=pre;
        
    }
    
    public void apagar(){
        
        apagarPantalla();
        apagarProcesador();
        cerrarApps();
        System.out.println("apagando el celular: "+modelo);
    }
    
    private void apagarPantalla(){
        
        System.out.println("apagando pantalla");
        
    }
    
    private void apagarProcesador(){
    
        System.out.println("apagando procesador: "+procesador);
    
    }
    private void cerrarApps(){
    
        System.out.println("cerrando aplicaciones");
    
    }

}