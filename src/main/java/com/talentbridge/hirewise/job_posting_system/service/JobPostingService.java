/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.service;

import com.talentbridge.hirewise.job_posting_system.dao.JobPostingDAO;
import com.talentbridge.hirewise.job_posting_system.model.JobPosting;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class JobPostingService {
      private JobPostingDAO jobPostingDAO = new JobPostingDAO();

    // Add a new job posting
    public void addJobPosting(JobPosting jobPosting) {
        // Validate required fields
        if (jobPosting.getTitle() == null || jobPosting.getTitle().trim().isEmpty()) {
            System.out.println("Job title is invalid!");
            return;
        }
        if (jobPosting.getPositionId() <= 0) {
            System.out.println("Position ID is invalid!");
            return;
        }
        jobPostingDAO.insert(jobPosting);
    }

    // Get a job posting by ID
    public JobPosting getJobPostingById(int jobPostingId) {
        if (jobPostingId <= 0) {
            System.out.println("Invalid job posting ID!");
            return null;
        }
        return jobPostingDAO.findById(jobPostingId);
    }

    // Get all job postings
    public List<JobPosting> getAllJobPostings() {
        return jobPostingDAO.findAll();
    }

    // Update an existing job posting
    public void updateJobPosting(JobPosting jobPosting) {
        // Validate required fields
        if (jobPosting.getJobPostingId() <= 0) {
            System.out.println("Invalid job posting ID!");
            return;
        }
        if (jobPosting.getTitle() == null || jobPosting.getTitle().trim().isEmpty()) {
            System.out.println("Job title is invalid!");
            return;
        }
        jobPostingDAO.update(jobPosting);
    }

    // Delete a job posting by ID
    public void deleteJobPosting(int jobPostingId) {
        if (jobPostingId <= 0) {
            System.out.println("Invalid job posting ID for deletion!");
            return;
        }
        jobPostingDAO.delete(jobPostingId);
    }
}
