/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organizations;

import Roles.HospitalManagerRole;
import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class HospitalOrganization extends Organization{
    
    public HospitalOrganization(){
        super(Organization.orgType.HospitalOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HospitalManagerRole());
        return roles;
    }
    
}
