package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.ImageLib;
import com.talentbridge.hirewise.user.User;
import com.talentbridge.hirewise.custom_components.CCSideMenuList;
import com.talentbridge.hirewise.custom_components.Item;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author emirs
 */
public class SideMenuPanel extends javax.swing.JPanel {

    public SideMenuPanel() {
        initComponents();
        cCGradientPanel1.setColorAdjustment(0.2f);

//        CCScrollBar sp = new CCScrollBar();
//        sp.setForeground(new Color(123,52,219));
//        cCTransparentScrollPane1.setVerticalScrollBar(sp);
//        CCScrollBar sp2 = new CCScrollBar();
//        sp2.setOrientation(JScrollBar.HORIZONTAL);
//        cCTransparentScrollPane1.setHorizontalScrollBar(sp2);
        ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\logo.png");
        Image imgFit = icon.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        icon.setImage(imgFit);
        logoLabel.setIcon(icon);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cCGradientPanel1 = new com.talentbridge.hirewise.custom_components.CCGradientPanel();
        logoText = new javax.swing.JLabel();
        logoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cCSideMenuList1 = new com.talentbridge.hirewise.custom_components.CCSideMenuList<>();

        setBackground(new java.awt.Color(123, 52, 219));
        setPreferredSize(new java.awt.Dimension(230, 230));

        cCGradientPanel1.setGradientEndd(new java.awt.Color(48, 170, 250));
        cCGradientPanel1.setGradientStart(new java.awt.Color(140, 4, 219));

        logoText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoText.setForeground(new java.awt.Color(255, 255, 255));
        logoText.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        logoText.setText("HireWise Personel");

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Developed by TalentBridge");

        cCSideMenuList1.setBackground(new java.awt.Color(122, 51, 219));
        cCSideMenuList1.setBorder(null);
        cCSideMenuList1.setForeground(new java.awt.Color(255, 255, 255));
        cCSideMenuList1.setSelectedColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout cCGradientPanel1Layout = new javax.swing.GroupLayout(cCGradientPanel1);
        cCGradientPanel1.setLayout(cCGradientPanel1Layout);
        cCGradientPanel1Layout.setHorizontalGroup(
            cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cCGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoText, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(cCGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(cCSideMenuList1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cCGradientPanel1Layout.setVerticalGroup(
            cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cCGradientPanel1Layout.createSequentialGroup()
                .addGroup(cCGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCSideMenuList1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cCGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cCGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public final void adjustSideMenuContent(String account) {
        if (account.equals("hirewise_user")) {
            hirewiseUserList();
            logoText.setText("Hirewise User");
        } else if (account.equals("hirewise_hr")) {
            hirewiseHRList();
            logoText.setText("Hirewise HR");
        } else if (account.equals("talentbridge_emp")) {
            talentbridgeEmpList();
            logoText.setText("TalentBridge Employee");
        } else if (account.equals("talentbridge_manager")) {
            talentbridgeManagerList();
            logoText.setText("TalentBridge Manager");
        } else if (account.equals("talentbridge_admin")) {
            talentbridgeAdminList();
            logoText.setText("TalentBridge Admin");
        } else {
            logoutList();
        }
    }

    private void logoutList() {
        cCSideMenuList1.removeAllItems();

        //------------ Login -------------
        ImageIcon icon = new ImageIcon(ImageLib.getLoginIconPath());
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Login", icon, MainFrame.instance.getLoginPage()));

        //------------ Register -------------
        ImageIcon icon2 = new ImageIcon(ImageLib.getRegisterIconPath());
        Image imgFit2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon2.setImage(imgFit2);
        cCSideMenuList1.addItem(new Item("Register", icon2, MainFrame.instance.getRegisterPage()));

        cCSideMenuList1.setSelectedIndex(0);
    }

    private void hirewiseHRList() {
        testList();
        

        //------------ HR Job Posts -------------
        ImageIcon icon2 = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFit2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon2.setImage(imgFit2);
        cCSideMenuList1.addItem(new Item("Job Posts", icon2, MainFrame.instance.getHRJobPostsPage()));
        
         //------------ HR Applications -------------
        ImageIcon icon3 = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFit3 = icon3.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon3.setImage(imgFit3);
        cCSideMenuList1.addItem(new Item("Applications", icon3, MainFrame.instance.getHRApplicationPage()));
        
        
        

    }

    private void hirewiseUserList() {
        cCSideMenuList1.removeAllItems();

        //------------ Home -------------
        ImageIcon icon = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Home", icon, MainFrame.instance.getHomePage()));

        //------------ Profile -------------
        ImageIcon icon2 = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFit2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon2.setImage(imgFit2);
        cCSideMenuList1.addItem(new Item("Profile", icon2, MainFrame.instance.getApplicantProfilePage()));

        //------------ Job Posts -------------
        ImageIcon icon3 = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFit3 = icon3.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon3.setImage(imgFit3);
        cCSideMenuList1.addItem(new Item("Job Posts", icon3, MainFrame.instance.getJobPostsPage()));
        
        //------------ CV -------------
        ImageIcon icon5 = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFit5 = icon5.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon5.setImage(imgFit5);
        cCSideMenuList1.addItem(new Item("Create CV", icon5, MainFrame.instance.getCVPage()));
        

        cCSideMenuList1.setSelectedIndex(1);

        //------------ Applications -------------
        ImageIcon icon6 = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFit6 = icon6.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon6.setImage(imgFit6);
        cCSideMenuList1.addItem(new Item("Applications", icon6, MainFrame.instance.getApplicationPage()));
        
        

    }

    private void talentbridgeManagerList() {
        cCSideMenuList1.removeAllItems();

        // 1) Home
        ImageIcon iconHome = new ImageIcon(ImageLib.getHomeIconPath());
        Image imgFitHome = iconHome.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconHome.setImage(imgFitHome);
        cCSideMenuList1.addItem(new Item("Home", iconHome, MainFrame.instance.getManagerHomePage(cCSideMenuList1)));

        // 2) Profile
        ImageIcon iconProfile = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFitProfile = iconProfile.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconProfile.setImage(imgFitProfile);
        cCSideMenuList1.addItem(new Item("Profile", iconProfile, MainFrame.instance.getProfilePage()));

        // 3) Leave Record View
        ImageIcon iconLeave = new ImageIcon(ImageLib.getLeaveIconPath());
        Image imgFitLeave = iconLeave.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconLeave.setImage(imgFitLeave);
        cCSideMenuList1.addItem(new Item("Show Leaves", iconLeave, MainFrame.instance.getLeaveRecordPage()));

        // 4) Departmant Budget
        ImageIcon iconBudget = new ImageIcon(ImageLib.getBudgetIconPath());
        Image imgFitBudget = iconBudget.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconBudget.setImage(imgFitBudget);
        cCSideMenuList1.addItem(new Item("Departmant Budget", iconBudget, MainFrame.instance.getDepartmentBudgetPage()));

        // 6) Positions
        ImageIcon iconPosCreate = new ImageIcon(ImageLib.getPositionsIconPath());
        Image imgFitPosCreate = iconPosCreate.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconPosCreate.setImage(imgFitPosCreate);
        cCSideMenuList1.addItem(new Item("Positions", iconPosCreate, MainFrame.instance.getShowPositionsPage()));

        // 7) Tasks
        ImageIcon iconTask = new ImageIcon(ImageLib.getTaskIconPath());
        Image imgFitTask = iconTask.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconTask.setImage(imgFitTask);
        cCSideMenuList1.addItem(new Item("Tasks", iconTask, MainFrame.instance.getShowTasksManagerPage()));

        // 8) Reviews
        ImageIcon iconReview = new ImageIcon(ImageLib.getReviewIconPath());
        Image imgFitReview = iconReview.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconReview.setImage(imgFitReview);
        cCSideMenuList1.addItem(new Item("Show Review", iconReview, MainFrame.instance.getShowPerformanceReviewPage()));

        cCSideMenuList1.setSelectedIndex(1);
    }

    private void talentbridgeEmpList() {
        cCSideMenuList1.removeAllItems();

        //------------ Profile -------------
        ImageIcon icon = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Profile", icon, MainFrame.instance.getProfilePage()));

        //------------ Position Details -------------
        ImageIcon icon2 = new ImageIcon(ImageLib.getPositionIconPath());
        Image imgFit2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon2.setImage(imgFit2);
        cCSideMenuList1.addItem(new Item("Position Details", icon2, MainFrame.instance.getPositionDetailPage()));

        //------------ Show Tasks -------------
        ImageIcon icon3 = new ImageIcon(ImageLib.getTaskIconPath());
        Image imgFit3 = icon3.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon3.setImage(imgFit3);
        cCSideMenuList1.addItem(new Item("Tasks", icon3, MainFrame.instance.getShowTasksPage()));
        
        // 3) Leave Record View
        ImageIcon iconLeave = new ImageIcon(ImageLib.getLeaveIconPath());
        Image imgFitLeave = iconLeave.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconLeave.setImage(imgFitLeave);
        cCSideMenuList1.addItem(new Item("Leave Requests", iconLeave, MainFrame.instance.getEmpLeaveRequestsPage()));

        cCSideMenuList1.setSelectedIndex(0);
    }

    private void talentbridgeAdminList() {
        cCSideMenuList1.removeAllItems();
        
        // 1) Home
        ImageIcon iconHome = new ImageIcon(ImageLib.getHomeIconPath());
        Image imgFitHome = iconHome.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconHome.setImage(imgFitHome);
        cCSideMenuList1.addItem(new Item("Home", iconHome, MainFrame.instance.getAdminHomePage(cCSideMenuList1)));

        // 2) Profile
        ImageIcon iconProfile = new ImageIcon(ImageLib.getUserIconPath());
        Image imgFitProfile = iconProfile.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconProfile.setImage(imgFitProfile);
        cCSideMenuList1.addItem(new Item("Profile", iconProfile, MainFrame.instance.getProfilePage()));

        // 3) Departments
        ImageIcon iconDepartment = new ImageIcon(ImageLib.getDepartmentPath());
        Image imgFitDept = iconDepartment.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        iconDepartment.setImage(imgFitDept);
        cCSideMenuList1.addItem(new Item("Show Departments", iconDepartment, MainFrame.instance.getShowDepartmentsPage()));
        
        // 4) Promote Employee to Admin
        ImageIcon promoteIcon = new ImageIcon(ImageLib.getPromotionIconPath());
        Image imgFitPromote = promoteIcon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        promoteIcon.setImage(imgFitPromote);
        cCSideMenuList1.addItem(new Item("Promote Employee", promoteIcon, MainFrame.instance.getPromoteEmployeePage()));
        
        cCSideMenuList1.setSelectedIndex(1);
    }

    private void testList() {
        cCSideMenuList1.removeAllItems();

        //------------ Department -------------
        ImageIcon icon = new ImageIcon(ImageLib.getWelcomeIconPath());
        Image imgFit = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon.setImage(imgFit);
        cCSideMenuList1.addItem(new Item("Department", icon, MainFrame.instance.getLoginPage()));

        // ------------ Wellcome -------------
        ImageIcon icon2 = new ImageIcon(ImageLib.getDepartmentIconPath());
        Image imgFit2 = icon2.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon2.setImage(imgFit2);
        cCSideMenuList1.addItem(new Item("Wellcome", icon2, MainFrame.instance.getDepartmentPage()));

        //------------ Show Tasks -------------
        ImageIcon icon3 = new ImageIcon(ImageLib.getWelcomeIconPath());
        Image imgFit3 = icon.getImage().getScaledInstance(25, 25, Image.SCALE_AREA_AVERAGING);
        icon3.setImage(imgFit3);
        cCSideMenuList1.addItem(new Item("Tasks", icon3, MainFrame.instance.getShowTasksPage()));

        cCSideMenuList1.setSelectedIndex(0);
    }
    
    // If the manager changes the page from the home section, adjust the position of the sidebar
    public CCSideMenuList<String> getCCSideMenuList() {
        return cCSideMenuList1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.talentbridge.hirewise.custom_components.CCGradientPanel cCGradientPanel1;
    private com.talentbridge.hirewise.custom_components.CCSideMenuList<String> cCSideMenuList1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JLabel logoText;
    // End of variables declaration//GEN-END:variables
}
