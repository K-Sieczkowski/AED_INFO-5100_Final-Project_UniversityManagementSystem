/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Employees.Employee;
import Business.Roles.Role;
import Business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> userAccountList;
    
    
    public UserAccountDirectory(){
        userAccountList = new ArrayList();
    }
    
     public UserAccount createStudentUserAccount(String username, String password, Student student, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setStudent(student);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public boolean checkIfUsernameIsTaken(String username){
        for(UserAccount ua : userAccountList){
            if(ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    public UserAccount findUserAccount(String employee) {



       for (UserAccount ua : userAccountList) {



           if (ua.isMatch(employee)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
    
}
