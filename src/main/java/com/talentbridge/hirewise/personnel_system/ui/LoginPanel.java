package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.User;
import com.talentbridge.hirewise.UserService;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.service.EmployeeService;

/**
 *
 * @author emirs
 */
public class LoginPanel extends javax.swing.JPanel implements IPage {

    private String loginType = "hirewise";
    UserService userService = new UserService();
    EmployeeService empService = new EmployeeService();

    public LoginPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new com.talentbridge.hirewise.custom_components.Button();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hirewiseRadioBtn = new javax.swing.JRadioButton();
        talentBridgeRadioBtn = new javax.swing.JRadioButton();
        warningLabel = new javax.swing.JLabel();

        jLabel1.setText("Username");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");

        jLabel4.setText("Login Type");

        buttonGroup1.add(hirewiseRadioBtn);
        hirewiseRadioBtn.setSelected(true);
        hirewiseRadioBtn.setText("Hirewise");
        hirewiseRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hirewiseRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(talentBridgeRadioBtn);
        talentBridgeRadioBtn.setText("TalentBridge");
        talentBridgeRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                talentBridgeRadioBtnActionPerformed(evt);
            }
        });

        warningLabel.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(359, 359, 359)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(hirewiseRadioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(talentBridgeRadioBtn))
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(390, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hirewiseRadioBtn)
                    .addComponent(talentBridgeRadioBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(warningLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void talentBridgeRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_talentBridgeRadioBtnActionPerformed
        // TODO add your handling code here:
        loginType = "talentbridge";
    }//GEN-LAST:event_talentBridgeRadioBtnActionPerformed

    private void hirewiseRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hirewiseRadioBtnActionPerformed
        // TODO add your handling code here:
        loginType = "hirewise";
    }//GEN-LAST:event_hirewiseRadioBtnActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String username = usernameField.getText();
        String password = passwordField.getText();
        User account = null;
        try {
            account = userService.authenticate(username, password);
        } catch (Exception e) {
            warningLabel.setText("Invalid username or password.");
            return;
        }
        
        String account_type = "";
        if (loginType.equals("hirewise")) {
            try {
                Employee emp = empService.getEmployeeByUserId(account.getUserId());
                try {
                    String position_title = empService.getPositionTitleForEmployee(emp.getEmployeeId());
                    if (position_title.equals("HR")) {
                        account_type = "hirewise_hr";
                    } else {
                        account_type = "hirewise_user";
                    }
                } catch (RuntimeException e) {
                    account_type = "hirewise_user";
                }
            } catch (Exception e) {
                account_type = "hirewise_user";
            }
        }else if(loginType.equals("talentbridge")){
            try {
                Employee emp = empService.getEmployeeByUserId(account.getUserId());
                String position_title = empService.getPositionTitleForEmployee(emp.getEmployeeId());
                    if (position_title.equals("Manager")) {
                        account_type = "talentbridge_manager";
                    } else {
                        account_type = "talentbridge_emp";
                    }
            } catch (Exception e) {
                warningLabel.setText("No Employee Found with This Information");
                return;
            }
        }
        
        MainFrame.instance.setAccount(account);
        MainFrame.instance.setLoggedSystem(account_type);
        MainFrame.instance.login();
        MainFrame.instance.setPage(MainFrame.instance.getDepartmentPage());
    }//GEN-LAST:event_loginButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton hirewiseRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.talentbridge.hirewise.custom_components.Button loginButton;
    private javax.swing.JTextField passwordField;
    private javax.swing.JRadioButton talentBridgeRadioBtn;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {

    }
}
