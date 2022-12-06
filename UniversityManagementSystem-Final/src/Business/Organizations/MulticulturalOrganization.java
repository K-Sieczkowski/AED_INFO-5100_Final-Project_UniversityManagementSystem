/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Roles.CommunityCulturalAidRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class MulticulturalOrganization extends Organization {
    
    public MulticulturalOrganization(){
        super(Organization.orgType.MulticulturalOrg.getValue());
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CommunityCulturalAidRole());
        return roles;
    }
}
