/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organizations;

import Roles.Role;
import Roles.TherapistOrgManagerRole;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class TherapistOrganization extends Organization{
    
    public TherapistOrganization(){
        super(Organization.orgType.TherapistOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TherapistOrgManagerRole());
        return roles;
    }
    
}
