/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Enterprise;

import Business.Organizations.Organization;
import Business.Organizations.RealtorOrganization;
import Business.Roles.RealEstateAgentRole;
import Business.SendEmail.SendEmail;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HousingRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.net.URL;
import java.awt.Desktop;
/**
 *
 * @author arfinansari
 */
public class HousingWorkAreaJPanel extends javax.swing.JPanel {
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Organization organization;
    private SendEmail sendEmail;
    /**
     * Creates new form HospitalJPanel
     */

   public HousingWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization) {
       initComponents(); 
       this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        houEmpWelcomeTxt.setText("Welcome " + userAccount.getEmployee().getName() + "!");
        populateTable();
        displayEmployeesInCombo();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        houSearchBarTxt = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        AcceptRequestHM = new javax.swing.JButton();
        declineRequestHM = new javax.swing.JButton();
        lblPL = new javax.swing.JLabel();
        lblMP = new javax.swing.JLabel();
        lblDL = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        txtMP = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        housingEmployeeTbl = new javax.swing.JTable();
        txtComments = new javax.swing.JTextField();
        cbPL = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        houEmpWelcomeTxt = new javax.swing.JLabel();
        houSearchBtn = new javax.swing.JButton();
        clearHouSearchBtn = new javax.swing.JButton();
        btnMap = new javax.swing.JButton();
        txtDL1 = new javax.swing.JTextField();
        btnAssign = new javax.swing.JButton();
        lblAssignEmployee = new javax.swing.JLabel();
        cbAssignEmployee = new javax.swing.JComboBox<>();
        btnViewHM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setMinimumSize(new java.awt.Dimension(1050, 1050));
        setPreferredSize(new java.awt.Dimension(1050, 850));

        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 850));

        jTabbedPane1.setBackground(new java.awt.Color(224, 237, 242));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1070, 850));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1070, 850));

        jPanel8.setBackground(new java.awt.Color(224, 237, 242));
        jPanel8.setPreferredSize(new java.awt.Dimension(1070, 870));

        lblSearch.setText("Search Bar:");

        AcceptRequestHM.setText("Accept Request");
        AcceptRequestHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptRequestHMActionPerformed(evt);
            }
        });

        declineRequestHM.setText("Decline Request");
        declineRequestHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineRequestHMActionPerformed(evt);
            }
        });

        lblPL.setText("Priority Level:");

        lblMP.setText("Max Price:");

        lblDL.setText("Desired Location:");

        lblComments.setText("Comments:");

        txtMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMPActionPerformed(evt);
            }
        });

        housingEmployeeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Priority Level", "Request Date", "Status", "Student Name", "Max Price", "Desired Location", "Comments", "Assigned Employee", "Completed Date"
            }
        ));
        jScrollPane9.setViewportView(housingEmployeeTbl);

        txtComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentsActionPerformed(evt);
            }
        });

        cbPL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P1", "P2", "P3", "P4" }));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        houEmpWelcomeTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        houSearchBtn.setText("Search");
        houSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houSearchBtnActionPerformed(evt);
            }
        });

        clearHouSearchBtn.setText("Clear Search");
        clearHouSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearHouSearchBtnActionPerformed(evt);
            }
        });

        btnMap.setText("Lookup MAP");
        btnMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapActionPerformed(evt);
            }
        });

        txtDL1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDL1ActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblAssignEmployee.setText("Assign Employee");

        btnViewHM.setText("View");
        btnViewHM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(houEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(466, 466, 466))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDL)
                                    .addComponent(lblMP)
                                    .addComponent(lblPL)
                                    .addComponent(lblComments))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtComments, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMP, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDL1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPL, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn))
                        .addGap(18, 18, 18)
                        .addComponent(btnMap))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                            .addComponent(lblAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(495, 495, 495)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(136, 136, 136))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(AcceptRequestHM)
                                    .addGap(18, 18, 18)
                                    .addComponent(declineRequestHM)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnViewHM, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(lblSearch)
                                    .addGap(18, 18, 18)
                                    .addComponent(houSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(houSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearHouSearchBtn))
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(houEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(houSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(houSearchBtn)
                    .addComponent(clearHouSearchBtn))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptRequestHM)
                    .addComponent(declineRequestHM)
                    .addComponent(btnViewHM))
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssignEmployee)
                    .addComponent(cbAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPL))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMP))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDL1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMap))
                    .addComponent(lblDL))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComments)
                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Housing Request", jPanel8);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Housing Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1096, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jSeparator2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1043, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(731, 731, 731))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptRequestHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptRequestHMActionPerformed
   int selectedRowIndex = housingEmployeeTbl.getSelectedRow();
      
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }



       else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Accepted")) {
            JOptionPane.showMessageDialog(this, "Request has already been accepted, please make a new selection.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "Request has already been assigned.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("In Progress")) {
            JOptionPane.showMessageDialog(this, "Request is already in progress.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Submitted")) {
        
        HousingRequest housingRequest = (HousingRequest) ((RealtorOrganization)organization).getWorkQueue().getWorkQueueList().get(selectedRowIndex);
        housingRequest.setStatus("Accepted");
        
        JOptionPane.showMessageDialog(this, "The request has been successfully accepted.");
          
        
        }
        populateTable();
    }//GEN-LAST:event_AcceptRequestHMActionPerformed

    private void declineRequestHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineRequestHMActionPerformed
   int selectedRowIndex = housingEmployeeTbl.getSelectedRow();
       if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was already canceled, please make a new selection.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request was already completed, can no longer be canceled.");
        }
        
        else if(selectedRowIndex >0){
            int dialogInput = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you would like to decline the request?", "Decline Request", dialogInput);
            if (dialogResult == 0) {
            
            HousingRequest housingRequest = (HousingRequest) ((RealtorOrganization)organization).getWorkQueue().getWorkQueueList().get(selectedRowIndex);
            housingRequest.setStatus("Canceled");
            JOptionPane.showMessageDialog(this, "The request has been declined and marked as canceled.");
        
        }
            else{
                
            }
        } 
        populateTable();      
    }//GEN-LAST:event_declineRequestHMActionPerformed

    private void txtMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMPActionPerformed

    private void txtCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentsActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
    int selectedRowIndex = housingEmployeeTbl.getSelectedRow();



       if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }



   try{
        DefaultTableModel model = (DefaultTableModel) housingEmployeeTbl.getModel();
        HousingRequest housingRequest = (HousingRequest) model.getValueAt(selectedRowIndex, 0);



       housingRequest.setPriorityLevel(cbPL.getSelectedItem().toString());
        housingRequest.setMaxPrice(Double. parseDouble(txtMP.getText()));
        housingRequest.setDesiredLocation(txtDL1.getText());
        housingRequest.setComments(txtComments.getText());
        
        
        JOptionPane.showMessageDialog(this, "Request has been updated.");
        }
        
    catch (NumberFormatException e){
         JOptionPane.showMessageDialog(this, "Please enter a valid number format (i.e., 1000) in the max price field.");
        }
    
        cbPL.setName("");
        txtMP.setText("");
        txtDL1.setText("");
        txtComments.setText("");
        
       populateTable();     
    }//GEN-LAST:event_updateBtnActionPerformed

    private void houSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houSearchBtnActionPerformed
        String s = houSearchBarTxt.getText();
        newHousingEmpFilter(s);
    }//GEN-LAST:event_houSearchBtnActionPerformed

    private void clearHouSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearHouSearchBtnActionPerformed
        String s = ("");
        newHousingEmpFilter(s);
        houSearchBarTxt.setText("");
    }//GEN-LAST:event_clearHouSearchBtnActionPerformed

    private void btnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapActionPerformed
        // TODO add your handling code here:
        if(txtDL1.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Please select a row to view first.");
        }
        else try{
            Desktop.getDesktop().browse(new URL("http://maps.google.com").toURI());
        } catch (Exception e){}
        
      String locationTxt = txtDL1.getText();
      StringSelection stringSelection = new StringSelection(locationTxt);
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(stringSelection, null);
    
    }//GEN-LAST:event_btnMapActionPerformed

    private void txtDL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDL1ActionPerformed

    private void btnViewHMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHMActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = housingEmployeeTbl.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) housingEmployeeTbl.getModel();
        HousingRequest housingRequest = (HousingRequest) model.getValueAt(selectedRowIndex, 0);
        
        cbPL.setName(String.valueOf(housingRequest.getPriorityLevel()));
        txtDL1.setText(String.valueOf(housingRequest.getDesiredLocation()));
        txtMP.setText(String.valueOf(housingRequest.getMaxPrice()));
        txtComments.setText(String.valueOf(housingRequest.getComments()));
        if(housingRequest.getReceiver() != null){
        cbAssignEmployee.setSelectedItem(housingRequest.getReceiver().getEmployee().getName());
        }else{
            cbAssignEmployee.setSelectedItem("");
        }
        cbPL.setSelectedItem(housingRequest.getPriorityLevel());
    }//GEN-LAST:event_btnViewHMActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = housingEmployeeTbl.getSelectedRow();



       if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }
     
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Submitted")) {
            JOptionPane.showMessageDialog(this, "Please accept the request before proceeding.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("In Progress")) {
            JOptionPane.showMessageDialog(this, "Request is already in progress.");
        }
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "Request has already been assigned.");
        }
        
        
        else if(housingEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Accepted")) {
        
        
        HousingRequest housingRequest = (HousingRequest) ((RealtorOrganization)organization).getWorkQueue().getWorkQueueList().get(selectedRowIndex);
   
        
        String employeeName = cbAssignEmployee.getSelectedItem().toString();
        UserAccount userAccount1 = ((RealtorOrganization)organization).getUserAccountDirectory().findUserAccount(employeeName);
        housingRequest.setReceiver(userAccount1);
        housingRequest.setStatus("Assigned");
        userAccount1.getWorkQueue().addRequestToQueue(housingRequest);



        JOptionPane.showMessageDialog(this, "The request has been successfully assigned.");
            
        }
        
        populateTable();   
    }//GEN-LAST:event_btnAssignActionPerformed

        public void newHousingEmpFilter(String s) {
        DefaultTableModel model = (DefaultTableModel) housingEmployeeTbl.getModel();
        TableRowSorter<DefaultTableModel> t = new TableRowSorter<DefaultTableModel>(model);
        housingEmployeeTbl.setRowSorter(t);
        t.setRowFilter(RowFilter.regexFilter(s));

    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptRequestHM;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnMap;
    private javax.swing.JButton btnViewHM;
    private javax.swing.JComboBox<String> cbAssignEmployee;
    private javax.swing.JComboBox<String> cbPL;
    private javax.swing.JButton clearHouSearchBtn;
    private javax.swing.JButton declineRequestHM;
    private javax.swing.JLabel houEmpWelcomeTxt;
    private javax.swing.JTextField houSearchBarTxt;
    private javax.swing.JButton houSearchBtn;
    private javax.swing.JTable housingEmployeeTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAssignEmployee;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblDL;
    private javax.swing.JLabel lblMP;
    private javax.swing.JLabel lblPL;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtDL1;
    private javax.swing.JTextField txtMP;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
          DefaultTableModel model = (DefaultTableModel) housingEmployeeTbl.getModel();
        model.setRowCount(0);
           
        housingEmployeeTbl.setAutoCreateRowSorter(true);
        
        for (WorkRequest request : ((RealtorOrganization) organization).getWorkQueue().getWorkQueueList()) {
            Object[] row = new Object[9];
            row[0] = ((HousingRequest) request);
            row[1] = ((HousingRequest) request).getDateOfRequest();
            row[2] = ((HousingRequest) request).getStatus();
            row[3] = ((HousingRequest) request).getSender().getStudent().getName();
            row[4] = ((HousingRequest) request).getMaxPrice();
            row[5] = ((HousingRequest) request).getDesiredLocation();
            row[6] = ((HousingRequest) request).getComments();
            if(request.getStatus().equals("Assigned")){
                row[7] = ((HousingRequest) request).getReceiver().getEmployee().getName();
            }
            else if(request.getStatus().equals("Completed")){
                row[7] = ((HousingRequest) request).getReceiver().getEmployee().getName();
            }else{
                row[7] = "";
            }
            if(request.getStatus().equals("Completed")){
            row[8] = ((HousingRequest) request).getDateResolved();
            }
            else{
            row[8] = "";
            }
            
            model.addRow(row);
    }
    }
    private void displayEmployeesInCombo(){
       
    for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()){
         if(userAccount.getRole() instanceof RealEstateAgentRole) cbAssignEmployee.addItem(userAccount.getEmployee().getName());
     }
}
}
