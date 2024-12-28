package com.talentbridge.hirewise.custom_components;

import com.talentbridge.hirewise.personnel_system.model.SalaryRecord;

/**
 *
 * @author emirs
 */
public class CCSalaryHistoryElement extends javax.swing.JPanel {

    public CCSalaryHistoryElement(SalaryRecord record) {
        initComponents();
        salaryLabel.setText(record.getSalaryAmount() + "TL");
        dateLabel.setText(record.getEffectiveDate().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCPaintedCircle1 = new com.talentbridge.hirewise.custom_components.CCPaintedCircle();
        salaryLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout cCPaintedCircle1Layout = new javax.swing.GroupLayout(cCPaintedCircle1);
        cCPaintedCircle1.setLayout(cCPaintedCircle1Layout);
        cCPaintedCircle1Layout.setHorizontalGroup(
            cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        cCPaintedCircle1Layout.setVerticalGroup(
            cCPaintedCircle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        add(cCPaintedCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 30, 30));

        salaryLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        salaryLabel.setText("12500 TL");
        add(salaryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 107, 20));

        jLabel2.setText("jLabel2");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        jLabel2.setRequestFocusEnabled(false);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 0, 4, 70));

        dateLabel.setText(" ");
        add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 110, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.CCPaintedCircle cCPaintedCircle1;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel salaryLabel;
    // End of variables declaration//GEN-END:variables
}
