package com.example.streamsdemo.exercise;

import com.example.streamsdemo.model.Student;
import com.example.streamsdemo.model.StudentDto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

private final StudentService studentService = new StudentService();


    @Test
    public void getStudentsByLocation(){
        //GIVEN
        String location = "Hamburg";
        List<Student> expected = new ArrayList<>(List.of(
                Student.builder().name("Frank").location("Hamburg").age(42).build(),
                Student.builder().name("Hans").location("Hamburg").age(43).build(),
                Student.builder().name("Klaus").location("Hamburg").age(17).build()));

        //WHEN
        List<Student> actual = studentService.getStudentsByLocation(location);

        //THEN
        assertEquals(actual, expected);

    }

    @Test
    public void getStudentsByLocationAndMaximumAge(){
        //GIVEN
        String location = "Hamburg";
        int maxAge = 42;
        List<Student> expected = new ArrayList<>(List.of(
                Student.builder().name("Frank").location("Hamburg").age(42).build(),
                Student.builder().name("Klaus").location("Hamburg").age(17).build()));

        //WHEN
        List<Student> actual = studentService.getStudentsByLocationAndMaximumAge(location, maxAge);

        //THEN
        assertEquals(actual, expected);
    }

    @Test
    public void getOldestStudent(){
        //GIVEN
        Student expected = Student.builder().name("Frida").location("Köln").age(77).build();

        //WHEN
        Student actual = studentService.getOldestStudent();

        //THEN
        assertEquals(actual, expected);
    }

    @Test
    public void createStudentDtoList(){
        //GIVEN
        List<StudentDto> expected = new ArrayList<>(List.of(
                StudentDto.builder().name("Frank").location("Hamburg").build(),
                StudentDto.builder().name("Maria").location("Köln").build(),
                StudentDto.builder().name("Klaus").location("Frankfurt").build(),
                StudentDto.builder().name("Franziska").location("München").build(),
                StudentDto.builder().name("Anne").location("Frankfurt").build(),
                StudentDto.builder().name("Hans").location("Hamburg").build(),
                StudentDto.builder().name("Klaus").location("Hamburg").build(),
                StudentDto.builder().name("Gerda").location("München").build(),
                StudentDto.builder().name("Frida").location("Köln").build()));

        //WHEN
        List<StudentDto> actual = studentService.createStudentDto();

        //THEN
        assertEquals(actual, expected);
    }

}