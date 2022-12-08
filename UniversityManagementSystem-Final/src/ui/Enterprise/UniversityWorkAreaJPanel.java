/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Enterprise;


import Business.Organizations.Organization;
import Business.Organizations.UniversityOrganization;
import Business.SendEmail.SendEmail;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdvisingRequest;
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
public class UniversityWorkAreaJPanel extends javax.swing.JPanel {
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Organization organization;
    private SendEmail sendEmail;
    /**
     * Creates new form UniversityJPanel
     */
    public UniversityWorkAreaJPanel() {
        initComponents();
     
    }

   public UniversityWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization) {
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        uniEmpWelcomeTxt.setText("Welcome " + userAccount.getEmployee().getName() + " !");
        populateUniversityTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPViewUniversity = new javax.swing.JPanel();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        lblPL = new javax.swing.JLabel();
        lblAT = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        comSearchBarTxt = new javax.swing.JTextField();
        hospitalSearchBtn = new javax.swing.JButton();
        clearHospitalSearchBtn = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        universityTbl = new javax.swing.JTable();
        cbAT = new javax.swing.JComboBox<>();
        cbPL = new javax.swing.JComboBox<>();
        uniEmpWelcomeTxt = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        lblAssignEmployee = new javax.swing.JLabel();
        cbAssignEmployee = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("University Work Area");

        jTabbedPane1.setBackground(new java.awt.Color(224, 237, 242));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1070, 850));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1070, 850));

        jPViewUniversity.setBackground(new java.awt.Color(224, 237, 242));
        jPViewUniversity.setPreferredSize(new java.awt.Dimension(1070, 850));

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

        lblPL.setText("Priority Level");

        lblAT.setText("Advising Type");

        lblComments.setText("Comments:");

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

        universityTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Priority Level", "Request Date", "Status", "Student Name", "Advising Type", "Comments", "Assigned Employee", "Completed Date"
            }
        ));
        jScrollPane1.setViewportView(universityTbl);

        jScrollPane10.setViewportView(jScrollPane1);

        cbAT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Re-Exam", "Emergency Travel", "Accidents" }));

        cbPL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critical", "High", "Medium", "Low" }));

        uniEmpWelcomeTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        uniEmpWelcomeTxt.setForeground(new java.awt.Color(255, 255, 255));
        uniEmpWelcomeTxt.setText("WELCOME");

        javax.swing.GroupLayout jPViewUniversityLayout = new javax.swing.GroupLayout(jPViewUniversity);
        jPViewUniversity.setLayout(jPViewUniversityLayout);
        jPViewUniversityLayout.setHorizontalGroup(
            jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPViewUniversityLayout.createSequentialGroup()
                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPViewUniversityLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPViewUniversityLayout.createSequentialGroup()
                                .addComponent(viewButton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPViewUniversityLayout.createSequentialGroup()
                                    .addComponent(jLabel39)
                                    .addGap(18, 18, 18)
                                    .addComponent(comSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hospitalSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearHospitalSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPViewUniversityLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPViewUniversityLayout.createSequentialGroup()
                                        .addComponent(lblComments, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))
                                    .addGroup(jPViewUniversityLayout.createSequentialGroup()
                                        .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAT, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPL, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58)))
                                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbAT, javax.swing.GroupLayout.Alignment.LEADING, 0, 409, Short.MAX_VALUE)
                                    .addComponent(txtComments, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPL, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        btnAssign.setText("Assign");

        lblAssignEmployee.setText("Assign Employee");

        cbAssignEmployee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPViewUniversityLayout = new javax.swing.GroupLayout(jPViewUniversity);
        jPViewUniversity.setLayout(jPViewUniversityLayout);
        jPViewUniversityLayout.setHorizontalGroup(
            jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPViewUniversityLayout.createSequentialGroup()
                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPViewUniversityLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPViewUniversityLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPViewUniversityLayout.createSequentialGroup()
                                        .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAT, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPL, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPViewUniversityLayout.createSequentialGroup()
                                        .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblComments, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblAssignEmployee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)))
                                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbAT, javax.swing.GroupLayout.Alignment.LEADING, 0, 409, Short.MAX_VALUE)
                                    .addComponent(txtComments, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPL, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPViewUniversityLayout.createSequentialGroup()
                                        .addComponent(cbAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAssign))))
                            .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPViewUniversityLayout.createSequentialGroup()
                                    .addComponent(viewButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPViewUniversityLayout.createSequentialGroup()
                                    .addComponent(jLabel39)
                                    .addGap(18, 18, 18)
                                    .addComponent(comSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hospitalSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearHospitalSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPViewUniversityLayout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(updateBtn))
                    .addGroup(jPViewUniversityLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(uniEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPViewUniversityLayout.setVerticalGroup(
            jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPViewUniversityLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(uniEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(comSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hospitalSearchBtn)
                    .addComponent(clearHospitalSearchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(deleteButton))
                .addGap(47, 47, 47)
                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPViewUniversityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComments, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(updateBtn)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View University Cases", jPViewUniversity);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
      int selectedRow = universityTbl.getSelectedRow();
        AdvisingRequest advisingRequest = (AdvisingRequest) userAccount.getWorkQueue().getWorkQueueList().get(selectedRow);

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        else if (universityTbl.getValueAt(selectedRow, 6) != null) {

            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }

        else if (universityTbl.getValueAt(selectedRow, 2).equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "Request has already been assigned.");
        }

        else if (universityTbl.getValueAt(selectedRow, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }

        else if (universityTbl.getValueAt(selectedRow, 2).equals("In Progress")) {
            advisingRequest.setStatus("Assigned");
        }

        populateUniversityTable();
    }//GEN-LAST:event_viewButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
       int selectedRowIndex = universityTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
       // DefaultTableModel model = (DefaultTableModel) communityTbl.getModel();
        else if (universityTbl.getValueAt(selectedRowIndex, 0) != null) {

        JOptionPane.showMessageDialog(this, "Selection has been Declined.");
        }
        populateUniversityTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRowIndex = universityTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) universityTbl.getModel();
        
            cbPL.setSelectedItem(null);
            cbAT.setSelectedItem(null);
            txtComments.setText("");
          DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Priority Level");
        tableModel.addColumn("Advising Type");
        tableModel.addColumn("Comment");
        
        JOptionPane.showMessageDialog(this, "Community has been updated.");

        cbPL.setName("");
        cbAT.setName("");
        txtComments.setText("");

        populateUniversityTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void hospitalSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalSearchBtnActionPerformed
        String s = comSearchBarTxt.getText();
        newUniversityEmpFilter(s);
    }//GEN-LAST:event_hospitalSearchBtnActionPerformed

    private void clearHospitalSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearHospitalSearchBtnActionPerformed
        String s = ("");
        newUniversityEmpFilter(s);
        comSearchBarTxt.setText("");
    }//GEN-LAST:event_clearHospitalSearchBtnActionPerformed
       public void newUniversityEmpFilter(String s) {
        DefaultTableModel model = (DefaultTableModel) universityTbl.getModel();
        TableRowSorter<DefaultTableModel> t = new TableRowSorter<DefaultTableModel>(model);
        universityTbl.setRowSorter(t);
        t.setRowFilter(RowFilter.regexFilter(s));
    }

    public SendEmail getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(SendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAT;
    private javax.swing.JComboBox<String> cbPL;
    private javax.swing.JButton clearHospitalSearchBtn;
    private javax.swing.JTextField comSearchBarTxt;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton hospitalSearchBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPViewUniversity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAT;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblPL;
    private javax.swing.JTextField txtComments;
    private javax.swing.JLabel uniEmpWelcomeTxt;
    private javax.swing.JTable universityTbl;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables

    private void populateUniversityTable() {
        DefaultTableModel model = (DefaultTableModel) universityTbl.getModel();
        model.setRowCount(0);
        
        UniversityOrganization universityOrg = (UniversityOrganization) organization;
        
        for (WorkRequest request : universityOrg.getWorkQueue().getWorkQueueList()) {
            Object[] row = new Object[7];
            row[0] = ((AdvisingRequest) request);
            row[1] = ((AdvisingRequest) request).getDateOfRequest();
            row[2] = ((AdvisingRequest) request).getStatus();
            row[3] = ((AdvisingRequest) request).getSender().getStudent().getName();
            row[4] = ((AdvisingRequest) request).getAdvisingType();
            row[5] = ((AdvisingRequest) request).getComments();
            if(request.getStatus().equals("Completed")){
            row[6] = ((AdvisingRequest) request).getDateResolved();
            }
            else{
            row[6] = ""; 
            }
            
            model.addRow(row);
    }
    }
}
