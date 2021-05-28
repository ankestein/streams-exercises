package com.example.streamsdemo.exercise;

import com.example.streamsdemo.model.Student;
import com.example.streamsdemo.model.StudentDto;

import java.util.ArrayList;
import java.util.List;


public class StudentService {

    private final ArrayList<Student> students = new ArrayList<>(List.of(
            Student.builder().name("Frank").location("Hamburg").age(42).build(),
            Student.builder().name("Maria").location("Köln").age(15).build(),
            Student.builder().name("Klaus").location("Frankfurt").age(22).build(),
            Student.builder().name("Franziska").location("München").age(45).build(),
            Student.builder().name("Anne").location("Frankfurt").age(50).build(),
            Student.builder().name("Hans").location("Hamburg").age(43).build(),
            Student.builder().name("Klaus").location("Hamburg").age(17).build(),
            Student.builder().name("Gerda").location("München").age(31).build(),
            Student.builder().name("Frida").location("Köln").age(77).build()
    ));


    // 1. Filter students by location using streams
    public List<Student> getStudentsByLocation(String location){
        return null;
    }

    // 2. Filter students by location and maximum age using streams
    public List<Student> getStudentsByLocationAndMaximumAge(String location, int maxAge){
        return null;
    }

    // 3. Get the oldest student
    public Student getOldestStudent(){
        return null;
    }

    // 4. Write a method that maps a Student to a StudentDto
    public List<StudentDto> createStudentDto(){
        return null;
    }





}
