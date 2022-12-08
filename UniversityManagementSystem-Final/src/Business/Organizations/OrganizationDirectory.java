/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    
    public OrganizationDirectory(){
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getorganizationList() {
        return organizationList;
    }

    public void setOrgList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    
}
