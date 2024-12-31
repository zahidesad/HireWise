package com.talentbridge.hirewise.custom_components.manager_custom_components;

import com.talentbridge.hirewise.personnel_system.model.Position;
import com.talentbridge.hirewise.personnel_system.service.EmployeeService;
import com.talentbridge.hirewise.personnel_system.service.PositionService;
import javax.swing.JOptionPane;

/**
 *
 * @author zahid
 */
public class CCPositionPanel extends javax.swing.JPanel {

    private Position position;

    public CCPositionPanel(Position position) {
        initComponents();
        this.position = position;
        setPanel(position);
    }

    private void setPanel(Position pos) {
        txtPositionName.setText(pos.getPositionTitle());
        txtPositionDescription.setText(pos.getPositionDescription());
        txtbaseSalary.setText(String.valueOf(pos.getBaseSalary()));

        // Pozisyonda çalışan sayısını bul:
        EmployeeService empService = new EmployeeService();
        int count = empService.countEmployeesByPositionId(pos.getPositionId());
        labelTotalPositionEmployeesValue.setText(String.valueOf(count));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCPaintedCircle1 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle4 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle2 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle5 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle3 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle6 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle7 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle8 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        labelTotalPositionEmployees = new javax.swing.JLabel();
        labelTotalPositionEmployeesValue = new javax.swing.JLabel();
        txtPositionName = new javax.swing.JTextField();
        txtPositionDescription = new javax.swing.JTextField();
        txtbaseSalary = new javax.swing.JTextField();
        updateButton = new com.talentbridge.hirewise.custom_components.Button();

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

        labelTotalPositionEmployees.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTotalPositionEmployees.setText("Total Employees working on this position:");

        labelTotalPositionEmployeesValue.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelTotalPositionEmployeesValue.setText("1232");

        txtPositionName.setBackground(new java.awt.Color(204, 204, 204));
        txtPositionName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPositionName.setForeground(new java.awt.Color(0, 0, 0));
        txtPositionName.setText("Position Name");

        txtPositionDescription.setBackground(new java.awt.Color(204, 204, 204));
        txtPositionDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPositionDescription.setForeground(new java.awt.Color(0, 0, 0));
        txtPositionDescription.setText("Position Description");

        txtbaseSalary.setBackground(new java.awt.Color(204, 204, 204));
        txtbaseSalary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbaseSalary.setForeground(new java.awt.Color(0, 0, 0));
        txtbaseSalary.setText("Base Salary");

        updateButton.setBackground(new java.awt.Color(204, 204, 204));
        updateButton.setForeground(new java.awt.Color(0, 0, 0));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbaseSalary))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPositionName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelTotalPositionEmployees)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelTotalPositionEmployeesValue)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPositionDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 270, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPositionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPositionDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbaseSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTotalPositionEmployees)
                                .addComponent(labelTotalPositionEmployeesValue)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        String title = txtPositionName.getText();
        String desc = txtPositionDescription.getText();
        double baseSalary = Double.parseDouble(txtbaseSalary.getText());

        position.setPositionTitle(title);
        position.setPositionDescription(desc);
        position.setBaseSalary(baseSalary);

        // 3) Service çağır
        PositionService service = new PositionService();
        service.updatePosition(position);

        JOptionPane.showMessageDialog(
            this,
            "Position updated successfully!",
            "Update",
            JOptionPane.INFORMATION_MESSAGE
        );
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle1;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle2;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle3;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle4;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle5;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle6;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle7;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle8;
    private javax.swing.JLabel labelTotalPositionEmployees;
    private javax.swing.JLabel labelTotalPositionEmployeesValue;
    private javax.swing.JTextField txtPositionDescription;
    private javax.swing.JTextField txtPositionName;
    private javax.swing.JTextField txtbaseSalary;
    private com.talentbridge.hirewise.custom_components.Button updateButton;
    // End of variables declaration//GEN-END:variables
}
