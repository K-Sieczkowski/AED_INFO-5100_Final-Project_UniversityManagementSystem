/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdmin;

import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eswar
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private Network network;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.network = network;
        populateTable();
        displayComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        lblEnterpriseName = new javax.swing.JLabel();
        lblNetwork = new javax.swing.JLabel();
        cbNetwork = new javax.swing.JComboBox();
        cbEnterpriseType = new javax.swing.JComboBox();
        btnAddEnterprise = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEnterprise = new javax.swing.JTable();
        lblEnterpriseType = new javax.swing.JLabel();
        txtEnterpriseName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        lblHeading.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Create Enterprise ");

        lblEnterpriseName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblEnterpriseName.setText("Enterprise Name");

        lblNetwork.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblNetwork.setText("Choose Network");

        cbEnterpriseType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));

        btnAddEnterprise.setBackground(new java.awt.Color(255, 255, 255));
        btnAddEnterprise.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        btnAddEnterprise.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAddEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEnterpriseActionPerformed(evt);
            }
        });

        tableEnterprise.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network", "Enterprise Type", "Enterprise Name"
            }
        ));
        jScrollPane1.setViewportView(tableEnterprise);

        lblEnterpriseType.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblEnterpriseType.setText("Enterprise Type");

        btnBack.setBackground(new java.awt.Color(204, 255, 255));
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblEnterpriseName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNetwork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEnterpriseType, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbEnterpriseType, 0, 190, Short.MAX_VALUE)
                            .addComponent(cbNetwork, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEnterpriseName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(btnAddEnterprise)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnBack))
                    .addComponent(lblHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEnterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterpriseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnAddEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEnterpriseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAddEnterpriseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Network network = (Network)  cbNetwork.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) cbEnterpriseType.getSelectedItem();



       if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid input, please try again.");
            return;
        }
        if(txtEnterpriseName.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.");
            return;
        }
        String name = txtEnterpriseName.getText().trim();
        ArrayList<String> enterpriseCheck = new ArrayList<>();
        for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList())
        {
            enterpriseCheck.add(e.getOrgName());
            
        }
        if(enterpriseCheck.contains(name))
        {
            JOptionPane.showMessageDialog(null, "Enterprise already exists with the same name");
            return;
            
        }
        Enterprise enterprise = network.getEnterpriseDirectory().createEnterprise(name, type);



      populateTable();
       txtEnterpriseName.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEnterprise;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cbEnterpriseType;
    private javax.swing.JComboBox cbNetwork;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterpriseName;
    private javax.swing.JLabel lblEnterpriseType;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblNetwork;
    private javax.swing.JTable tableEnterprise;
    private javax.swing.JTextField txtEnterpriseName;
    // End of variables declaration//GEN-END:variables

  private void populateTable() {
    DefaultTableModel model = (DefaultTableModel) tableEnterprise.getModel();
        model.setRowCount(0);
    
    for (Network network : ecosystem.getNetworkList()) {
         for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
        Object[] row = new Object[3];
        row[0] = network.getName();
        row[1] = enterprise.getEnterpriseType().getValue();
        row[2] = enterprise.getOrgName();
        
        model.addRow(row);



   }
    }
    }
    
    
    private void displayComboBox() {
        cbNetwork.removeAllItems();



       for (Network network : ecosystem.getNetworkList()) {
            cbNetwork.addItem(network);
        }



       for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            cbEnterpriseType.addItem(type);
        }



}}