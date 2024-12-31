package com.talentbridge.hirewise.personnel_system.ui.admin_screens;

import com.talentbridge.hirewise.custom_components.CCSideMenuList;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;

/**
 *
 * @author zahid
 */
public class AdminHomePanel extends javax.swing.JPanel implements IPage {

    CCSideMenuList<String> cCSideMenuList;

    public AdminHomePanel(CCSideMenuList cCSideMenuList) {
        initComponents();
        this.cCSideMenuList = cCSideMenuList;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new com.talentbridge.hirewise.custom_components.Label();
        showLeavesButton = new com.talentbridge.hirewise.custom_components.Button();
        showTasksButton = new com.talentbridge.hirewise.custom_components.Button();

        header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        header.setText("WELCOME TO TALENT_BRIDGE ADMIN PANEL");
        header.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N

        showLeavesButton.setBackground(new java.awt.Color(204, 204, 204));
        showLeavesButton.setForeground(new java.awt.Color(0, 0, 0));
        showLeavesButton.setText("SHOW DEPARTMENTS");
        showLeavesButton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        showLeavesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLeavesButtonActionPerformed(evt);
            }
        });

        showTasksButton.setBackground(new java.awt.Color(204, 204, 204));
        showTasksButton.setForeground(new java.awt.Color(0, 0, 0));
        showTasksButton.setText("PROMOTE EMPLOYEE");
        showTasksButton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        showTasksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTasksButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showLeavesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(showTasksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showTasksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showLeavesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showLeavesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLeavesButtonActionPerformed
        cCSideMenuList.setSelectedIndex(2);
        MainFrame.instance.setPage(MainFrame.instance.getShowDepartmentsPage());
    }//GEN-LAST:event_showLeavesButtonActionPerformed

    private void showTasksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTasksButtonActionPerformed
        cCSideMenuList.setSelectedIndex(5);
        MainFrame.instance.setPage(MainFrame.instance.getPromoteEmployeePage());
    }//GEN-LAST:event_showTasksButtonActionPerformed

    @Override
    public void onPageSetted() {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Label header;
    private com.talentbridge.hirewise.custom_components.Button showLeavesButton;
    private com.talentbridge.hirewise.custom_components.Button showTasksButton;
    // End of variables declaration//GEN-END:variables
}
