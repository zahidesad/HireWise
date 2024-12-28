package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.ImageLib;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.DepartmentBudget;
import com.talentbridge.hirewise.personnel_system.service.DepartmentBudgetService;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class AddNewDepartmentBudgetPanel extends javax.swing.JPanel implements IPage {
    
    public AddNewDepartmentBudgetPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new com.talentbridge.hirewise.custom_components.Label();
        label2 = new com.talentbridge.hirewise.custom_components.Label();
        label3 = new com.talentbridge.hirewise.custom_components.Label();
        label4 = new com.talentbridge.hirewise.custom_components.Label();
        totalBudgetTxt = new com.talentbridge.hirewise.custom_components.TextField();
        salariesBudgetTxt = new com.talentbridge.hirewise.custom_components.TextField();
        hiringBudgetTxt = new com.talentbridge.hirewise.custom_components.TextField();
        fiscalYearTxt = new com.talentbridge.hirewise.custom_components.TextField();
        saveButton = new com.talentbridge.hirewise.custom_components.Button();
        backButton = new com.talentbridge.hirewise.custom_components.Button();

        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Enter Fiscal Year :");
        label1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        label2.setBackground(new java.awt.Color(204, 204, 204));
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Enter Total Budget :");
        label2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        label3.setBackground(new java.awt.Color(204, 204, 204));
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Enter Budget for Salaries : ");
        label3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        label4.setBackground(new java.awt.Color(204, 204, 204));
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Enter Budget for Hiring : ");
        label4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        totalBudgetTxt.setBackground(new java.awt.Color(204, 204, 204));
        totalBudgetTxt.setForeground(new java.awt.Color(0, 0, 0));

        salariesBudgetTxt.setBackground(new java.awt.Color(204, 204, 204));
        salariesBudgetTxt.setForeground(new java.awt.Color(0, 0, 0));

        hiringBudgetTxt.setBackground(new java.awt.Color(204, 204, 204));
        hiringBudgetTxt.setForeground(new java.awt.Color(0, 0, 0));

        fiscalYearTxt.setBackground(new java.awt.Color(204, 204, 204));
        fiscalYearTxt.setForeground(new java.awt.Color(0, 0, 0));

        saveButton.setBackground(new java.awt.Color(204, 204, 204));
        saveButton.setForeground(new java.awt.Color(0, 0, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(102, 102, 102));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-arrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalBudgetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salariesBudgetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hiringBudgetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiscalYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiscalYearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalBudgetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salariesBudgetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hiringBudgetTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            // 1) Giriş yapan manager departmanId
            int managerDeptId = MainFrame.instance.getEmployee().getDepartmentId();
            
            int fiscalYear = Integer.parseInt(fiscalYearTxt.getText());
            double totalBudget = Double.parseDouble(totalBudgetTxt.getText());
            double allocatedSalaries = Double.parseDouble(salariesBudgetTxt.getText());
            double allocatedHiring = Double.parseDouble(hiringBudgetTxt.getText());
            
            if (fiscalYear <= 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Fiscal Year must be a positive number!",
                        "Invalid Input",
                        JOptionPane.WARNING_MESSAGE
                );
                return; // Kaydetme işleminden çık
            }
            
            if (totalBudget <= 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Total Budget must be a positive number!",
                        "Invalid Input",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }
            
            if (allocatedSalaries < 0 || allocatedHiring < 0) {
                JOptionPane.showMessageDialog(
                        this,
                        "Allocated for Salaries/Hiring cannot be negative!",
                        "Invalid Input",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }
            
            if (allocatedSalaries > totalBudget) {
                JOptionPane.showMessageDialog(
                        this,
                        "Salaries allocation cannot exceed total budget!",
                        "Invalid Input",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }
            
            if (allocatedHiring > totalBudget) {
                JOptionPane.showMessageDialog(
                        this,
                        "Hiring allocation cannot exceed total budget!",
                        "Invalid Input",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }
            
            if ((allocatedSalaries + allocatedHiring) > totalBudget) {
                JOptionPane.showMessageDialog(
                        this,
                        "Sum of Salaries & Hiring allocation cannot exceed total budget!",
                        "Invalid Input",
                        JOptionPane.WARNING_MESSAGE
                );
                return;
            }
            
            DepartmentBudget db = new DepartmentBudget();
            db.setDepartmentId(managerDeptId);
            db.setFiscalYear(fiscalYear);
            db.setTotalBudget(totalBudget);
            db.setAllocatedForSalaries(allocatedSalaries);
            db.setAllocatedForHiring(allocatedHiring);
            
            DepartmentBudgetService service = new DepartmentBudgetService();
            service.addDepartmentBudget(db);
            
            JOptionPane.showMessageDialog(
                    this,
                    "Department budget added successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );
            MainFrame.instance.setPage(MainFrame.instance.getDepartmentBudgetPage());
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numeric values for FiscalYear/Total/Salaries/Hiring fields!",
                    "Invalid Input",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception ex) {
            // Herhangi başka bir hata
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ImageIcon icon = new ImageIcon(ImageLib.getBackArrowPath());        
        backButton.setIcon(icon);
        MainFrame.instance.setPage(MainFrame.instance.getDepartmentBudgetPage());
    }//GEN-LAST:event_backButtonActionPerformed
    
    @Override
    public void onPageSetted() {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Button backButton;
    private com.talentbridge.hirewise.custom_components.TextField fiscalYearTxt;
    private com.talentbridge.hirewise.custom_components.TextField hiringBudgetTxt;
    private com.talentbridge.hirewise.custom_components.Label label1;
    private com.talentbridge.hirewise.custom_components.Label label2;
    private com.talentbridge.hirewise.custom_components.Label label3;
    private com.talentbridge.hirewise.custom_components.Label label4;
    private com.talentbridge.hirewise.custom_components.TextField salariesBudgetTxt;
    private com.talentbridge.hirewise.custom_components.Button saveButton;
    private com.talentbridge.hirewise.custom_components.TextField totalBudgetTxt;
    // End of variables declaration//GEN-END:variables
}
