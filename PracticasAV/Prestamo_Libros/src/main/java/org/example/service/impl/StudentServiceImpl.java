package org.example.service.impl;

import org.example.exception.DuplicateStudentException;
import org.example.exception.ErrorMessage;
import org.example.exception.StudentNotFoundException;
import org.example.model.Book;
import org.example.model.Student;
import org.example.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentServiceImpl implements IStudentService {

    private List<Student> students = new ArrayList<>();


    @Override
    public void registerStudent(Student student) {

        boolean isDuplicatedStudent = students.stream()
                .anyMatch(existingStudent -> existingStudent.getDni().equals(student.getDni())
                && existingStudent.getName().equals(student.getName()));

        if (isDuplicatedStudent){
            throw new DuplicateStudentException(
                    ErrorMessage.DUPLICATE_STUDENT.formatMessage(student.getDni(),student.getName())
            );
        }
        students.add(student);

    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Optional<Student> findStudentByDNI(String dni) {

        Optional<Student> optionalStudent=students.stream()
                .filter(student -> student.getDni().equals(dni))
                .findFirst();
        if (optionalStudent.isEmpty()){
            throw new StudentNotFoundException(
                    ErrorMessage.STUDENT_NOT_FOUND.formatMessage(dni)
            );
        }

        return optionalStudent;
    }
}
