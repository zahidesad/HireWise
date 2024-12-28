package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.ImageLib;
import com.talentbridge.hirewise.User;
import com.talentbridge.hirewise.custom_components.CCSalaryHistoryElement;
import com.talentbridge.hirewise.custom_components.CCScrollBar;
import com.talentbridge.hirewise.custom_components.CCTaskElement;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Department;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.Position;
import com.talentbridge.hirewise.personnel_system.model.SalaryRecord;
import com.talentbridge.hirewise.personnel_system.model.Task;
import com.talentbridge.hirewise.personnel_system.service.DepartmentService;
import com.talentbridge.hirewise.personnel_system.service.PositionService;
import com.talentbridge.hirewise.personnel_system.service.SalaryRecordService;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author emirs
 */
public class PositionDetailsPanel extends javax.swing.JPanel implements IPage{

    Employee emp;
    User user;
    SalaryRecordService salaryRecordService = new SalaryRecordService();
    PositionService positionService = new PositionService();
    DepartmentService departmentService = new DepartmentService();
    public PositionDetailsPanel() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JLabel();
        positionLable = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        departmentField = new javax.swing.JLabel();
        cCAvatarImageLabel = new com.talentbridge.hirewise.custom_components.CCAvatarImageLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        salaryHistoryScrollPane = new javax.swing.JScrollPane();
        performanceScrollPane = new javax.swing.JScrollPane();
        DetailsLabel = new javax.swing.JLabel();
        positionDetailsLabel = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("POSITION DETAILS");

        jLabel1.setText("Username");

        usernameField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameField.setText("Emirhans");

        positionLable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        positionLable.setText("AI Engineer");

        jLabel4.setText("Department");

        jLabel6.setText("Position");

        departmentField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        departmentField.setText("Technology");

        jLabel8.setText("Performance Reviews");

        jLabel9.setText("Salary History");

        salaryHistoryScrollPane.setBorder(null);

        DetailsLabel.setText("position details");

        positionDetailsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        positionDetailsLabel.setText("AI Engineer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(positionLable, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(salaryHistoryScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(performanceScrollPane)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(cCAvatarImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(departmentField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(DetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(positionDetailsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departmentField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(DetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(positionLable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cCAvatarImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(performanceScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                    .addComponent(salaryHistoryScrollPane))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void createSalaryList(){ 
        
        List<SalaryRecord> salaryRecords = salaryRecordService.getEmployeeSalaryRecords(MainFrame.instance.getEmployee());
        
        JPanel resultConteiner = new JPanel();
        resultConteiner.setSize(200, 60 * salaryRecords.size());
        GridLayout gridLayout = new GridLayout(salaryRecords.size(), 1);
        gridLayout.setVgap(0);
        resultConteiner.setLayout(gridLayout);
        
        for (SalaryRecord record : salaryRecords) {
            CCSalaryHistoryElement salaryListElement = new CCSalaryHistoryElement(record);
            salaryListElement.setSize(180, 50);
            resultConteiner.add(salaryListElement);
        }
        
        salaryHistoryScrollPane.setViewportView(resultConteiner);
        
        salaryHistoryScrollPane.setVerticalScrollBar(new CCScrollBar());
        CCScrollBar sp = new CCScrollBar();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        salaryHistoryScrollPane.setHorizontalScrollBar(sp);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DetailsLabel;
    private com.talentbridge.hirewise.custom_components.CCAvatarImageLabel cCAvatarImageLabel;
    private javax.swing.JLabel departmentField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane performanceScrollPane;
    private javax.swing.JLabel positionDetailsLabel;
    private javax.swing.JLabel positionLable;
    private javax.swing.JScrollPane salaryHistoryScrollPane;
    private javax.swing.JLabel usernameField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        createSalaryList();
        
        emp = MainFrame.instance.getEmployee();
        user = MainFrame.instance.getAccount();
        Position pos =  positionService.getPositionById(emp.getPositionId());
        Department dept = departmentService.getDepartmentById(emp.getDepartmentId());
        
        usernameField.setText(user.getUsername());
        departmentField.setText(dept.getDepartmentName());
        positionLable.setText(pos.getPositionTitle());
        positionDetailsLabel.setText(pos.getPositionDescription());
        
        ImageIcon icon2 = new ImageIcon(ImageLib.getPPIconPath(user.getUsername()));
        Image imgFit2 = icon2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        icon2.setImage(imgFit2);
        cCAvatarImageLabel.setImage(icon2);
    }
}
