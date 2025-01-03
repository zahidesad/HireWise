package com.talentbridge.hirewise.custom_components.manager_custom_components;

import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.Task;
import com.talentbridge.hirewise.personnel_system.service.EmployeeService;
import com.talentbridge.hirewise.personnel_system.service.TaskService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class CCTaskElementManager extends javax.swing.JPanel {

    private Task task;
    private List<Employee> departmentEmployees;

    public CCTaskElementManager(Task t) {
        initComponents();
        this.task = t;
        setPanelData(t);
    }

    private void setPanelData(Task t) {
        Employee managerEmp = MainFrame.instance.getEmployee();
        int managerDeptId = managerEmp.getDepartmentId();

        EmployeeService empService = new EmployeeService();
        List<Employee> allEmp = empService.getAllEmployees();
        departmentEmployees = new ArrayList<>();
        for (Employee e : allEmp) {
            if (e.getDepartmentId() == managerDeptId) {
                departmentEmployees.add(e);
            }
        }
        // Combobox doldur
        employeeComboBox.removeAllItems();
        for (Employee e : departmentEmployees) {
            employeeComboBox.addItem(e.getFirstName() + " " + e.getLastName() + " (ID=" + e.getEmployeeId() + ")");
        }
        int assignedId = t.getAssignedTo();
        if (assignedId > 0) {
            for (int i = 0; i < departmentEmployees.size(); i++) {
                if (departmentEmployees.get(i).getEmployeeId() == assignedId) {
                    employeeComboBox.setSelectedIndex(i);
                    break;
                }
            }
        }

        // 3) Date’ler ve description, status
        if (t.getStartDate() != null) {
            txtStartDate.setText(new SimpleDateFormat("yyyy-MM-dd").format(t.getStartDate()));
        }
        if (t.getEndDate() != null) {
            txtEndDate.setText(new SimpleDateFormat("yyyy-MM-dd").format(t.getEndDate()));
        }
        txtDescription.setText(t.getTaskDescription());
        statusComboBox.setSelectedItem(t.getStatus()); // “Pending”, “In Progress”, “Completed”
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startDate = new com.raven.datechooser.DateChooser();
        endDate = new com.raven.datechooser.DateChooser();
        cCPaintedCircle1 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle4 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        employeeComboBox = new javax.swing.JComboBox<>();
        cCPaintedCircle2 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle5 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        txtStartDate = new javax.swing.JTextField();
        cCPaintedCircle3 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle6 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        txtEndDate = new javax.swing.JTextField();
        cCPaintedCircle7 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle8 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        txtDescription = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        updateButton = new com.talentbridge.hirewise.custom_components.Button();
        deleteButton = new com.talentbridge.hirewise.custom_components.Button();

        startDate.setDateFormat("yyyy-MM-dd");
        startDate.setTextRefernce(txtStartDate);

        endDate.setDateFormat("yyyy-MM-dd");
        endDate.setTextRefernce(txtEndDate);

        setBackground(new java.awt.Color(153, 153, 153));

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

        employeeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee 1", "Employee 2", "Employee 3", "Employee 4" }));

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

        txtDescription.setText("Description");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending", "In Progress", "Completed" }));

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            int selectedIndex = employeeComboBox.getSelectedIndex();
            if (selectedIndex < 0) {
                throw new IllegalArgumentException("Please select an employee for this task.");
            }
            Employee chosenEmp = departmentEmployees.get(selectedIndex);
            int assignedEmpId = chosenEmp.getEmployeeId();

            // 2) StartDate, EndDate parse
            Date startD = null, endD = null;
            if (!txtStartDate.getText().trim().isEmpty()) {
                startD = new SimpleDateFormat("yyyy-MM-dd").parse(txtStartDate.getText().trim());
            }
            if (!txtEndDate.getText().trim().isEmpty()) {
                endD = new SimpleDateFormat("yyyy-MM-dd").parse(txtEndDate.getText().trim());
            }

            // 3) Description ve status
            String desc = txtDescription.getText().trim();
            String status = statusComboBox.getSelectedItem().toString();

            // 4) Model güncelle
            task.setAssignedTo(assignedEmpId);
            task.setTaskDescription(desc);
            task.setStatus(status);
            task.setStartDate(startD);
            task.setEndDate(endD);

            // 5) DB update
            TaskService service = new TaskService();
            service.updateTask(task);

            JOptionPane.showMessageDialog(
                    this,
                    "Task updated successfully!",
                    "Update",
                    JOptionPane.INFORMATION_MESSAGE
            );
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
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            int choice = JOptionPane.showConfirmDialog(
                    this,
                    "Are you sure to delete this Task?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION
            );
            if (choice == JOptionPane.YES_OPTION) {
                TaskService service = new TaskService();
                service.deleteTask(task.getTaskId());
                this.setVisible(false); // or remove from parent
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle1;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle2;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle3;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle4;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle5;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle6;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle7;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle8;
    private com.talentbridge.hirewise.custom_components.Button deleteButton;
    private javax.swing.JComboBox<String> employeeComboBox;
    private com.raven.datechooser.DateChooser endDate;
    private com.raven.datechooser.DateChooser startDate;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtStartDate;
    private com.talentbridge.hirewise.custom_components.Button updateButton;
    // End of variables declaration//GEN-END:variables
}
