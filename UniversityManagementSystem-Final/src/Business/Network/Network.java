/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.Enterprises.EnterpriseDirectory;
import Business.Student.StudentDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author ksiec
 */
public class Network {

    private String name;
    private UserAccountDirectory userAccountDirectory;
    private StudentDirectory studentDirectory;
    private EnterpriseDirectory enterpriseDirectory;

    public Network() {
        userAccountDirectory = new UserAccountDirectory();
        studentDirectory = new StudentDirectory();
        enterpriseDirectory = new EnterpriseDirectory();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    @Override
    public String toString() {
        return name;
    }

}
