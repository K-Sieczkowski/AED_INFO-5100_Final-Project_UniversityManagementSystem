/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EnterpriseAdmin;

import Business.Enterprise.CovidHelpEnterprise;
import Business.Enterprise.EmergencyResponseEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GrievanceManagementEnterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohithparvataneni
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private OrganizationDirectory organizationDirectory;
    DefaultTableModel model;
    
    public ManageOrganizationJPanel(JPanel userProcessContainer,Enterprise enterprise, OrganizationDirectory organizationDirectory) {
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise=enterprise;
        this.organizationDirectory = organizationDirectory;
        model = (DefaultTableModel) tblOrganization.getModel();
        populateTable();
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boxOrganization = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganization = new javax.swing.JTable();
        btnAddOrganization = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Select an Organization");

        tblOrganization.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Org ID", "Organization Name"
            }
        ));
        jScrollPane1.setViewportView(tblOrganization);

        btnAddOrganization.setBackground(new java.awt.Color(204, 255, 255));
        btnAddOrganization.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-add-48.png")); // NOI18N
        btnAddOrganization.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-back-arrow-48.png")); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/mohithparvataneni/Downloads/icons8-organization-48-2.png")); // NOI18N
        jLabel2.setText("Manage Organization");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1)
                        .addGap(89, 89, 89)
                        .addComponent(boxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(518, 518, 518)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(btnAddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(btnAddOrganization))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed
       
        Type type = (Type) boxOrganization.getSelectedItem();
        organizationDirectory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_btnAddOrganizationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    private void populateComboBox()
    {
        boxOrganization.removeAllItems();
        for (Organization.Type type : Organization.Type.values()){
            
            if (!type.getValue().equals(Organization.Type.Admin))
            {
                if(enterprise instanceof GrievanceManagementEnterprise)
                {
                    
                     boxOrganization.addItem(Organization.Type.GarbageRemoval);
                     boxOrganization.addItem(Organization.Type.StreetLighting);
                     boxOrganization.addItem(Organization.Type.WaterSupply);
                     boxOrganization.addItem(Organization.Type.Police);
                     break;
                }
                else if(enterprise instanceof EmergencyResponseEnterprise)
                {
                    
                     boxOrganization.addItem(Organization.Type.Hospital);
                     boxOrganization.addItem(Organization.Type.FireControl);
                     break;
                    
                }
                else if(enterprise instanceof CovidHelpEnterprise)
                {
                     boxOrganization.addItem(Organization.Type.Government);
                     boxOrganization.addItem(Organization.Type.NonGovernment);
                     break;
                }
                  
            }
        }
    }
    
    private void populateTable(){
         
        model.setRowCount(0);
        
        for (Organization organization : organizationDirectory.getOrganizationList()){
            
            Object[] obj = {organization.getOrganizationID(), organization.getName()};
            model.addRow(obj);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxOrganization;
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrganization;
    // End of variables declaration//GEN-END:variables
}
