package com.example.streamsdemo.exercise;

import com.example.streamsdemo.model.Location;
import com.example.streamsdemo.model.Student;
import com.example.streamsdemo.model.StudentDto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StudentService {

    private final List<Student> students = new ArrayList<>(List.of(
            Student.builder().name("Frank").location(Location.HAMBURG).age(42).build(),
            Student.builder().name("Maria").location(Location.COLOGNE).age(15).build(),
            Student.builder().name("Klaus").location(Location.FRANKFURT).age(22).build(),
            Student.builder().name("Frida").location(Location.COLOGNE).age(77).build(),
            Student.builder().name("Franziska").location(Location.MUNICH).age(45).build(),
            Student.builder().name("Anne").location(Location.FRANKFURT).age(50).build(),
            Student.builder().name("Hans").location(Location.HAMBURG).age(43).build(),
            Student.builder().name("Hugo").location(Location.HAMBURG).age(17).build(),
            Student.builder().name("Gerda").location(Location.MUNICH).age(31).build()
    ));


    // 1. Filter students by location using streams
    public List<Student> getStudentsByLocation(Location location){
        return students.stream().filter(student -> student.getLocation().equals(location)).collect(Collectors.toList());
    }

    // 2. Filter students by location and maximum age using streams
    public List<Student> getStudentsByLocationAndMaximumAge(Location location, int maxAge){
        return students.stream()
                .filter(student -> student.getLocation().equals(location))
                .filter(student -> student.getAge() <= maxAge).collect(Collectors.toList());
    }

    // 3. Write a method that maps a Student to a StudentDto
    public List<StudentDto> createStudentDto(){
        return students.stream()
                .map(student -> StudentDto.builder().location(student.getLocation()).name(student.getName()).build())
                .collect(Collectors.toList());
    }

    // 4. Return a List with all names starting with F in uppercase and alphabetically sorted
    public List<String> filterStudentsByName(){
        return students.stream()
                .filter(student -> student.getName().startsWith("F"))
                .map(student -> student.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }

    public int getPopulation(Location location){
        return location.getPopulation();
    }

}
