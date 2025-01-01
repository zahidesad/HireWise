package com.talentbridge.hirewise.custom_components;

import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.LeaveRecord;
import com.talentbridge.hirewise.personnel_system.service.LeaveRecordService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author emirs
 */
public class CCLeaveRequestElement extends javax.swing.JPanel {

    public CCLeaveRequestElement() {
        initComponents();

        record = new LeaveRecord();
        record.setStatus("Pending");
        
        deleteButton.setEnabled(false);
        updateButton.setText("Add");
        addMode = true;
    }

    boolean addMode = false;
    LeaveRecord record;
    LeaveRecordService lrs = new LeaveRecordService();

    public CCLeaveRequestElement(LeaveRecord record) {
        initComponents();

        this.record = record;
        leaveTypeComboBox.setSelectedItem(record.getLeaveType());
        statusComboBox.setSelectedItem(record.getStatus());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = sdf.format(record.getStartDate());
        startDateTxt.setText(formattedDate);
        formattedDate = sdf.format(record.getEndDate());
        endDateTxt.setText(formattedDate);

        Employee approvedBy = record.getApprovedByEmployee();
        String name = (approvedBy != null) ? approvedBy.getFirstName() + " " + approvedBy.getLastName() : "Waiting...";
        approvedByLabel.setText(name);
        
        if (!record.getStatus().equals("Pending")) {
            updateButton.setEnabled(false);
            deleteButton.setEnabled(false);
            startDateTxt.setEnabled(false);
            startDate.setEnabled(false);
            endDateTxt.setEnabled(false);
            endDate.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startDate = new com.raven.datechooser.DateChooser();
        endDate = new com.raven.datechooser.DateChooser();
        jLabel1 = new javax.swing.JLabel();
        leaveTypeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        approvedByLabel = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        cCGradientPanel1 = new com.talentbridge.hirewise.custom_components.CCGradientPanel();
        startDateTxt = new javax.swing.JTextField();
        endDateTxt = new javax.swing.JTextField();

        startDate.setDateFormat("yyyy-MM-dd");
        startDate.setTextRefernce(startDateTxt);

        endDate.setDateFormat("yyyy-MM-dd");
        endDate.setTextRefernce(endDateTxt);

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Leave Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 98, -1));

        leaveTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Annual", "Sick" }));
        add(leaveTypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 28, 98, -1));

        jLabel2.setText("Status:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 6, 98, -1));

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "Approved", "Rejected" }));
        statusComboBox.setEnabled(false);
        add(statusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 28, 98, -1));

        jLabel3.setText("Start Date:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 98, -1));

        jLabel4.setText("End Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 80, 98, -1));

        jLabel5.setText("Approved By:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 173, 98, -1));

        approvedByLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        approvedByLabel.setText("Pending...");
        add(approvedByLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 189, 98, 29));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 173, 98, -1));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 202, 98, -1));

        cCGradientPanel1.setGradientEndd(new java.awt.Color(204, 255, 204));
        cCGradientPanel1.setGradientStart(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout cCGradientPanel1Layout = new javax.swing.GroupLayout(cCGradientPanel1);
        cCGradientPanel1.setLayout(cCGradientPanel1Layout);
        cCGradientPanel1Layout.setHorizontalGroup(
            cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cCGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(endDateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                .addContainerGap())
        );
        cCGradientPanel1Layout.setVerticalGroup(
            cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cCGradientPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        add(cCGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        if (!record.getStatus().equals("Pending")) {
            JOptionPane.showMessageDialog(
                    MainFrame.instance,
                    "You Cannot Update Accepted&Rejected Requests",
                    "Update Failure",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        try {
            // TODO add your handling code here:
            Date endD = new SimpleDateFormat("yyyy-MM-dd").parse(endDateTxt.getText().trim());
            Date startD = new SimpleDateFormat("yyyy-MM-dd").parse(startDateTxt.getText().trim());
            String leaveType = (String) leaveTypeComboBox.getSelectedItem();

            record.setLeaveType(leaveType);
            record.setEndDate(endD);
            record.setStartDate(startD);

            if (addMode) {
                record.setEmployeeId(MainFrame.instance.getEmployee().getEmployeeId());
                lrs.updateLeaveRecord(record);
                lrs.addLeaveRecord(record);
                MainFrame.instance.getEmpLeaveRequestsPage().onPageSetted();
            } else {
                lrs.updateLeaveRecord(record);
            }

            JOptionPane.showMessageDialog(
                    MainFrame.instance,
                    "Leave Request Updated!",
                    "Update Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(
                    MainFrame.instance,
                    "Parsing Error!",
                    "An Error Occured",
                    JOptionPane.ERROR_MESSAGE
            );
            System.out.println("Parsing Error");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        lrs.deleteLeaveRecord(record.getLeaveId());
        JOptionPane.showMessageDialog(
                MainFrame.instance,
                "Leave Request Deleted Succesfully!",
                "Delete Success",
                JOptionPane.INFORMATION_MESSAGE
        );
        MainFrame.instance.getEmpLeaveRequestsPage().onPageSetted();
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel approvedByLabel;
    private com.talentbridge.hirewise.custom_components.CCGradientPanel cCGradientPanel1;
    private javax.swing.JButton deleteButton;
    private com.raven.datechooser.DateChooser endDate;
    private javax.swing.JTextField endDateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> leaveTypeComboBox;
    private com.raven.datechooser.DateChooser startDate;
    private javax.swing.JTextField startDateTxt;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
