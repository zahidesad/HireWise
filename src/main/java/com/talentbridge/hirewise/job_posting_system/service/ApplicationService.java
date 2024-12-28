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
}
