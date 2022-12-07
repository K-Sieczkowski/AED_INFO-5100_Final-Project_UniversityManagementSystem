/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Organizations.Organization.orgType;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class OrganizationDirectory {
    private ArrayList<Organization> orgList;
    
    
    public OrganizationDirectory(){
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrgList() {
        return orgList;
    }

    public void setOrgList(ArrayList<Organization> orgList) {
        this.orgList = orgList;
    }
    
    
    public Organization createOrg(orgType type){
        
        Organization organization = null;
        
        if (type.getValue().equals(orgType.UniversityOrg.getValue())){
            organization = new UniversityOrganization();
            orgList.add(organization);
        }
        
        else if (type.getValue().equals(orgType.PoliceOrg.getValue())){
            organization = new PoliceOrganization();
            orgList.add(organization);
        }
        
        else if (type.getValue().equals(orgType.HospitalOrg.getValue())){
            organization = new HospitalOrganization();
            orgList.add(organization);
        }
        
        else if (type.getValue().equals(orgType.TherapistOrg.getValue())){
            organization = new TherapistOrganization();
            orgList.add(organization);
        }
        
        else if (type.getValue().equals(orgType.FireDepartmentOrg.getValue())){
            organization = new FireDepartmentOrganization();
            orgList.add(organization);
        }
        
        else if (type.getValue().equals(orgType.MulticulturalOrg.getValue())){
            organization = new MulticulturalOrganization();
            orgList.add(organization);
        }
        
        else if (type.getValue().equals(orgType.RealtorOrg.getValue())){
            organization = new RealtorOrganization();
            orgList.add(organization);
        }
        
    return organization;
    
    }
}
