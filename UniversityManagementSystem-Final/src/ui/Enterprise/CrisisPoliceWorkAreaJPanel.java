/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Enterprise;

import Business.Organizations.FireDepartmentOrganization;
import Business.Organizations.MulticulturalOrganization;
import Business.Organizations.Organization;
import Business.Organizations.PoliceOrganization;
import Business.Organizations.RealtorOrganization;
import Business.Roles.CommunityCulturalAidRole;
import Business.Roles.FireDepartmentChiefRole;
import Business.Roles.PoliceDepartmentChiefRole;
import Business.SendEmail.SendEmail;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CommunityRequest;
import Business.WorkQueue.EmergencyRequest;
import Business.WorkQueue.HousingRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author arfinansari
 */
public class CrisisPoliceWorkAreaJPanel extends javax.swing.JPanel {
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Organization organization;
    private SendEmail sendEmail;

    /**
     * Creates new form CommunityWorkAreaJPanel
     */
    public CrisisPoliceWorkAreaJPanel() {
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
        criPoliceSearchBarTxt = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        AcceptRequestCPM = new javax.swing.JButton();
        declineRequestCPM = new javax.swing.JButton();
        lblPL = new javax.swing.JLabel();
        lblDL = new javax.swing.JLabel();
        emergencyTxt = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        crisisPoliceEmployeeTbl = new javax.swing.JTable();
        commentTxt = new javax.swing.JTextField();
        cbPL = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        criPoliceSearchBtn = new javax.swing.JButton();
        clearPolSearchBtn = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        lblAssignEmployee = new javax.swing.JLabel();
        cbAssignEmployee = new javax.swing.JComboBox<>();
        btnViewCPM = new javax.swing.JButton();
        uniEmpWelcomeTxt = new javax.swing.JLabel();
        lblEmergencyType = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        btnMap = new javax.swing.JButton();
        txtDL1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1050, 850));
        setPreferredSize(new java.awt.Dimension(1050, 850));

        jTabbedPane2.setBackground(new java.awt.Color(224, 237, 242));
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(1070, 850));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1070, 850));

        jPanel8.setBackground(new java.awt.Color(224, 237, 242));
        jPanel8.setMinimumSize(new java.awt.Dimension(1050, 1050));
        jPanel8.setPreferredSize(new java.awt.Dimension(1050, 1050));

        lblSearch.setText("Search Bar:");

        AcceptRequestCPM.setText("Accept Request");
        AcceptRequestCPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptRequestCPMActionPerformed(evt);
            }
        });

        declineRequestCPM.setText("Decline Request");
        declineRequestCPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineRequestCPMActionPerformed(evt);
            }
        });

        lblPL.setText("Priority Level:");

        lblDL.setText("Comments");

        emergencyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencyTxtActionPerformed(evt);
            }
        });

        crisisPoliceEmployeeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Priority Level", "Request Date", "Status", "Student Name", "Emergency Type", "Comments", "Assigned Employee", "Completed Date"
            }
        ));
        jScrollPane9.setViewportView(crisisPoliceEmployeeTbl);

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

        criPoliceSearchBtn.setText("Search");
        criPoliceSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criPoliceSearchBtnActionPerformed(evt);
            }
        });

        clearPolSearchBtn.setText("Clear Search");
        clearPolSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearPolSearchBtnActionPerformed(evt);
            }
        });

        btnAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/icons8-add-user-male-24.png"))); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblAssignEmployee.setText("Assign Employee");

        btnViewCPM.setText("View");
        btnViewCPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCPMActionPerformed(evt);
            }
        });

        uniEmpWelcomeTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        lblEmergencyType.setText("Emergency Type:");

        lblLocation.setText("Location");

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
                                .addComponent(AcceptRequestCPM)
                                .addGap(18, 18, 18)
                                .addComponent(declineRequestCPM)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewCPM, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(lblSearch)
                                    .addGap(18, 18, 18)
                                    .addComponent(criPoliceSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(criPoliceSearchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(clearPolSearchBtn))
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(lblAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbAssignEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDL)
                                    .addComponent(lblPL)
                                    .addComponent(lblEmergencyType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(commentTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emergencyTxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbPL, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDL1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnMap))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(updateBtn)))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(uniEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch)
                    .addComponent(criPoliceSearchBarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criPoliceSearchBtn)
                    .addComponent(clearPolSearchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptRequestCPM)
                    .addComponent(declineRequestCPM)
                    .addComponent(btnViewCPM))
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
                    .addComponent(emergencyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmergencyType))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(btnMap)
                    .addComponent(txtDL1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDL)
                    .addComponent(commentTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(updateBtn)
                .addGap(49, 49, 49))
        );

        jTabbedPane2.addTab("View Police Work Request", jPanel8);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crisis Police Work Area Panel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1091, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 751, Short.MAX_VALUE)
                .addGap(180, 180, 180))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptRequestCPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptRequestCPMActionPerformed
        int selectedRowIndex = crisisPoliceEmployeeTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Accepted")) {
            JOptionPane.showMessageDialog(this, "Request has already been accepted, please make a new selection.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "Request has already been assigned.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("In Progress")) {
            JOptionPane.showMessageDialog(this, "Request is already in progress.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Submitted")) {

            EmergencyRequest emergencyRequest = (EmergencyRequest) ((PoliceOrganization)organization).getWorkQueue().getWorkQueueList().get(selectedRowIndex);
            emergencyRequest.setStatus("Accepted");

            JOptionPane.showMessageDialog(this, "The request has been successfully accepted.");

        }
        populateTable();
    }//GEN-LAST:event_AcceptRequestCPMActionPerformed

    private void declineRequestCPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineRequestCPMActionPerformed
        int selectedRowIndex = crisisPoliceEmployeeTbl.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was already canceled, please make a new selection.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request was already completed, can no longer be canceled.");
        }

        else if(selectedRowIndex >0){
            int dialogInput = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you would like to decline the request?", "Decline Request", dialogInput);
            if (dialogResult == 0) {

                EmergencyRequest emergencyRequest = (EmergencyRequest) ((PoliceOrganization)organization).getWorkQueue().getWorkQueueList().get(selectedRowIndex);
                emergencyRequest.setStatus("Canceled");
                JOptionPane.showMessageDialog(this, "The request has been declined and marked as canceled.");

            }
            else{

            }
        }
        populateTable();
    }//GEN-LAST:event_declineRequestCPMActionPerformed

    private void emergencyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencyTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emergencyTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRowIndex = crisisPoliceEmployeeTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        else{
            DefaultTableModel model = (DefaultTableModel) crisisPoliceEmployeeTbl.getModel();
            EmergencyRequest emergencyRequest = (EmergencyRequest) model.getValueAt(selectedRowIndex, 0);

            emergencyRequest.setPriorityLevel(cbPL.getSelectedItem().toString());
            emergencyRequest.setEmergencyType(emergencyTxt.getText());
            emergencyRequest.setComments(commentTxt.getText());

            JOptionPane.showMessageDialog(this, "Request has been updated.");
        }

       
        cbPL.setName("");
        emergencyTxt.setText("");
        commentTxt.setText("");

        populateTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void criPoliceSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criPoliceSearchBtnActionPerformed
        String s = criPoliceSearchBarTxt.getText();
        newComFilter(s);
    }//GEN-LAST:event_criPoliceSearchBtnActionPerformed

    private void clearPolSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearPolSearchBtnActionPerformed
        String s = ("");
        newComFilter(s);
        criPoliceSearchBarTxt.setText("");
    }//GEN-LAST:event_clearPolSearchBtnActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = crisisPoliceEmployeeTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row.");
            return;
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Submitted")) {
            JOptionPane.showMessageDialog(this, "Please accept the request before proceeding.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("In Progress")) {
            JOptionPane.showMessageDialog(this, "Request is already in progress.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Assigned")) {
            JOptionPane.showMessageDialog(this, "Request has already been assigned.");
        }

        else if(crisisPoliceEmployeeTbl.getValueAt(selectedRowIndex, 2).equals("Accepted")) {

            EmergencyRequest emergencyRequest = (EmergencyRequest) ((PoliceOrganization)organization).getWorkQueue().getWorkQueueList().get(selectedRowIndex);

            String employeeName = cbAssignEmployee.getSelectedItem().toString();
            UserAccount userAccount1 = ((PoliceOrganization)organization).getUserAccountDirectory().findUserAccount(employeeName);
            emergencyRequest.setReceiver(userAccount1);
            emergencyRequest.setStatus("Assigned");
            userAccount1.getWorkQueue().addRequestToQueue(emergencyRequest);

            JOptionPane.showMessageDialog(this, "The request has been successfully assigned.");

        }

        populateTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnViewCPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCPMActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = crisisPoliceEmployeeTbl.getSelectedRow();

        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) crisisPoliceEmployeeTbl.getModel();
        EmergencyRequest emergencyRequest = (EmergencyRequest) model.getValueAt(selectedRowIndex, 0);

        cbPL.setName(String.valueOf(emergencyRequest.getPriorityLevel()));
        emergencyTxt.setText(String.valueOf(emergencyRequest.getEmergencyType()));
        commentTxt.setText(String.valueOf(emergencyRequest.getComments()));
        if(emergencyRequest.getReceiver() != null){
            cbAssignEmployee.setSelectedItem(emergencyRequest.getReceiver().getEmployee().getName());
        }else{
            cbAssignEmployee.setSelectedItem("");
        }
        cbPL.setSelectedItem(emergencyRequest.getPriorityLevel());
    }//GEN-LAST:event_btnViewCPMActionPerformed

    private void cbPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPLActionPerformed

    private void commentTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commentTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commentTxtActionPerformed

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

    public void newComFilter(String s) {
        DefaultTableModel model = (DefaultTableModel) crisisPoliceEmployeeTbl.getModel();
        TableRowSorter<DefaultTableModel> t = new TableRowSorter<DefaultTableModel>(model);
        crisisPoliceEmployeeTbl.setRowSorter(t);
        t.setRowFilter(RowFilter.regexFilter(s));

    }
    
    private void displayEmployeesInCombo(){
       
    for(UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()){
         if(userAccount.getRole() instanceof PoliceDepartmentChiefRole) cbAssignEmployee.addItem(userAccount.getEmployee().getName());
     }
}
    
    
    private void populateTable() {
     DefaultTableModel model = (DefaultTableModel) crisisPoliceEmployeeTbl.getModel();
        model.setRowCount(0);
           
        crisisPoliceEmployeeTbl.setAutoCreateRowSorter(true);
        
        for (WorkRequest request : ((PoliceOrganization) organization).getWorkQueue().getWorkQueueList()) {
            Object[] row = new Object[8];
            row[0] = ((EmergencyRequest) request);
            row[1] = ((EmergencyRequest) request).getDateOfRequest();
            row[2] = ((EmergencyRequest) request).getStatus();
            row[3] = ((EmergencyRequest) request).getSender().getStudent().getName();
            row[4] = ((EmergencyRequest) request).getEmergencyType();
            row[5] = ((EmergencyRequest) request).getComments();
            if(request.getStatus().equals("Assigned")){
                row[6] = ((EmergencyRequest) request).getReceiver().getEmployee().getName();
            }
            else if(request.getStatus().equals("Completed")){
                row[6] = ((EmergencyRequest) request).getReceiver().getEmployee().getName();
            }else{
                row[6] = "";
            }
            if(request.getStatus().equals("Completed")){
            row[7] = ((EmergencyRequest) request).getDateResolved();
            }
            else{
            row[7] = "";
            }
            
            model.addRow(row);
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptRequestCPM;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnMap;
    private javax.swing.JButton btnViewCPM;
    private javax.swing.JComboBox<String> cbAssignEmployee;
    private javax.swing.JComboBox<String> cbPL;
    private javax.swing.JButton clearPolSearchBtn;
    private javax.swing.JTextField commentTxt;
    private javax.swing.JTextField criPoliceSearchBarTxt;
    private javax.swing.JButton criPoliceSearchBtn;
    private javax.swing.JTable crisisPoliceEmployeeTbl;
    private javax.swing.JButton declineRequestCPM;
    private javax.swing.JTextField emergencyTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblAssignEmployee;
    private javax.swing.JLabel lblDL;
    private javax.swing.JLabel lblEmergencyType;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblPL;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTextField txtDL1;
    private javax.swing.JLabel uniEmpWelcomeTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    
}