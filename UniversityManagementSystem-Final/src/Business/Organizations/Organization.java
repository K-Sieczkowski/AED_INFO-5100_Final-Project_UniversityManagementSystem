/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Employees.EmployeeDirectory;
import Business.Roles.Role;
//import Person.PersonDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public abstract class Organization {
    public String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    private int availableFunds;
    private int ngoAvailableFunds;

    public int getNgoAvailableFunds() {
        return ngoAvailableFunds;
    }

    public void setNgoAvailableFunds(int ngoAvailableFunds) {
        this.ngoAvailableFunds = ngoAvailableFunds;
    }
    
    public enum Type
    {
       
        Admin("Admin Organization"),
        WaterSupply("WaterSupply Organization"),
        StreetLighting("StreetLighting Organization"),
        GarbageRemoval("GarbageRemoval Organization"),
        Police("Police Organization"),
        FireControl("FireControl Organization"),
        Hospital("Hospital Organization"),
        Government("Government Organization"),
        NonGovernment("NonGovernment Organization");
        
        private String value;
        
        private Type(String value){
                
            this.value = value;
            
        }

        public String getValue() {
            
            return value;
        }
        
    }

    public Organization(String name) {
        this.name = name;
        this.availableFunds = 500000;
        this.ngoAvailableFunds = 100000;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    
    public Organization(){
        
    }


    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public int getAvailableFunds() {
        return availableFunds;
    }

    public void setAvailableFunds(int availableFunds) {
        this.availableFunds = availableFunds;
    }
    
    @Override
    public String toString() {
        return name;
    }
}

