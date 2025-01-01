/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.talentbridge.hirewise.custom_components;

import com.talentbridge.hirewise.job_posting_system.dao.ApplicationDAO;
import com.talentbridge.hirewise.job_posting_system.dao.JobPostingDAO;
import com.talentbridge.hirewise.job_posting_system.model.Application;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;

/**
 *
 * @author Lenovo
 */
public class CCHRApplicationsElement extends javax.swing.JPanel {

    /**
     * Creates new form HRApplicationsElement
     */
    public int applicationId;
    Application application;
    public CCHRApplicationsElement(Application application) {
        
        
        initComponents();
        this.application = application;
        applicationId = application.getApplicationId();
        SetPanel(application);
        StatusComboBox.addActionListener(evt -> {
    String selectedStatus = (String) StatusComboBox.getSelectedItem();
    if (selectedStatus != null) {
        application.setCurrentStage(selectedStatus); // Application'ın status bilgisini güncelle
        System.out.println("Status updated to: " + selectedStatus);
    }
});
        
        UpdateButton.addActionListener(evt -> {
    try {
        // Güncel bilgileri TextField ve ComboBox'lardan alın
        String updatedName = NameTextField.getText().trim();
        String updatedTitle = TitleTextField.getText().trim();
        String updatedStartDate = StartDateTextField.getText().trim();
        String updatedStatus = (String) StatusComboBox.getSelectedItem();

        // Alanların doluluğunu kontrol edin
        if (updatedName.isEmpty() || updatedTitle.isEmpty() || updatedStartDate.isEmpty() || updatedStatus == null) {
            System.out.println("All fields must be filled!");
            return;
        }

        // Application nesnesini güncelle
        application.getApplicant().setFirstName(updatedName); // Eğer 'Applicant' nesnesi mevcutsa
        application.setApplicationDate(java.sql.Date.valueOf(updatedStartDate)); // Tarih formatı 'yyyy-MM-dd' olmalı
        application.setCurrentStage(updatedStatus);

        // JobPosting başlığını güncelle (gerekiyorsa)
        JobPostingDAO jobPostingDao = new JobPostingDAO();
        int jobPostingId = application.getJobPostingId();
        jobPostingDao.updateTitle(jobPostingId, updatedTitle); // Eğer başlık güncellenmesi gerekiyorsa

        // Application'ı veritabanında güncelle
        ApplicationDAO applicationDao = new ApplicationDAO();
        applicationDao.update(application);

        System.out.println("Application and related JobPosting updated successfully!");

    } catch (Exception e) {
        System.out.println("Error while updating application or job posting: " + e.getMessage());
        e.printStackTrace();
    }
});
    }
    
    
    public final void SetPanel(Application application){
        JobPostingDAO jobPostingDao= new JobPostingDAO();
        ApplicationDAO applicationDao = new ApplicationDAO();
        NameTextField.setText(applicationDao.findById(application.getApplicationId()).getApplicant().getFirstName());
        StartDateTextField.setText(application.getApplicationDate().toString());
        TitleTextField.setText(jobPostingDao.findById(application.getJobPostingId()).getTitle());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCPaintedCircle1 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        NameTextField = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        CVButton = new javax.swing.JButton();
        TitleTextField = new javax.swing.JTextField();
        StartDateTextField = new javax.swing.JTextField();
        StatusComboBox = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout cCPaintedCircle1Layout = new javax.swing.GroupLayout(cCPaintedCircle1);
        cCPaintedCircle1.setLayout(cCPaintedCircle1Layout);
        cCPaintedCircle1Layout.setHorizontalGroup(
            cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        cCPaintedCircle1Layout.setVerticalGroup(
            cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        UpdateButton.setText("Update");

        CVButton.setText("CV");
        CVButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVButtonActionPerformed(evt);
            }
        });

        TitleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleTextFieldActionPerformed(evt);
            }
        });

        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Received", "Interview" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UpdateButton)
                    .addComponent(CVButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartDateTextField)
                    .addComponent(StatusComboBox, 0, 98, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UpdateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CVButton))
                            .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(TitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(StartDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TitleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleTextFieldActionPerformed

    private void CVButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVButtonActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getHRCVPage());
    }//GEN-LAST:event_CVButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CVButton;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField StartDateTextField;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JTextField TitleTextField;
    private javax.swing.JButton UpdateButton;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle1;
    // End of variables declaration//GEN-END:variables
}