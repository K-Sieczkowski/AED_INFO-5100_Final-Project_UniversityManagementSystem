/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author ksiec
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        AcademicCounselor("AcademicCounselor"),
        CommunityCulturalAid("CommunityCulturalAid"),
        Doctor("Doctor"),
        Fireman("Fireman"),
        GovernmentOrgManager("GovernmentOrganizationManager"),
        HospitalManager("HospitalManager"),
        ITSupportEmployee("ITSupportEmployee"),
        NGOManager("NGoManager"),
        PoliceDepartmentChief("PoliceDepartmentChief"),
        PoliceOfficer("PoliceOfficer"),
        RealEstateAgent("RealEstateAgent"),
        RealEstateCompanyManager("RealEstateCompanyManager"),
        Student("Student"),
        SystemAdmin("SystemAdmin"),
        Therapist("Therapist"),
        UniversityDirector("UniversityDirector");

      
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
        @Override
        public String toString() {
            return value;
        }
        
    }
    
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business, 
            Network network);
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
  
}
