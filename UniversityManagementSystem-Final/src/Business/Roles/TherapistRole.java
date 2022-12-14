/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Organizations.TherapistOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Role.TherapistEmployeeJPanel;

/**
 *
 * @author ksiec
 */
public class TherapistRole extends Role {
   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new TherapistEmployeeJPanel(userProcessContainer, account, (TherapistOrganization) organization);
    }
}
