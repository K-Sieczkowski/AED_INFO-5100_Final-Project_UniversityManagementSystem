/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprises;

import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;

/**
 *
 * @author ksiec
 */
public abstract class Enterprise extends Organization {
   
    public OrganizationDirectory orgDirectory;
    public EnterpriseType enterpriseType;
    
    public Enterprise(String orgName, EnterpriseType enterpriseType){
        super(orgName);
        this.enterpriseType = enterpriseType;
        orgDirectory = new OrganizationDirectory();
        
    }
    
    public enum EnterpriseType{
        
        Students("Student"),
        StudentAdvising("Student Advising"),
        CommunityInvolvementManagement("Community Involvement Management"),
        CrisisManagement("Crisis Management"),
        HousingManagement("Housing Management"),
        WellbeingSupport("Well-being Support");
        
        
        private String value;
        
        private EnterpriseType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
        
    }
    
    @Override
    public String toString(){
        return orgName;
    }

    public OrganizationDirectory getOrgDirectory() {
        return orgDirectory;
    }

    public void setOrgDirectory(OrganizationDirectory orgDirectory) {
        this.orgDirectory = orgDirectory;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    
}
