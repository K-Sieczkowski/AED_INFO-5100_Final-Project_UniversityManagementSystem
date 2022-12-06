/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Roles.RealEstateCompanyManagerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class RealtorOrganization extends Organization{
    
    public RealtorOrganization(){
        super(Organization.orgType.RelatorOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RealEstateCompanyManagerRole());
        return roles;
    }
    
}
