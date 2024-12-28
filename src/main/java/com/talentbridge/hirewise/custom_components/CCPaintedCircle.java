package com.talentbridge.hirewise.custom_components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author emirs
 */
public class CCPaintedCircle extends javax.swing.JPanel {

    private int diameter;
    private Color color;
    
    public CCPaintedCircle() {
        initComponents();
        
        this.diameter = 30;
        this.color = new Color(102,0,255);
        setPreferredSize(new Dimension(diameter + 20, diameter + 20)); // Set preferred size
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Enable anti-aliasing for smooth edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the color
        g2d.setColor(color);

        // Draw the circle in the center of the component
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;
        g2d.fillOval(x, y, diameter, diameter);
    }

    // Getter and Setter for Diameter
    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
        repaint();
    }

    // Getter and Setter for Color
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
