package com.talentbridge.hirewise.custom_components;

import com.talentbridge.hirewise.personnel_system.model.DepartmentBudget;

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
        fiscalYearValue.setText(String.valueOf(departmentBudget.getFiscalYear()));
        totalBudgetValue.setText(String.valueOf(departmentBudget.getTotalBudget()));
        allocatedSalariesValue.setText(String.valueOf(departmentBudget.getAllocatedForSalaries()));
        allocatedHiringValue.setText(String.valueOf(departmentBudget.getAllocatedForHiring()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new com.talentbridge.hirewise.custom_components.Label();
        fiscalYear = new javax.swing.JLabel();
        label3 = new com.talentbridge.hirewise.custom_components.Label();
        TotalBudget = new javax.swing.JLabel();
        label5 = new com.talentbridge.hirewise.custom_components.Label();
        allocatedSalaries = new javax.swing.JLabel();
        label6 = new com.talentbridge.hirewise.custom_components.Label();
        allocatedHiring = new javax.swing.JLabel();
        fiscalYearValue = new javax.swing.JLabel();
        totalBudgetValue = new javax.swing.JLabel();
        allocatedSalariesValue = new javax.swing.JLabel();
        allocatedHiringValue = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        label2.setBackground(new java.awt.Color(255, 153, 102));
        label2.setForeground(new java.awt.Color(255, 153, 102));

        fiscalYear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fiscalYear.setText("Fiscal Year :");

        label3.setBackground(new java.awt.Color(255, 153, 102));
        label3.setForeground(new java.awt.Color(255, 153, 102));

        TotalBudget.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TotalBudget.setText("Total Budget :");

        label5.setBackground(new java.awt.Color(255, 153, 102));
        label5.setForeground(new java.awt.Color(255, 153, 102));

        allocatedSalaries.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allocatedSalaries.setText("Allocated for Salaries :");

        label6.setBackground(new java.awt.Color(255, 153, 102));
        label6.setForeground(new java.awt.Color(255, 153, 102));

        allocatedHiring.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allocatedHiring.setText("Allocated for Hiring :");

        fiscalYearValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fiscalYearValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fiscalYearValue.setText("Fiscal Year");

        totalBudgetValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalBudgetValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalBudgetValue.setText("Total Budget");

        allocatedSalariesValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allocatedSalariesValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allocatedSalariesValue.setText("Allocated for Salaries");

        allocatedHiringValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allocatedHiringValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allocatedHiringValue.setText("Allocated for Hiring");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fiscalYear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiscalYearValue, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TotalBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalBudgetValue)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allocatedSalaries)
                    .addComponent(allocatedHiring))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(allocatedHiringValue)
                    .addComponent(allocatedSalariesValue))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(allocatedSalariesValue)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allocatedSalaries))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(allocatedHiring)
                                .addComponent(allocatedHiringValue))
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fiscalYear)
                                .addComponent(fiscalYearValue))
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TotalBudget)
                                .addComponent(totalBudgetValue)))))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalBudget;
    private javax.swing.JLabel allocatedHiring;
    private javax.swing.JLabel allocatedHiringValue;
    private javax.swing.JLabel allocatedSalaries;
    private javax.swing.JLabel allocatedSalariesValue;
    private javax.swing.JLabel fiscalYear;
    private javax.swing.JLabel fiscalYearValue;
    private com.talentbridge.hirewise.custom_components.Label label2;
    private com.talentbridge.hirewise.custom_components.Label label3;
    private com.talentbridge.hirewise.custom_components.Label label5;
    private com.talentbridge.hirewise.custom_components.Label label6;
    private javax.swing.JLabel totalBudgetValue;
    // End of variables declaration//GEN-END:variables
}
