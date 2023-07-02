package com.example.studentmanagementportal;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentRepository {


    Map<Integer,Student> studentDb= new HashMap<>();
    public Student getStudent(int admNo){
        return studentDb.get(admNo);
    }

    public String addStudent(Student student) {
        if(studentDb.containsKey(student.getAdmNo())){
            return "Student already present";
        }
        studentDb.put(student.getAdmNo(), student);
        return "Student added Successfully";
    }

    public String deleteStudent(int admNo) {
        if(!studentDb.containsKey(admNo)){
            return "Student doesn't exist";
        }
        studentDb.remove(admNo);
        return "Student deleted successfully";
    }

    public Student updateCourse(int admNo, String newCourse) {

        if(!studentDb.containsKey(admNo)){
           throw  new RuntimeException("Student doesn't exist");
        }

        Student student= studentDb.get(admNo);
        student.setCourse(newCourse);

        return student;

    }
}
