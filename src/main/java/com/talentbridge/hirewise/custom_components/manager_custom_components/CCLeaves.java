package com.talentbridge.hirewise.custom_components.manager_custom_components;

import com.talentbridge.hirewise.personnel_system.model.LeaveRecord;
import com.talentbridge.hirewise.personnel_system.service.LeaveRecordService;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class CCLeaves extends javax.swing.JPanel {

    LeaveRecord leave;

    public CCLeaves(LeaveRecord leave) {
        initComponents();

        this.leave = leave;
        setPanel(leave);
    }

    public final void setPanel(LeaveRecord leave) {
        employeeNameLabel.setText(leave.getEmployee().getFirstName() + " " + leave.getEmployee().getLastName());
        employeePositionLabel.setText(leave.getEmployee().getPosition().getPositionTitle());
        startDateLabel.setText(leave.getStartDate().toString());
        endDateLabel.setText(leave.getEndDate().toString());
        leaveTypeLabel.setText(leave.getLeaveType());
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Pending", "Approved", "Rejected"}));
        statusComboBox.setSelectedItem(leave.getStatus());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeePositionLabel = new javax.swing.JLabel();
        endDateLabel = new javax.swing.JLabel();
        employeeNameLabel = new javax.swing.JLabel();
        startDateLabel = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        saveButton = new com.talentbridge.hirewise.custom_components.Button();
        leaveTypeLabel = new javax.swing.JLabel();
        cCPaintedCircle1 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle4 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle2 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle5 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle3 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle6 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle7 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle8 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle9 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle10 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();

        setBackground(new java.awt.Color(153, 153, 153));

        employeePositionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employeePositionLabel.setText("Employee Position");

        endDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        endDateLabel.setText("End Date");

        employeeNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        employeeNameLabel.setText("Employee Name");

        startDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startDateLabel.setText("Start Date");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Rejected" }));

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        leaveTypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        leaveTypeLabel.setText("Leave Type");

        cCPaintedCircle1.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle1.setDiameter(20);
        cCPaintedCircle1.setOpaque(false);

        cCPaintedCircle4.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle4.setDiameter(20);

        javax.swing.GroupLayout cCPaintedCircle4Layout = new javax.swing.GroupLayout(cCPaintedCircle4);
        cCPaintedCircle4.setLayout(cCPaintedCircle4Layout);
        cCPaintedCircle4Layout.setHorizontalGroup(
            cCPaintedCircle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle4Layout.setVerticalGroup(
            cCPaintedCircle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(cCPaintedCircle4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cCPaintedCircle1Layout.setVerticalGroup(
            cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(cCPaintedCircle4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cCPaintedCircle2.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle2.setDiameter(20);
        cCPaintedCircle2.setOpaque(false);

        cCPaintedCircle5.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle5.setDiameter(20);

        javax.swing.GroupLayout cCPaintedCircle5Layout = new javax.swing.GroupLayout(cCPaintedCircle5);
        cCPaintedCircle5.setLayout(cCPaintedCircle5Layout);
        cCPaintedCircle5Layout.setHorizontalGroup(
            cCPaintedCircle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle5Layout.setVerticalGroup(
            cCPaintedCircle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(cCPaintedCircle5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cCPaintedCircle2Layout.setVerticalGroup(
            cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle2Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(cCPaintedCircle5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cCPaintedCircle3.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle3.setDiameter(20);
        cCPaintedCircle3.setOpaque(false);

        cCPaintedCircle6.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle6.setDiameter(20);

        javax.swing.GroupLayout cCPaintedCircle6Layout = new javax.swing.GroupLayout(cCPaintedCircle6);
        cCPaintedCircle6.setLayout(cCPaintedCircle6Layout);
        cCPaintedCircle6Layout.setHorizontalGroup(
            cCPaintedCircle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle6Layout.setVerticalGroup(
            cCPaintedCircle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(cCPaintedCircle6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cCPaintedCircle3Layout.setVerticalGroup(
            cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle3Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(cCPaintedCircle6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cCPaintedCircle7.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle7.setDiameter(20);
        cCPaintedCircle7.setOpaque(false);

        cCPaintedCircle8.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle8.setDiameter(20);

        javax.swing.GroupLayout cCPaintedCircle8Layout = new javax.swing.GroupLayout(cCPaintedCircle8);
        cCPaintedCircle8.setLayout(cCPaintedCircle8Layout);
        cCPaintedCircle8Layout.setHorizontalGroup(
            cCPaintedCircle8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle8Layout.setVerticalGroup(
            cCPaintedCircle8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cCPaintedCircle7Layout = new javax.swing.GroupLayout(cCPaintedCircle7);
        cCPaintedCircle7.setLayout(cCPaintedCircle7Layout);
        cCPaintedCircle7Layout.setHorizontalGroup(
            cCPaintedCircle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cCPaintedCircle8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cCPaintedCircle7Layout.setVerticalGroup(
            cCPaintedCircle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle7Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(cCPaintedCircle8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        cCPaintedCircle9.setColor(new java.awt.Color(255, 153, 102));
        cCPaintedCircle9.setDiameter(20);
        cCPaintedCircle9.setOpaque(false);

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

        javax.swing.GroupLayout cCPaintedCircle9Layout = new javax.swing.GroupLayout(cCPaintedCircle9);
        cCPaintedCircle9.setLayout(cCPaintedCircle9Layout);
        cCPaintedCircle9Layout.setHorizontalGroup(
            cCPaintedCircle9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cCPaintedCircle10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        cCPaintedCircle9Layout.setVerticalGroup(
            cCPaintedCircle9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(cCPaintedCircle9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cCPaintedCircle9Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(cCPaintedCircle10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cCPaintedCircle9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeePositionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(employeeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(endDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addComponent(startDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(leaveTypeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leaveTypeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startDateLabel)
                                    .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endDateLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(employeeNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(employeePositionLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cCPaintedCircle9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        leave.setStatus(statusComboBox.getSelectedItem().toString());
        LeaveRecordService leaveRecordService = new LeaveRecordService();
        leaveRecordService.updateLeaveRecord(leave);
        
        JOptionPane.showMessageDialog(
                this,
                "Leave Status Updated!",
                "Update Success",
                JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle1;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle10;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle2;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle3;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle4;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle5;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle6;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle7;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle8;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle9;
    private javax.swing.JLabel employeeNameLabel;
    private javax.swing.JLabel employeePositionLabel;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JLabel leaveTypeLabel;
    private com.talentbridge.hirewise.custom_components.Button saveButton;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JComboBox<String> statusComboBox;
    // End of variables declaration//GEN-END:variables
}
