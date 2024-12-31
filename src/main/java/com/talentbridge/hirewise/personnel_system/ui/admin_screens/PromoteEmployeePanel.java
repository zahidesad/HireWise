package com.talentbridge.hirewise.personnel_system.ui.admin_screens;

import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Department;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.Position;
import com.talentbridge.hirewise.personnel_system.service.EmployeeService;
import com.talentbridge.hirewise.personnel_system.service.PositionService;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zahid
 */
public class PromoteEmployeePanel extends javax.swing.JPanel implements IPage {

    private DefaultTableModel tableModel;
    private List<Employee> employeeList;

    public PromoteEmployeePanel() {
        initComponents();
    }

    @Override
    public void onPageSetted() {
        loadEmployeeTable();
    }

    private void loadEmployeeTable() {
        // Sütun başlıkları
        String[] columnNames = {
            "First Name",
            "Last Name",
            "Department",
            "Position",
            "Email",
            "Phone",
            "Hire Date"
        };

        tableModel = new DefaultTableModel(columnNames, 0);
        tableDark1.setModel(tableModel);

        EmployeeService empService = new EmployeeService();
        employeeList = empService.getAllNonManagerEmployees(); 

        // Tüm Employee kayıtlarını satır satır ekleyelim
        for (Employee e : employeeList) {
            String fName = e.getFirstName();
            String lName = e.getLastName();

            Department dept = e.getDepartment();
            String deptName = (dept != null) ? dept.getDepartmentName() : "No Dept";

            Position pos = e.getPosition();
            String posName = (pos != null) ? pos.getPositionTitle() : "No Position";

            String email = (e.getEmail() != null) ? e.getEmail() : "";
            String phone = (e.getPhone() != null) ? e.getPhone() : "";
            String hireDate = (e.getHireDate() != null)
                    ? new SimpleDateFormat("yyyy-MM-dd").format(e.getHireDate())
                    : "";

            Object[] rowData = {fName, lName, deptName, posName, email, phone, hireDate};
            tableModel.addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDark1 = new com.talentbridge.hirewise.custom_components.TableDark();
        promoteButton = new com.talentbridge.hirewise.custom_components.Button();

        tableDark1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableDark1);

        promoteButton.setBackground(new java.awt.Color(204, 204, 204));
        promoteButton.setForeground(new java.awt.Color(0, 0, 0));
        promoteButton.setText("Promote to Manager");
        promoteButton.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        promoteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promoteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(promoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(promoteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void promoteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promoteButtonActionPerformed
        // 1) Tablodan seçili satır indexlerini al
        int[] selectedRows = tableDark1.getSelectedRows();

        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select an employee from the table.",
                    "No Selection",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        if (selectedRows.length > 1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select only ONE employee at a time.",
                    "Multiple Selections",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        int selectedRow = selectedRows[0];
        Employee selectedEmp = employeeList.get(selectedRow);
        int empId = selectedEmp.getEmployeeId();

        PositionService posService = new PositionService();
        int managerPositionId = posService.getPositionIdByTitle("Manager");

        // 4) Employee set position_id = managerPositionId, update
        selectedEmp.setPositionId(managerPositionId);
        // update DB
        EmployeeService empService = new EmployeeService();
        empService.updateEmployee(selectedEmp);

        JOptionPane.showMessageDialog(
                this,
                "Employee promoted to manager successfully!",
                "Promotion",
                JOptionPane.INFORMATION_MESSAGE
        );

        // 5) Tablodaki satır, “Position” cellini “Manager” olarak güncelleyelim
        tableModel.setValueAt("Manager", selectedRow, 3);
    }//GEN-LAST:event_promoteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private com.talentbridge.hirewise.custom_components.Button promoteButton;
    private com.talentbridge.hirewise.custom_components.Button saveButton;
    private com.talentbridge.hirewise.custom_components.Button saveButton1;
    private com.talentbridge.hirewise.custom_components.TableDark tableDark1;
    // End of variables declaration//GEN-END:variables

}
