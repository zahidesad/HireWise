/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.talentbridge.hirewise.custom_components;

import com.talentbridge.hirewise.job_posting_system.dao.JobPostingDAO;
import com.talentbridge.hirewise.job_posting_system.model.Application;
import com.talentbridge.hirewise.job_posting_system.service.ApplicationService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

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
        setBackground(Color.decode("#616fec"));
        setOpaque(false);
    }
    
     protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Yuvarlatılmış dikdörtgeni çizmek için
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30); // 30px yuvarlatma
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        ViewButton = new javax.swing.JButton();
        StartDateLabel = new javax.swing.JLabel();
        LastUpdatedDateLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        cCPaintedCircle2 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle3 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle4 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle8 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(515, 100));

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

        cCPaintedCircle2.setBackground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle2.setForeground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle2.setToolTipText("");
        cCPaintedCircle2.setColor(new java.awt.Color(246, 183, 162));
        cCPaintedCircle2.setDiameter(15);

        javax.swing.GroupLayout cCPaintedCircle2Layout = new javax.swing.GroupLayout(cCPaintedCircle2);
        cCPaintedCircle2.setLayout(cCPaintedCircle2Layout);
        cCPaintedCircle2Layout.setHorizontalGroup(
            cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle2Layout.setVerticalGroup(
            cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        cCPaintedCircle3.setBackground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle3.setForeground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle3.setToolTipText("");
        cCPaintedCircle3.setColor(new java.awt.Color(246, 183, 162));

        javax.swing.GroupLayout cCPaintedCircle3Layout = new javax.swing.GroupLayout(cCPaintedCircle3);
        cCPaintedCircle3.setLayout(cCPaintedCircle3Layout);
        cCPaintedCircle3Layout.setHorizontalGroup(
            cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        cCPaintedCircle3Layout.setVerticalGroup(
            cCPaintedCircle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        cCPaintedCircle4.setBackground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle4.setForeground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle4.setToolTipText("");
        cCPaintedCircle4.setColor(new java.awt.Color(246, 183, 162));
        cCPaintedCircle4.setDiameter(15);

        javax.swing.GroupLayout cCPaintedCircle4Layout = new javax.swing.GroupLayout(cCPaintedCircle4);
        cCPaintedCircle4.setLayout(cCPaintedCircle4Layout);
        cCPaintedCircle4Layout.setHorizontalGroup(
            cCPaintedCircle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle4Layout.setVerticalGroup(
            cCPaintedCircle4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        cCPaintedCircle8.setBackground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle8.setForeground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle8.setToolTipText("");
        cCPaintedCircle8.setColor(new java.awt.Color(246, 183, 162));
        cCPaintedCircle8.setDiameter(15);

        javax.swing.GroupLayout cCPaintedCircle8Layout = new javax.swing.GroupLayout(cCPaintedCircle8);
        cCPaintedCircle8.setLayout(cCPaintedCircle8Layout);
        cCPaintedCircle8Layout.setHorizontalGroup(
            cCPaintedCircle8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle8Layout.setVerticalGroup(
            cCPaintedCircle8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(ViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cCPaintedCircle4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cCPaintedCircle8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LastUpdatedDateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StartDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(88, 88, 88)
                .addComponent(DeleteButton)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ViewButton)
                            .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(cCPaintedCircle3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StartDateLabel)
                            .addComponent(cCPaintedCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cCPaintedCircle4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastUpdatedDateLabel))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusLabel)
                            .addComponent(cCPaintedCircle8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
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
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle2;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle3;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle4;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle8;
    // End of variables declaration//GEN-END:variables
}
