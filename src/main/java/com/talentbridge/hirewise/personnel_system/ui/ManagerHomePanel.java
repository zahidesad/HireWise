package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.custom_components.CCSideMenuList;
import com.talentbridge.hirewise.personnel_system.core.IPage;

/**
 *
 * @author zahid
 */
public class ManagerHomePanel extends javax.swing.JPanel implements IPage{

    CCSideMenuList<String> cCSideMenuList; 
    
    public ManagerHomePanel(CCSideMenuList cCSideMenuList) {
        initComponents();
        this.cCSideMenuList = cCSideMenuList;
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new com.talentbridge.hirewise.custom_components.Label();
        showLeavesButton = new com.talentbridge.hirewise.custom_components.Button();
        showReviewsButton = new com.talentbridge.hirewise.custom_components.Button();
        showTasksButton = new com.talentbridge.hirewise.custom_components.Button();

        header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        header.setText("WELCOME TO TALENT_BRIDGE MANAGER PANEL");
        header.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N

        showLeavesButton.setBackground(new java.awt.Color(204, 204, 204));
        showLeavesButton.setForeground(new java.awt.Color(0, 0, 0));
        showLeavesButton.setText("SHOW LEAVES");
        showLeavesButton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        showLeavesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLeavesButtonActionPerformed(evt);
            }
        });

        showReviewsButton.setBackground(new java.awt.Color(204, 204, 204));
        showReviewsButton.setForeground(new java.awt.Color(0, 0, 0));
        showReviewsButton.setText("SHOW REVIEWS");
        showReviewsButton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        showReviewsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showReviewsButtonActionPerformed(evt);
            }
        });

        showTasksButton.setBackground(new java.awt.Color(204, 204, 204));
        showTasksButton.setForeground(new java.awt.Color(0, 0, 0));
        showTasksButton.setText("SHOW TASKS");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(129, 129, 129)
                            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(330, 330, 330)
                            .addComponent(showReviewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(showLeavesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showTasksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showTasksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showLeavesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(showReviewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showLeavesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLeavesButtonActionPerformed
        cCSideMenuList.setSelectedIndex(2);
        MainFrame.instance.setPage(MainFrame.instance.getLeaveRecordPage());
    }//GEN-LAST:event_showLeavesButtonActionPerformed

    private void showTasksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTasksButtonActionPerformed
        cCSideMenuList.setSelectedIndex(5);
        MainFrame.instance.setPage(MainFrame.instance.getShowTasksManagerPage());
    }//GEN-LAST:event_showTasksButtonActionPerformed

    private void showReviewsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showReviewsButtonActionPerformed
        cCSideMenuList.setSelectedIndex(6);
        MainFrame.instance.setPage(MainFrame.instance.getShowPerformanceReviewPage());
    }//GEN-LAST:event_showReviewsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Label header;
    private com.talentbridge.hirewise.custom_components.Button showLeavesButton;
    private com.talentbridge.hirewise.custom_components.Button showReviewsButton;
    private com.talentbridge.hirewise.custom_components.Button showTasksButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        
    }
}
