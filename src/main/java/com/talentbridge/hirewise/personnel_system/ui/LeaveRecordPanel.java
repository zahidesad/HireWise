package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.custom_components.CCLeaves;
import com.talentbridge.hirewise.custom_components.CCScrollBar;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.LeaveRecord;
import com.talentbridge.hirewise.personnel_system.service.LeaveRecordService;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author zahid
 */
public class LeaveRecordPanel extends javax.swing.JPanel implements IPage {

    public LeaveRecordPanel() {
        initComponents();
    }

    @Override
    public void onPageSetted() {
        // 1) Giriş yapan manager’ın employee nesnesine erişelim
        Employee managerEmp = MainFrame.instance.getEmployee();
        // 2) O employee’nin department_id’si:
        int managerDeptId = managerEmp.getDepartmentId();

        createLeaveRecordList(managerDeptId);
    }

    public List<LeaveRecord> getLeaveRecordsForManager(int managerDeptId) {
        LeaveRecordService leaveRecordService = new LeaveRecordService();

        List<LeaveRecord> allLeaves = leaveRecordService.getAllLeaveRecords();
        List<LeaveRecord> filteredLeaves = new ArrayList<>();

        for (LeaveRecord lr : allLeaves) {
            if (lr.getEmployee() != null && lr.getEmployee().getDepartmentId() == managerDeptId) {
                filteredLeaves.add(lr);
            }
        }
        return filteredLeaves;
    }

    private void createLeaveRecordList(int managerDeptId) {

        List<LeaveRecord> leaveRecords = getLeaveRecordsForManager(managerDeptId);

        JPanel resultConteiner = new JPanel();
        resultConteiner.setSize(800, 100 * leaveRecords.size());
        GridLayout gridLayout = new GridLayout(leaveRecords.size(), 1);
        gridLayout.setVgap(5);
        resultConteiner.setLayout(gridLayout);

        for (LeaveRecord leave : leaveRecords) {
            CCLeaves leavesElement = new CCLeaves(leave);
            leavesElement.setSize(700, 100);
            resultConteiner.add(leavesElement);
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

        setPreferredSize(new java.awt.Dimension(960, 550));

        label1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        label1.setText("Employee Leave Requests");
        label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private com.talentbridge.hirewise.custom_components.Label label1;
    // End of variables declaration//GEN-END:variables

}
