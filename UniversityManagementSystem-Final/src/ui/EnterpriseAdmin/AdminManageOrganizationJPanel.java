/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.EnterpriseAdmin;


import javax.swing.table.DefaultTableModel;
import Business.Enterprises.CommunityInvolvementEnterprise;
import Business.Enterprises.CrisisManagementEnterprise;
import Business.Enterprises.Enterprise;
import Business.Enterprises.HousingManagementEnterprise;
import Business.Enterprises.StudentAdvisingEnterprise;
import Business.Enterprises.WellbeingSupportEnterprise;
import Business.Organizations.Organization;
import Business.Organizations.Organization.orgType;
import Business.Organizations.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author arfinansari
 */
public class AdminManageOrganizationJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private OrganizationDirectory organizationDirectory;
    /**
     * Creates new form AdminManageOrganizationJPanel
     */
    public AdminManageOrganizationJPanel(JPanel userProcessContainer,Enterprise enterprise, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.organizationDirectory = organizationDirectory;
        populateTable();
        populateOrganizationComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSelectOrganization = new javax.swing.JLabel();
        cbOrganization = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageOrganization = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 1050));

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Organization");

        lblSelectOrganization.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/organization.png"))); // NOI18N
        lblSelectOrganization.setText("Select an Organization");

        cbOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrganizationActionPerformed(evt);
            }
        });

        tblManageOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization ID", "Organization"
            }
        ));
        jScrollPane1.setViewportView(tblManageOrganization);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8-go-back-48.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(237, 237, 237)
                            .addComponent(lblSelectOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(347, 347, 347)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(302, 302, 302))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(355, 355, 355))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectOrganization)
                    .addComponent(cbOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnUpdate)
                .addGap(0, 488, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(cbOrganization.getSelectedItem().equals(Organization.orgType.RealtorOrg.getValue())){
          orgType type = Organization.orgType.RealtorOrg;
          organizationDirectory.createOrg(type);
       }
       else if(cbOrganization.getSelectedItem().equals(Organization.orgType.TherapistOrg.getValue())){
          orgType type = Organization.orgType.TherapistOrg;
          organizationDirectory.createOrg(type);   
       }
       else if(cbOrganization.getSelectedItem().equals(Organization.orgType.HospitalOrg.getValue())){
          orgType type = Organization.orgType.HospitalOrg;
          organizationDirectory.createOrg(type);   
       }
       else if(cbOrganization.getSelectedItem().equals(Organization.orgType.FireDepartmentOrg.getValue())){
          orgType type = Organization.orgType.FireDepartmentOrg;
          organizationDirectory.createOrg(type);   
       }
       
       else if(cbOrganization.getSelectedItem().equals(Organization.orgType.PoliceOrg.getValue())){
          orgType type = Organization.orgType.PoliceOrg;
          organizationDirectory.createOrg(type);   
       }
       
       else if(cbOrganization.getSelectedItem().equals(Organization.orgType.UniversityOrg.getValue())){
          orgType type = Organization.orgType.UniversityOrg;
          organizationDirectory.createOrg(type);   
       }
       
       else if(cbOrganization.getSelectedItem().equals(Organization.orgType.MulticulturalOrg.getValue())){
          orgType type = Organization.orgType.MulticulturalOrg;
          organizationDirectory.createOrg(type);   
       }
        JOptionPane.showMessageDialog(this, "The organization has been added.");
        
        populateTable();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
   /*      int selectedRowIndex = tblManageOrganization.getSelectedRow();

      if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

      else{
           
          if(cbOrganization.getSelectedItem()){
              JOptionPane.showMessageDialog(this, "Please fill in all fields.");
            
           }
           
           else{
           
            DefaultTableModel model = (DefaultTableModel) tblManageOrganization.getModel();
            
            String orgName = cbOrganization.getSelectedItem().toString();
        
            Business.Organizations.Organization organization = enterprise.getOrgDirectory().findOrg(orgName);
            UserAccountDirectory useraccountdirectory = organization.getUserAccountDirectory();
            Employee e = organization.getEmployeeDirectory().findEmployee(model.getValueAt(selectedRowIndex, 1).toString());
            UserAccount ua = useraccountdirectory.findUserAccount(model.getValueAt(selectedRowIndex, 1).toString());


            ua.getEmployee().setName(cbOrganization.getName());
            
            JOptionPane.showMessageDialog(this, "Employee has been updated.");
        }
      }
        cbOrganization.setName("");
        
        populateTable();     */
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cbOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrganizationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbOrganization;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelectOrganization;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblManageOrganization;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
          DefaultTableModel model = (DefaultTableModel) tblManageOrganization.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : organizationDirectory.getOrgList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrgID();
            row[1] = organization.getOrgName();
            
            model.addRow(row);
        }  
}

private void populateOrganizationComboBox(){
       
       for(Organization.orgType type : Organization.orgType.values()){
           
           if (enterprise instanceof HousingManagementEnterprise){
               cbOrganization.addItem(Organization.orgType.RealtorOrg.getValue());
               break;
           }
           else if(enterprise instanceof CommunityInvolvementEnterprise){
             cbOrganization.addItem(Organization.orgType.MulticulturalOrg.getValue());
             break;
           }
           else if(enterprise instanceof CrisisManagementEnterprise){
              cbOrganization.addItem(Organization.orgType.FireDepartmentOrg.getValue());
              cbOrganization.addItem(Organization.orgType.PoliceOrg.getValue());
              break;
           }
           else if(enterprise instanceof StudentAdvisingEnterprise){
           cbOrganization.addItem(Organization.orgType.UniversityOrg.getValue());
            break;
           }
           else if(enterprise instanceof WellbeingSupportEnterprise){
           cbOrganization.addItem(Organization.orgType.TherapistOrg.getValue());
           cbOrganization.addItem(Organization.orgType.HospitalOrg.getValue());
           break;
           
    }
       }
}
}
