/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Enterprises.Enterprise;
import Business.Organizations.MulticulturalOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Role.CommunityEmployeeJPanel;

/**
 *
 * @author ksiec
 */
public class CommunityCulturalAidRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new CommunityEmployeeJPanel(userProcessContainer, account, (MulticulturalOrganization) organization);
    }
    
}
