/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Enterprise;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author arfinansari
 */
public class CrisisWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CrisisJPanel
     */
    public CrisisWorkAreaJPanel() {
        initComponents();
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
        addressTxt = new javax.swing.JTextField();
        lblComment = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtComment = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        hospitalSearchBarTxt = new javax.swing.JTextField();
        hospitalSearchBtn = new javax.swing.JButton();
        clearHospitalSearchBtn = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitalsTbl = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lblEmergencyTypeA = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        lblPriorityLevelA = new javax.swing.JLabel();
        txtCommentA = new javax.swing.JTextField();
        lblCommentA = new javax.swing.JLabel();
        cbPL = new javax.swing.JComboBox<>();
        cbET = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jTabbedPane1.setBackground(new java.awt.Color(224, 237, 242));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1070, 850));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1070, 850));

        jPanel2.setBackground(new java.awt.Color(224, 237, 242));
        jPanel2.setPreferredSize(new java.awt.Dimension(1070, 850));

        viewButton.setText("View Emergency Cases");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        lblEmergencyType.setText("Emergency Type:");

        lblPT.setText("Priority Type:");

        lblComment.setText("Comments:");

        lblAddress.setText("Address:");

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

        hospitalsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Emergency Type", "Priority Level", "Comments"
            }
        ));
        jScrollPane1.setViewportView(hospitalsTbl);

        jScrollPane10.setViewportView(jScrollPane1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Re-Exam", "Emergency Travel", "Accidents" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critical", "High", "Medium", "Low" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(updateBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(viewButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(lblComment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 409, Short.MAX_VALUE)
                                .addComponent(txtComment, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Emergency Cases", jPanel2);

        jPanel3.setBackground(new java.awt.Color(224, 237, 242));
        jPanel3.setPreferredSize(new java.awt.Dimension(1070, 704));

        lblEmergencyTypeA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmergencyTypeA.setText("Emergency Type:");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        lblPriorityLevelA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPriorityLevelA.setText("Priority Level:");

        txtCommentA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentAActionPerformed(evt);
            }
        });

        lblCommentA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCommentA.setText("Comments:");

        cbPL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Critical", "High", "Medium", "Low" }));

        cbET.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Re-Exam", "Emergency Travel", "Accidents" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(lblCommentA)
                                    .addGap(116, 116, 116))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(lblPriorityLevelA)
                                    .addGap(103, 103, 103)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblEmergencyTypeA)
                                .addGap(83, 83, 83)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCommentA, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(cbPL, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbET, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(302, 302, 302))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmergencyTypeA)
                    .addComponent(cbET, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPriorityLevelA)
                    .addComponent(cbPL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommentA)
                    .addComponent(txtCommentA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(saveButton)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Emergency Cases", jPanel3);

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

    private void txtCommentAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentAActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (cbET.setSelectedItem("") || cbPL.setSelectedItem("") || txtCommentA.getText().equals("") ) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.");
        } else {

            String name = txtName.getText();
            String cityName = txtCity.getText();
            String cityZip = txtCommentA.getText();
           

            Hospital h = hospitals.addNewHospital();
            h.setName(name);

            City c = cities.addNewCity();
            c.setName(cityName);
            c.setZipcode(cityZip);

            House hs = communities.addNewHouse();
            hs.setAddress(address);

            h.setCity(c);
            h.addAddress(hs);

            JOptionPane.showMessageDialog(this, "New hopsital added.");

            txtName.setText("");
            txtCity.setText("");
            txtCommentA.setText("");
            txtAddress.setText("");

            populateHospitalTable();

        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void clearHospitalSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearHospitalSearchBtnActionPerformed
        String s = ("");
        newHospitalFilter(s);
        hospitalSearchBarTxt.setText("");
    }//GEN-LAST:event_clearHospitalSearchBtnActionPerformed

    private void hospitalSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalSearchBtnActionPerformed
        String s = hospitalSearchBarTxt.getText();
        newHospitalFilter(s);
    }//GEN-LAST:event_hospitalSearchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRowIndex = hospitalsTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) hospitalsTbl.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);

        selectedHospital.setName(jTextField1.getText());
        selectedHospital.getCity().setName(cityTxt.getText());
        selectedHospital.getCity().setZipcode(txtComment.getText());
        selectedHospital.getHouse().setAddress(addressTxt.getText());

        JOptionPane.showMessageDialog(this, "Hospital has been updated.");

        jTextField1.setText("");
        cityTxt.setText("");
        txtComment.setText("");
        addressTxt.setText("");

        populateHospitalTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int selectedRowIndex = hospitalsTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) hospitalsTbl.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);

        hospitals.deleteHospital(selectedHospital);

        JOptionPane.showMessageDialog(this, "Hospital deleted.");

        populateHospitalTable();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        int selectedRowIndex = hospitalsTbl.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) hospitalsTbl.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);

        jTextField1.setText(String.valueOf(selectedHospital.getName()));
        cityTxt.setText(String.valueOf(selectedHospital.getCity().getName()));
        txtComment.setText(String.valueOf(selectedHospital.getCity().getZipcode()));
        addressTxt.setText(String.valueOf(selectedHospital.getHouse().getAddress()));
    }//GEN-LAST:event_viewButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JComboBox<String> cbET;
    private javax.swing.JComboBox<String> cbPL;
    private javax.swing.JButton clearHospitalSearchBtn;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField hospitalSearchBarTxt;
    private javax.swing.JButton hospitalSearchBtn;
    private javax.swing.JTable hospitalsTbl;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblComment;
    private javax.swing.JLabel lblCommentA;
    private javax.swing.JLabel lblEmergencyType;
    private javax.swing.JLabel lblEmergencyTypeA;
    private javax.swing.JLabel lblPT;
    private javax.swing.JLabel lblPriorityLevelA;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField txtComment;
    private javax.swing.JTextField txtCommentA;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
