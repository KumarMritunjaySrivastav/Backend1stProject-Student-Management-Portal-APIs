package com.example.studentmanagementportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

//    Map<Integer,Student> studentDb= new HashMap<>();
@Autowired
StudentSevice studentSevice;
    @GetMapping("/get_info")
    public Student getStudent(@RequestParam("id") int admnNo){

        return studentSevice.getStudent(admnNo);
    }

    @PostMapping("/add")
        public String addStudent(@RequestBody Student student){
           return studentSevice.addStudent(student);
        }
        @DeleteMapping("/delete")
        public String deleteStudent(@RequestParam("id") int admNo) {
           return studentSevice.deleteStudent(admNo);
//            return "Student deleted Successfully";
        }
        @PutMapping("/update")
        public Student updateCourse(@RequestParam("id") int admNo, @RequestParam("course") String newCourse){
//        if(!studentDb.containsKey(admNo)){
//            throw new RuntimeException("Student doesn't exist");
//        }
//        Student student=studentDb.get(admNo);
//        student.setCourse(newCourse);
//
//
//        return student;
            return studentSevice.updateCourse(admNo,newCourse);
        }
//        @GetMapping("get_total_students")
//        public int getTotalStudent(){
//        int total=0;
//        for(int admnNo:studentDb.keySet()){
//            if(studentDb.get(admnNo).getAge()>25){
//                total++;
//            }
//        }
//        return  total;
//        }
}
