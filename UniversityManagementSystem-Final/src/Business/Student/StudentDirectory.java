/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class StudentDirectory {
    private ArrayList<Student> studentList;
    
    public Student addStudent(Student student){
        studentList.add(student);
        return student;
    }
    
    
    public StudentDirectory(){
        studentList = new ArrayList();
    }
    

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    
}
