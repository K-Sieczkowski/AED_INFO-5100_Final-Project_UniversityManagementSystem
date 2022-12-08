/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Network;

import Business.Enterprises.EnterpriseDirectory;
import Business.Student.StudentDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.util.Set;

/**
 *
 * @author ksiec
 */
public class Network {
private Set<Network> networks;
    private String networkName;
    String enterpriseType;
    String enterpriseName;
    private UserAccountDirectory userAccountDirectory;
    private StudentDirectory studentDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    

    public Network() {
        userAccountDirectory = new UserAccountDirectory();
        studentDirectory = new StudentDirectory();
        enterpriseDirectory = new EnterpriseDirectory();

    }
    public Network addNewNetwork() {
    Network newNetwork = new Network();
        networks.add(newNetwork);
        return newNetwork;
    }

    public Set<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(Set<Network> networks) {
        this.networks = networks;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getName() {
        return networkName;
    }

    public void setName(String name) {
        this.networkName = networkName;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    @Override
    public String toString() {
        return networkName;
    }

}
