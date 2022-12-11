/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Enterprise;

import Business.Organizations.MulticulturalOrganization;
import Business.Organizations.Organization;
import Business.Organizations.RealtorOrganization;
import Business.Organizations.UniversityOrganization;
import Business.Roles.CommunityCulturalAidRole;
import Business.Roles.UniversityDirectorRole;
import Business.SendEmail.SendEmail;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdvisingRequest;
import Business.WorkQueue.CommunityRequest;
import Business.WorkQueue.HousingRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author arfinansari
 */
public class UniversityWorkAreaJPanel extends javax.swing.JPanel {
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Organization organization;
    private SendEmail sendEmail;

    /**
     * Creates new form CommunityWorkAreaJPanel
     */
    public UniversityWorkAreaJPanel() {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        uniEmpWelcomeTxt.setText("Welcome " + userAccount.getEmployee().getName() + "!");
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
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        uniSearchBarTxt = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        AcceptRequestCM = new javax.swing.JButton();
        declineRequestCM = new javax.swing.JButton();
        lblPL = new javax.swing.JLabel();
        lblDL = new javax.swing.JLabel();
        advisingTxt = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        universityEmployeeTbl = new javax.swing.JTable();
        commentTxt = new javax.swing.JTextField();
        cbPL = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        uniSearchBtn = new javax.swing.JButton();
        clearUniSearchBtn = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        lblAssignEmployee = new javax.swing.JLabel();
        cbAssignEmployee = new javax.swing.JComboBox<>();
        btnViewUM = new javax.swing.JButton();
        uniEmpWelcomeTxt = new javax.swing.JLabel();
        lblDL1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1050, 850));
        setPreferredSize(new java.awt.Dimension(1050, 850));

        jTabbedPane2.setBackground(new java.awt.Color(224, 237, 242));
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(1070, 850));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1070, 850));

        jPanel8.setBackground(new java.awt.Color(224, 237, 242));
        jPanel8.setPreferredSize(new java.awt.Dimension(1070, 870));

        lblSearch.setText("Search Bar:");

        AcceptRequestCM.setText("Accept Request");
        AcceptRequestCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptRequestCMActionPerformed(evt);
            }
        });

        declineRequestCM.setText("Decline Request");
        declineRequestCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineRequestCMActionPerformed(evt);
            }
        });

        lblPL.setText("Priority Level");

        lblDL.setText("Comments");

        advisingTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advisingTxtActionPerformed(evt);
            }
        });

        universityEmployeeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Priority Level", "Request Date", "Status", "Student Name", "Advising Type", "Comments", "Assigned Employee", "Completed Date"
            }
        ));
        jScrollPane9.setViewportView(universityEmployeeTbl);

        commentTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commentTxtActionPerformed(evt);
            }
        });

        cbPL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P1", "P2", "P3", "P4" }));
        cbPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPLActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        uniSearchBtn.setText("Search");
        uniSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uniSearchBtnActionPerformed(evt);
            }
        });

        clearUniSearchBtn.setText("Clear Search");
        clearUniSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearUniSearchBtnActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblAssignEmployee.setText("Assign Employee");

        btnViewUM.setText("View");
        btnViewUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUMActionPerformed(evt);
            }
        });

        uniEmpWelcomeTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblDL1.setText("Advising Type");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(uniEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(AcceptRequestCM)
                                .addGap(18, 18, 18)
                                .addComponent(declineRequestCM)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewUM, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(lblSearch)
                                    .addGap(18, 18, 18)
                                    .addComponent(uniSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(uniSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearUniSearchBtn))
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lblAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(updateBtn)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDL)
                                        .addComponent(lblPL)
                                        .addComponent(lblDL1))
                                    .addGap(41, 41, 41)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(commentTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(advisingTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbPL, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(uniEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(uniSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uniSearchBtn)
                    .addComponent(clearUniSearchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptRequestCM)
                    .addComponent(declineRequestCM)
                    .addComponent(btnViewUM))
                .addGap(71, 71, 71)
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
                    .addComponent(advisingTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDL1))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commentTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDL))
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addGap(69, 69, 69))
        );

        jTabbedPane2.addTab("View University Request", jPanel8);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University Work Area Panel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1047, Short.MAX_VALUE))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 751, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptRequestCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptRequestCMActionPerformed
        int selectedRowIndex = universityEmployeeTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Accepted")) {
            JOptionPane.showMessageDialog(this, "Request has already been accepted, please make a new selection.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "Request has already been assigned.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("In Progress")) {
            JOptionPane.showMessageDialog(this, "Request is already in progress.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Submitted")) {

            AdvisingRequest advisingRequest = (AdvisingRequest) ((UniversityOrganization)organization).getWorkQueue().getWorkQueueList().get(selectedRowIndex);
            advisingRequest.setStatus("Accepted");

            JOptionPane.showMessageDialog(this, "The request has been successfully accepted.");

        }
        populateTable();
    }//GEN-LAST:event_AcceptRequestCMActionPerformed

    private void declineRequestCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineRequestCMActionPerformed
        int selectedRowIndex = universityEmployeeTbl.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was already canceled, please make a new selection.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request was already completed, can no longer be canceled.");
        }

        else if(selectedRowIndex >0){
            int dialogInput = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you would like to decline the request?", "Decline Request", dialogInput);
            if (dialogResult == 0) {

                AdvisingRequest advisingRequest = (AdvisingRequest) ((UniversityOrganization)organization).getWorkQueue().getWorkQueueList().get(selectedRowIndex);
                advisingRequest.setStatus("Canceled");
                JOptionPane.showMessageDialog(this, "The request has been declined and marked as canceled.");

            }
            else{

            }
        }
        populateTable();
    }//GEN-LAST:event_declineRequestCMActionPerformed

    private void advisingTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advisingTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_advisingTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRowIndex = universityEmployeeTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) universityEmployeeTbl.getModel();
            AdvisingRequest advisingRequest = (AdvisingRequest) model.getValueAt(selectedRowIndex, 0);

            advisingRequest.setPriorityLevel(cbPL.getSelectedItem().toString());
            advisingRequest.setAdvisingType(advisingTxt.getText());
            advisingRequest.setComments(commentTxt.getText());

            JOptionPane.showMessageDialog(this, "Request has been updated.");
        }

       
        cbPL.setName("");
        advisingTxt.setText("");
        commentTxt.setText("");

        populateTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void uniSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uniSearchBtnActionPerformed
        String s = uniSearchBarTxt.getText();
        newComFilter(s);
    }//GEN-LAST:event_uniSearchBtnActionPerformed

    private void clearUniSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearUniSearchBtnActionPerformed
        String s = ("");
        newComFilter(s);
        uniSearchBarTxt.setText("");
    }//GEN-LAST:event_clearUniSearchBtnActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = universityEmployeeTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Submitted")) {
            JOptionPane.showMessageDialog(this, "Please accept the request before proceeding.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("In Progress")) {
            JOptionPane.showMessageDialog(this, "Request is already in progress.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "Request has already been assigned.");
        }

        else if(universityEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Accepted")) {

            AdvisingRequest advisingRequest = (AdvisingRequest) ((MulticulturalOrganization)organization).getWorkQueue().getWorkQueueList().get(selectedRowIndex);

            String employeeName = cbAssignEmployee.getSelectedItem().toString();
            UserAccount userAccount1 = ((MulticulturalOrganization)organization).getUserAccountDirectory().findUserAccount(employeeName);
            advisingRequest.setReceiver(userAccount1);
            advisingRequest.setStatus("Assigned");
            userAccount1.getWorkQueue().addRequestToQueue(advisingRequest);

            JOptionPane.showMessageDialog(this, "The request has been successfully assigned.");

        }

        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnViewUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUMActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = universityEmployeeTbl.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) universityEmployeeTbl.getModel();
        AdvisingRequest advisingRequest = (AdvisingRequest) model.getValueAt(selectedRowIndex, 0);

        cbPL.setName(String.valueOf(advisingRequest.getPriorityLevel()));
        advisingTxt.setText(String.valueOf(advisingRequest.getAdvisingType()));
        commentTxt.setText(String.valueOf(advisingRequest.getComments()));
        if(advisingRequest.getReceiver() != null){
            cbAssignEmployee.setSelectedItem(advisingRequest.getReceiver().getEmployee().getName());
        }else{
            cbAssignEmployee.setSelectedItem("");
        }
        cbPL.setSelectedItem(advisingRequest.getPriorityLevel());
    }//GEN-LAST:event_btnViewUMActionPerformed

    private void cbPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPLActionPerformed

    private void commentTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentTxtActionPerformed

    public void newComFilter(String s) {
        DefaultTableModel model = (DefaultTableModel) universityEmployeeTbl.getModel();
        TableRowSorter<DefaultTableModel> t = new TableRowSorter<DefaultTableModel>(model);
        universityEmployeeTbl.setRowSorter(t);
        t.setRowFilter(RowFilter.regexFilter(s));

    }
    
    private void displayEmployeesInCombo(){
       
    for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()){
         if(userAccount.getRole() instanceof UniversityDirectorRole) cbAssignEmployee.addItem(userAccount.getEmployee().getName());
     }
}
    
    
    private void populateTable() {
     DefaultTableModel model = (DefaultTableModel) universityEmployeeTbl.getModel();
        model.setRowCount(0);
           
        universityEmployeeTbl.setAutoCreateRowSorter(true);
        
        for (WorkRequest request : ((MulticulturalOrganization) organization).getWorkQueue().getWorkQueueList()) {
            Object[] row = new Object[8];
            row[0] = ((AdvisingRequest) request);
            row[1] = ((AdvisingRequest) request).getDateOfRequest();
            row[2] = ((AdvisingRequest) request).getStatus();
            row[3] = ((AdvisingRequest) request).getSender().getStudent().getName();
            row[4] = ((AdvisingRequest) request).getAdvisingType();
            row[5] = ((AdvisingRequest) request).getComments();
            if(request.getStatus().equals("Assigned")){
                row[6] = ((AdvisingRequest) request).getReceiver().getEmployee().getName();
            }
            else if(request.getStatus().equals("Completed")){
                row[6] = ((AdvisingRequest) request).getReceiver().getEmployee().getName();
            }else{
                row[6] = "";
            }
            if(request.getStatus().equals("Completed")){
            row[7] = ((AdvisingRequest) request).getDateResolved();
            }
            else{
            row[7] = "";
            }
            
            model.addRow(row);
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptRequestCM;
    private javax.swing.JTextField advisingTxt;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnViewUM;
    private javax.swing.JComboBox<String> cbAssignEmployee;
    private javax.swing.JComboBox<String> cbPL;
    private javax.swing.JButton clearUniSearchBtn;
    private javax.swing.JTextField commentTxt;
    private javax.swing.JButton declineRequestCM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblAssignEmployee;
    private javax.swing.JLabel lblDL;
    private javax.swing.JLabel lblDL1;
    private javax.swing.JLabel lblPL;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel uniEmpWelcomeTxt;
    private javax.swing.JTextField uniSearchBarTxt;
    private javax.swing.JButton uniSearchBtn;
    private javax.swing.JTable universityEmployeeTbl;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    
}