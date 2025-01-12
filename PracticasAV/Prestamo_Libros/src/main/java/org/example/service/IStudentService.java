package org.example.service;

import org.example.model.Book;
import org.example.model.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {

    void registerStudent(Student student);
    List<Student> getAllStudents();
    Optional<Student> findStudentByDNI(String dni);

}
