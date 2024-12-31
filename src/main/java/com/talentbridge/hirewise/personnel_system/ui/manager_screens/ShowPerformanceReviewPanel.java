package com.talentbridge.hirewise.personnel_system.ui.manager_screens;

import com.talentbridge.hirewise.custom_components.CCScrollBar;
import com.talentbridge.hirewise.custom_components.manager_custom_components.CCShowReview;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.PerformanceReview;
import com.talentbridge.hirewise.personnel_system.service.PerformanceReviewService;
import com.talentbridge.hirewise.personnel_system.ui.MainFrame;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

/**
 *
 * @author zahid
 */
public class ShowPerformanceReviewPanel extends javax.swing.JPanel implements IPage {

    public ShowPerformanceReviewPanel() {
        initComponents();
    }

     @Override
    public void onPageSetted() {
        Employee managerEmp = MainFrame.instance.getEmployee();
        int managerDeptId = managerEmp.getDepartmentId();

        PerformanceReviewService prService = new PerformanceReviewService();
        List<PerformanceReview> allReviews = prService.getAllPerformanceReviews();

        List<PerformanceReview> managerDeptReviews = new ArrayList<>();
        for (PerformanceReview pr : allReviews) {
            Employee emp = pr.getEmployee(); // PerformanceReview -> getEmployee
            if (emp != null && emp.getDepartmentId() == managerDeptId) {
                managerDeptReviews.add(pr);
            }
        }

        createReviewList(managerDeptReviews);
    }

    private void createReviewList(List<PerformanceReview> reviews) {
        JPanel container = new JPanel();
        container.setSize(800, 100 * reviews.size());
        container.setLayout(new GridLayout(reviews.size(), 1, 0, 5));
        GridLayout gridLayout = new GridLayout(reviews.size(), 1);
        gridLayout.setVgap(5);
        container.setLayout(gridLayout);

        for (PerformanceReview pr : reviews) {
            CCShowReview reviewPanel = new CCShowReview(pr);
            container.add(reviewPanel);
        }

        jScrollPane.setViewportView(container);

        // scrollbar custom, opsiyonel
        jScrollPane.setVerticalScrollBar(new CCScrollBar());
        CCScrollBar sp = new CCScrollBar();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        jScrollPane.setHorizontalScrollBar(sp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        headerLabel = new com.talentbridge.hirewise.custom_components.Label();
        giveNewPerformanceReview = new com.talentbridge.hirewise.custom_components.Button();

        headerLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        headerLabel.setText("Department Performance Reviews");
        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        giveNewPerformanceReview.setBackground(new java.awt.Color(204, 204, 204));
        giveNewPerformanceReview.setForeground(new java.awt.Color(0, 0, 0));
        giveNewPerformanceReview.setText("Give New Performance Review");
        giveNewPerformanceReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveNewPerformanceReviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(giveNewPerformanceReview, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(giveNewPerformanceReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void giveNewPerformanceReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveNewPerformanceReviewActionPerformed
        MainFrame.instance.setPage(MainFrame.instance.getGivePerformanceReviewPage());
    }//GEN-LAST:event_giveNewPerformanceReviewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.Button giveNewPerformanceReview;
    private com.talentbridge.hirewise.custom_components.Label headerLabel;
    private javax.swing.JScrollPane jScrollPane;
    // End of variables declaration//GEN-END:variables

}
