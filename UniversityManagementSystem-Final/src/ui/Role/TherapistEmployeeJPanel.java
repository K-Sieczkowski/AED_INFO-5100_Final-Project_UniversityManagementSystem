/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Role;

import Business.Organizations.Organization;
import Business.SendEmail.SendEmail;
import Business.Student.Student;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HealthRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ksiec
 */
public class TherapistEmployeeJPanel extends javax.swing.JPanel {

    private UserAccount userAccount;
    private JPanel userProcessContainer;
    private Organization organization;
    private SendEmail sendEmail;
    
    /**
     * Creates new form TherapistEmployeeJPanel
     */
    public TherapistEmployeeJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization) {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        therapistEmpWelcomeTxt.setText("Welcome " + userAccount.getEmployee().getName() + "!");
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

        acceptBtn = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        therapistEmployeeTbl = new javax.swing.JTable();
        therapistEmpSearchBtn = new javax.swing.JButton();
        therapistEmpClearBtn = new javax.swing.JButton();
        therapistEmpSearchTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        therapistEmpWelcomeTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(186, 234, 186));
        setMinimumSize(new java.awt.Dimension(1050, 850));
        setPreferredSize(new java.awt.Dimension(1050, 850));

        acceptBtn.setText("Accept Request");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        processBtn.setText("Process Request");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        therapistEmployeeTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Priority Level", "Request Date", "Status", "Student Name", "Type", "Comments", "Completed Date"
            }
        ));
        jScrollPane2.setViewportView(therapistEmployeeTbl);

        jScrollPane1.setViewportView(jScrollPane2);

        therapistEmpSearchBtn.setText("Search");
        therapistEmpSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                therapistEmpSearchBtnActionPerformed(evt);
            }
        });

        therapistEmpClearBtn.setText("Clear Search");
        therapistEmpClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                therapistEmpClearBtnActionPerformed(evt);
            }
        });

        therapistEmpSearchTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                therapistEmpSearchTxtActionPerformed(evt);
            }
        });

        jLabel4.setText("Search Bar:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Therapist Work Area");

        therapistEmpWelcomeTxt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        therapistEmpWelcomeTxt.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/TherapistImage.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(processBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(therapistEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(therapistEmpSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                .addComponent(therapistEmpSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(therapistEmpClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(therapistEmpWelcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(therapistEmpSearchBtn)
                            .addComponent(therapistEmpClearBtn)
                            .addComponent(jLabel4)
                            .addComponent(therapistEmpSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acceptBtn)
                            .addComponent(processBtn)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed

        int selectedRow = therapistEmployeeTbl.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        else if (therapistEmployeeTbl.getValueAt(selectedRow, 2).equals("Completed")) {

            JOptionPane.showMessageDialog(this, "Request has already been completed.");
        }

        else if (therapistEmployeeTbl.getValueAt(selectedRow, 2).equals("In Progress")) {
            JOptionPane.showMessageDialog(this, "Request is already in progress.");
        }

        else if (therapistEmployeeTbl.getValueAt(selectedRow, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");
        }

        else if (therapistEmployeeTbl.getValueAt(selectedRow, 2).equals("Assigned")) {
            HealthRequest healthRequest  = (HealthRequest) userAccount.getWorkQueue().getWorkQueueList().get(selectedRow);
            healthRequest.setStatus("In Progress");
        }

        populateTable();
        
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        int selectedRow = therapistEmployeeTbl.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        if (therapistEmployeeTbl.getValueAt(selectedRow, 2).equals("Canceled")) {
            JOptionPane.showMessageDialog(this, "Request was canceled, please make a new selection.");

        } else if (therapistEmployeeTbl.getValueAt(selectedRow, 2).equals("Completed")) {
            JOptionPane.showMessageDialog(this, "Request has already been completed.");

        } else if (therapistEmployeeTbl.getValueAt(selectedRow, 2).equals("Assigned")){
            JOptionPane.showMessageDialog(this, "Please accept request before processing.");

        } else if (therapistEmployeeTbl.getValueAt(selectedRow, 2).equals("In Progress")) {
            int dialogInput = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Request complete? ", "Complete Request", dialogInput);
            if (dialogResult == 0) {

                WorkQueue workQueue = userAccount.getWorkQueue();
                HealthRequest healthRequest  = (HealthRequest) workQueue.getWorkQueueList().get(selectedRow);
                healthRequest.setStatus("Completed");
                healthRequest.setDateResolved(new Date());

                Student student1 = healthRequest.getSender().getStudent();

                SendEmail.sendEmail(healthRequest.getSender().getStudent().getEmail(), student1);
               
                JOptionPane.showMessageDialog(this, "Request completed. Confirmation sent to Student.");

                populateTable();
            }
        }
    }//GEN-LAST:event_processBtnActionPerformed

    private void therapistEmpSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_therapistEmpSearchBtnActionPerformed
        String s = therapistEmpSearchTxt.getText();
        newTherapistEmpFilter(s);
    }//GEN-LAST:event_therapistEmpSearchBtnActionPerformed

    private void therapistEmpClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_therapistEmpClearBtnActionPerformed
        String s = ("");
        newTherapistEmpFilter(s);
        therapistEmpSearchTxt.setText("");
    }//GEN-LAST:event_therapistEmpClearBtnActionPerformed

    private void therapistEmpSearchTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_therapistEmpSearchTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_therapistEmpSearchTxtActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) therapistEmployeeTbl.getModel();
        model.setRowCount(0);
        
        therapistEmployeeTbl.setAutoCreateRowSorter(true);
        
        for (WorkRequest request : userAccount.getWorkQueue().getWorkQueueList()) {
            Object[] row = new Object[7];
            row[0] = ((HealthRequest) request);
            row[1] = ((HealthRequest) request).getDateOfRequest();
            row[2] = ((HealthRequest) request).getStatus();
            row[3] = ((HealthRequest) request).getSender().getStudent().getName();
            row[4] = ((HealthRequest) request).getType();
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
    
    public void newTherapistEmpFilter(String s) {
        DefaultTableModel model = (DefaultTableModel) therapistEmployeeTbl.getModel();
        TableRowSorter<DefaultTableModel> t = new TableRowSorter<DefaultTableModel>(model);
        therapistEmployeeTbl.setRowSorter(t);
        t.setRowFilter(RowFilter.regexFilter(s));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processBtn;
    private javax.swing.JButton therapistEmpClearBtn;
    private javax.swing.JButton therapistEmpSearchBtn;
    private javax.swing.JTextField therapistEmpSearchTxt;
    private javax.swing.JLabel therapistEmpWelcomeTxt;
    private javax.swing.JTable therapistEmployeeTbl;
    // End of variables declaration//GEN-END:variables
}