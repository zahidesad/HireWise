/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.ui;
import com.talentbridge.hirewise.job_posting_system.dao.JobPostingDAO;
import com.talentbridge.hirewise.job_posting_system.model.JobPosting;
import com.talentbridge.hirewise.job_posting_system.service.JobPostingService;
import com.talentbridge.hirewise.personnel_system.dao.EmployeeDAO;
import com.talentbridge.hirewise.personnel_system.dao.PositionDAO;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.Position;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import java.sql.Date;


/**
 *
 * @author Lenovo
 */
public class HRJobPublishPanel extends javax.swing.JPanel {
    private JobPostingService jobPostingService;
    /**
     * Creates new form JobPublishPanel
     */
    public HRJobPublishPanel() {
        jobPostingService = new JobPostingService(); // Service başlat
        initComponents(); 
       
    }

     
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCRoundedButton1 = new com.talentbridge.hirewise.custom_components.CCRoundedButton();
        cCRoundedButton2 = new com.talentbridge.hirewise.custom_components.CCRoundedButton();
        cCRoundedButton3 = new com.talentbridge.hirewise.custom_components.CCRoundedButton();
        jLabel1 = new javax.swing.JLabel();
        PositionTextField = new javax.swing.JTextField();
        DescriptionTextField = new javax.swing.JTextField();
        ExpiryDateTextField = new javax.swing.JTextField();
        StatusTextField = new javax.swing.JTextField();
        CreateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Publish Job");

        PositionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionTextFieldActionPerformed(evt);
            }
        });

        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Job Title:");

        jLabel3.setText("Job Description");

        jLabel4.setText("Expiry Date:");

        jLabel5.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExpiryDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(CreateButton)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PositionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExpiryDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(CreateButton)
                .addGap(96, 96, 96))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
    
               
                // Skill objesi oluştur ve DAO'yu çağır
                JobPosting jobPost = new JobPosting();
                PositionDAO positionDao = new PositionDAO();
                EmployeeDAO employeeDao = new EmployeeDAO();
                Date today = new Date(System.currentTimeMillis());
                
                Employee employee = employeeDao.findByUserId(MainFrame.instance.getAccount().getUserId());
                Position position = positionDao.findByTitle(PositionTextField.getText());
                String expiryDateText = ExpiryDateTextField.getText().trim();
                java.sql.Date expiryDate = java.sql.Date.valueOf(expiryDateText);
                
                jobPost.setPostedBy(employee.getEmployeeId());
                jobPost.setPositionId(position.getPositionId());
                jobPost.setTitle(position.getPositionTitle());
                jobPost.setDescription(DescriptionTextField.getText());
                jobPost.setStatus(StatusTextField.getText());
                jobPost.setPostingDate(today);
                jobPost.setExpiryDate(expiryDate);

                JobPostingDAO jobPostDAO = new JobPostingDAO();
                jobPostDAO.insert(jobPost);

           
              
                PositionTextField.setText("");
                DescriptionTextField.setText("");
                StatusTextField.setText("");
                ExpiryDateTextField.setText("");
                
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void PositionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateButton;
    private javax.swing.JTextField DescriptionTextField;
    private javax.swing.JTextField ExpiryDateTextField;
    private javax.swing.JTextField PositionTextField;
    private javax.swing.JTextField StatusTextField;
    private com.talentbridge.hirewise.custom_components.CCRoundedButton cCRoundedButton1;
    private com.talentbridge.hirewise.custom_components.CCRoundedButton cCRoundedButton2;
    private com.talentbridge.hirewise.custom_components.CCRoundedButton cCRoundedButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
