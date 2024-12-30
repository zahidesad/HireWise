package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.ImageLib;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.Task;
import com.talentbridge.hirewise.personnel_system.service.EmployeeService;
import com.talentbridge.hirewise.personnel_system.service.TaskService;
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
public class AddNewTaskManagerPanel extends javax.swing.JPanel implements IPage {

    private List<Employee> departmentEmployees;

    public AddNewTaskManagerPanel() {
        initComponents();
    }

    @Override
    public void onPageSetted() {
        // Combobox doldurma (manager dept employees)
        Employee managerEmp = MainFrame.instance.getEmployee();
        int managerDeptId = managerEmp.getDepartmentId();

        EmployeeService empService = new EmployeeService();
        List<Employee> allEmp = empService.getAllEmployees();
        departmentEmployees = new ArrayList<>();
        employeeComboBox.removeAllItems();

        for (Employee e : allEmp) {
            if (e.getDepartmentId() == managerDeptId) {
                departmentEmployees.add(e);
                employeeComboBox.addItem(e.getFirstName() + " " + e.getLastName() + " (ID=" + e.getEmployeeId() + ")");
            }
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        startDate = new com.raven.datechooser.DateChooser();
        endDate = new com.raven.datechooser.DateChooser();
        label1 = new com.talentbridge.hirewise.custom_components.Label();
        label2 = new com.talentbridge.hirewise.custom_components.Label();
        txtTaskName = new com.talentbridge.hirewise.custom_components.TextField();
        label3 = new com.talentbridge.hirewise.custom_components.Label();
        txtTaskDescription = new com.talentbridge.hirewise.custom_components.TextField();
        label4 = new com.talentbridge.hirewise.custom_components.Label();
        startDateTxt = new com.talentbridge.hirewise.custom_components.TextField();
        saveButton = new com.talentbridge.hirewise.custom_components.Button();
        backButton = new com.talentbridge.hirewise.custom_components.Button();
        employeeComboBox = new javax.swing.JComboBox<>();
        label5 = new com.talentbridge.hirewise.custom_components.Label();
        endDateTxt = new com.talentbridge.hirewise.custom_components.TextField();

        jScrollPane1.setViewportView(jEditorPane1);

        startDate.setDateFormat("yyyy-MM-dd");
        startDate.setTextRefernce(startDateTxt);

        endDate.setDateFormat("yyyy-MM-dd");
        endDate.setTextRefernce(endDateTxt);

        label1.setBackground(new java.awt.Color(204, 204, 204));
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Employee Name Surname : ");
        label1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        label2.setBackground(new java.awt.Color(204, 204, 204));
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Task Name : ");
        label2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        txtTaskName.setBackground(new java.awt.Color(204, 204, 204));
        txtTaskName.setForeground(new java.awt.Color(0, 0, 0));

        label3.setBackground(new java.awt.Color(204, 204, 204));
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Task Description : ");
        label3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        txtTaskDescription.setBackground(new java.awt.Color(204, 204, 204));
        txtTaskDescription.setForeground(new java.awt.Color(0, 0, 0));

        label4.setBackground(new java.awt.Color(204, 204, 204));
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("End Date : ");
        label4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        startDateTxt.setBackground(new java.awt.Color(204, 204, 204));
        startDateTxt.setForeground(new java.awt.Color(0, 0, 0));
        startDateTxt.setText("");

        saveButton.setBackground(new java.awt.Color(204, 204, 204));
        saveButton.setForeground(new java.awt.Color(0, 0, 0));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(102, 102, 102));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back-arrow.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee 1", "Employee 2", "Employee 3", "Employee 4" }));

        label5.setBackground(new java.awt.Color(204, 204, 204));
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Start Date : ");
        label5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        endDateTxt.setBackground(new java.awt.Color(204, 204, 204));
        endDateTxt.setForeground(new java.awt.Color(0, 0, 0));
        endDateTxt.setText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(422, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTaskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTaskDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            // 1) ComboBox seçili employee
            int selIndex = employeeComboBox.getSelectedIndex();
            if (selIndex < 0) {
                throw new IllegalArgumentException("Please select an employee to assign the Task.");
            }
            Employee chosenEmp = departmentEmployees.get(selIndex);

            // 2) Task name, desc
            String taskName = txtTaskName.getText().trim();
            String taskDesc = txtTaskDescription.getText().trim();
            if (taskName.isEmpty()) {
                throw new IllegalArgumentException("Task name is required.");
            }

            // 3) startDate, endDate parse
            Date startD = null, endD = null;
            if (!startDateTxt.getText().trim().isEmpty()) {
                startD = new SimpleDateFormat("yyyy-MM-dd").parse(startDateTxt.getText().trim());
            }
            if (!endDateTxt.getText().trim().isEmpty()) {
                endD = new SimpleDateFormat("yyyy-MM-dd").parse(endDateTxt.getText().trim());
            }

            // 4) Model
            Task newTask = new Task();
            newTask.setAssignedTo(chosenEmp.getEmployeeId());
            newTask.setTaskName(taskName);
            newTask.setTaskDescription(taskDesc);
            newTask.setStartDate(startD);
            newTask.setEndDate(endD);
            newTask.setStatus("Pending");  // veya “In Progress” / “Pending”, default

            // 5) Service
            TaskService service = new TaskService();
            service.addTask(newTask);

            JOptionPane.showMessageDialog(
                    this,
                    "Task added successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE
            );

            // Geri dön ShowTasksManagerPanel
            MainFrame.instance.setPage(MainFrame.instance.getShowTasksManagerPage());

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Invalid date format. Please use yyyy-MM-dd",
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
    }//GEN-LAST:event_saveButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ImageIcon icon = new ImageIcon(ImageLib.getBackArrowPath());
        backButton.setIcon(icon);
        MainFrame.instance.setPage(MainFrame.instance.getShowTasksManagerPage());
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Button backButton;
    private javax.swing.JComboBox<String> employeeComboBox;
    private com.raven.datechooser.DateChooser endDate;
    private com.talentbridge.hirewise.custom_components.TextField endDateTxt;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.talentbridge.hirewise.custom_components.Label label1;
    private com.talentbridge.hirewise.custom_components.Label label2;
    private com.talentbridge.hirewise.custom_components.Label label3;
    private com.talentbridge.hirewise.custom_components.Label label4;
    private com.talentbridge.hirewise.custom_components.Label label5;
    private com.talentbridge.hirewise.custom_components.Button saveButton;
    private com.raven.datechooser.DateChooser startDate;
    private com.talentbridge.hirewise.custom_components.TextField startDateTxt;
    private com.talentbridge.hirewise.custom_components.TextField txtTaskDescription;
    private com.talentbridge.hirewise.custom_components.TextField txtTaskName;
    // End of variables declaration//GEN-END:variables
}
