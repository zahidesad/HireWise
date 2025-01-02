/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.ui;

import com.talentbridge.hirewise.job_posting_system.model.Application;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;



/**
 *
 * @author Lenovo
 */
public class ApplicationsDetailPanel extends javax.swing.JPanel implements IPage{

    /**
     * Creates new form ApplicationsDetailPanel
     */
   
    public ApplicationsDetailPanel() {
        initComponents();
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartDateLabel = new javax.swing.JLabel();
        EndDateLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        ApplicationDetailsLabel = new javax.swing.JLabel();
        ApplicationTitleLabel = new javax.swing.JLabel();
        cCPaintedCircle1 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle10 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle11 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle12 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();

        StartDateLabel.setText("jLabel1");

        EndDateLabel.setText("jLabel2");

        StatusLabel.setText("jLabel3");

        ApplicationDetailsLabel.setText("jLabel4");

        ApplicationTitleLabel.setText("jLabel5");

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

        cCPaintedCircle10.setDiameter(15);

        javax.swing.GroupLayout cCPaintedCircle10Layout = new javax.swing.GroupLayout(cCPaintedCircle10);
        cCPaintedCircle10.setLayout(cCPaintedCircle10Layout);
        cCPaintedCircle10Layout.setHorizontalGroup(
            cCPaintedCircle10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        cCPaintedCircle10Layout.setVerticalGroup(
            cCPaintedCircle10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cCPaintedCircle11.setDiameter(15);

        javax.swing.GroupLayout cCPaintedCircle11Layout = new javax.swing.GroupLayout(cCPaintedCircle11);
        cCPaintedCircle11.setLayout(cCPaintedCircle11Layout);
        cCPaintedCircle11Layout.setHorizontalGroup(
            cCPaintedCircle11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        cCPaintedCircle11Layout.setVerticalGroup(
            cCPaintedCircle11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        cCPaintedCircle12.setDiameter(15);

        javax.swing.GroupLayout cCPaintedCircle12Layout = new javax.swing.GroupLayout(cCPaintedCircle12);
        cCPaintedCircle12.setLayout(cCPaintedCircle12Layout);
        cCPaintedCircle12Layout.setHorizontalGroup(
            cCPaintedCircle12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        cCPaintedCircle12Layout.setVerticalGroup(
            cCPaintedCircle12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ApplicationDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 346, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ApplicationTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cCPaintedCircle11, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(cCPaintedCircle10, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StartDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(EndDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cCPaintedCircle12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EndDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cCPaintedCircle10, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cCPaintedCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cCPaintedCircle11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(StatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cCPaintedCircle12, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
                            .addGap(2, 2, 2)
                            .addComponent(StartDateLabel))
                        .addComponent(ApplicationTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(ApplicationDetailsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApplicationDetailsLabel;
    private javax.swing.JLabel ApplicationTitleLabel;
    private javax.swing.JLabel EndDateLabel;
    private javax.swing.JLabel StartDateLabel;
    private javax.swing.JLabel StatusLabel;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle1;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle10;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle11;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle12;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle4;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle5;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle7;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle8;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle9;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onPageSetted() {
        Application application = MainFrame.instance.getApplicationPage().application;
        ApplicationTitleLabel.setText(application.getJobPosting().getTitle());
        ApplicationDetailsLabel.setText(application.getJobPosting().getDescription());
        StartDateLabel.setText(application.getApplicationDate().toString());
        EndDateLabel.setText(application.getLastUpdated().toString());
        StatusLabel.setText(application.getJobPosting().getStatus());
        
    }
}
