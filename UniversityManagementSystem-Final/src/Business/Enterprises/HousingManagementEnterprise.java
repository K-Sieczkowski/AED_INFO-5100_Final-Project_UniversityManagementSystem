/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprises;

import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class HousingManagementEnterprise extends Enterprise {
    
    public HousingManagementEnterprise(String name){
        super(name, EnterpriseType.HousingManagement);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
