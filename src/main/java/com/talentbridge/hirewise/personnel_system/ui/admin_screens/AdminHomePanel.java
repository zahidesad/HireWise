package com.talentbridge.hirewise.personnel_system.ui.admin_screens;

import com.talentbridge.hirewise.custom_components.CCSideMenuList;
import com.talentbridge.hirewise.personnel_system.core.IPage;

/**
 *
 * @author zahid
 */
public class AdminHomePanel extends javax.swing.JPanel implements IPage {

    CCSideMenuList<String> cCSideMenuList;

    public AdminHomePanel(CCSideMenuList cCSideMenuList) {
        initComponents();
        this.cCSideMenuList = cCSideMenuList;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void onPageSetted() {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
