package com.talentbridge.hirewise.personnel_system.ui.manager_screens;

import com.talentbridge.hirewise.ImageLib;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.Position;
import com.talentbridge.hirewise.personnel_system.service.PositionService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class AddNewPositionPanel extends javax.swing.JPanel implements IPage {

    public AddNewPositionPanel() {
        initComponents();
    }

    public void onPageSetted() {
        // Optionally clear fields
        positionTitleTxt.setText("");
        positionDescriptionTxt.setText("");
        baseSalaryTxt.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new com.talentbridge.hirewise.custom_components.Label();
        label2 = new com.talentbridge.hirewise.custom_components.Label();
        label3 = new com.talentbridge.hirewise.custom_components.Label();
        positionTitleTxt = new com.talentbridge.hirewise.custom_components.TextField();
        positionDescriptionTxt = new com.talentbridge.hirewise.custom_components.TextField();
        baseSalaryTxt = new com.talentbridge.hirewise.custom_components.TextField();
        saveButton = new com.talentbridge.hirewise.custom_components.Button();
        backButton2 = new com.talentbridge.hirewise.custom_components.Button();

        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Position Title :");
        label1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        label2.setBackground(new java.awt.Color(204, 204, 204));
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Position Description :");
        label2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        label3.setBackground(new java.awt.Color(204, 204, 204));
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Base Salary : ");
        label3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        positionTitleTxt.setBackground(new java.awt.Color(204, 204, 204));
        positionTitleTxt.setForeground(new java.awt.Color(0, 0, 0));

        positionDescriptionTxt.setBackground(new java.awt.Color(204, 204, 204));
        positionDescriptionTxt.setForeground(new java.awt.Color(0, 0, 0));

        baseSalaryTxt.setBackground(new java.awt.Color(204, 204, 204));
        baseSalaryTxt.setForeground(new java.awt.Color(0, 0, 0));

        saveButton.setBackground(new java.awt.Color(204, 204, 204));
        saveButton.setForeground(new java.awt.Color(0, 0, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backButton2.setBackground(new java.awt.Color(102, 102, 102));
        backButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-arrow.png"))); // NOI18N
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(backButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(874, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(67, 67, 67)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(positionDescriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(baseSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(positionTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(99, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(484, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(positionTitleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(47, 47, 47)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(positionDescriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(42, 42, 42)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(baseSalaryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(146, 146, 146)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            Employee managerEmp = MainFrame.instance.getEmployee();
            int managerDeptId = managerEmp.getDepartmentId();

            String title = positionTitleTxt.getText();
            String desc = positionDescriptionTxt.getText();
            double baseSalary = Double.parseDouble(baseSalaryTxt.getText());

            Position pos = new Position();
            pos.setDepartmentId(managerDeptId);
            pos.setPositionTitle(title);
            pos.setPositionDescription(desc);
            pos.setBaseSalary(baseSalary);

            PositionService service = new PositionService();
            service.addPosition(pos);

            JOptionPane.showMessageDialog(this,
                    "Position added successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            MainFrame.instance.setPage(MainFrame.instance.getShowPositionsPage());

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid number for base salary!",
                    "Invalid Input",
                    JOptionPane.WARNING_MESSAGE
            );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        ImageIcon icon = new ImageIcon(ImageLib.getBackArrowPath());
        backButton2.setIcon(icon);
        MainFrame.instance.setPage(MainFrame.instance.getShowPositionsPage());
    }//GEN-LAST:event_backButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Button backButton2;
    private com.talentbridge.hirewise.custom_components.TextField baseSalaryTxt;
    private com.talentbridge.hirewise.custom_components.Label label1;
    private com.talentbridge.hirewise.custom_components.Label label2;
    private com.talentbridge.hirewise.custom_components.Label label3;
    private com.talentbridge.hirewise.custom_components.TextField positionDescriptionTxt;
    private com.talentbridge.hirewise.custom_components.TextField positionTitleTxt;
    private com.talentbridge.hirewise.custom_components.Button saveButton;
    // End of variables declaration//GEN-END:variables
}
