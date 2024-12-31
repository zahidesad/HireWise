package com.talentbridge.hirewise.personnel_system.ui.admin_screens;

import com.talentbridge.hirewise.ImageLib;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.service.DepartmentService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class AddNewDepartmentPanel extends javax.swing.JPanel implements IPage {

    public AddNewDepartmentPanel() {
        initComponents();
    }

    @Override
    public void onPageSetted() {
        txtDepartmentName.setText("");
        txtDescription.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new com.talentbridge.hirewise.custom_components.Button();
        label1 = new com.talentbridge.hirewise.custom_components.Label();
        txtDepartmentName = new com.talentbridge.hirewise.custom_components.TextField();
        label2 = new com.talentbridge.hirewise.custom_components.Label();
        txtDescription = new com.talentbridge.hirewise.custom_components.TextField();
        saveButton = new com.talentbridge.hirewise.custom_components.Button();

        backButton.setBackground(new java.awt.Color(102, 102, 102));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-arrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Enter Department Name :");
        label1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        txtDepartmentName.setBackground(new java.awt.Color(204, 204, 204));
        txtDepartmentName.setForeground(new java.awt.Color(0, 0, 0));

        label2.setBackground(new java.awt.Color(204, 204, 204));
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Enter Description : ");
        label2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        txtDescription.setBackground(new java.awt.Color(204, 204, 204));
        txtDescription.setForeground(new java.awt.Color(0, 0, 0));

        saveButton.setBackground(new java.awt.Color(204, 204, 204));
        saveButton.setForeground(new java.awt.Color(0, 0, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(txtDepartmentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ImageIcon icon = new ImageIcon(ImageLib.getBackArrowPath());
        backButton.setIcon(icon);
        MainFrame.instance.setPage(MainFrame.instance.getShowDepartmentsPage());
    }//GEN-LAST:event_backButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            String deptName = txtDepartmentName.getText().trim();
            String desc = txtDescription.getText().trim();

            DepartmentService deptService = new DepartmentService();
            deptService.addDepartment(deptName, desc);

            JOptionPane.showMessageDialog(
                    this,
                    "New Department added successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            // Geri dön
            MainFrame.instance.setPage(MainFrame.instance.getShowDepartmentsPage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Button backButton;
    private com.talentbridge.hirewise.custom_components.Label label1;
    private com.talentbridge.hirewise.custom_components.Label label2;
    private com.talentbridge.hirewise.custom_components.Button saveButton;
    private com.talentbridge.hirewise.custom_components.TextField txtDepartmentName;
    private com.talentbridge.hirewise.custom_components.TextField txtDescription;
    // End of variables declaration//GEN-END:variables

}
