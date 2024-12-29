package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.User;
import com.talentbridge.hirewise.job_posting_system.model.Applicant;
import com.talentbridge.hirewise.job_posting_system.ui.ApplicantProfilePanel;
import com.talentbridge.hirewise.job_posting_system.ui.HomePanel;
import com.talentbridge.hirewise.job_posting_system.ui.JobPostsPanel;
import com.talentbridge.hirewise.job_posting_system.ui.RegisterPanel;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author emirs
 */
public class MainFrame extends javax.swing.JFrame {
    
    public static MainFrame instance;
    
    
  
    private User account; 
    private Employee employee; 
    private Applicant applicant; 
    private String loggedSystem = "";
    
    private final SideMenuPanel sideMenu;
    private final HeaderPanel header;
    
    private final HomePanel homePage;
    private final ApplicantProfilePanel applicantProfilePage;
    private final JobPostsPanel jobPostsPage;
    
    private final WelcomePanel welcomePage;
    private final DepartmentPanel departmentPage;
    private final ShowTasksPanel showTasksPage;
    private final LoginPanel loginPage;
    private final RegisterPanel registerPage;
    private final ProfilePanel profilePage;
    private final PositionDetailsPanel positionDetailsPage;
    private final LeaveRecordPanel leaveRecordPage;

    private final DepartmentBudgetPanel departmentBudgetPage;
    private final AddNewDepartmentBudgetPanel addNewDepartmentBudgetPage;

    
    
    

    public MainFrame() {
        initComponents();
        homePage= new HomePanel();
        applicantProfilePage = new ApplicantProfilePanel();
        jobPostsPage = new JobPostsPanel();
        
        welcomePage = new WelcomePanel();
        departmentPage = new DepartmentPanel();
        showTasksPage = new ShowTasksPanel();
        loginPage = new LoginPanel();
        registerPage = new RegisterPanel();
        profilePage = new ProfilePanel();
        positionDetailsPage = new PositionDetailsPanel();
        
        // ----------Department Panels----------
        leaveRecordPage = new LeaveRecordPanel();
        departmentBudgetPage = new DepartmentBudgetPanel();
        addNewDepartmentBudgetPage = new AddNewDepartmentBudgetPanel();
        // -------------------------------------
        headerPanel.setLayout(new GridLayout());
        header = new HeaderPanel();
        header.setSize(headerPanel.getWidth(), headerPanel.getWidth());
        headerPanel.add(header);
        
        sideMenuPanel.setLayout(new GridLayout());
        sideMenu = new SideMenuPanel();
        sideMenu.setSize(sideMenuPanel.getWidth(), sideMenuPanel.getWidth());
        sideMenuPanel.add(sideMenu);
        
        this.add(mainPanel);
        
        // account = Login.checkRememberMe();
        setPage(welcomePage);        
        
        this.setPreferredSize(new Dimension(1200, 600));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        // ImageIcon icon = new ImageIcon("C:\\Users\\emirs\\Desktop\\pics\\appIcons\\logo.png");
        // this.setIconImage(icon.getImage());
    }
    
    private void onAfterInit(){
        sideMenu.adjustSideMenuContent("logout");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideMenuPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout sideMenuPanelLayout = new javax.swing.GroupLayout(sideMenuPanel);
        sideMenuPanel.setLayout(sideMenuPanelLayout);
        sideMenuPanelLayout.setHorizontalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        sideMenuPanelLayout.setVerticalGroup(
            sideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 964, Short.MAX_VALUE)
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        mainPanel.setBackground(new java.awt.Color(225, 225, 225));
        mainPanel.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideMenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                instance = new MainFrame();
                instance.onAfterInit();
                instance.setVisible(true);
            }
        });
    }
    public HomePanel getHomePage(){
        return this.homePage;
    }
    public ApplicantProfilePanel getApplicantProfilePage(){
        return this.applicantProfilePage;
    }
    public JobPostsPanel getJobPostsPage(){
        return this.jobPostsPage;
    }

    public DepartmentPanel getDepartmentPage(){return this.departmentPage; }
    public WelcomePanel getWelcomePage(){return this.welcomePage; }
    public LoginPanel getLoginPage(){return this.loginPage; }
    public RegisterPanel getRegisterPage(){return this.registerPage; }
    public ShowTasksPanel getShowTasksPage(){return this.showTasksPage; }
    public ProfilePanel getProfilePage(){return this.profilePage; }
    
    public PositionDetailsPanel getPositionDetailPage(){return this.positionDetailsPage; }
    public LeaveRecordPanel getLeaveRecordPage(){return this.leaveRecordPage; }
    public DepartmentBudgetPanel getDepartmentBudgetPage(){return this.departmentBudgetPage; }
    public AddNewDepartmentBudgetPanel getAddNewDepartmentBudgetPage(){ return this.addNewDepartmentBudgetPage; }
    
    public User getAccount(){return this.account; }
    public void setAccount(User acc){ this.account = acc; }
    public Employee getEmployee(){return this.employee; }
    public void setEmployee(Employee emp){ this.employee = emp; }
    public Applicant getApplicant(){return this.applicant; }
    public void setApplicant(Applicant applicant){ this.applicant = applicant; }
    public String getLoggedSystem() {return loggedSystem;}
    public void setLoggedSystem(String loggedSystem) {this.loggedSystem = loggedSystem;}
    
    public final void setPage(JPanel page) {
        mainPanel.removeAll();
        mainPanel.add(page);
        mainPanel.revalidate();
        mainPanel.repaint();
        System.out.println("Page Setted!");

        if (page instanceof IPage iPage) {
            iPage.onPageSetted();
        }
    }
    
    public void updatePP(){
        header.updateProfilePicture();
    }

    public void logout() {
        //loginPage.forgetMe();
        account = null;
        setPage(getLoginPage());

        sideMenu.adjustSideMenuContent("logout");
        header.adjustHeader(account);
    }

    public void login() {
        sideMenu.adjustSideMenuContent(loggedSystem);
        header.adjustHeader(account);
        
        System.out.println(loggedSystem);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel sideMenuPanel;
    // End of variables declaration//GEN-END:variables


    
}
