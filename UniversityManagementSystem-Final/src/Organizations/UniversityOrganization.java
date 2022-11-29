/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organizations;

import Roles.Role;
import Roles.UniversityDirectorRole;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class UniversityOrganization extends Organization {

    public UniversityOrganization() {
        super(Organization.orgType.UniversityOrg.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new UniversityDirectorRole());
        return roles;
    }
}
