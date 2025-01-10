package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Estudiantes> alumno = new ArrayList<>();
        alumno.add( new Estudiantes("Ivan",101));
        alumno.add( new Estudiantes("pedro",102));
        alumno.add( new Estudiantes("Diego", 103));
        System.out.println("lista antes de la eliminacion");
        for (Estudiantes alumnos: alumno)
            System.out.println(alumnos);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("lista despues de la eliminacion");
        alumno.removeIf(alumnos -> alumnos.getMatricula()==103);

        for (Estudiantes alumnos: alumno)
            System.out.println(alumnos);



    }
}