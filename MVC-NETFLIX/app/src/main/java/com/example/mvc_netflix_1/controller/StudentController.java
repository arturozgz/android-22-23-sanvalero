package com.example.mvc_netflix_1.controller;

import com.example.mvc_netflix_1.MainActivity;
import com.example.mvc_netflix_1.model.StudentWS;
import com.example.mvc_netflix_1.model.pojo.Student;

public class StudentController {
    private StudentWS model;
    private MainActivity view;

    public StudentController(StudentWS model, MainActivity view) {
        this.model = model;
        this.view = view;
    }
    public void getStudent(){
        // THREADS -> RETROFIT 2
        // IRÍA A WEBSERVICE REST + COGERÍA DATA STUDENT + Y VOLVERÍA
        Student student = model.getStudentWS();
        view.printStudentDetails(student);

    }
    public void updateStudent(Student student){
        // THREADS -> RETROFIT 2
        // IRÍA A WEBSERVICE REST + COGERÍA DATA STUDENT + Y VOLVERÍA
        Student student1 = model.updateStudentWS(student);
        view.printStudentDetailsOnScreen(student1);

    }

    /*public void updateStudent(){
        view.printStudentDetails(model.getStudent());
    }*/
}
