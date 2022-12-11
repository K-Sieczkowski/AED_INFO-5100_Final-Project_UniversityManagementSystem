/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organizations;

import Employees.EmployeeDirectory;
import Roles.Role;
//import Person.PersonDirectory;
import UserAccount.UserAccountDirectory;
import WorkQueue.WorkQueueDirectory;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public abstract class Organization {
    public String orgName;
    //private PersonDirectory personDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueueDirectory workQueue;
    private int orgID;
    private static int counter=0;

    
    public Organization(String orgName){
        this.orgName = orgName;
        workQueue = new WorkQueueDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        orgID = counter;
        ++counter;
    }
    
    public enum orgType{
        UniversityOrg("University Organization"),
        GovernmentOrg("Government Organization"),
        NonGovernmentalOrg("Non-governmental Organization"),
        PoliceOrg("Police Organization"),
        HospitalOrg("Hospital Organization"),
        TherapistOrg("Therapist Organization"),
        FireDepartmentOrg("Fire Department Organization"),
        MulticulturalOrg("Multicultural Organization"),
        RelatorOrg("Relator Organization");
        
        private String value;
        
        private orgType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
    }
    
    public abstract ArrayList<Role> getSupportedRole();
    
    /**
     * @return the orgName
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName the orgName to set
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public WorkQueueDirectory getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueueDirectory workQueue) {
        this.workQueue = workQueue;
    }
    

    /**
     * @return the orgID
     */
    public int getOrgID() {
        return orgID;
    }

    /**
     * @param orgID the orgID to set
     */
    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }

//    public PersonDirectory getPersonDirectory() {
//        return personDirectory;
//    }
//
//    public void setPersonDirectory(PersonDirectory personDirectory) {
//        this.personDirectory = personDirectory;
//    }
    
    
    @Override
    public String toString(){
        return orgName;
    }
}

