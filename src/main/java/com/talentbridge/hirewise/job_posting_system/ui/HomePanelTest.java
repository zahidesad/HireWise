/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.ui;

import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class HomePanelTest {
  
    public static void main(String[] args) {
        // Ana çerçeve oluştur
        JFrame frame = new JFrame("Home Panel Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Çerçeve kapatıldığında program sonlanır
        frame.setSize(750, 450); // Çerçeve boyutları
        
        // HomePanel örneğini oluştur ve çerçeveye ekle
        HomePanel homePanel = new HomePanel();
        frame.add(homePanel);

        // Çerçeveyi görünür hale getir
        frame.setVisible(true);
    }
}

