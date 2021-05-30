package com.example.streamsdemo.exercise;

import com.example.streamsdemo.model.Location;
import com.example.streamsdemo.model.Student;
import com.example.streamsdemo.model.StudentDto;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

private final StudentService studentService = new StudentService();


    @Test
    public void testGetStudentsByLocation(){
        //GIVEN
        List<Student> expected = new ArrayList<>(List.of(
                Student.builder().name("Frank").location(Location.HAMBURG).age(42).build(),
                Student.builder().name("Hans").location(Location.HAMBURG).age(43).build(),
                Student.builder().name("Hugo").location(Location.HAMBURG).age(17).build()));

        //WHEN
        List<Student> actual = studentService.getStudentsByLocation(Location.HAMBURG);

        //THEN
        assertEquals(actual, expected);

    }

    @Test
    public void testGetStudentsByLocationAndMaximumAge(){
        //GIVEN
        int maxAge = 42;
        List<Student> expected = new ArrayList<>(List.of(
                Student.builder().name("Frank").location(Location.HAMBURG).age(42).build(),
                Student.builder().name("Hugo").location(Location.HAMBURG).age(17).build()));

        //WHEN
        List<Student> actual = studentService.getStudentsByLocationAndMaximumAge(Location.HAMBURG, maxAge);

        //THEN
        assertEquals(actual, expected);
    }


    @Test
    public void testCreateStudentDtoList(){
        //GIVEN
        List<StudentDto> expected = new ArrayList<>(List.of(
                StudentDto.builder().name("Frank").location(Location.HAMBURG).build(),
                StudentDto.builder().name("Maria").location(Location.COLOGNE).build(),
                StudentDto.builder().name("Klaus").location(Location.FRANKFURT).build(),
                StudentDto.builder().name("Frida").location(Location.COLOGNE).build(),
                StudentDto.builder().name("Franziska").location(Location.MUNICH).build(),
                StudentDto.builder().name("Anne").location(Location.FRANKFURT).build(),
                StudentDto.builder().name("Hans").location(Location.HAMBURG).build(),
                StudentDto.builder().name("Hugo").location(Location.HAMBURG).build(),
                StudentDto.builder().name("Gerda").location(Location.MUNICH).build()));


        //WHEN
        List<StudentDto> actual = studentService.createStudentDto();

        //THEN
        assertEquals(actual, expected);
    }


    @Test
    public void testGetStudentsStartingWithF(){
        //GIVEN
        List<String> expected = new ArrayList<>(List.of("FRANK", "FRANZISKA", "FRIDA"));

        //WHEN
        List<String> actual = studentService.filterStudentsByName();

        //THEN
        assertEquals(actual, expected);
    }

    @Test
    public void testGetPopulation(){
        //GIVEN
        Location location = Location.MUNICH;
        int expected = 1500000;

        //WHEN
        int actual = studentService.getPopulation(location);

        //THEN
        assertEquals(actual, expected);

    }

}

