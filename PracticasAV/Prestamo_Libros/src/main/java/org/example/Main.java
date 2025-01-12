package org.example;

import org.example.exception.BookNotFoundException;
import org.example.exception.DuplicateBookException;
import org.example.exception.StudentNotFoundException;
import org.example.model.Book;
import org.example.model.Student;
import org.example.service.IBookService;
import org.example.service.IStudentService;
import org.example.service.impl.BookServiceImpl;
import org.example.service.impl.StudentServiceImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Corrección

        boolean exit = false;
        IBookService bookService = new BookServiceImpl();
        IStudentService studentService = new StudentServiceImpl();

        do {
            System.out.println("Menu de opciones...");
            System.out.println("1.-Registrar Libro");
            System.out.println("2.-Listar Libro");
            System.out.println("3.-Listar libro por ISBN");
            System.out.println("4.-Registrar Estudiantes");
            System.out.println("5.-Listar Estudiantes");
            System.out.println("6.-Buscar Estudiantes por DNI");
            System.out.println("7.-Registrar Prestamo");
            System.out.println("8.-Registrar prestamo por Rango de fecha");
            System.out.println("9.-Listar prestamo por estudiante");
            System.out.println("0.- Salir");

            int choice = Integer.parseInt(reader.readLine());
            switch (choice){
                case 1:
                    try {
                        System.out.println("Titulo");
                        String title = reader.readLine();

                        System.out.println("autor");
                        String author = reader.readLine();

                        System.out.println("año");
                        int year = Integer.parseInt(reader.readLine());

                        System.out.println("ISBN");
                        String isbn = reader.readLine();
                        Book newBook = new Book(title, author, year, isbn);
                        bookService.registerBook(newBook);
                        System.out.println("libro regitrado!!!");

                    }catch (DuplicateBookException | IOException e){
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:

                    System.out.println("listado de libros");

                    bookService.getAllBooks().forEach(System.out::println);
                    break;

                case 3:

                    try {


                    System.out.println("ingrese el ISBN");
                    String isbn = reader.readLine();
                    Optional<Book> foundBook =  bookService.findBookByISBN(isbn);
                    System.out.println(foundBook.get());

                    }catch (BookNotFoundException | IOException e){

                        System.out.println(e.getMessage());

                    }

                    break;
                case 4:
                    try {



                    System.out.println("ingrese el nombre del estudiante");
                    String name = reader.readLine();
                    System.out.println("ingrese el DNI del estudiante");
                    String dni = reader.readLine();

                    Student studentNew = new Student(name,dni);
                    studentService.registerStudent(studentNew);

                    System.out.println("estudiante registrado exitosamente");

                    }catch (DuplicateBookException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                case 5:

                    System.out.println("listado de Estudiantes");

                    studentService.getAllStudents().forEach(System.out::println);



                    break;
                case 6:
                    try {
                        System.out.println("ingrese el dni del estudiante");
                        String dniToFind = reader.readLine();

                        Optional<Student> foundStudent = studentService.findStudentByDNI(dniToFind);
                        System.out.println("Estudiante encontrado: "+ foundStudent);

                    }catch (StudentNotFoundException e){

                        System.out.println(e.getMessage());

                    }

                    break;

                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 0:

                    exit = true;
                    System.out.println("Hasta luego!!!");
                    break;
                default:
                    System.out.println("opcion no valida, por favor seleccione una opcion valida");
                    break;
            }

        }while (!exit);



    }
}