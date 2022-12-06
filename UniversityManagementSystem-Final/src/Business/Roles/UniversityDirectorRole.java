/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Organizations.UniversityOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Enterprise.UniversityWorkAreaJPanel;

/**
 *
 * @author ksiec
 */
public class UniversityDirectorRole extends Role {
    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new UniversityWorkAreaJPanel(userProcessContainer, account,(UniversityOrganization)organization);
    }
}
