package com.talentbridge.hirewise.job_posting_system.model;

import com.talentbridge.hirewise.job_posting_system.dao.ApplicantDAO;
import com.talentbridge.hirewise.job_posting_system.dao.JobPostingDAO;
import java.sql.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Application {
     private int applicationId;
    private int applicantId;
    private int jobPostingId;
    private Date applicationDate;
    private String currentStage;
    private Date lastUpdated;
    
    
    
    public Applicant getApplicant() {
       
        if (this.applicantId <= 0) {
            return null;
        }
        ApplicantDAO dao = new ApplicantDAO();
        return dao.findById(this.applicantId);
    }
    public JobPosting getJobPosting() {
      
        if (this.jobPostingId <= 0) {
            return null;
        }
        JobPostingDAO dao = new JobPostingDAO();
        return dao.findById(this.jobPostingId);
    }
    
    
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public int getJobPostingId() {
        return jobPostingId;
    }

    public void setJobPostingId(int jobPostingId) {
        this.jobPostingId = jobPostingId;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
