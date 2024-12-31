package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.ImageLib;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.PerformanceReview;
import com.talentbridge.hirewise.personnel_system.service.EmployeeService;
import com.talentbridge.hirewise.personnel_system.service.PerformanceReviewService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class GivePerformanceReviewPanel extends javax.swing.JPanel implements IPage {

    private List<Employee> departmentEmployees;

    public GivePerformanceReviewPanel() {
        initComponents();
    }

    @Override
    public void onPageSetted() {
        // 1) Giriş yapan manager
        Employee managerEmp = MainFrame.instance.getEmployee();
        int deptId = managerEmp.getDepartmentId();

        // 2) Departmandaki employees
        EmployeeService empService = new EmployeeService();
        List<Employee> allEmp = empService.getAllEmployees();
        departmentEmployees = new ArrayList<>();
        employeeNameComboBox.removeAllItems();

        for (Employee e : allEmp) {
            if (e.getDepartmentId() == deptId) {
                departmentEmployees.add(e);
                employeeNameComboBox.addItem(e.getFirstName() + " " + e.getLastName() + " (ID=" + e.getEmployeeId() + ")");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new com.talentbridge.hirewise.custom_components.Label();
        label2 = new com.talentbridge.hirewise.custom_components.Label();
        label3 = new com.talentbridge.hirewise.custom_components.Label();
        label5 = new com.talentbridge.hirewise.custom_components.Label();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        employeeNameComboBox = new javax.swing.JComboBox<>();
        txtReviewDate = new javax.swing.JTextField();
        perfomanceComboBox = new javax.swing.JComboBox<>();
        txtComments = new javax.swing.JTextField();
        employeeNameSurnameLabel = new com.talentbridge.hirewise.custom_components.Label();
        reviewDateLabel = new com.talentbridge.hirewise.custom_components.Label();
        performanceScoreLabel = new com.talentbridge.hirewise.custom_components.Label();
        commentsLabel = new com.talentbridge.hirewise.custom_components.Label();
        giveReviewButton = new com.talentbridge.hirewise.custom_components.Button();
        backButton = new com.talentbridge.hirewise.custom_components.Button();

        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Employee Name Surname : ");
        label1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        label2.setBackground(new java.awt.Color(204, 204, 204));
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Task Name : ");
        label2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        label3.setBackground(new java.awt.Color(204, 204, 204));
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Task Description : ");
        label3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        label5.setBackground(new java.awt.Color(204, 204, 204));
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Start Date : ");
        label5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        dateChooser1.setForeground(new java.awt.Color(0, 204, 204));
        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(txtReviewDate);

        employeeNameComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        employeeNameComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee 1", "Employee 2", "Employee 3", "Employee 4" }));

        perfomanceComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        perfomanceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        employeeNameSurnameLabel.setBackground(new java.awt.Color(204, 204, 204));
        employeeNameSurnameLabel.setForeground(new java.awt.Color(0, 0, 0));
        employeeNameSurnameLabel.setText("Employee Name Surname : ");
        employeeNameSurnameLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        reviewDateLabel.setBackground(new java.awt.Color(204, 204, 204));
        reviewDateLabel.setForeground(new java.awt.Color(0, 0, 0));
        reviewDateLabel.setText("Review Date : ");
        reviewDateLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        performanceScoreLabel.setBackground(new java.awt.Color(204, 204, 204));
        performanceScoreLabel.setForeground(new java.awt.Color(0, 0, 0));
        performanceScoreLabel.setText("Performance Score : ");
        performanceScoreLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        commentsLabel.setBackground(new java.awt.Color(204, 204, 204));
        commentsLabel.setForeground(new java.awt.Color(0, 0, 0));
        commentsLabel.setText("Comments :");
        commentsLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        giveReviewButton.setBackground(new java.awt.Color(204, 204, 204));
        giveReviewButton.setForeground(new java.awt.Color(0, 0, 0));
        giveReviewButton.setText("Give Review");
        giveReviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveReviewButtonActionPerformed(evt);
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(giveReviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeNameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reviewDateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(performanceScoreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(commentsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perfomanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReviewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(351, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(performanceScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(employeeNameSurnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReviewDate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reviewDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(perfomanceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(commentsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(giveReviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void giveReviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveReviewButtonActionPerformed
        try {
            // 1) Seçili employee
            int selIndex = employeeNameComboBox.getSelectedIndex();
            if (selIndex < 0) {
                throw new IllegalArgumentException("Please select an employee to review.");
            }
            Employee chosenEmp = departmentEmployees.get(selIndex);
            int empId = chosenEmp.getEmployeeId();

            // 2) Review date parse
            String dateStr = txtReviewDate.getText().trim();
            Date rDate = null;
            if (!dateStr.isEmpty()) {
                rDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
            }

            // 3) Score
            int score = Integer.parseInt(perfomanceComboBox.getSelectedItem().toString());

            // 4) Comments
            String cmnt = txtComments.getText().trim();

            // 5) Model
            PerformanceReview pr = new PerformanceReview();
            pr.setEmployeeId(empId);
            pr.setReviewDate(rDate);
            pr.setPerformanceScore(score);
            pr.setComments(cmnt);

            // 6) DB insert
            PerformanceReviewService prService = new PerformanceReviewService();
            prService.addPerformanceReview(pr);

            JOptionPane.showMessageDialog(
                    this,
                    "New performance review created!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            MainFrame.instance.setPage(MainFrame.instance.getShowPerformanceReviewPage());

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Invalid date format. Please use yyyy-MM-dd.",
                    "Date Parse Error",
                    JOptionPane.WARNING_MESSAGE
            );
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_giveReviewButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ImageIcon icon = new ImageIcon(ImageLib.getBackArrowPath());
        backButton.setIcon(icon);
        MainFrame.instance.setPage(MainFrame.instance.getShowPerformanceReviewPage());
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Button backButton;
    private com.talentbridge.hirewise.custom_components.Label commentsLabel;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JComboBox<String> employeeNameComboBox;
    private com.talentbridge.hirewise.custom_components.Label employeeNameSurnameLabel;
    private com.talentbridge.hirewise.custom_components.Button giveReviewButton;
    private com.talentbridge.hirewise.custom_components.Label label1;
    private com.talentbridge.hirewise.custom_components.Label label2;
    private com.talentbridge.hirewise.custom_components.Label label3;
    private com.talentbridge.hirewise.custom_components.Label label5;
    private javax.swing.JComboBox<String> perfomanceComboBox;
    private com.talentbridge.hirewise.custom_components.Label performanceScoreLabel;
    private com.talentbridge.hirewise.custom_components.Label reviewDateLabel;
    private javax.swing.JTextField txtComments;
    private javax.swing.JTextField txtReviewDate;
    // End of variables declaration//GEN-END:variables
}
