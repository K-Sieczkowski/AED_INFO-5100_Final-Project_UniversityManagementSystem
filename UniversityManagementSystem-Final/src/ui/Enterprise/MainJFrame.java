/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Enterprise;

import Business.University;
import Organization.Police;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import ui.Role.StudentWorkAreaJPanel;

/**
 *
 * @author arfinansari
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    //University system;
    JPanel JPanel2;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public MainJFrame() {
        initComponents();
        this.system = system;
        this.JPanel2 = JPanel2;
         system = dB4OUtil.retrieveSystem();
        this.setSize(680, 450);
        addWindowListener(new WindowAdapter()
	{
	@Override
		public void windowClosing(WindowEvent e)
			{
			 dB4OUtil.storeSystem(system);
					System.exit(0);
			}
	});   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(10, 23, 850, 850));
        setMinimumSize(new java.awt.Dimension(1350, 850));
        setPreferredSize(new java.awt.Dimension(1350, 850));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 850));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 850));

        lblWelcome.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Welcome Students!!");

        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserName.setText("User Name:");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:");

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName)
                    .addComponent(lblUserName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblWelcome)
                .addGap(81, 81, 81)
                .addComponent(lblUserName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(518, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(1050, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1050, 0));
        jPanel2.setLayout(new java.awt.CardLayout());

        lblTitle.setBackground(new java.awt.Color(255, 204, 204));
        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Welcome to the University Management System");
        jPanel2.add(lblTitle, "card2");

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        btnLogout.setEnabled(false);
        txtUserName.setEnabled(true);
        txtPassword.setEnabled(true);
        btnLogin.setEnabled(true);

        txtUserName.setText("");
        txtPassword.setText("");

        jPanel2.removeAll();
        JPanel blankJP = new JPanel();
        jPanel2.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) jPanel2.getLayout();
        crdLyt.next(jPanel2);
        dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String name = txtUserName.getText();
        String pwd = new String(txtPassword.getText());
        if(name.equals("admin") && pwd.equals("admin123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome " + name, "Successful Login" , JOptionPane.PLAIN_MESSAGE);
             AdminWorkAreaJPanel adminJPanel = new AdminWorkAreaJPanel();
             jPanel2.add("adminJPanel", adminJPanel);

             CardLayout layout=(CardLayout)jPanel2.getLayout();
             layout.next(jPanel2);
        }   
        else if(name.equals("com") && pwd.equals("com123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome " + name, "Successful Login" , JOptionPane.PLAIN_MESSAGE);
            CommunityWorkAreaJPanel communityJPanel = new CommunityWorkAreaJPanel();
             jPanel2.add("communityJPanel", communityJPanel);

             CardLayout layout=(CardLayout)jPanel2.getLayout();
             layout.next(jPanel2);
        }
        else if(name.equals("cri") && pwd.equals("cri123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome " + name, "Successful Login" , JOptionPane.PLAIN_MESSAGE);
            CrisisPoliceWorkAreaJPanel1 crisisJPanel = new CrisisPoliceWorkAreaJPanel1();
             jPanel2.add("crisisJPanel", crisisJPanel);

             CardLayout layout=(CardLayout)jPanel2.getLayout();
             layout.next(jPanel2);
        }
        else if(name.equals("hou") && pwd.equals("hou123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome " + name, "Successful Login" , JOptionPane.PLAIN_MESSAGE);
            HousingWorkAreaJPanel housingJPanel = new HousingWorkAreaJPanel();
             jPanel2.add("housingJPanel", housingJPanel);

             CardLayout layout=(CardLayout)jPanel2.getLayout();
             layout.next(jPanel2);
        }
        else if(name.equals("uni") && pwd.equals("uni123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome " + name, "Successful Login" , JOptionPane.PLAIN_MESSAGE);
            UniversityWorkAreaJPanel1 universityJPanel = new UniversityWorkAreaJPanel1();
             jPanel2.add("universityJPanel", universityJPanel);

             CardLayout layout=(CardLayout)jPanel2.getLayout();
             layout.next(jPanel2);
        }
        else if(name.equals("wel") && pwd.equals("wel123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome " + name, "Successful Login" , JOptionPane.PLAIN_MESSAGE);
            TherapistWorkAreaJPanel1 wellbeingJPanel = new TherapistWorkAreaJPanel1();
             jPanel2.add("wellbeingJPanel", wellbeingJPanel);

             CardLayout layout=(CardLayout)jPanel2.getLayout();
             layout.next(jPanel2);
        }
        else if(name.equals("sys") && pwd.equals("sys123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome " + name, "Successful Login" , JOptionPane.PLAIN_MESSAGE);
            AdminWorkAreaJPanel systemadminJPanel = new AdminWorkAreaJPanel();
             jPanel2.add("systemadminJPanel", systemadminJPanel);

             CardLayout layout=(CardLayout)jPanel2.getLayout();
             layout.next(jPanel2);
        }else if(name.equals("stu") && pwd.equals("stu123"))
        {
            JOptionPane.showMessageDialog(null,"Welcome " + name, "Successful Login" , JOptionPane.PLAIN_MESSAGE);
            StudentWorkAreaJPanel studentWorkAreaJPanel = new StudentWorkAreaJPanel();
             jPanel2.add("studentWorkAreaJPanel", studentWorkAreaJPanel);

             CardLayout layout=(CardLayout)jPanel2.getLayout();
             layout.next(jPanel2);
        }
             else
            JOptionPane.showMessageDialog(null,"Invalid User Name/Password ", "Unsuccessful Login" , JOptionPane.PLAIN_MESSAGE);
    
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
