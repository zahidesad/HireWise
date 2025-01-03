package com.talentbridge.hirewise.custom_components.admin_custom_components;

import com.talentbridge.hirewise.personnel_system.model.Department;
import com.talentbridge.hirewise.personnel_system.model.DepartmentBudget;
import com.talentbridge.hirewise.personnel_system.service.DepartmentBudgetService;
import com.talentbridge.hirewise.personnel_system.service.DepartmentService;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class CCDepartment extends javax.swing.JPanel {

    private Department department;
    private DepartmentBudget currentBudget;

    public CCDepartment(Department d) {
        initComponents();
        this.department = d;
        setPanelData(department);
    }

    private void setPanelData(Department dept) {
        // 1) Department Name & Description
        txtDepartmentName.setText(dept.getDepartmentName());
        txtDepartmentDesc.setText(dept.getDepartmentDescription());

        // 2) Department Budget - son kaydı bul (veya bir mantık)
        DepartmentService deptService = new DepartmentService();
        List<DepartmentBudget> budgetHistory = deptService.getDepartmentBudgetHistory(dept.getDepartmentId());
        if (!budgetHistory.isEmpty()) {
            // Örnek: en son kaydı al
            currentBudget = budgetHistory.get(budgetHistory.size() - 1);
            txtDepartmentBudget.setText(String.valueOf(currentBudget.getTotalBudget()));
        } else {
            // Budget kaydı yoksa
            currentBudget = null;
            txtDepartmentBudget.setText("0");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCPaintedCircle1 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        departmentName = new javax.swing.JLabel();
        txtDepartmentName = new javax.swing.JTextField();
        cCPaintedCircle2 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        deptDescription = new javax.swing.JLabel();
        txtDepartmentDesc = new javax.swing.JTextField();
        cCPaintedCircle3 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        deptBudget = new javax.swing.JLabel();
        txtDepartmentBudget = new javax.swing.JTextField();
        updateButton = new com.talentbridge.hirewise.custom_components.Button();

        setBackground(new java.awt.Color(153, 153, 153));

        cCPaintedCircle1.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle1.setDiameter(20);
        cCPaintedCircle1.setOpaque(false);

        javax.swing.GroupLayout cCPaintedCircle1Layout = new javax.swing.GroupLayout(cCPaintedCircle1);
        cCPaintedCircle1.setLayout(cCPaintedCircle1Layout);
        cCPaintedCircle1Layout.setHorizontalGroup(
            cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle1Layout.setVerticalGroup(
            cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        departmentName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        departmentName.setText("Department Name : ");

        txtDepartmentName.setBackground(new java.awt.Color(204, 204, 204));
        txtDepartmentName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDepartmentName.setForeground(new java.awt.Color(0, 0, 0));

        cCPaintedCircle2.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle2.setDiameter(20);
        cCPaintedCircle2.setOpaque(false);

        javax.swing.GroupLayout cCPaintedCircle2Layout = new javax.swing.GroupLayout(cCPaintedCircle2);
        cCPaintedCircle2.setLayout(cCPaintedCircle2Layout);
        cCPaintedCircle2Layout.setHorizontalGroup(
            cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle2Layout.setVerticalGroup(
            cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        deptDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deptDescription.setText("Department Description : ");

        txtDepartmentDesc.setBackground(new java.awt.Color(204, 204, 204));
        txtDepartmentDesc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDepartmentDesc.setForeground(new java.awt.Color(0, 0, 0));

        cCPaintedCircle3.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle3.setDiameter(20);
        cCPaintedCircle3.setOpaque(false);

        javax.swing.GroupLayout cCPaintedCircle3Layout = new javax.swing.GroupLayout(cCPaintedCircle3);
        cCPaintedCircle3.setLayout(cCPaintedCircle3Layout);
        cCPaintedCircle3Layout.setHorizontalGroup(
            cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle3Layout.setVerticalGroup(
            cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        deptBudget.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deptBudget.setText("Department Budget : ");

        txtDepartmentBudget.setBackground(new java.awt.Color(204, 204, 204));
        txtDepartmentBudget.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDepartmentBudget.setForeground(new java.awt.Color(0, 0, 0));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deptDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepartmentDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDepartmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deptBudget)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDepartmentBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deptBudget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDepartmentBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(departmentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDepartmentName))
                    .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDepartmentDesc)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deptDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            // 1) Department ad/desc
            String newName = txtDepartmentName.getText().trim();
            String newDesc = txtDepartmentDesc.getText().trim();

            // 2) Department Budget
            String budStr = txtDepartmentBudget.getText().trim();
            double newBudget = Double.parseDouble(budStr);

            // 3) Department update
            DepartmentService deptService = new DepartmentService();
            deptService.updateDepartment(department.getDepartmentId(), newName, newDesc);

            // 4) Budget update
            if (currentBudget != null) {
                currentBudget.setTotalBudget(newBudget);
                DepartmentBudgetService bService = new DepartmentBudgetService();
                bService.updateDepartmentBudget(currentBudget);
            } else {
                // Elde bir budget kaydı yok, belki eklemek istersiniz
                DepartmentBudget newB = new DepartmentBudget();
                newB.setDepartmentId(department.getDepartmentId());
                newB.setFiscalYear(2024);  // sabit mi alacaksınız?
                newB.setTotalBudget(newBudget);
                newB.setAllocatedForSalaries(0);
                newB.setAllocatedForHiring(0);

                DepartmentBudgetService bService = new DepartmentBudgetService();
                bService.addDepartmentBudget(newB);
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Department updated successfully!",
                    "Update",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Invalid budget value, please enter numeric.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle1;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle2;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle3;
    private javax.swing.JLabel departmentName;
    private javax.swing.JLabel deptBudget;
    private javax.swing.JLabel deptDescription;
    private javax.swing.JTextField txtDepartmentBudget;
    private javax.swing.JTextField txtDepartmentDesc;
    private javax.swing.JTextField txtDepartmentName;
    private com.talentbridge.hirewise.custom_components.Button updateButton;
    // End of variables declaration//GEN-END:variables
}
