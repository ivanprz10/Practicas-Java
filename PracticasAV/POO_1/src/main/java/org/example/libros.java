package org.example;

public class libros {
    private String titulo;
    private String autor;
    private int ano;

    public libros(String titulo, String autor, int ano){

        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }
}
