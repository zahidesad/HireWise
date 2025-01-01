package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.custom_components.CCScrollBar;
import com.talentbridge.hirewise.custom_components.CCLeaveRequestElement;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.LeaveRecord;
import com.talentbridge.hirewise.personnel_system.service.LeaveRecordService;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author emirs
 */
public class EmpLeaveRequestsPanel extends javax.swing.JPanel implements IPage{

    LeaveRecordService lrs = new LeaveRecordService();
    
    public EmpLeaveRequestsPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        leaveRequestsScrollPane = new javax.swing.JScrollPane();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Leave Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leaveRequestsScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(leaveRequestsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createLeaveRequestskList(List<LeaveRecord> records) {
        JPanel resultConteiner = new JPanel();
        resultConteiner.setSize(250 * records.size(), 250);
        GridLayout gridLayout = new GridLayout(1, records.size());
        gridLayout.setHgap(10);
        resultConteiner.setLayout(gridLayout);

        CCLeaveRequestElement addRecordElement = new CCLeaveRequestElement();
        resultConteiner.add(addRecordElement);
        
        for (LeaveRecord t : records) {
            CCLeaveRequestElement recordPanel = new CCLeaveRequestElement(t);
            resultConteiner.add(recordPanel);
        }
            
        leaveRequestsScrollPane.setViewportView(resultConteiner);
        leaveRequestsScrollPane.setVerticalScrollBar(new CCScrollBar());
        CCScrollBar sp = new CCScrollBar();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        leaveRequestsScrollPane.setHorizontalScrollBar(sp);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane leaveRequestsScrollPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        var records = lrs.getEmployeeLeaveRecords(MainFrame.instance.getEmployee().getEmployeeId());
        createLeaveRequestskList(records);
    }
}
