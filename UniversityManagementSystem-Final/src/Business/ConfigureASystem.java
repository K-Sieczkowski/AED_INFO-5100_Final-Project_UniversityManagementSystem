/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

//import Roles.SystemAdminRole;

//import Person.Person;
import UserAccount.UserAccount;
import Roles.SystemAdminRole;
import Employees.Employee;

//import UserAccount.UserAccount;
//
///**
// *
// * @author ksiec
// */
public class ConfigureASystem {
   
    public static EcoSystem configure(){
       
    EcoSystem system = EcoSystem.getInstance();
   
    //Create a network
    //create an enterprise
    //initialize organizations
    //have some employees 
    //create user account
    
    
    //Person person = system.getPersonDirectory().addPerson();
    
    Employee employee = system.getEmployeeDirectory().createEmployee("System Admin");
        
    UserAccount ua = system.getUserAccountDirectory().createUserAccount("systemadmin", "systemadmin", employee, new SystemAdminRole());   
      
    return system;
    }
    
}
