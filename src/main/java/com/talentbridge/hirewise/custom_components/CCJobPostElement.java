/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.talentbridge.hirewise.custom_components;

import com.talentbridge.hirewise.job_posting_system.model.JobPosting;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


/**
 *
 * @author Lenovo
 */
public class CCJobPostElement extends javax.swing.JPanel {

    /**
     * Creates new form CCJobPostElement
     */
    JobPosting jobPosting;
    public CCJobPostElement(JobPosting jobPosting) {
        initComponents();
        this.jobPosting = jobPosting;
        setPanel(jobPosting);
        setBackground(Color.decode("#616fec"));
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCPaintedCircle2 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        TitleLabel = new javax.swing.JLabel();
        ViewButton = new javax.swing.JButton();
        StartDateLabel = new javax.swing.JLabel();
        EndDateLabel = new javax.swing.JLabel();
        StatusLabel = new javax.swing.JLabel();
        cCPaintedCircle6 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle7 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle8 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        cCPaintedCircle9 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();

        javax.swing.GroupLayout cCPaintedCircle2Layout = new javax.swing.GroupLayout(cCPaintedCircle2);
        cCPaintedCircle2.setLayout(cCPaintedCircle2Layout);
        cCPaintedCircle2Layout.setHorizontalGroup(
            cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        cCPaintedCircle2Layout.setVerticalGroup(
            cCPaintedCircle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        EndDateLabel.setText("jLabel3");

        StatusLabel.setText("jLabel4");

        cCPaintedCircle6.setBackground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle6.setForeground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle6.setToolTipText("");
        cCPaintedCircle6.setColor(new java.awt.Color(246, 183, 162));

        javax.swing.GroupLayout cCPaintedCircle6Layout = new javax.swing.GroupLayout(cCPaintedCircle6);
        cCPaintedCircle6.setLayout(cCPaintedCircle6Layout);
        cCPaintedCircle6Layout.setHorizontalGroup(
            cCPaintedCircle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        cCPaintedCircle6Layout.setVerticalGroup(
            cCPaintedCircle6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        cCPaintedCircle7.setBackground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle7.setForeground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle7.setToolTipText("");
        cCPaintedCircle7.setColor(new java.awt.Color(246, 183, 162));
        cCPaintedCircle7.setDiameter(15);

        javax.swing.GroupLayout cCPaintedCircle7Layout = new javax.swing.GroupLayout(cCPaintedCircle7);
        cCPaintedCircle7.setLayout(cCPaintedCircle7Layout);
        cCPaintedCircle7Layout.setHorizontalGroup(
            cCPaintedCircle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle7Layout.setVerticalGroup(
            cCPaintedCircle7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

        cCPaintedCircle9.setBackground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle9.setForeground(new java.awt.Color(97, 111, 236));
        cCPaintedCircle9.setToolTipText("");
        cCPaintedCircle9.setColor(new java.awt.Color(246, 183, 162));
        cCPaintedCircle9.setDiameter(15);

        javax.swing.GroupLayout cCPaintedCircle9Layout = new javax.swing.GroupLayout(cCPaintedCircle9);
        cCPaintedCircle9.setLayout(cCPaintedCircle9Layout);
        cCPaintedCircle9Layout.setHorizontalGroup(
            cCPaintedCircle9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        cCPaintedCircle9Layout.setVerticalGroup(
            cCPaintedCircle9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cCPaintedCircle6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(ViewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCPaintedCircle8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cCPaintedCircle9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(EndDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StatusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ViewButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(cCPaintedCircle6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(StartDateLabel)
                                    .addComponent(cCPaintedCircle8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(EndDateLabel))
                            .addComponent(cCPaintedCircle7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(StatusLabel)
                            .addComponent(cCPaintedCircle9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Yuvarlatılmış dikdörtgeni çizmek için
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30); // 30px yuvarlatma
    }
    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
        MainFrame.instance.getJobDetailsPage().postedJob = jobPosting;
        MainFrame.instance.setPage(MainFrame.instance.getJobDetailsPage());
    }//GEN-LAST:event_ViewButtonActionPerformed
    
    public final void setPanel(JobPosting jobPosting){
        TitleLabel.setText(jobPosting.getTitle());
        StartDateLabel.setText(jobPosting.getPostingDate().toString());
        EndDateLabel.setText(jobPosting.getExpiryDate().toString());
        StatusLabel.setText(jobPosting.getStatus());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EndDateLabel;
    private javax.swing.JLabel StartDateLabel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton ViewButton;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle2;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle6;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle7;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle8;
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle9;
    // End of variables declaration//GEN-END:variables

   
}
