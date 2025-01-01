package com.talentbridge.hirewise.personnel_system.ui;

import com.talentbridge.hirewise.custom_components.CCHRApplicationsElement;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.ShowPositionsPanel;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.ShowPerformanceReviewPanel;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.ManagerHomePanel;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.ShowTasksManagerPanel;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.LeaveRecordPanel;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.AddNewDepartmentBudgetPanel;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.DepartmentBudgetPanel;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.GivePerformanceReviewPanel;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.AddNewTaskManagerPanel;
import com.talentbridge.hirewise.personnel_system.ui.manager_screens.AddNewPositionPanel;
import com.talentbridge.hirewise.user.User;
import com.talentbridge.hirewise.custom_components.CCSideMenuList;
import com.talentbridge.hirewise.job_posting_system.model.Applicant;
import com.talentbridge.hirewise.job_posting_system.model.Application;
import com.talentbridge.hirewise.job_posting_system.model.JobPosting;
import com.talentbridge.hirewise.job_posting_system.ui.ApplicantProfilePanel;
import com.talentbridge.hirewise.job_posting_system.ui.ApplicationsDetailPanel;
import com.talentbridge.hirewise.job_posting_system.ui.ApplicationsPanel;
import com.talentbridge.hirewise.job_posting_system.ui.CVPanel;
import com.talentbridge.hirewise.job_posting_system.ui.HRApplications;
import com.talentbridge.hirewise.job_posting_system.ui.HRCVPanel;
import com.talentbridge.hirewise.job_posting_system.ui.HRJobDetailsPanel;
import com.talentbridge.hirewise.job_posting_system.ui.HRJobPostsPanel;
import com.talentbridge.hirewise.job_posting_system.ui.HRJobPublishPanel;
import com.talentbridge.hirewise.job_posting_system.ui.HomePanel;
import com.talentbridge.hirewise.job_posting_system.ui.JobDetailsPanel;
import com.talentbridge.hirewise.job_posting_system.ui.JobPostsPanel;
import com.talentbridge.hirewise.job_posting_system.ui.OrganizationAddPanel;
import com.talentbridge.hirewise.job_posting_system.ui.RegisterPanel;
import com.talentbridge.hirewise.personnel_system.core.IPage;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.ui.admin_screens.AddNewDepartmentPanel;
import com.talentbridge.hirewise.personnel_system.ui.admin_screens.AdminHomePanel;
import com.talentbridge.hirewise.personnel_system.ui.admin_screens.PromoteEmployeePanel;
import com.talentbridge.hirewise.personnel_system.ui.admin_screens.ShowDepartmentsPanel;
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
    private final CVPanel cvPage;
    private final OrganizationAddPanel organizationAddPage;
    private final JobDetailsPanel jobDetailsPage;
    private final ApplicationsPanel applicationPage;
    private final ApplicationsDetailPanel applicationDetailsPage;
    private final HRJobDetailsPanel hrJobDetailsPage;
    private final HRJobPublishPanel hrJobPublishPage;
    private final HRJobPostsPanel hrJobPostsPage;
    private final HRApplications hrApplicationPage;
    private final HRCVPanel hrCVPage;

  
    
    private final WelcomePanel welcomePage;
    private final DepartmentPanel departmentPage;
    private final ShowTasksPanel showTasksPage;
    private final LoginPanel loginPage;
    private final RegisterPanel registerPage;
    private final ProfilePanel profilePage;
    private final PositionDetailsPanel positionDetailsPage;
    private final LeaveRecordPanel leaveRecordPage;
    private final EmpLeaveRequestsPanel empLeaveRequestsPage;

    private final AdminHomePanel adminHomePage;
    private final ShowDepartmentsPanel showDepartmentsPage;
    private final AddNewDepartmentPanel addNewDepartmentPage;
    private final PromoteEmployeePanel promoteEmployeePage;
    
    
    
    private final DepartmentBudgetPanel departmentBudgetPage;
    private final AddNewDepartmentBudgetPanel addNewDepartmentBudgetPage;
    private final ShowPositionsPanel showPositionsPage;
    private final AddNewPositionPanel addNewPositionPage;
    private final ShowTasksManagerPanel showTasksManagerPage;
    private final AddNewTaskManagerPanel addNewTaskManagerPage;
    private final ShowPerformanceReviewPanel showPerformanceReviewPage;
    private final GivePerformanceReviewPanel givePerformanceReviewPage;
    private final ManagerHomePanel managerHomePage;

    
    
    

    public MainFrame() {
        initComponents();
        homePage= new HomePanel();
        applicantProfilePage = new ApplicantProfilePanel();
        jobPostsPage = new JobPostsPanel();
        cvPage = new CVPanel();
        organizationAddPage = new OrganizationAddPanel();
        jobDetailsPage = new JobDetailsPanel();
        applicationPage = new ApplicationsPanel();
        applicationDetailsPage = new ApplicationsDetailPanel();
        hrJobDetailsPage = new HRJobDetailsPanel();
        hrJobPostsPage = new HRJobPostsPanel();
        hrJobPublishPage = new HRJobPublishPanel();
        hrApplicationPage = new HRApplications();
        hrCVPage = new HRCVPanel();
    
        
        welcomePage = new WelcomePanel();
        departmentPage = new DepartmentPanel();
        showTasksPage = new ShowTasksPanel();
        loginPage = new LoginPanel();
        registerPage = new RegisterPanel();
        profilePage = new ProfilePanel();
        positionDetailsPage = new PositionDetailsPanel();
        empLeaveRequestsPage = new EmpLeaveRequestsPanel();
        
        // ----------Admin Panels----------
        showDepartmentsPage = new ShowDepartmentsPanel();
        addNewDepartmentPage = new AddNewDepartmentPanel();
        promoteEmployeePage = new PromoteEmployeePanel();
        // ------------------------------------
        
        
        // ----------Manager Panels----------
        leaveRecordPage = new LeaveRecordPanel();
        departmentBudgetPage = new DepartmentBudgetPanel();
        addNewDepartmentBudgetPage = new AddNewDepartmentBudgetPanel();
        showPositionsPage = new ShowPositionsPanel();
        addNewPositionPage = new AddNewPositionPanel();
        showTasksManagerPage = new ShowTasksManagerPanel();
        addNewTaskManagerPage = new AddNewTaskManagerPanel();
        showPerformanceReviewPage = new ShowPerformanceReviewPanel();
        givePerformanceReviewPage = new GivePerformanceReviewPanel();
        // ------------------------------------
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
        
        // Manager Home Page 
        managerHomePage = new ManagerHomePanel(sideMenu.getCCSideMenuList());
        // Admin Home Page
         adminHomePage = new AdminHomePanel(sideMenu.getCCSideMenuList());
        
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
    public CVPanel getCVPage(){
        return this.cvPage;
    }
    public OrganizationAddPanel getOrganizationAddPage(){
        return this.organizationAddPage;
    }
    public JobDetailsPanel getJobDetailsPage(){
        return this.jobDetailsPage;
    }
    public ApplicationsPanel getApplicationPage(){
        return this.applicationPage;
    }
    
    public HRJobPostsPanel getHRJobPostsPage(){
        return this.hrJobPostsPage;
    }
    
    
    public HRApplications getHRApplicationPage(){
        return this.hrApplicationPage;
    }
    public HRCVPanel getHRCVPage(){
        return this.hrCVPage;
    }
    
   
    
   
    
    public ApplicationsDetailPanel getApplicationsDetailPage(){
        return this.applicationDetailsPage;
    }
    public HRJobDetailsPanel getHRJobDetailsPage(){
        return this.hrJobDetailsPage;
    }

    public HRJobPublishPanel getHRJobPublishPage(){
        return this.hrJobPublishPage;
    }
    public DepartmentPanel getDepartmentPage(){return this.departmentPage; }
    public WelcomePanel getWelcomePage(){return this.welcomePage; }
    public LoginPanel getLoginPage(){return this.loginPage; }
    public RegisterPanel getRegisterPage(){return this.registerPage; }
    public ShowTasksPanel getShowTasksPage(){return this.showTasksPage; }
    public ProfilePanel getProfilePage(){return this.profilePage; }
    public EmpLeaveRequestsPanel getEmpLeaveRequestsPage() {return this.empLeaveRequestsPage; }
    
    
    public AdminHomePanel getAdminHomePage(CCSideMenuList cCSideMenuList) { return this.adminHomePage; }
    public ShowDepartmentsPanel getShowDepartmentsPage () { return this.showDepartmentsPage; }
    public AddNewDepartmentPanel getAddNewDepartmentPage () { return this.addNewDepartmentPage; }
    public PromoteEmployeePanel getPromoteEmployeePage () { return this.promoteEmployeePage; }
    
    public PositionDetailsPanel getPositionDetailPage(){return this.positionDetailsPage; }
    public LeaveRecordPanel getLeaveRecordPage(){return this.leaveRecordPage; }
    public DepartmentBudgetPanel getDepartmentBudgetPage(){return this.departmentBudgetPage; }
    public AddNewDepartmentBudgetPanel getAddNewDepartmentBudgetPage(){ return this.addNewDepartmentBudgetPage; }
    public ShowPositionsPanel getShowPositionsPage(){ return this.showPositionsPage; }
    public AddNewPositionPanel getAddNewPositionPage () { return this.addNewPositionPage; }
    public ShowTasksManagerPanel getShowTasksManagerPage (){ return this.showTasksManagerPage; }
    public AddNewTaskManagerPanel getAddNewTaskManagerPage () { return this.addNewTaskManagerPage; }
    public ShowPerformanceReviewPanel getShowPerformanceReviewPage () { return this.showPerformanceReviewPage; }
    public GivePerformanceReviewPanel getGivePerformanceReviewPage () { return this.givePerformanceReviewPage; }
    public ManagerHomePanel getManagerHomePage (CCSideMenuList cCSideMenuList) { return this.managerHomePage; }
    
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
