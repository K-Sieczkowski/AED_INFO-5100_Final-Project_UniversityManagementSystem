/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.Roles.Role;
import Business.Roles.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public EcoSystem() {
        super(null);
        networkList = new ArrayList();
    }
    
    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean isUnique(String name) {
        for (Network network : networkList) {
            if (network.getName().equalsIgnoreCase(name)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(username)) {
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrgDirectory().getOrgList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(username)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }

}
