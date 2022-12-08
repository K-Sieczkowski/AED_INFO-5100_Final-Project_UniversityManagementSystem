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
    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType type){
        
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Students){
            
            enterprise = new StudentAdvisingEnterprise(name);
            enterpriseList.add(enterprise);
        }
         else if (type == Enterprise.EnterpriseType.HousingManagement){
            
            enterprise = new HousingManagementEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.CrisisManagement){
            
            enterprise = new CrisisManagementEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if (type == Enterprise.EnterpriseType.WellbeingSupport){
                
            enterprise=new WellbeingSupportEnterprise(name);
            enterpriseList.add(enterprise);
           
        }
        return enterprise;
    }
    
}
