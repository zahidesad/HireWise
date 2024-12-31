package com.talentbridge.hirewise.custom_components.manager_custom_components;

import com.talentbridge.hirewise.personnel_system.model.DepartmentBudget;
import com.talentbridge.hirewise.personnel_system.service.DepartmentBudgetService;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class CCDepartmentBudget extends javax.swing.JPanel {

    DepartmentBudget departmentBudget;

    public CCDepartmentBudget(DepartmentBudget departmentBudget) {
        initComponents();
        this.departmentBudget = departmentBudget;
        setPanel(departmentBudget);
    }

    public final void setPanel(DepartmentBudget departmentBudget) {
        txtfiscalYearValue.setText(String.valueOf(departmentBudget.getFiscalYear()));
        txTotalBudgetValue.setText(String.valueOf(departmentBudget.getTotalBudget()));
        txtAllocatedSalariesValue.setText(String.valueOf(departmentBudget.getAllocatedForSalaries()));
        txtAllocatedHiringValue.setText(String.valueOf(departmentBudget.getAllocatedForHiring()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fiscalYear = new javax.swing.JLabel();
        TotalBudget = new javax.swing.JLabel();
        allocatedSalaries = new javax.swing.JLabel();
        allocatedHiring = new javax.swing.JLabel();
        cCPaintedCircle1 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle10 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle2 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle12 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle3 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle14 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle4 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle16 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        updateButton = new com.talentbridge.hirewise.custom_components.Button();
        deleteButton = new com.talentbridge.hirewise.custom_components.Button();
        txtfiscalYearValue = new javax.swing.JTextField();
        txTotalBudgetValue = new javax.swing.JTextField();
        txtAllocatedSalariesValue = new javax.swing.JTextField();
        txtAllocatedHiringValue = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));

        fiscalYear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fiscalYear.setText("Fiscal Year :");

        TotalBudget.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalBudget.setText("Total Budget :");

        allocatedSalaries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allocatedSalaries.setText("Allocated for Salaries :");

        allocatedHiring.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allocatedHiring.setText("Allocated for Hiring :");

        cCPaintedCircle1.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle1.setDiameter(20);
        cCPaintedCircle1.setOpaque(false);

        cCPaintedCircle10.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle10.setDiameter(20);

        javax.swing.GroupLayout cCPaintedCircle10Layout = new javax.swing.GroupLayout(cCPaintedCircle10);
        cCPaintedCircle10.setLayout(cCPaintedCircle10Layout);
        cCPaintedCircle10Layout.setHorizontalGroup(
            cCPaintedCircle10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle10Layout.setVerticalGroup(
            cCPaintedCircle10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cCPaintedCircle1Layout = new javax.swing.GroupLayout(cCPaintedCircle1);
        cCPaintedCircle1.setLayout(cCPaintedCircle1Layout);
        cCPaintedCircle1Layout.setHorizontalGroup(
            cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cCPaintedCircle10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cCPaintedCircle1Layout.setVerticalGroup(
            cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(cCPaintedCircle10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cCPaintedCircle2.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle2.setDiameter(20);
        cCPaintedCircle2.setOpaque(false);

        cCPaintedCircle12.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle12.setDiameter(20);

        javax.swing.GroupLayout cCPaintedCircle12Layout = new javax.swing.GroupLayout(cCPaintedCircle12);
        cCPaintedCircle12.setLayout(cCPaintedCircle12Layout);
        cCPaintedCircle12Layout.setHorizontalGroup(
            cCPaintedCircle12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle12Layout.setVerticalGroup(
            cCPaintedCircle12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cCPaintedCircle2Layout = new javax.swing.GroupLayout(cCPaintedCircle2);
        cCPaintedCircle2.setLayout(cCPaintedCircle2Layout);
        cCPaintedCircle2Layout.setHorizontalGroup(
            cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cCPaintedCircle12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cCPaintedCircle2Layout.setVerticalGroup(
            cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle2Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(cCPaintedCircle12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cCPaintedCircle3.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle3.setDiameter(20);
        cCPaintedCircle3.setOpaque(false);

        cCPaintedCircle14.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle14.setDiameter(20);

        javax.swing.GroupLayout cCPaintedCircle14Layout = new javax.swing.GroupLayout(cCPaintedCircle14);
        cCPaintedCircle14.setLayout(cCPaintedCircle14Layout);
        cCPaintedCircle14Layout.setHorizontalGroup(
            cCPaintedCircle14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle14Layout.setVerticalGroup(
            cCPaintedCircle14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cCPaintedCircle3Layout = new javax.swing.GroupLayout(cCPaintedCircle3);
        cCPaintedCircle3.setLayout(cCPaintedCircle3Layout);
        cCPaintedCircle3Layout.setHorizontalGroup(
            cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cCPaintedCircle14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cCPaintedCircle3Layout.setVerticalGroup(
            cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle3Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(cCPaintedCircle14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cCPaintedCircle4.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle4.setDiameter(20);
        cCPaintedCircle4.setOpaque(false);

        cCPaintedCircle16.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle16.setDiameter(20);

        javax.swing.GroupLayout cCPaintedCircle16Layout = new javax.swing.GroupLayout(cCPaintedCircle16);
        cCPaintedCircle16.setLayout(cCPaintedCircle16Layout);
        cCPaintedCircle16Layout.setHorizontalGroup(
            cCPaintedCircle16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle16Layout.setVerticalGroup(
            cCPaintedCircle16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cCPaintedCircle4Layout = new javax.swing.GroupLayout(cCPaintedCircle4);
        cCPaintedCircle4.setLayout(cCPaintedCircle4Layout);
        cCPaintedCircle4Layout.setHorizontalGroup(
            cCPaintedCircle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cCPaintedCircle16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cCPaintedCircle4Layout.setVerticalGroup(
            cCPaintedCircle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle4Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(cCPaintedCircle16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        txtfiscalYearValue.setBackground(new java.awt.Color(204, 204, 204));
        txtfiscalYearValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtfiscalYearValue.setForeground(new java.awt.Color(0, 0, 0));
        txtfiscalYearValue.setText("Fiscal Year");

        txTotalBudgetValue.setBackground(new java.awt.Color(204, 204, 204));
        txTotalBudgetValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txTotalBudgetValue.setForeground(new java.awt.Color(0, 0, 0));
        txTotalBudgetValue.setText("Fiscal Year");

        txtAllocatedSalariesValue.setBackground(new java.awt.Color(204, 204, 204));
        txtAllocatedSalariesValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAllocatedSalariesValue.setForeground(new java.awt.Color(0, 0, 0));
        txtAllocatedSalariesValue.setText("Fiscal Year");

        txtAllocatedHiringValue.setBackground(new java.awt.Color(204, 204, 204));
        txtAllocatedHiringValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAllocatedHiringValue.setForeground(new java.awt.Color(0, 0, 0));
        txtAllocatedHiringValue.setText("Fiscal Year");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiscalYear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfiscalYearValue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TotalBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txTotalBudgetValue, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCPaintedCircle4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allocatedSalaries)
                    .addComponent(allocatedHiring))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAllocatedSalariesValue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAllocatedHiringValue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fiscalYear)
                                .addComponent(txtfiscalYearValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TotalBudget)
                                .addComponent(txTotalBudgetValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(allocatedSalaries)
                                .addComponent(txtAllocatedSalariesValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(allocatedHiring)
                                        .addComponent(txtAllocatedHiringValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cCPaintedCircle4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            int fiscalYear = Integer.parseInt(txtfiscalYearValue.getText());
            double total = Double.parseDouble(txTotalBudgetValue.getText());
            double sal = Double.parseDouble(txtAllocatedSalariesValue.getText());
            double hir = Double.parseDouble(txtAllocatedHiringValue.getText());

            departmentBudget.setFiscalYear(fiscalYear);
            departmentBudget.setTotalBudget(total);
            departmentBudget.setAllocatedForSalaries(sal);
            departmentBudget.setAllocatedForHiring(hir);

            DepartmentBudgetService service = new DepartmentBudgetService();
            service.updateDepartmentBudget(departmentBudget);

            JOptionPane.showMessageDialog(
                    this,
                    "Budget updated successfully!",
                    "Update",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numeric values for budget fields!",
                    "Invalid Input",
                    JOptionPane.WARNING_MESSAGE
            );
        } catch (Exception ex) {
            // Service’ten gelebilecek IllegalArgumentException, RuntimeException vb.
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            int budgetId = departmentBudget.getBudgetId();
            // Confirm
            int choice = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure you want to delete this budget?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION
            );
            if (choice == JOptionPane.YES_OPTION) {
                DepartmentBudgetService service = new DepartmentBudgetService();
                service.deleteDepartmentBudget(budgetId);

                JOptionPane.showMessageDialog(
                        this,
                        "Budget deleted!",
                        "Delete",
                        JOptionPane.INFORMATION_MESSAGE
                );
                this.setVisible(false);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalBudget;
    private javax.swing.JLabel allocatedHiring;
    private javax.swing.JLabel allocatedSalaries;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle1;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle10;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle12;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle14;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle16;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle2;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle3;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle4;
    private com.talentbridge.hirewise.custom_components.Button deleteButton;
    private javax.swing.JLabel fiscalYear;
    private javax.swing.JTextField txTotalBudgetValue;
    private javax.swing.JTextField txtAllocatedHiringValue;
    private javax.swing.JTextField txtAllocatedSalariesValue;
    private javax.swing.JTextField txtfiscalYearValue;
    private com.talentbridge.hirewise.custom_components.Button updateButton;
    // End of variables declaration//GEN-END:variables
}
