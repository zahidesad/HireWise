package com.talentbridge.hirewise.personnel_system.ui.admin_screens;

import com.talentbridge.hirewise.custom_components.CCScrollBar;
import com.talentbridge.hirewise.custom_components.admin_custom_components.CCDepartment;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Department;
import com.talentbridge.hirewise.personnel_system.service.DepartmentService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author zahid
 */
public class ShowDepartmentsPanel extends javax.swing.JPanel implements IPage {

    public ShowDepartmentsPanel() {
        initComponents();
    }
    @Override
    public void onPageSetted() {
        // 1) Tüm department’ları çek
        DepartmentService deptService = new DepartmentService();
        List<Department> allDepts = deptService.getAllDepartments();

        // 2) Ekrana bas
        createDepartmentList(allDepts);
    }

    private void createDepartmentList(List<Department> departments) {
        JPanel container = new JPanel();
        container.setSize(800, 100 * departments.size());
        container.setLayout(new GridLayout(departments.size(), 1, 0, 5));
        GridLayout gridLayout = new GridLayout(departments.size(), 1);
        gridLayout.setVgap(5);
        container.setLayout(gridLayout);


        for (Department d : departments) {
            CCDepartment deptPanel = new CCDepartment(d);
            container.add(deptPanel);
        }

        jScrollPane.setViewportView(container);

        // Opsiyonel: özel scrollbar
        jScrollPane.setVerticalScrollBar(new CCScrollBar());
        CCScrollBar sp = new CCScrollBar();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane.setHorizontalScrollBar(sp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        header = new com.talentbridge.hirewise.custom_components.Label();
        addNewDepartment = new com.talentbridge.hirewise.custom_components.Button();

        header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        header.setText("All Departments");
        header.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addNewDepartment.setBackground(new java.awt.Color(204, 204, 204));
        addNewDepartment.setForeground(new java.awt.Color(0, 0, 0));
        addNewDepartment.setText("Add New Department");
        addNewDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addNewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addNewDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNewDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewDepartmentActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getAddNewDepartmentPage());
    }//GEN-LAST:event_addNewDepartmentActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Button addNewDepartment;
    private com.talentbridge.hirewise.custom_components.Label header;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables

}
