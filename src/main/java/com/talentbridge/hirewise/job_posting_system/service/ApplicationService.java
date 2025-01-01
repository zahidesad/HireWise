/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.service;

import com.talentbridge.hirewise.job_posting_system.dao.ApplicantDAO;
import com.talentbridge.hirewise.job_posting_system.dao.ApplicationDAO;
import com.talentbridge.hirewise.job_posting_system.dao.JobPostingDAO;
import com.talentbridge.hirewise.job_posting_system.model.Applicant;
import com.talentbridge.hirewise.job_posting_system.model.Application;
import com.talentbridge.hirewise.job_posting_system.model.JobPosting;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ApplicationService {

    private ApplicationDAO applicationDAO = new ApplicationDAO();

    // Create a new application
    public void addApplication(Application application) {
        // Validate mandatory fields
        if (application.getApplicantId() <= 0 || application.getJobPostingId() <= 0) {
            System.out.println("Invalid applicant ID or job posting ID!");
            return;
        }
        applicationDAO.insert(application);
    }

    // Get an application by ID
    public Application getApplicationById(int applicationId) {
        if (applicationId <= 0) {
            System.out.println("Invalid application ID!");
            return null;
        }
        return applicationDAO.findById(applicationId);
    }

    // Get all applications
    public List<Application> getAllApplications() {
        return applicationDAO.findAll();
    }

    // Update an existing application
    public void updateApplication(Application application) {
        // Validate application before updating
        if (application.getApplicationId() <= 0) {
            System.out.println("Invalid application ID for update!");
            return;
        }
        applicationDAO.update(application);
    }

    // Delete an application by ID
    public void deleteApplication(int applicationId) {
        if (applicationId <= 0) {
            System.out.println("Invalid application ID for deletion!");
            return;
        }
        applicationDAO.delete(applicationId);
    }
    
    // Apply for a job
public void applyForJob(int applicantId, int jobPostingId) {
    // Validate input
    if (applicantId <= 0 || jobPostingId <= 0) {
        System.out.println("Invalid applicant ID or job posting ID!");
        return;
    }

    // Create a new Application object
    Application application = new Application();
    application.setApplicantId(applicantId);
    application.setJobPostingId(jobPostingId);
    
    // Set application date and initial stage
    LocalDateTime currentDateTime = LocalDateTime.now();
    Date applicationDate = Date.from(currentDateTime.atZone(ZoneId.systemDefault()).toInstant());
    java.sql.Date sqlDate = new java.sql.Date(applicationDate.getTime());


    application.setApplicationDate(sqlDate);
    application.setCurrentStage("Received");
    application.setLastUpdated(sqlDate);

    // Insert the application into the database
    try {
        applicationDAO.insert(application);
        System.out.println("Application submitted successfully with ID: " + application.getApplicationId());
    } catch (Exception e) {
        System.out.println("Error occurred while applying for the job: " + e.getMessage());
        e.printStackTrace();
    }
}

// Filter applications by job post title
public List<Application> getApplicationsByJobPostTitle(String jobPostTitle) {
    // Validate input
    if (jobPostTitle == null || jobPostTitle.trim().isEmpty()) {
        System.out.println("Job post title cannot be null or empty!");
        return new ArrayList<>();
    }

    try {
        return applicationDAO.filterApplicationsByJobPostTitle(jobPostTitle);
    } catch (Exception e) {
        System.out.println("Error occurred while filtering applications by job post title: " + e.getMessage());
        e.printStackTrace();
        return new ArrayList<>();
    }
}

// Delete all applications by job posting ID
public void deleteApplicationsByJobPostingId(int jobPostingId) {
    // Validate input
    if (jobPostingId <= 0) {
        System.out.println("Invalid job posting ID!");
        return;
    }

    try {
        applicationDAO.deleteApplicationsByJobPostingId(jobPostingId);
        System.out.println("All applications for job posting ID " + jobPostingId + " have been deleted.");
    } catch (Exception e) {
        System.out.println("Error occurred while deleting applications for job posting ID: " + jobPostingId);
        e.printStackTrace();
    }
}
}
