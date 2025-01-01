/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.talentbridge.hirewise.custom_components;

import com.talentbridge.hirewise.job_posting_system.dao.JobPostingDAO;
import com.talentbridge.hirewise.job_posting_system.model.Application;
import com.talentbridge.hirewise.job_posting_system.service.ApplicationService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;

/**
 *
 * @author Lenovo
 */
public class CCApplicationElement extends javax.swing.JPanel {

    /**
     * Creates new form CCApplicationElement
     */
    Application application;
    public CCApplicationElement(Application application) {
        initComponents();
        this.application = application;
        SetPanel(application);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCPaintedCircle1 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        TitleLabel = new javax.swing.JLabel();
        ViewButton = new javax.swing.JButton();
        StartDateLabel = new javax.swing.JLabel();
        LastUpdatedDateLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        cCPaintedCircle5 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle6 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle7 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();

        setPreferredSize(new java.awt.Dimension(515, 100));

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

        TitleLabel.setText("jLabel1");

        ViewButton.setText("View");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        StartDateLabel.setText("jLabel2");

        LastUpdatedDateLabel.setText("jLabel3");

        StatusLabel.setText("jLabel4");

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cCPaintedCircle5Layout = new javax.swing.GroupLayout(cCPaintedCircle5);
        cCPaintedCircle5.setLayout(cCPaintedCircle5Layout);
        cCPaintedCircle5Layout.setHorizontalGroup(
            cCPaintedCircle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cCPaintedCircle5Layout.setVerticalGroup(
            cCPaintedCircle5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cCPaintedCircle6Layout = new javax.swing.GroupLayout(cCPaintedCircle6);
        cCPaintedCircle6.setLayout(cCPaintedCircle6Layout);
        cCPaintedCircle6Layout.setHorizontalGroup(
            cCPaintedCircle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cCPaintedCircle6Layout.setVerticalGroup(
            cCPaintedCircle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout cCPaintedCircle7Layout = new javax.swing.GroupLayout(cCPaintedCircle7);
        cCPaintedCircle7.setLayout(cCPaintedCircle7Layout);
        cCPaintedCircle7Layout.setHorizontalGroup(
            cCPaintedCircle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        cCPaintedCircle7Layout.setVerticalGroup(
            cCPaintedCircle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ViewButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(cCPaintedCircle6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cCPaintedCircle5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StartDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LastUpdatedDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteButton)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StartDateLabel)
                            .addComponent(cCPaintedCircle5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ViewButton)
                                    .addComponent(LastUpdatedDateLabel)
                                    .addComponent(DeleteButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(cCPaintedCircle6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StatusLabel)
                            .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        MainFrame.instance.getApplicationPage().application = application;
        MainFrame.instance.setPage(MainFrame.instance.getApplicationsDetailPage());
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
    
    ApplicationService applicationService = new ApplicationService();

    
    applicationService.deleteApplication(application.getApplicationId());

   
    }//GEN-LAST:event_DeleteButtonActionPerformed

    public final void SetPanel(Application application){
        JobPostingDAO jobPostingDao= new JobPostingDAO();
        TitleLabel.setText(jobPostingDao.findById(application.getJobPostingId()).getTitle());
        StartDateLabel.setText(application.getApplicationDate().toString());
        LastUpdatedDateLabel.setText(application.getLastUpdated().toString());
        StatusLabel.setText(application.getCurrentStage());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel LastUpdatedDateLabel;
    private javax.swing.JLabel StartDateLabel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton ViewButton;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle1;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle5;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle6;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle7;
    // End of variables declaration//GEN-END:variables
}
