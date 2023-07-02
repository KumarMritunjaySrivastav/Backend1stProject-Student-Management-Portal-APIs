package com.example.studentmanagementportal;

import org.springframework.beans.factory.annotation.Autowired;


public class StudentSevice {
    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int admNo){
        return studentRepository.getStudent(admNo);
    }

    public String addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public String deleteStudent(int admNo) {
        return studentRepository.deleteStudent(admNo);
    }

    public Student updateCourse(int admNo, String newCourse) {
        return studentRepository.updateCourse(admNo,newCourse);
    }
}
