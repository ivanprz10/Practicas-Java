package org.example;

public class Estudiantes {
    private String nombre;
    private int matricula;

    public Estudiantes(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "nombre='" + nombre + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
