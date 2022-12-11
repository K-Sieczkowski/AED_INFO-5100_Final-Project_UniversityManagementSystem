/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprises;

import java.util.ArrayList;

/**
 *
 * @author ksiec
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    
    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType enType){
        Enterprise enterprise = null;
        
        if(enType == Enterprise.EnterpriseType.CommunityInvolvementManagement){
            enterprise = new CommunityInvolvementEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(enType == Enterprise.EnterpriseType.CrisisManagement){
            enterprise = new CrisisManagementEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(enType == Enterprise.EnterpriseType.HousingManagement){
            enterprise = new HousingManagementEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(enType == Enterprise.EnterpriseType.StudentAdvising){
            enterprise = new StudentAdvisingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(enType == Enterprise.EnterpriseType.WellbeingSupport){
            enterprise = new WellbeingSupportEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
}
