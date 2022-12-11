/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organizations;

import Roles.NGOManagerRole;
import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class NonGovernmentalOrganization extends Organization{
    
    public NonGovernmentalOrganization(){
        super(Organization.orgType.NonGovernmentalOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGOManagerRole());
        return roles;
    }
}
