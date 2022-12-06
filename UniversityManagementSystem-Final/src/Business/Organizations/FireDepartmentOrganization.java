/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organizations;

import Business.Roles.FireDepartmentChiefRole;
import Business.Roles.Role;
import java.util.ArrayList;


/**
 *
 * @author ksiec
 */
public class FireDepartmentOrganization extends Organization{

    public FireDepartmentOrganization() {
        super(Organization.orgType.FireDepartmentOrg.getValue());
    }

@Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FireDepartmentChiefRole());
        return roles;
    }
    
}
