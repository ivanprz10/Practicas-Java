package com.mycompany.ejemplo;

/**
 *
 * @author ivanp
 */
public class automovil {

    public String nombre;

    public int id;

    public String especie;

    public int edad;

    public String contactodueño;



public automovil (String nom, int i, String esp, int yo, String contact ){

    nombre=nom;

    id=i;

    especie=esp;

    edad=yo;

    contactodueño=contact;

}

public void show(){

   System.out.println("Nombre;"+nombre);

   System.out.println("Identificación;"+id);

   System.out.println("Especie;"+especie);

   System.out.println("Edad;"+edad);

   System.out.println("Telefono;"+contactodueño);

}
}