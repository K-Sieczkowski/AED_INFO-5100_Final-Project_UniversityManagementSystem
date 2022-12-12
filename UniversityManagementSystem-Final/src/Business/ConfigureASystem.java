/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;


import Business.UserAccount.UserAccount;
import Business.Roles.SystemAdminRole;
import Business.Employees.Employee;
import Business.Enterprises.CommunityInvolvementEnterprise;
import Business.Enterprises.CrisisManagementEnterprise;
import Business.Enterprises.Enterprise;
import Business.Enterprises.HousingManagementEnterprise;
import Business.Enterprises.StudentAdvisingEnterprise;
import Business.Enterprises.WellbeingSupportEnterprise;
import Business.Network.Network;
import Business.Organizations.FireDepartmentOrganization;
import Business.Organizations.HospitalOrganization;
import Business.Organizations.MulticulturalOrganization;
import Business.Organizations.Organization;
import Business.Organizations.PoliceOrganization;
import Business.Organizations.RealtorOrganization;
import Business.Organizations.TherapistOrganization;
import Business.Organizations.UniversityOrganization;
import Business.Roles.AcademicCounselorRole;
import Business.Roles.AdminRole;
import Business.Roles.CommunityCulturalAidRole;
import Business.Roles.CommunityManagerRole;
import Business.Roles.DoctorRole;
import Business.Roles.FireDepartmentChiefRole;
import Business.Roles.FiremanRole;
import Business.Roles.HospitalManagerRole;
import Business.Roles.PoliceDepartmentChiefRole;
import Business.Roles.PoliceOfficerRole;
import Business.Roles.RealEstateAgentRole;
import Business.Roles.RealEstateCompanyManagerRole;
import Business.Roles.TherapistOrgManagerRole;
import Business.Roles.TherapistRole;
import Business.Roles.UniversityDirectorRole;
import Business.Student.Student;
import Business.WorkQueue.AdvisingRequest;
import Business.WorkQueue.CommunityRequest;
import Business.WorkQueue.EmergencyRequest;
import Business.WorkQueue.HealthRequest;
import Business.WorkQueue.HousingRequest;
import com.github.javafaker.*;
import java.util.Calendar;
import java.util.Date;


//
///**
// *
// * @author ksiec
// */
public class ConfigureASystem {
    
    //add faker
    public static Faker magicBox;
    
    //initalize faker
//    public ConfigureASystem(){
//      magicBox = new Faker();  
//    }
   
    public static EcoSystem configure(){
        
    //initalize faker  
    magicBox = new Faker();
    
    EcoSystem system = EcoSystem.getInstance();
    
   
    //Create a network
    
     Network network1 = system.createAndAddNetwork();
     network1.setName("Boston");
     
     
    //create admin employee
    
    Employee employee = new Employee();
    employee.setName("Erin Owens");
    system.setOrgName("Student System");
    system.getEmployeeDirectory().createEmployee(employee.getName());
    
    
    //create a system admin account
    UserAccount ua = system.getUserAccountDirectory().createUserAccount("systemAdmin", "systemadmin123", employee, new SystemAdminRole()); 
            
    //create an enterprises and orgs
    
    Enterprise advisingEnterprise = network1.getEnterpriseDirectory().createEnterprise("Student Advising", Enterprise.EnterpriseType.StudentAdvising);
    Organization universityOrg = advisingEnterprise.getOrgDirectory().createOrg(Organization.orgType.UniversityOrg);
    universityOrg.setOrgName("University");
    
    Enterprise communityEnterprise = network1.getEnterpriseDirectory().createEnterprise("Community Involvement Management", Enterprise.EnterpriseType.CommunityInvolvementManagement);
    Organization communityOrg = communityEnterprise.getOrgDirectory().createOrg(Organization.orgType.MulticulturalOrg);
    
    Enterprise crisisEnterprise = network1.getEnterpriseDirectory().createEnterprise("Crisis Management", Enterprise.EnterpriseType.CrisisManagement);
    Organization fireOrg = crisisEnterprise.getOrgDirectory().createOrg(Organization.orgType.FireDepartmentOrg);
    Organization policeOrg = crisisEnterprise.getOrgDirectory().createOrg(Organization.orgType.PoliceOrg);
    
    Enterprise wellbeingEnterprise = network1.getEnterpriseDirectory().createEnterprise("Well-being Support", Enterprise.EnterpriseType.WellbeingSupport);
    Organization hospitalOrg = wellbeingEnterprise.getOrgDirectory().createOrg(Organization.orgType.HospitalOrg);
    Organization therapistOrg = wellbeingEnterprise.getOrgDirectory().createOrg(Organization.orgType.TherapistOrg);
    
    
    Enterprise housingEnterprise = network1.getEnterpriseDirectory().createEnterprise("Housing Management", Enterprise.EnterpriseType.HousingManagement);
    Organization housingOrg = housingEnterprise.getOrgDirectory().createOrg(Organization.orgType.RealtorOrg);
    
    
    //enterprise admin
    
    
    Employee admin1 = new Employee();
    housingEnterprise.getEmployeeDirectory().createEmployee("Ed Smith");
    UserAccount ad1 = housingEnterprise.getUserAccountDirectory().createUserAccount("housingAdmin", "housingadmin123", admin1, new AdminRole());
    ad1.getEmployee().setName("Ed Smith");
    
    Employee admin2 = new Employee();
    wellbeingEnterprise.getEmployeeDirectory().createEmployee("Ryan Dee");
    UserAccount ad2 = wellbeingEnterprise.getUserAccountDirectory().createUserAccount("wellbeingAdmin", "wellbeingadmin123", admin2, new AdminRole());
    ad2.getEmployee().setName("Ryan Dee");
    
    Employee admin3 = new Employee();
    advisingEnterprise.getEmployeeDirectory().createEmployee("Sue Locks");
    UserAccount ad3 = advisingEnterprise.getUserAccountDirectory().createUserAccount("advisingAdmin", "advising123", admin3, new AdminRole());
    ad3.getEmployee().setName("Sue Locks");
    
    Employee admin4 = new Employee();
    communityEnterprise.getEmployeeDirectory().createEmployee("Ron Williams");
    UserAccount ad4 = communityEnterprise.getUserAccountDirectory().createUserAccount("communityAdmin", "communityadmin123", admin4, new AdminRole());
    ad4.getEmployee().setName("Ron Williams");
    
    Employee admin5 = new Employee();
    crisisEnterprise.getEmployeeDirectory().createEmployee("Lex Jones");
    UserAccount ad5 = crisisEnterprise.getUserAccountDirectory().createUserAccount("crisisAdmin", "crisisadmin123", admin5, new AdminRole());
    ad5.getEmployee().setName("Lex Jones");
    
    

//create students
    
    Student s1 = new Student("Liz Conway", "01234", 18, "Female", "10 Hope Ave, Boston, MA 02222", "k.sieczkowski16@gmail.com", "343-454-4544", "liz123", "123", network1);
    network1.getStudentDirectory().addStudent(s1);
    UserAccount sua1 = network1.getUserAccountDirectory().createStudentUserAccount("stu001", "stu222", s1);
    
    Student s2 = new Student("Max Jones", "01111", 19, "Male", "12 Park Drive, Boston, MA 02322", "madhatarfin11@gmail.com", "474-454-4533", "max123", "123", network1);
    network1.getStudentDirectory().addStudent(s2);
    UserAccount sua2 = network1.getUserAccountDirectory().createStudentUserAccount("stu002", "stu222", s2);
    
    Student s3 = new Student("Jake Brown", "03333", 20, "Male", "1 Canal St, Boston, MA 02114", "k.sieczkowski16@gmail.com", "343-343-2322", "jake123", "123", network1);
    network1.getStudentDirectory().addStudent(s3);
    UserAccount sua3 = network1.getUserAccountDirectory().createStudentUserAccount("stu003", "stu222", s3);
    
    Student s4 = new Student("Hannah Smith", "01232", 18, "Female", "15 Sun Lane, Boston, MA 02474", "madhatarfin11@gmail.com", "565-454-5655", "hannah123", "123", network1);
    network1.getStudentDirectory().addStudent(s4);
    UserAccount sua4 = network1.getUserAccountDirectory().createStudentUserAccount("stu004", "stu222", s4);
    
    Student s9 = new Student("Jess Miller", "03454", 19, "Male", "21 Forsyth St, Boston, MA 02115", "madhatarfin11@gmail.com", "453-458-5643", "jess123", "123", network1);
    network1.getStudentDirectory().addStudent(s9);
    UserAccount sua9 = network1.getUserAccountDirectory().createStudentUserAccount("jess123", "123", s9);
    
    
    //students with faker
    Student s5 = new Student(magicBox.name().fullName(), magicBox.numerify("#####"), 18,"Male", magicBox.address().fullAddress(), magicBox.internet().emailAddress(), magicBox.phoneNumber().toString(), "stu001", "123", network1);
    Student s6 = new Student(magicBox.name().fullName(), magicBox.numerify("#####"), 20, "Female", magicBox.address().fullAddress(), magicBox.internet().emailAddress(), magicBox.phoneNumber().toString(), "stu002", "123", network1);
    Student s7 = new Student(magicBox.name().fullName(), magicBox.numerify("#####"), 19, "Female", magicBox.address().fullAddress(), magicBox.internet().emailAddress(), magicBox.phoneNumber().toString(), "stu003", "123", network1);
    Student s8 = new Student(magicBox.name().fullName(),magicBox.numerify("#####"), 20, "Male", magicBox.address().fullAddress(), magicBox.internet().emailAddress(), magicBox.phoneNumber().toString(), "stu004", "123", network1);
    
    
    //add faker students to network
    network1.getStudentDirectory().addStudent(s5);
    network1.getStudentDirectory().addStudent(s6);
    network1.getStudentDirectory().addStudent(s7);
    network1.getStudentDirectory().addStudent(s8);
    UserAccount sua5 = network1.getUserAccountDirectory().createStudentUserAccount("stu009", "123", s5);
    UserAccount sua6 = network1.getUserAccountDirectory().createStudentUserAccount("stu010", "123", s6);
    UserAccount sua7 = network1.getUserAccountDirectory().createStudentUserAccount("stu011", "123", s7);
    UserAccount sua8 = network1.getUserAccountDirectory().createStudentUserAccount("stu012", "123", s8);
    
//create and add employees to Orgs
   
    
    //academic
    
    Employee advisingManager1 = new Employee();
    advisingManager1.setName("Nick Conrad");
    
    
    //faker made employees
     Employee advisingEmp01 = new Employee();
     advisingEmp01.setName(magicBox.name().fullName());
     String advisingEmp01Name = advisingEmp01.getName();
             
     Employee advisingEmp02 = new Employee();
     advisingEmp02.setName(magicBox.name().fullName());
     String advisingEmp02Name = advisingEmp02.getName();
     
     //add user accounts for faker employees
     UserAccount adEmpUA01 = ((UniversityOrganization) universityOrg).getUserAccountDirectory().createUserAccount("counselor001", "123", advisingEmp01, new AcademicCounselorRole());
     UserAccount adEmpUA02 = ((UniversityOrganization) universityOrg).getUserAccountDirectory().createUserAccount("counselor002", "123", advisingEmp02, new AcademicCounselorRole());
     
     //add user accounts for faker employees
     
    
    //more employees and manager
    Employee advisingEmp1 = new Employee();
    advisingEmp1.setName("Sam Smith");
    
    Employee advisingEmp2 = new Employee();
    advisingEmp2.setName("Jill Jane");
    
    Employee advisingEmp3 = new Employee();
    advisingEmp3.setName("Erin Jones");
    
    Employee advisingEmp4 = new Employee();
    advisingEmp4.setName("Ted Barker");
    
    UserAccount adManagerUA1 = ((UniversityOrganization) universityOrg).getUserAccountDirectory().createUserAccount("advisingManager", "advisingManager000", advisingManager1, new UniversityDirectorRole());
    UserAccount adEmpUA2 =((UniversityOrganization) universityOrg).getUserAccountDirectory().createUserAccount("counselor001", "counselor111", advisingEmp1, new AcademicCounselorRole());
    UserAccount adEmpUA3 = ((UniversityOrganization) universityOrg).getUserAccountDirectory().createUserAccount("counselor002", "counselor111", advisingEmp2, new AcademicCounselorRole());
    UserAccount adEmpUA4 = ((UniversityOrganization) universityOrg).getUserAccountDirectory().createUserAccount("erin", "123", advisingEmp3, new AcademicCounselorRole());
    UserAccount adEmpUA5 = ((UniversityOrganization) universityOrg).getUserAccountDirectory().createUserAccount("ted", "123", advisingEmp4, new AcademicCounselorRole());
                        
    
    
    for(Organization org : advisingEnterprise.getOrgDirectory().getOrgList()){
        
        if(org instanceof UniversityOrganization){
            ((UniversityOrganization) org).getEmployeeDirectory().createEmployee("Nick Conrad");
            
            ((UniversityOrganization) org).getEmployeeDirectory().createEmployee("Sam Smith");
            
            ((UniversityOrganization) org).getEmployeeDirectory().createEmployee("Jill Jane");
            
            ((UniversityOrganization) org).getEmployeeDirectory().createEmployee("Erin Jones");
            
            ((UniversityOrganization) org).getEmployeeDirectory().createEmployee("Ted Barker");
            
            //add faker employees
            ((UniversityOrganization) org).getEmployeeDirectory().createEmployee(advisingEmp01Name);
            ((UniversityOrganization) org).getEmployeeDirectory().createEmployee(advisingEmp02Name);
            
        }
    }
    
    
    
    //community
    
    //faker employees
    Employee communityEmp01 = new Employee();
    communityEmp01.setName(magicBox.name().fullName());
    String communityEmp01Name = communityEmp01.getName();
    
    Employee communityEmp02 = new Employee();
    communityEmp02.setName(magicBox.name().fullName());
    String communityEmp02Name = communityEmp02.getName();
    
    
    //faker employee user accounts
    UserAccount comEmpUA001 = ((MulticulturalOrganization) communityOrg).getUserAccountDirectory().createUserAccount("comEmp001", "123", communityEmp01, new CommunityCulturalAidRole());
    UserAccount comEmpUA002 = ((MulticulturalOrganization) communityOrg).getUserAccountDirectory().createUserAccount("comEmp002", "123", communityEmp01, new CommunityCulturalAidRole());
    
    
    //add more employees
    
    Employee communityManager1 = new Employee();
    communityManager1.setName("Dan Dock");
    
    Employee communityEmp1 = new Employee();
    communityEmp1.setName("Ryan Renolds");
    
    Employee communityEmp2 = new Employee();
    communityEmp2.setName("Rob Day");
    
    Employee communityEmp3 = new Employee();
    communityEmp3.setName("Kate Keen");
    
    Employee communityEmp4 = new Employee();
    communityEmp4.setName("Lex Lane");
    
    
    UserAccount comManagerUA1 = ((MulticulturalOrganization) communityOrg).getUserAccountDirectory().createUserAccount("communityManager", "communityManager000", communityManager1, new CommunityManagerRole());
    UserAccount comEmpUA2 =((MulticulturalOrganization) communityOrg).getUserAccountDirectory().createUserAccount("comEmployee001", "comEmployee111", communityEmp1, new CommunityCulturalAidRole());
    UserAccount comEmpUA3 = ((MulticulturalOrganization) communityOrg).getUserAccountDirectory().createUserAccount("comEmployee002", "comEmployee111", communityEmp2, new CommunityCulturalAidRole());
    UserAccount comEmpUA4 = ((MulticulturalOrganization) communityOrg).getUserAccountDirectory().createUserAccount("kate", "123", communityEmp3, new CommunityCulturalAidRole());
    UserAccount comEmpUA5 = ((MulticulturalOrganization) communityOrg).getUserAccountDirectory().createUserAccount("lex", "123", communityEmp4, new CommunityCulturalAidRole());
                                            
    
        for(Organization org : communityEnterprise.getOrgDirectory().getOrgList()){
        
        if(org instanceof MulticulturalOrganization){
            ((MulticulturalOrganization) org).getEmployeeDirectory().createEmployee(communityManager1.getName());
            
            ((MulticulturalOrganization) org).getEmployeeDirectory().createEmployee(communityEmp1.getName());
            
            ((MulticulturalOrganization) org).getEmployeeDirectory().createEmployee(communityEmp2.getName());
            
            ((MulticulturalOrganization) org).getEmployeeDirectory().createEmployee(communityEmp3.getName());
            
            ((MulticulturalOrganization) org).getEmployeeDirectory().createEmployee(communityEmp4.getName());
            
            //faker employees
             ((MulticulturalOrganization) org).getEmployeeDirectory().createEmployee(communityEmp01Name);
             ((MulticulturalOrganization) org).getEmployeeDirectory().createEmployee(communityEmp02Name);
            
        }
     }
        
        
   //crisis
   
   //fire
   
   //faker employees
    Employee crisisEmp01 = new Employee();
    crisisEmp01.setName(magicBox.name().fullName());
    String crisisEmp01Name = crisisEmp01.getName();
    
    Employee crisisEmp02 = new Employee();
    crisisEmp02.setName(magicBox.name().fullName());
    String crisisEmp02Name = crisisEmp02.getName();
    
    //faker employees user accounts
    UserAccount fireEmpUA01 = ((FireDepartmentOrganization) fireOrg).getUserAccountDirectory().createUserAccount("fire001", "123", crisisEmp01, new FiremanRole());                        
    UserAccount fireEmpUA02 = ((FireDepartmentOrganization) fireOrg).getUserAccountDirectory().createUserAccount("fire001", "123", crisisEmp02, new FiremanRole());                        
    
   
   //create more employees
    Employee crisisManager1 = new Employee();
    crisisManager1.setName("Bob Bill");
    
    Employee crisisEmp1 = new Employee();
    crisisEmp1.setName("Theo Tan");
    
    Employee crisisEmp2 = new Employee();
    crisisEmp2.setName("Keith Kane");
    
    Employee crisisEmp3 = new Employee();
    crisisEmp3.setName("Dex Rose");
    
    UserAccount fireManagerUA1 = ((FireDepartmentOrganization) fireOrg).getUserAccountDirectory().createUserAccount("fireManager", "fireManager000", crisisManager1, new FireDepartmentChiefRole());
    UserAccount fireEmpUA2 = ((FireDepartmentOrganization) fireOrg).getUserAccountDirectory().createUserAccount("fireman001", "fireman111", crisisEmp1, new FiremanRole());
    UserAccount fireEmpUA3 = ((FireDepartmentOrganization) fireOrg).getUserAccountDirectory().createUserAccount("fireman002", "fireman111", crisisEmp2, new FiremanRole());
    UserAccount fireEmpUA4 = ((FireDepartmentOrganization) fireOrg).getUserAccountDirectory().createUserAccount("dex", "123", crisisEmp3, new FiremanRole());                        
    
    
    for(Organization org : crisisEnterprise.getOrgDirectory().getOrgList()){
        
        if(org instanceof FireDepartmentOrganization){
            ((FireDepartmentOrganization) org).getEmployeeDirectory().createEmployee(crisisManager1.getName());
            
            ((FireDepartmentOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp1.getName());
            
            ((FireDepartmentOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp2.getName());
            
            ((FireDepartmentOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp3.getName());
            
            //faker employees
            ((FireDepartmentOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp01Name);
            ((FireDepartmentOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp02Name);
            
        }
    }
    
    
    //police
    
    //faker employees
    Employee crisisEmp03 = new Employee();
    crisisEmp03.setName(magicBox.name().fullName());
    String crisisEmp03Name = crisisEmp03.getName();
    
    Employee crisisEmp04 = new Employee();
    crisisEmp04.setName(magicBox.name().fullName());
    String crisisEmp04Name = crisisEmp04.getName();
    
    
    //faker employee user accounts
    UserAccount policeEmpUA01 = ((PoliceOrganization) policeOrg).getUserAccountDirectory().createUserAccount("police001", "123", crisisEmp03, new PoliceOfficerRole());
    UserAccount policeEmpUA02 = ((PoliceOrganization) policeOrg).getUserAccountDirectory().createUserAccount("police002", "123", crisisEmp04, new PoliceOfficerRole());
    
    
    //create more employees
    
    Employee crisisManager2 = new Employee();
    crisisManager2.setName("Mary May");
    
    Employee crisisEmp4 = new Employee();
    crisisEmp4.setName("Alan York");
    
    Employee crisisEmp5 = new Employee();
    crisisEmp5.setName("Becky Bare");
    
    Employee crisisEmp6 = new Employee();
    crisisEmp6.setName("Fred Fax");
    
    UserAccount policeManagerUA1 = ((PoliceOrganization) policeOrg).getUserAccountDirectory().createUserAccount("policeManager", "policeManager000", crisisManager2, new PoliceDepartmentChiefRole());
    UserAccount policeEmpUA2 = ((PoliceOrganization) policeOrg).getUserAccountDirectory().createUserAccount("police001", "police111", crisisEmp4, new PoliceOfficerRole());
    UserAccount policeEmpUA3 = ((PoliceOrganization) policeOrg).getUserAccountDirectory().createUserAccount("police002", "police111", crisisEmp5, new PoliceOfficerRole());
    UserAccount policeEmpUA4 = ((PoliceOrganization) policeOrg).getUserAccountDirectory().createUserAccount("fred", "123", crisisEmp6, new PoliceOfficerRole());
                                    
    
    
    for(Organization org : crisisEnterprise.getOrgDirectory().getOrgList()){
        
        if(org instanceof PoliceOrganization){
            ((PoliceOrganization) org).getEmployeeDirectory().createEmployee(crisisManager2.getName());
            
            ((PoliceOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp4.getName());
            
            ((PoliceOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp5.getName());
            
            ((PoliceOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp6.getName());
            
            //faker emplpoyees
            ((PoliceOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp03Name);
            ((PoliceOrganization) org).getEmployeeDirectory().createEmployee(crisisEmp04Name);
             
            
        }
    }
    
    
   //wellbeing
   
   //hospital
   
   //faker employees
    Employee wellbeingEmp01 = new Employee();
    wellbeingEmp01.setName(magicBox.name().fullName());
    String wellbeingEmp01Name = wellbeingEmp01.getName();
    
    Employee wellbeingEmp02 = new Employee();
    wellbeingEmp02.setName(magicBox.name().fullName());
    String wellbeingEmp02Name = wellbeingEmp02.getName();
   
    
    //faker employee user accounts
    UserAccount hospEmpUA01 = ((HospitalOrganization) hospitalOrg).getUserAccountDirectory().createUserAccount("doc001", "123", wellbeingEmp01, new DoctorRole());
    UserAccount hospEmpUA02 = ((HospitalOrganization) hospitalOrg).getUserAccountDirectory().createUserAccount("doc002", "123", wellbeingEmp02, new DoctorRole());
     
    
    
   //create more employees
    Employee wellbeingManager1 = new Employee();
    wellbeingManager1.setName("Zach Brown");
    
    Employee wellbeingEmp1 = new Employee();
    wellbeingEmp1.setName("Michelle Max");
    
    Employee wellbeingEmp2 = new Employee();
    wellbeingEmp2.setName("Zee Dawn");
    
    Employee wellbeingEmp3 = new Employee();
    wellbeingEmp3.setName("John Jones");
    
    UserAccount hospManagerUA1 = ((HospitalOrganization) hospitalOrg).getUserAccountDirectory().createUserAccount("hospitalManager", "hospitalManager000", wellbeingManager1, new HospitalManagerRole());
    UserAccount hospEmpUA2 = ((HospitalOrganization) hospitalOrg).getUserAccountDirectory().createUserAccount("doctor001", "doctor111", wellbeingEmp1, new DoctorRole());
    UserAccount hospEmpUA3 = ((HospitalOrganization) hospitalOrg).getUserAccountDirectory().createUserAccount("doctor002", "doctor111", wellbeingEmp2, new DoctorRole());
    UserAccount hospEmpUA4 = ((HospitalOrganization) hospitalOrg).getUserAccountDirectory().createUserAccount("john", "123", wellbeingEmp3, new DoctorRole());
                                    
    
    
    for(Organization org : wellbeingEnterprise.getOrgDirectory().getOrgList()){
        
        if(org instanceof HospitalOrganization){
            ((HospitalOrganization) org).getEmployeeDirectory().createEmployee(wellbeingManager1.getName());
            
            ((HospitalOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp1.getName());
            
            ((HospitalOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp2.getName());
            
            ((HospitalOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp3.getName());
           
            //faker employees
            ((HospitalOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp01Name);
            ((HospitalOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp02Name);
           
        }
    }
    
    
    //therapy
    
    //faker employees
    Employee wellbeingEmp03 = new Employee();
    wellbeingEmp03.setName(magicBox.name().fullName());
    String wellbeingEmp03Name = wellbeingEmp03.getName();
    
    Employee wellbeingEmp04 = new Employee();
    wellbeingEmp04.setName(magicBox.name().fullName());
    String wellbeingEmp04Name = wellbeingEmp04.getName();
    
    
    //faker employee user accounts
    UserAccount therapistEmpUA01 = ((TherapistOrganization) therapistOrg).getUserAccountDirectory().createUserAccount("therapist001", "123", wellbeingEmp03, new TherapistRole());
    UserAccount therapistEmpUA02 = ((TherapistOrganization) therapistOrg).getUserAccountDirectory().createUserAccount("therapist002", "123", wellbeingEmp04, new TherapistRole());
      
    
    //create more employees
    Employee wellbeingManager2 = new Employee();
    wellbeingManager2.setName("Gina Gains");
    
    Employee wellbeingEmp4 = new Employee();
    wellbeingEmp4.setName("Emily Manning");
    
    Employee wellbeingEmp5 = new Employee();
    wellbeingEmp5.setName("Lee Lu");
    
    Employee wellbeingEmp6 = new Employee();
    wellbeingEmp6.setName("Peter Pan");
    
    
    UserAccount therapistManagerUA1 = ((TherapistOrganization) therapistOrg).getUserAccountDirectory().createUserAccount("therapistManager", "therapistManager000", wellbeingManager2, new TherapistOrgManagerRole());
    UserAccount therapistEmpUA2 = ((TherapistOrganization) therapistOrg).getUserAccountDirectory().createUserAccount("therapist001", "therapist111", wellbeingEmp4, new TherapistRole());
    UserAccount therapistEmpUA3 = ((TherapistOrganization) therapistOrg).getUserAccountDirectory().createUserAccount("therapist002", "therapist111", wellbeingEmp5, new TherapistRole());
    UserAccount therapistEmpUA4 = ((TherapistOrganization) therapistOrg).getUserAccountDirectory().createUserAccount("peter", "123", wellbeingEmp6, new TherapistRole());
                        
    
    for(Organization org : wellbeingEnterprise.getOrgDirectory().getOrgList()){
        
        if(org instanceof TherapistOrganization){
            
            ((TherapistOrganization) org).getEmployeeDirectory().createEmployee(wellbeingManager2.getName());
       
            ((TherapistOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp4.getName());
            
            ((TherapistOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp5.getName());
            
            ((TherapistOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp6.getName());
            
            //faker employees
            ((TherapistOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp03Name);
            ((TherapistOrganization) org).getEmployeeDirectory().createEmployee(wellbeingEmp04Name);
            
        }
    }
            
            
    
   //housing 
   
   //faker employees
    Employee housEmp01 = new Employee();
    housEmp01.setName(magicBox.name().fullName());
    String housEmp01Name = housEmp01.getName();
    
    Employee housEmp02 = new Employee();
    housEmp02.setName(magicBox.name().fullName());
    String housEmp02Name = housEmp02.getName();
    
    //faker employee user accounts
    UserAccount realtorEmpUA01 = ((RealtorOrganization) housingOrg).getUserAccountDirectory().createUserAccount("realtor001", "123", housEmp01, new RealEstateAgentRole());
    UserAccount realtorEmpUA02 = ((RealtorOrganization) housingOrg).getUserAccountDirectory().createUserAccount("realtor002", "123", housEmp02, new RealEstateAgentRole());
     
    
   //create more employees
    Employee housManager1 = new Employee();
    housManager1.setName("Jack Jones");
    
    Employee housEmp1 = new Employee();
    housEmp1.setName("Sarah Smith");
    
    Employee housEmp2 = new Employee();
    housEmp2.setName("Alex Wall");
    
    Employee housEmp3 = new Employee();
    housEmp3.setName("Lary Brown");
    
    Employee housEmp4 = new Employee();
    housEmp4.setName("Eric Lake");
    
    
    UserAccount realtorManagerUA1 = ((RealtorOrganization) housingOrg).getUserAccountDirectory().createUserAccount("housingManager", "housingManager000", housManager1, new RealEstateCompanyManagerRole());
    UserAccount realtorEmpUA5 = ((RealtorOrganization) housingOrg).getUserAccountDirectory().createUserAccount("realtor001", "realtor111", housEmp4, new RealEstateAgentRole());
    UserAccount realtorEmpUA2 = ((RealtorOrganization) housingOrg).getUserAccountDirectory().createUserAccount("realtor002", "realtor111", housEmp1, new RealEstateAgentRole());
    UserAccount realtorEmpUA3 = ((RealtorOrganization) housingOrg).getUserAccountDirectory().createUserAccount("alex", "123", housEmp2, new RealEstateAgentRole());
    UserAccount realtorEmpUA4 = ((RealtorOrganization) housingOrg).getUserAccountDirectory().createUserAccount("lary", "123", housEmp3, new RealEstateAgentRole());
     
    
    
    
        for(Organization org : housingEnterprise.getOrgDirectory().getOrgList()){
        
        if(org instanceof RealtorOrganization){
            ((RealtorOrganization) org).getEmployeeDirectory().createEmployee(housManager1.getName());
            //UserAccount realtorEmpUA1 = ((RealtorOrganization) org).getUserAccountDirectory().createUserAccount("jack", "123", housManager1, new RealEstateCompanyManagerRole());
            
            ((RealtorOrganization) org).getEmployeeDirectory().createEmployee(housEmp1.getName());
            //UserAccount realtorEmpUA2 = ((RealtorOrganization) org).getUserAccountDirectory().createUserAccount("sarah", "123", housEmp1, new RealEstateAgentRole());
        
            ((RealtorOrganization) org).getEmployeeDirectory().createEmployee(housEmp2.getName());
            //UserAccount realtorEmpUA3 = ((RealtorOrganization) org).getUserAccountDirectory().createUserAccount("alex", "123", housEmp2, new RealEstateAgentRole());
     
            ((RealtorOrganization) org).getEmployeeDirectory().createEmployee(housEmp3.getName());
            //UserAccount realtorEmpUA4 = ((RealtorOrganization) org).getUserAccountDirectory().createUserAccount("lary", "123", housEmp3, new RealEstateAgentRole());
     
            ((RealtorOrganization) org).getEmployeeDirectory().createEmployee(housEmp4.getName());
            //UserAccount realtorEmpUA5 = ((RealtorOrganization) org).getUserAccountDirectory().createUserAccount("eric", "123", housEmp4, new RealEstateAgentRole());
     
            //faker employees
            ((RealtorOrganization) org).getEmployeeDirectory().createEmployee(housEmp01Name);
            ((RealtorOrganization) org).getEmployeeDirectory().createEmployee(housEmp02Name);
            
            
        }
    }
    
   
        
    //create some student requests
        
        AdvisingRequest advisingRequest1 = new AdvisingRequest();
        advisingRequest1.setAdvisingType("Graduation");
        advisingRequest1.setComments("Application Assistance");
        Calendar c0 = Calendar.getInstance();
            c0.set(2022, 11, 15, 1, 40);
            Date date0 = c0.getTime();
        advisingRequest1.setDateOfRequest(date0);
        advisingRequest1.setOrgType("University Organization");
        advisingRequest1.setSender(sua1);
        advisingRequest1.setPriorityLevel("P2");
        advisingRequest1.setStatus("Submitted");
        advisingRequest1.setRequestType("Advising Request");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof StudentAdvisingEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof UniversityOrganization){
                            ((UniversityOrganization) org).getWorkQueue().addRequestToQueue(advisingRequest1);
                        }
                    }
                    
                }
            }
        sua1.getWorkQueue().addRequestToQueue(advisingRequest1);
     
        HealthRequest healthRequest1 = new HealthRequest();
        healthRequest1.setType("Therapy Session");
        healthRequest1.setComments("Request for therapy apt regarding stress");
        Calendar c1 = Calendar.getInstance();
        c1.set(2022, 8, 13, 9, 17);
         Date date1 = c1.getTime();
        healthRequest1.setDateOfRequest(date1);
        healthRequest1.setStatus("Submitted");
        healthRequest1.setPriorityLevel("P2");
        healthRequest1.setSender(sua1);
        healthRequest1.setRequestType("Health Request");
        healthRequest1.setOrgType("Therapist Organization");
            for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WellbeingSupportEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof TherapistOrganization){
                            ((TherapistOrganization) org).getWorkQueue().addRequestToQueue(healthRequest1);
                        }
                    }
                    
                }
            }
        sua1.getWorkQueue().addRequestToQueue(healthRequest1);        
             
          
        
            HousingRequest housingRequest1 = new HousingRequest();
            housingRequest1.setMaxPrice(1200);
            housingRequest1.setDesiredLocation("Boston, MA 02115");
            housingRequest1.setComments("Looking for one or two bedroom");
            Calendar c2 = Calendar.getInstance();
            c2.set(2022, 10, 17, 14, 9);
            Date date2 = c2.getTime();
            housingRequest1.setDateOfRequest(date2);
            housingRequest1.setStatus("Submitted");
            housingRequest1.setSender(sua1);
            housingRequest1.setPriorityLevel("P4");
            housingRequest1.setRequestType("Housing Request");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof HousingManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof RealtorOrganization){
                            ((RealtorOrganization) org).getWorkQueue().addRequestToQueue(housingRequest1);
                        }
                    }
                    
                }
            }
        sua1.getWorkQueue().addRequestToQueue(housingRequest1);
        
        
        CommunityRequest communityRequest1 = new CommunityRequest();
        communityRequest1.setInvolvementType("Volunteering");
        communityRequest1.setComments("Looking to volunteer");
        Calendar c3 = Calendar.getInstance();
        c3.set(2022, 5, 10, 4, 34);
        Date date3 = c3.getTime();
        communityRequest1.setDateOfRequest(date3);
        communityRequest1.setOrgType("Multicultural Organization");
        communityRequest1.setSender(sua2);
        communityRequest1.setStatus("Submitted");
        communityRequest1.setPriorityLevel("P4");
        communityRequest1.setRequestType("Community Request");
        
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CommunityInvolvementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof MulticulturalOrganization){
                            ((MulticulturalOrganization) org).getWorkQueue().addRequestToQueue(communityRequest1);
                        }
                    }
                    
                }
            }
        
        sua2.getWorkQueue().addRequestToQueue(communityRequest1);
        
            
        EmergencyRequest emergencyRequest1 = new EmergencyRequest();
        emergencyRequest1.setEmergencyType("Police");
        emergencyRequest1.setLocation("360 Huntington Ave, Boston, MA 02115");
        emergencyRequest1.setComments("Reporting a crime");
        Calendar c4 = Calendar.getInstance();
        c4.set(2022, 11, 23, 16, 20);
        Date date4 = c4.getTime();
        emergencyRequest1.setDateOfRequest(date4);
        emergencyRequest1.setStatus("Submitted");
        emergencyRequest1.setPriorityLevel("P1");
        emergencyRequest1.setSender(sua2);
        emergencyRequest1.setRequestType("Emergency Request");    
        emergencyRequest1.setOrgType("Police Organization");
        
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CrisisManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof PoliceOrganization){
                            ((PoliceOrganization) org).getWorkQueue().addRequestToQueue(emergencyRequest1);
                        }
                    }
                    
                }
        }
        sua2.getWorkQueue().addRequestToQueue(emergencyRequest1);
        
        
        HealthRequest healthRequest2 = new HealthRequest();
        healthRequest2.setType("Hospital Visit");
        healthRequest2.setComments("General Check-Up");
        Calendar c5 = Calendar.getInstance();
        c5.set(2022, 12, 1, 10, 16);
        Date date5 = c5.getTime();
        healthRequest2.setDateOfRequest(date5);
        healthRequest2.setStatus("Submitted");
        healthRequest2.setSender(sua4);
        healthRequest2.setPriorityLevel("P2");
        healthRequest2.setRequestType("Health Request");
        healthRequest2.setOrgType("Hospital Organization");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WellbeingSupportEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof HospitalOrganization){
                            ((HospitalOrganization) org).getWorkQueue().addRequestToQueue(healthRequest2);
                        }
                    }
                    
                }
            }
        sua4.getWorkQueue().addRequestToQueue(healthRequest2);
        
        
        AdvisingRequest advisingRequest2 = new AdvisingRequest();
        advisingRequest2.setAdvisingType("Course Selection");
        advisingRequest2.setComments("Help with courses");
        Calendar c6 = Calendar.getInstance();
        c6.set(2022, 11, 10, 16, 5);
        Date date6 = c6.getTime();
        advisingRequest2.setDateOfRequest(date6);
        advisingRequest2.setOrgType("University Organization");
        advisingRequest2.setSender(sua4);
        advisingRequest2.setPriorityLevel("P3");
        advisingRequest2.setStatus("Submitted");
        advisingRequest2.setRequestType("Advising Request");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof StudentAdvisingEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof UniversityOrganization){
                            ((UniversityOrganization) org).getWorkQueue().addRequestToQueue(advisingRequest2);
                        }
                    }
                    
                }
            }
        sua4.getWorkQueue().addRequestToQueue(advisingRequest2);
     
        
        CommunityRequest communityRequest2 = new CommunityRequest();
        communityRequest2.setInvolvementType("Church");
        communityRequest2.setComments("Look to be connected to local church group");
        Calendar c7 = Calendar.getInstance();
        c7.set(2022, 10, 24, 14, 8);
        Date date7 = c7.getTime();
        communityRequest2.setDateOfRequest(date7);
        communityRequest2.setOrgType("Multicultural Organization");
        communityRequest2.setSender(sua4);
        communityRequest2.setStatus("Submitted");
        communityRequest2.setPriorityLevel("P4");
        communityRequest2.setRequestType("Community Request");
        
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CommunityInvolvementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof MulticulturalOrganization){
                            ((MulticulturalOrganization) org).getWorkQueue().addRequestToQueue(communityRequest2);
                        }
                    }
                    
                }
            }
        sua4.getWorkQueue().addRequestToQueue(communityRequest2);
        
       
        
        EmergencyRequest emergencyRequest2 = new EmergencyRequest();
        emergencyRequest2.setEmergencyType("Fire");
        emergencyRequest2.setLocation("316 Huntington Ave, Boston, MA 02115");
        emergencyRequest2.setComments("Reporting a fire");
        Calendar c8 = Calendar.getInstance();
        c8.set(2022, 12, 4, 11, 17);
        Date date8 = c8.getTime();
        emergencyRequest2.setDateOfRequest(date8);
        emergencyRequest2.setStatus("Submitted");
        emergencyRequest2.setPriorityLevel("P1");
        emergencyRequest2.setSender(sua4);
        emergencyRequest2.setRequestType("Emergency Request");    
        emergencyRequest2.setOrgType("Fire Department Organization");
            for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CrisisManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof FireDepartmentOrganization){
                            ((FireDepartmentOrganization) org).getWorkQueue().addRequestToQueue(emergencyRequest2);
                        }
                    }
                    
                }
            }
        sua4.getWorkQueue().addRequestToQueue(emergencyRequest2);
        
        
        EmergencyRequest emergencyRequest3 = new EmergencyRequest();
        emergencyRequest3.setEmergencyType("Police");
        emergencyRequest3.setLocation("768 Columbus Ave, Boston, MA 02120");
        emergencyRequest3.setComments("Reporting domestic violence");
        Calendar c9 = Calendar.getInstance();
        c9.set(2022, 11, 28, 16, 9);
        Date date9 = c9.getTime();
        emergencyRequest3.setDateOfRequest(date9);
        emergencyRequest3.setStatus("Submitted");
        emergencyRequest3.setPriorityLevel("P1");
        emergencyRequest3.setSender(sua1);
        emergencyRequest3.setRequestType("Emergency Request");    
        emergencyRequest3.setOrgType("Police Organization");
        
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CrisisManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof PoliceOrganization){
                            ((PoliceOrganization) org).getWorkQueue().addRequestToQueue(emergencyRequest3);
                        }
                    }
                    
                }
        }
        sua1.getWorkQueue().addRequestToQueue(emergencyRequest3);
        
        
        
        AdvisingRequest advisingRequest3 = new AdvisingRequest();
        advisingRequest3.setAdvisingType("Grad School");
        advisingRequest3.setComments("Advice on grad school");
        Calendar c10 = Calendar.getInstance();
        c10.set(2022, 9, 19, 7, 3);
        Date date10 = c10.getTime();
        advisingRequest3.setDateOfRequest(date10);
        advisingRequest3.setOrgType("University Organization");
        advisingRequest3.setSender(sua2);
        advisingRequest3.setPriorityLevel("P3");
        advisingRequest3.setStatus("Submitted");
        advisingRequest3.setRequestType("Advising Request");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof StudentAdvisingEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof UniversityOrganization){
                            ((UniversityOrganization) org).getWorkQueue().addRequestToQueue(advisingRequest3);
                        }
                    }
                    
                }
            }
        sua2.getWorkQueue().addRequestToQueue(advisingRequest2);
         
        
        AdvisingRequest advisingRequest4 = new AdvisingRequest();
        advisingRequest4.setAdvisingType("Co-op");
        advisingRequest4.setComments("Seeking co-op search advice");
        Calendar c11 = Calendar.getInstance();
        c11.set(2022, 11, 12, 13, 15);
        Date date11 = c11.getTime();
        advisingRequest4.setDateOfRequest(date11);
        advisingRequest4.setOrgType("University Organization");
        advisingRequest4.setSender(sua2);
        advisingRequest4.setPriorityLevel("P3");
        advisingRequest4.setStatus("Submitted");
        advisingRequest4.setRequestType("Advising Request");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof StudentAdvisingEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof UniversityOrganization){
                            ((UniversityOrganization) org).getWorkQueue().addRequestToQueue(advisingRequest4);
                        }
                    }
                    
                }
            }
        sua2.getWorkQueue().addRequestToQueue(advisingRequest4);
        
        
        HealthRequest healthRequest3 = new HealthRequest();
        healthRequest3.setType("Hospital Visit");
        healthRequest3.setComments("New doctor");
        Calendar c12 = Calendar.getInstance();
        c12.set(2022, 11, 20, 11, 40);
        Date date12 = c12.getTime();
        healthRequest3.setDateOfRequest(date12);
        healthRequest3.setStatus("Submitted");
        healthRequest3.setSender(sua1);
        healthRequest3.setPriorityLevel("P2");
        healthRequest3.setRequestType("Health Request");
        healthRequest3.setOrgType("Hospital Organization");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WellbeingSupportEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof HospitalOrganization){
                            ((HospitalOrganization) org).getWorkQueue().addRequestToQueue(healthRequest3);
                        }
                    }
                    
                }
            }
        sua1.getWorkQueue().addRequestToQueue(healthRequest3);
        
        
        CommunityRequest communityRequest3 = new CommunityRequest();
        communityRequest3.setInvolvementType("Volunteering");
        communityRequest3.setComments("Looking to volunteer");
        Calendar c13 = Calendar.getInstance();
        c13.set(2022, 9, 17, 17, 28);
        Date date13 = c13.getTime();
        communityRequest3.setDateOfRequest(date13);
        communityRequest3.setOrgType("Multicultural Organization");
        communityRequest3.setSender(sua1);
        communityRequest3.setStatus("Submitted");
        communityRequest3.setPriorityLevel("P4");
        communityRequest3.setRequestType("Community Request");
        
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CommunityInvolvementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof MulticulturalOrganization){
                            ((MulticulturalOrganization) org).getWorkQueue().addRequestToQueue(communityRequest3);
                        }
                    }
                    
                }
            }
        
        sua1.getWorkQueue().addRequestToQueue(communityRequest3);
        
        
        
        HousingRequest housingRequest2 = new HousingRequest();
            housingRequest2.setMaxPrice(900);
            housingRequest2.setDesiredLocation("Boston, MA 02120");
            housingRequest2.setComments("Looking for a one bedroom");
            Calendar c14 = Calendar.getInstance();
            c14.set(2022, 7, 12, 50, 11);
            Date date14 = c14.getTime();
            housingRequest2.setDateOfRequest(date14);
            housingRequest2.setStatus("Submitted");
            housingRequest2.setSender(sua4);
            housingRequest2.setPriorityLevel("P4");
            housingRequest2.setRequestType("Housing Request");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof HousingManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof RealtorOrganization){
                            ((RealtorOrganization) org).getWorkQueue().addRequestToQueue(housingRequest2);
                        }
                    }
                    
                }
            }
        sua4.getWorkQueue().addRequestToQueue(housingRequest1);
        
        
            HousingRequest housingRequest3 = new HousingRequest();
            housingRequest3.setMaxPrice(1550);
            housingRequest3.setDesiredLocation("Boston, MA 02115");
            housingRequest3.setComments("Looking for a three bedroom");
            Calendar c15 = Calendar.getInstance();
            c15.set(2022, 9, 22, 16, 30);
            Date date15 = c15.getTime();
            housingRequest3.setDateOfRequest(date15);
            housingRequest3.setStatus("Submitted");
            housingRequest3.setSender(sua3);
            housingRequest3.setPriorityLevel("P4");
            housingRequest3.setRequestType("Housing Request");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof HousingManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof RealtorOrganization){
                            ((RealtorOrganization) org).getWorkQueue().addRequestToQueue(housingRequest3);
                        }
                    }
                    
                }
            }
        sua3.getWorkQueue().addRequestToQueue(housingRequest3);
        
        
            HousingRequest housingRequest4 = new HousingRequest();
            housingRequest4.setMaxPrice(1100);
            housingRequest4.setDesiredLocation("Boston, MA 02115");
            housingRequest4.setComments("Looking for a two bedroom");
            Calendar c16 = Calendar.getInstance();
            c16.set(2022, 1, 17, 8, 14);
            Date date16 = c16.getTime();
            Calendar c20 = Calendar.getInstance();
            c20.set(2022, 2, 24, 11, 37);
            Date date20 = c20.getTime();
            housingRequest4.setDateOfRequest(date16);
            housingRequest4.setStatus("Completed");
            housingRequest4.setSender(sua3);
            housingRequest4.setPriorityLevel("P3");
            housingRequest4.setRequestType("Housing Request");
            housingRequest4.setDateResolved(date20);
            housingRequest4.setReceiver(realtorEmpUA5);
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof HousingManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof RealtorOrganization){
                            ((RealtorOrganization) org).getWorkQueue().addRequestToQueue(housingRequest4);
                        }
                    }
                    
                }
            }
        sua3.getWorkQueue().addRequestToQueue(housingRequest4);
        realtorEmpUA5.getWorkQueue().addRequestToQueue(housingRequest4);
        
        
        CommunityRequest communityRequest4 = new CommunityRequest();
        communityRequest4.setInvolvementType("Church");
        communityRequest4.setComments("Looking for a local mosque");
        Calendar c17 = Calendar.getInstance();
        c17.set(2022, 10, 18, 12, 10);
        Date date17 = c17.getTime();
        communityRequest4.setDateOfRequest(date17);
        communityRequest4.setOrgType("Multicultural Organization");
        communityRequest4.setSender(sua3);
        communityRequest4.setStatus("Completed");
        communityRequest4.setPriorityLevel("P4");
        communityRequest4.setRequestType("Community Request");
        communityRequest4.setReceiver(comEmpUA2);
        Calendar c177 = Calendar.getInstance();
        c177.set(2022, 11, 2, 10, 5);
        Date date177 = c177.getTime();
        communityRequest4.setDateResolved(date177);
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CommunityInvolvementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof MulticulturalOrganization){
                            ((MulticulturalOrganization) org).getWorkQueue().addRequestToQueue(communityRequest4);
                        }
                    }
                    
                }
            }
        
        sua3.getWorkQueue().addRequestToQueue(communityRequest4);
        comEmpUA2.getWorkQueue().addRequestToQueue(communityRequest4);
        
        
    
        AdvisingRequest advisingRequest5 = new AdvisingRequest();
        advisingRequest5.setAdvisingType("Course Registration");
        advisingRequest5.setComments("Help with courses");
        Calendar c18 = Calendar.getInstance();
        c18.set(2022, 6, 8, 10, 7);
        Date date18 = c18.getTime();
        advisingRequest5.setDateOfRequest(date18);
        advisingRequest5.setOrgType("University Organization");
        advisingRequest5.setSender(sua3);
        advisingRequest5.setPriorityLevel("P3");
        advisingRequest5.setStatus("Canceled");
        advisingRequest5.setRequestType("Advising Request");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof StudentAdvisingEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof UniversityOrganization){
                            ((UniversityOrganization) org).getWorkQueue().addRequestToQueue(advisingRequest5);
                        }
                    }
                    
                }
            }
        sua3.getWorkQueue().addRequestToQueue(advisingRequest5);
         
        
            HousingRequest housingRequest5 = new HousingRequest();
            housingRequest5.setMaxPrice(700);
            housingRequest5.setDesiredLocation("Boston, MA 02117");
            housingRequest5.setComments("Looking for a studio");
            Calendar c19 = Calendar.getInstance();
            c19.set(2022, 3, 10, 14, 28);
            Date date19 = c19.getTime();
            housingRequest5.setDateOfRequest(date19);
            housingRequest5.setStatus("Canceled");
            housingRequest5.setSender(sua2);
            housingRequest5.setPriorityLevel("P4");
            housingRequest5.setRequestType("Housing Request");
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof HousingManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof RealtorOrganization){
                            ((RealtorOrganization) org).getWorkQueue().addRequestToQueue(housingRequest5);
                        }
                    }
                    
                }
            }
        sua2.getWorkQueue().addRequestToQueue(housingRequest4);
        
        
        HealthRequest healthRequest5 = new HealthRequest();
        healthRequest5.setType("Therapy Session");
        healthRequest5.setComments("Request for therapy apointment");
        Calendar c21 = Calendar.getInstance();
        c21.set(2022,11, 18, 10, 16);
        Date date21 = c21.getTime();
        healthRequest5.setDateOfRequest(date21);
        healthRequest5.setStatus("In Progress");
        healthRequest5.setPriorityLevel("P3");
        healthRequest5.setSender(sua3);
        healthRequest5.setRequestType("Health Request");
        healthRequest5.setOrgType("Therapist Organization");
        healthRequest5.setReceiver(therapistEmpUA2);
            for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WellbeingSupportEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof TherapistOrganization){
                            ((TherapistOrganization) org).getWorkQueue().addRequestToQueue(healthRequest5);
                        }
                    }
                    
                }
            }
        sua3.getWorkQueue().addRequestToQueue(healthRequest5);        
        therapistEmpUA2.getWorkQueue().addRequestToQueue(healthRequest5);
        
        
        
        EmergencyRequest emergencyRequest4 = new EmergencyRequest();
        emergencyRequest4.setEmergencyType("Police");
        emergencyRequest4.setLocation("11 Speare Pl, Boston, MA 02115");
        emergencyRequest4.setComments("Report of stolen bike");
        Calendar c22 = Calendar.getInstance();
        c22.set(2022, 12, 1, 18, 24);
        Date date22 = c22.getTime();
        emergencyRequest4.setDateOfRequest(date22);
        emergencyRequest4.setStatus("In Progress");
        emergencyRequest4.setPriorityLevel("P3");
        emergencyRequest4.setSender(sua2);
        emergencyRequest4.setRequestType("Emergency Request");    
        emergencyRequest4.setOrgType("Police Organization");
        emergencyRequest4.setReceiver(policeEmpUA2); 
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CrisisManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof PoliceOrganization){
                            ((PoliceOrganization) org).getWorkQueue().addRequestToQueue(emergencyRequest4);
                        }
                    }
                    
                }
        }
        sua2.getWorkQueue().addRequestToQueue(emergencyRequest4);
        policeEmpUA2.getWorkQueue().addRequestToQueue(emergencyRequest4);
        
        
        HealthRequest healthRequest6 = new HealthRequest();
        healthRequest6.setType("Hospital Visit");
        healthRequest6.setComments("Request to see new doctor");
        Calendar c23 = Calendar.getInstance();
        c23.set(2022, 12, 5, 8, 30);
        Date date23 = c23.getTime();
        healthRequest6.setDateOfRequest(date23);
        healthRequest6.setStatus("In Progress");
        healthRequest6.setSender(sua9);
        healthRequest6.setPriorityLevel("P3");
        healthRequest6.setRequestType("Health Request");
        healthRequest6.setOrgType("Hospital Organization");
        healthRequest6.setReceiver(hospEmpUA4);
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WellbeingSupportEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof HospitalOrganization){
                            ((HospitalOrganization) org).getWorkQueue().addRequestToQueue(healthRequest6);
                        }
                    }
                    
                }
            }
        sua9.getWorkQueue().addRequestToQueue(healthRequest6);
        hospEmpUA4.getWorkQueue().addRequestToQueue(healthRequest6);
        
        
        HealthRequest healthRequest7 = new HealthRequest();
        healthRequest7.setType("Hospital Visit");
        healthRequest7.setComments("Request to be seen for cold");
        Calendar c24 = Calendar.getInstance();
        c24.set(2022, 7, 9, 11, 9);
        Date date24 = c24.getTime();
        healthRequest7.setDateOfRequest(date24);
        healthRequest7.setStatus("Completed");
        healthRequest7.setSender(sua3);
        healthRequest7.setPriorityLevel("P2");
        healthRequest7.setRequestType("Health Request");
        healthRequest7.setOrgType("Hospital Organization");
        healthRequest7.setReceiver(hospEmpUA4);
        Calendar c25 = Calendar.getInstance();
        c25.set(2022, 7, 15, 13, 42);
        Date date25 = c25.getTime();
        healthRequest7.setDateResolved(date25);
        for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof WellbeingSupportEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof HospitalOrganization){
                            ((HospitalOrganization) org).getWorkQueue().addRequestToQueue(healthRequest7);
                        }
                    }
                    
                }
            }
        sua3.getWorkQueue().addRequestToQueue(healthRequest7);
        hospEmpUA4.getWorkQueue().addRequestToQueue(healthRequest7);
        
        
        EmergencyRequest emergencyRequest5 = new EmergencyRequest();
        emergencyRequest5.setEmergencyType("Fire");
        emergencyRequest5.setLocation("369 Huntington Ave, Boston, MA 02115");
        emergencyRequest5.setComments("Reporting a fire");
        Calendar c26 = Calendar.getInstance();
        c26.set(2022, 10, 18, 17, 20);
        Date date26 = c26.getTime();
        emergencyRequest5.setDateOfRequest(date26);
        emergencyRequest5.setStatus("Completed");
        emergencyRequest5.setPriorityLevel("P1");
        emergencyRequest5.setSender(sua4);
        emergencyRequest5.setRequestType("Emergency Request");    
        emergencyRequest5.setOrgType("Fire Department Organization");
        emergencyRequest5.setReceiver(fireEmpUA2);
        Calendar c27 = Calendar.getInstance();
        c27.set(2022, 10, 18, 19, 11);
        Date date27 = c27.getTime();
        emergencyRequest5.setDateResolved(date27);
            for(Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()){
                if(enterprise instanceof CrisisManagementEnterprise){
                    for(Organization org : enterprise.getOrgDirectory().getOrgList()){
                        if(org instanceof FireDepartmentOrganization){
                            ((FireDepartmentOrganization) org).getWorkQueue().addRequestToQueue(emergencyRequest5);
                        }
                    }
                    
                }
            }
        sua4.getWorkQueue().addRequestToQueue(emergencyRequest5);
        fireEmpUA2.getWorkQueue().addRequestToQueue(emergencyRequest5);
        
    return system;
    }
    }
