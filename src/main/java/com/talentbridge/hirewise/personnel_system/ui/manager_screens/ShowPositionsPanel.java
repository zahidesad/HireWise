package com.talentbridge.hirewise.personnel_system.ui.manager_screens;

import com.talentbridge.hirewise.custom_components.manager_custom_components.CCPositionPanel;
import com.talentbridge.hirewise.custom_components.CCScrollBar;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.Position;
import com.talentbridge.hirewise.personnel_system.service.PositionService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author zahid
 */
public class ShowPositionsPanel extends javax.swing.JPanel implements IPage {

    public ShowPositionsPanel() {
        initComponents();
    }

    @Override
    public void onPageSetted() {
        Employee managerEmp = MainFrame.instance.getEmployee();
        int managerDeptId = managerEmp.getDepartmentId();

        PositionService positionService = new PositionService();
        List<Position> positions = positionService.getPositionsByDepartmentId(managerDeptId);

        createPositionList(positions);
    }

    private void createPositionList(List<Position> positions) {
        JPanel resultConteiner = new JPanel();
        resultConteiner.setSize(800, 100 * positions.size());
        GridLayout gridLayout = new GridLayout(positions.size(), 1);
        gridLayout.setVgap(5);
        resultConteiner.setLayout(gridLayout);

        for (Position pos : positions) {
            CCPositionPanel posPanel = new CCPositionPanel(pos);
            resultConteiner.add(posPanel);
        }

        jScrollPane.setViewportView(resultConteiner);

        jScrollPane.setVerticalScrollBar(new CCScrollBar());
        CCScrollBar sp = new CCScrollBar();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane.setHorizontalScrollBar(sp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new com.talentbridge.hirewise.custom_components.Label();
        jScrollPane = new javax.swing.JScrollPane();
        addNewPosition = new com.talentbridge.hirewise.custom_components.Button();

        label1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        label1.setText("Department Positions");
        label1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        addNewPosition.setBackground(new java.awt.Color(204, 204, 204));
        addNewPosition.setForeground(new java.awt.Color(0, 0, 0));
        addNewPosition.setText("Add New Position");
        addNewPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPositionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addNewPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addNewPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void addNewPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPositionActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getAddNewPositionPage());
    }//GEN-LAST:event_addNewPositionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Button addNewPosition;
    private javax.swing.JScrollPane jScrollPane;
    private com.talentbridge.hirewise.custom_components.Label label1;
    // End of variables declaration//GEN-END:variables

}
