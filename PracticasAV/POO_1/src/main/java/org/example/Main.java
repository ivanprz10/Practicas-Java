package org.example;
public class Main {
    public static void main(String[] args) {

        //instanciar
        libros librouno = new libros("java","Kendall",2015);


        System.out.println("año de publicacion"+librouno.getAno()+"\n"+"autor: "+librouno.getAutor());

    }
}