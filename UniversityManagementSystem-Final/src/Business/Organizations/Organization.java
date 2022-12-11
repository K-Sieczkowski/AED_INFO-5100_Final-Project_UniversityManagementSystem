/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Employees.EmployeeDirectory;
import Business.Roles.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public abstract class Organization {
    public String orgName;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkQueue workQueue;
    private int orgID;
    private static int counter=0;

    
    public Organization(String orgName){
        this.orgName = orgName;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        orgID = counter;
        ++counter;
    }
    
    public enum orgType{
        UniversityOrg("University Organization"),
        PoliceOrg("Police Organization"),
        HospitalOrg("Hospital Organization"),
        TherapistOrg("Therapist Organization"),
        FireDepartmentOrg("Fire Department Organization"),
        MulticulturalOrg("Multicultural Organization"),
        RealtorOrg("Relator Organization");
        
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

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
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
    
     public boolean isMatch(String name) {
        if (getOrgName().equals(name)) {
            return true;
        }
        return false;
    }
    
    
    @Override
    public String toString(){
        return orgName;
    }
}

