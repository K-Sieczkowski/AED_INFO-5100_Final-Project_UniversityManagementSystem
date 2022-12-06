/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Student;

import java.util.ArrayList;

/**
 *
 * @author arfinansari
 */
public class StudentDirectory {
    private ArrayList<Student> studentList;

    public StudentDirectory() {
       studentList = new ArrayList();
    }
    
    public Student createStudent(String name,String Phone, String Email, String Address){
        Student student = new Student();
        student.setName("name");
        student.setAddress(Address);
        student.setEmail(Email);
        student.setPhone(Phone);
        student.setFlag(true);
        studentList.add(student);
        
        return student;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    
}
