package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.ImageLib;
import com.talentbridge.hirewise.user.User;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author emirs
 */
public class HeaderPanel extends javax.swing.JPanel {
    
    public HeaderPanel() {
        initComponents();
        
        adjustHeader(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logoutLabel = new javax.swing.JLabel();
        cCAvatarImageLabel1 = new com.talentbridge.hirewise.custom_components.CCAvatarImageLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Username:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 134, 20));

        usernameText.setForeground(new java.awt.Color(0, 0, 0));
        usernameText.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        usernameText.setText("Login Waiting...");
        add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 134, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(857, 10, 90, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 10, 2, 40));

        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });
        add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));
        add(cCAvatarImageLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        MainFrame.instance.logout();
    }//GEN-LAST:event_logoutLabelMouseClicked

    public final void adjustHeader(User account) {        
        if (account == null) {
            usernameText.setText("Login Waiting...");

            ImageIcon icon2 = new ImageIcon(ImageLib.getUserIconPath());
            Image imgFit2 = icon2.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            icon2.setImage(imgFit2);
            cCAvatarImageLabel1.setImage(icon2);
        
            logoutLabel.setIcon(null);
        } else {
            usernameText.setText(account.getUsername());
            
            ImageIcon icon = new ImageIcon(ImageLib.getPPIconPath(MainFrame.instance.getAccount().getUsername()));
            Image imgFit = icon.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING);
            icon.setImage(imgFit);
            cCAvatarImageLabel1.setImage(icon);

            ImageIcon icon2 = new ImageIcon(ImageLib.getLogoutIconPath());
            Image imgFit2 = icon2.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            icon2.setImage(imgFit2);
            logoutLabel.setIcon(icon2);
            
        }
        logoutLabel.repaint();
        cCAvatarImageLabel1.repaint();
        
    }
    
    public void updateProfilePicture(){
        ImageIcon icon2 = new ImageIcon(ImageLib.getPPIconPath(MainFrame.instance.getAccount().getUsername()));
        Image imgFit2 = icon2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon2.setImage(imgFit2);
        cCAvatarImageLabel1.setImage(icon2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.CCAvatarImageLabel cCAvatarImageLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel usernameText;
    // End of variables declaration//GEN-END:variables
}
