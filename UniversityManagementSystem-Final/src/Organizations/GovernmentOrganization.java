/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Organizations;

import Roles.GovernmentOrgManagerRole;
import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class GovernmentOrganization extends Organization {

    public GovernmentOrganization() {
        super(Organization.orgType.GovernmentOrg.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovernmentOrgManagerRole());
        return roles;
    }

}
