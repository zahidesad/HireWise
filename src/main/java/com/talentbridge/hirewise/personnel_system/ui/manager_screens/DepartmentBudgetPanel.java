package com.talentbridge.hirewise.personnel_system.ui.manager_screens;

import com.talentbridge.hirewise.custom_components.manager_custom_components.CCDepartmentBudget;
import com.talentbridge.hirewise.custom_components.CCScrollBar;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.DepartmentBudget;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.service.DepartmentBudgetService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author zahid
 */
public class DepartmentBudgetPanel extends javax.swing.JPanel implements IPage {

    public DepartmentBudgetPanel() {
        initComponents();
    }

    @Override
    public void onPageSetted() {
        Employee managerEmp = MainFrame.instance.getEmployee();
        int managerDeptId = managerEmp.getDepartmentId();

        DepartmentBudgetService budgetService = new DepartmentBudgetService();
        List<DepartmentBudget> budgets = budgetService.getBudgetsByDepartmentId(managerDeptId);

        displayBudgets(budgets);
    }

    private void displayBudgets(List<DepartmentBudget> budgets) {

        JPanel resultConteiner = new JPanel();
        resultConteiner.setSize(800, 100 * budgets.size());
        GridLayout gridLayout = new GridLayout(budgets.size(), 1);
        gridLayout.setVgap(5);
        resultConteiner.setLayout(gridLayout);

        for (DepartmentBudget b : budgets) {
            CCDepartmentBudget budgetPanel = new CCDepartmentBudget(b);
            resultConteiner.add(budgetPanel);
        }
        jScrollPane1.setViewportView(resultConteiner);

        jScrollPane1.setVerticalScrollBar(new CCScrollBar());
        CCScrollBar sp = new CCScrollBar();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane1.setHorizontalScrollBar(sp);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new com.talentbridge.hirewise.custom_components.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        addNewDepartmentBudget = new com.talentbridge.hirewise.custom_components.Button();

        label1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        label1.setText("Department Budgets");
        label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addNewDepartmentBudget.setBackground(new java.awt.Color(204, 204, 204));
        addNewDepartmentBudget.setForeground(new java.awt.Color(0, 0, 0));
        addNewDepartmentBudget.setText("Add New Department Budget");
        addNewDepartmentBudget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewDepartmentBudgetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addNewDepartmentBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addNewDepartmentBudget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNewDepartmentBudgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewDepartmentBudgetActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getAddNewDepartmentBudgetPage());
    }//GEN-LAST:event_addNewDepartmentBudgetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Button addNewDepartmentBudget;
    private javax.swing.JScrollPane jScrollPane1;
    private com.talentbridge.hirewise.custom_components.Label label1;
    // End of variables declaration//GEN-END:variables
}
