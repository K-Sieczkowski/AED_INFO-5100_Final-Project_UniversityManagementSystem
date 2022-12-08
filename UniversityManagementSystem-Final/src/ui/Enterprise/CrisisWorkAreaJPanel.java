/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Enterprise;
import Business.Organizations.FireDepartmentOrganization;
import Business.Organizations.Organization;
import Business.SendEmail.SendEmail;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdvisingRequest;
import Business.WorkQueue.CommunityRequest;
import Business.WorkQueue.EmergencyRequest;
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
public class CrisisWorkAreaJPanel extends javax.swing.JPanel {
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Organization organization;
    private SendEmail sendEmail;
    /**
     * Creates new form CrisisJPanel
     */
    public CrisisWorkAreaJPanel() {
        initComponents(); 
    }

    public CrisisWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization) {
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        uniEmpWelcomeTxt.setText("Welcome " + userAccount.getEmployee().getName() + " !");
        populateEmergencyTable(); 
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
        jPanel2 = new javax.swing.JPanel();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        lblEmergencyType = new javax.swing.JLabel();
        lblPT = new javax.swing.JLabel();
        lblComment = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        hospitalSearchBarTxt = new javax.swing.JTextField();
        hospitalSearchBtn = new javax.swing.JButton();
        clearHospitalSearchBtn = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        crisisTbl = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        uniEmpWelcomeTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jTabbedPane1.setBackground(new java.awt.Color(224, 237, 242));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1070, 850));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1070, 850));

        jPanel2.setBackground(new java.awt.Color(224, 237, 242));
        jPanel2.setPreferredSize(new java.awt.Dimension(1070, 850));

        viewButton.setText("Accept Request");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Decline Request");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        lblEmergencyType.setText("Emergency Type:");

        lblPT.setText("Priority Type:");

        lblComment.setText("Comments:");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel39.setText("Search Bar:");

        hospitalSearchBtn.setText("Search");
        hospitalSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalSearchBtnActionPerformed(evt);
            }
        });

        clearHospitalSearchBtn.setText("Clear Search");
        clearHospitalSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearHospitalSearchBtnActionPerformed(evt);
            }
        });

        crisisTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Emergency Type", "Request Date", "Status", "Student Name", "Priority Level", "Comments", "Assigned Employee", "Completed Date"
            }
        ));
        jScrollPane1.setViewportView(crisisTbl);

        jScrollPane10.setViewportView(jScrollPane1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Re-Exam", "Emergency Travel", "Accidents" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critical", "High", "Medium", "Low" }));

        uniEmpWelcomeTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uniEmpWelcomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        uniEmpWelcomeTxt.setText("WELCOME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateBtn)
                .addGap(452, 452, 452))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(viewButton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel39)
                                    .addGap(18, 18, 18)
                                    .addComponent(hospitalSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hospitalSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearHospitalSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblEmergencyType, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblPT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblComment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 409, Short.MAX_VALUE)
                                    .addComponent(txtComment, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(uniEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(uniEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(hospitalSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalSearchBtn)
                    .addComponent(clearHospitalSearchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(deleteButton))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmergencyType, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComment, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(updateBtn)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Emergency Cases", jPanel2);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crisis Work Area");

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
    
    private void clearHospitalSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearHospitalSearchBtnActionPerformed
        String s = ("");
        newCrisisEmpFilter(s);
        hospitalSearchBarTxt.setText("");
    }//GEN-LAST:event_clearHospitalSearchBtnActionPerformed

    private void hospitalSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalSearchBtnActionPerformed
        String s = hospitalSearchBarTxt.getText();
        newCrisisEmpFilter(s);
    }//GEN-LAST:event_hospitalSearchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
      int selectedRowIndex = crisisTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) crisisTbl.getModel();
        
            cbPL.setSelectedItem(null);
            cbET.setSelectedItem(null);
          DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Priority Level");
        tableModel.addColumn("Emergency Type");
        tableModel.addColumn("Comment");
        
        JOptionPane.showMessageDialog(this, "Request has been updated.");

        cbPL.setName("");
        cbET.setName("");
        txtCommentA.setText("");

        populateEmergencyTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRowIndex = crisisTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
       // DefaultTableModel model = (DefaultTableModel) communityTbl.getModel();
        else if (crisisTbl.getValueAt(selectedRowIndex, 0) != null) {

        JOptionPane.showMessageDialog(this, "Selection has been Declined.");
        }
        populateEmergencyTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
          int selectedRow = crisisTbl.getSelectedRow();
        EmergencyRequest emergencyRequest = (EmergencyRequest) userAccount.getWorkQueue().getWorkQueueList().get(selectedRow);

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        else if (crisisTbl.getValueAt(selectedRow, 6) != null) {

            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }

        else if (crisisTbl.getValueAt(selectedRow, 2).equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "Request has already been assigned.");
        }

        else if (crisisTbl.getValueAt(selectedRow, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }

        else if (crisisTbl.getValueAt(selectedRow, 2).equals("In Progress")) {
            emergencyRequest.setStatus("Assigned");
        }

        populateEmergencyTable();
    }//GEN-LAST:event_viewButtonActionPerformed

    public void newCrisisEmpFilter(String s) {
        DefaultTableModel model = (DefaultTableModel) crisisTbl.getModel();
        TableRowSorter<DefaultTableModel> t = new TableRowSorter<DefaultTableModel>(model);
        crisisTbl.setRowSorter(t);
        t.setRowFilter(RowFilter.regexFilter(s));

    }

    public SendEmail getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(SendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearHospitalSearchBtn;
    private javax.swing.JTable crisisTbl;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField hospitalSearchBarTxt;
    private javax.swing.JButton hospitalSearchBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblEmergencyType;
    private javax.swing.JLabel lblPT;
    private javax.swing.JTextField txtComment;
    private javax.swing.JLabel uniEmpWelcomeTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    private void populateEmergencyTable() {
     DefaultTableModel model = (DefaultTableModel) crisisTbl.getModel();
        model.setRowCount(0);
        
        FireDepartmentOrganization crisisOrg = (FireDepartmentOrganization) organization;
        
        for (WorkRequest request : crisisOrg.getWorkQueue().getWorkQueueList()) {
            Object[] row = new Object[7];
            row[0] = ((EmergencyRequest) request);
            row[1] = ((EmergencyRequest) request).getDateOfRequest();
            row[2] = ((EmergencyRequest) request).getStatus();
            row[3] = ((EmergencyRequest) request).getSender().getStudent().getName();
            row[4] = ((EmergencyRequest) request).getEmergencyType();
            row[5] = ((EmergencyRequest) request).getComments();
            if(request.getStatus().equals("Completed")){
            row[6] = ((EmergencyRequest) request).getDateResolved();
            }
            else{
            row[6] = ""; 
            }
            
            model.addRow(row);
}
}}
