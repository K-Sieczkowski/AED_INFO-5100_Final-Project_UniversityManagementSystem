/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Enterprise;

import Business.Organizations.HospitalOrganization;
import Business.Organizations.Organization;
import Business.SendEmail.SendEmail;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CommunityRequest;
import Business.WorkQueue.HealthRequest;
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
public class TherapistWorkAreaJPanel extends javax.swing.JPanel {
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Organization organization;
    private SendEmail sendEmail;
    /**
     * Creates new form WellbeingJPanel
     */
    public TherapistWorkAreaJPanel() {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        uniEmpWelcomeTxt.setText("Welcome " + userAccount.getEmployee().getName() + " !");
        populateTable();
    }

   public TherapistWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization) {
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        uniEmpWelcomeTxt.setText("Welcome " + userAccount.getEmployee().getName() + " !");
        populateTable();
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
        jPanel6 = new javax.swing.JPanel();
        viewPatientBtn = new javax.swing.JButton();
        deletePatientBtn = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        comSearchBarTxt = new javax.swing.JTextField();
        patientSearchBtn = new javax.swing.JButton();
        clearPatientSearchBtn = new javax.swing.JButton();
        lblRT = new javax.swing.JLabel();
        lblPL = new javax.swing.JLabel();
        lblRD = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        txtCommentsA = new javax.swing.JTextField();
        patientUpdateBtn = new javax.swing.JButton();
        cbRT = new javax.swing.JComboBox<>();
        cbPL = new javax.swing.JComboBox<>();
        DCRD = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWellbeing = new javax.swing.JTable();
        uniEmpWelcomeTxt = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        lblAssignEmployee = new javax.swing.JLabel();
        cbAssignEmployee = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jTabbedPane1.setBackground(new java.awt.Color(224, 237, 242));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1070, 850));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1070, 850));

        jPanel6.setBackground(new java.awt.Color(224, 237, 242));
        jPanel6.setPreferredSize(new java.awt.Dimension(1070, 704));

        viewPatientBtn.setText("Accept Request");
        viewPatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientBtnActionPerformed(evt);
            }
        });

        deletePatientBtn.setText("Decline Request");
        deletePatientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePatientBtnActionPerformed(evt);
            }
        });

        jLabel38.setText("Search Bar:");

        comSearchBarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comSearchBarTxtActionPerformed(evt);
            }
        });

        patientSearchBtn.setText("Search");
        patientSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientSearchBtnActionPerformed(evt);
            }
        });

        clearPatientSearchBtn.setText("Clear Search");
        clearPatientSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPatientSearchBtnActionPerformed(evt);
            }
        });

        lblRT.setText("Request Type:");

        lblPL.setText("Priority Level:");

        lblRD.setText("Request Date:");

        lblComments.setText("Comments:");

        patientUpdateBtn.setText("Update");
        patientUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientUpdateBtnActionPerformed(evt);
            }
        });

        cbRT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Therapy", "Emergency Admit", " " }));

        cbPL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critical", "High", "Medium", "Low" }));

        tblWellbeing.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Priority Level", "Request Date", "Status", "Student Name", "Request Type", "Comment", "Assigned Employee", "Completed Date"
            }
        ));
        jScrollPane1.setViewportView(tblWellbeing);

        uniEmpWelcomeTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uniEmpWelcomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        uniEmpWelcomeTxt.setText("WELCOME");

        btnAssign.setText("Assign");

        lblAssignEmployee.setText("Assign Employee");

        cbAssignEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(lblRD)
                                    .addContainerGap(867, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(lblComments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(patientUpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(384, 384, 384))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPL)
                                .addComponent(lblRT))
                            .addComponent(lblAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(cbAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btnAssign))
                            .addComponent(DCRD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPL, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCommentsA, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRT, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(uniEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(viewPatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deletePatientBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel38)
                                    .addGap(18, 18, 18)
                                    .addComponent(comSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(45, 45, 45)
                                    .addComponent(patientSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearPatientSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearPatientSearchBtn)
                            .addComponent(patientSearchBtn)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(uniEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(comSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPatientBtn)
                    .addComponent(deletePatientBtn))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssignEmployee)
                    .addComponent(cbAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRT)
                    .addComponent(cbRT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPL)
                    .addComponent(cbPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRD)
                    .addComponent(DCRD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCommentsA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(patientUpdateBtn)
                .addGap(60, 60, 60))
        );

        jTabbedPane1.addTab("View Health Request", jPanel6);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Therapist Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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

    private void viewPatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientBtnActionPerformed
   int selectedRow = tblWellbeing.getSelectedRow();
        HealthRequest healthRequest = (HealthRequest) userAccount.getWorkQueue().getWorkQueueList().get(selectedRow);

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        else if (tblWellbeing.getValueAt(selectedRow, 6) != null) {

            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }

        else if (tblWellbeing.getValueAt(selectedRow, 2).equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "Request has already been assigned.");
        }

        else if (tblWellbeing.getValueAt(selectedRow, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }

        else if (tblWellbeing.getValueAt(selectedRow, 2).equals("In Progress")) {
            healthRequest.setStatus("Assigned");
        }

        populateTable();
    }//GEN-LAST:event_viewPatientBtnActionPerformed

    private void deletePatientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePatientBtnActionPerformed
        int selectedRowIndex = tblWellbeing.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
       // DefaultTableModel model = (DefaultTableModel) communityTbl.getModel();
        else if (tblWellbeing.getValueAt(selectedRowIndex, 0) != null) {

        JOptionPane.showMessageDialog(this, "Selection has been Declined.");
        }
        populateTable();
    }//GEN-LAST:event_deletePatientBtnActionPerformed

    private void comSearchBarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comSearchBarTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comSearchBarTxtActionPerformed

    private void patientSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientSearchBtnActionPerformed
        String s = comSearchBarTxt.getText();
        newWellbeingEmpFilter(s);
    }//GEN-LAST:event_patientSearchBtnActionPerformed

    private void clearPatientSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPatientSearchBtnActionPerformed
        String s = ("");
        newWellbeingEmpFilter(s);
        comSearchBarTxt.setText("");
    }//GEN-LAST:event_clearPatientSearchBtnActionPerformed

    private void patientUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientUpdateBtnActionPerformed
      int selectedRowIndex = tblWellbeing.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblWellbeing.getModel();
        
            cbPL.setSelectedItem(null);
            cbRT.setSelectedItem(null);
            DCRD.setDateFormatString("");
            txtCommentsA.setText("");
          DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Priority Level");
        tableModel.addColumn("Request Type");
        tableModel.addColumn("Request Date");
        tableModel.addColumn("Comment");
        
        JOptionPane.showMessageDialog(this, "Details has been updated.");

        cbPL.setName("");
        cbRT.setName("");
        DCRD.setName("");
        txtCommentsA.setText("");

        populateTable();
    }//GEN-LAST:event_patientUpdateBtnActionPerformed
public void newWellbeingEmpFilter(String s) {
        DefaultTableModel model = (DefaultTableModel) tblWellbeing.getModel();
        TableRowSorter<DefaultTableModel> t = new TableRowSorter<DefaultTableModel>(model);
        tblWellbeing.setRowSorter(t);
        t.setRowFilter(RowFilter.regexFilter(s));
    }

    public SendEmail getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(SendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DCRD;
    private javax.swing.JButton btnAssign;
    private javax.swing.JComboBox<String> cbAssignEmployee;
    private javax.swing.JComboBox<String> cbPL;
    private javax.swing.JComboBox<String> cbRT;
    private javax.swing.JButton clearPatientSearchBtn;
    private javax.swing.JTextField comSearchBarTxt;
    private javax.swing.JButton deletePatientBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAssignEmployee;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblPL;
    private javax.swing.JLabel lblRD;
    private javax.swing.JLabel lblRT;
    private javax.swing.JButton patientSearchBtn;
    private javax.swing.JButton patientUpdateBtn;
    private javax.swing.JTable tblWellbeing;
    private javax.swing.JTextField txtCommentsA;
    private javax.swing.JLabel uniEmpWelcomeTxt;
    private javax.swing.JButton viewPatientBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
      DefaultTableModel model = (DefaultTableModel) tblWellbeing.getModel();
        model.setRowCount(0);
        
        HospitalOrganization hospitalOrg = (HospitalOrganization) organization;
        
        for (WorkRequest request : hospitalOrg.getWorkQueue().getWorkQueueList()) {
            Object[] row = new Object[7];
            row[0] = ((HealthRequest) request);
            row[1] = ((HealthRequest) request).getDateOfRequest();
            row[2] = ((HealthRequest) request).getStatus();
            row[3] = ((HealthRequest) request).getSender().getStudent().getName();
            row[4] = ((HealthRequest) request).getRequestType();
            row[5] = ((HealthRequest) request).getComments();
            if(request.getStatus().equals("Completed")){
            row[6] = ((HealthRequest) request).getDateResolved();
            }
            else{
            row[6] = ""; 
            }
            
            model.addRow(row);
    }
    }
}
