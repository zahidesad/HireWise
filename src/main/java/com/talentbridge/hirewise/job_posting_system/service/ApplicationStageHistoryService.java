/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.service;

import com.talentbridge.hirewise.job_posting_system.dao.ApplicationStageHistoryDAO;
import com.talentbridge.hirewise.job_posting_system.model.ApplicationStageHistory;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ApplicationStageHistoryService {
     private ApplicationStageHistoryDAO applicationStageHistoryDAO = new ApplicationStageHistoryDAO();

    // Add a new application stage history
    public void addApplicationStageHistory(ApplicationStageHistory history) {
        // Validate required fields
        if (history.getTitle() == null || history.getTitle().trim().isEmpty()) {
            System.out.println("Title is invalid!");
            return;
        }
        if (history.getPositionId() <= 0) {
            System.out.println("Position ID is invalid!");
            return;
        }
        applicationStageHistoryDAO.insert(history);
    }

    // Get an application stage history by ID
    public ApplicationStageHistory getApplicationStageHistoryById(int jobPostingId) {
        if (jobPostingId <= 0) {
            System.out.println("Invalid job posting ID!");
            return null;
        }
        return applicationStageHistoryDAO.findById(jobPostingId);
    }

    // Get all application stage histories
    public List<ApplicationStageHistory> getAllApplicationStageHistories() {
        return applicationStageHistoryDAO.findAll();
    }

    // Update an existing application stage history
    public void updateApplicationStageHistory(ApplicationStageHistory history) {
        // Validate required fields
        if (history.getJobPostingId() <= 0) {
            System.out.println("Invalid job posting ID!");
            return;
        }
        if (history.getTitle() == null || history.getTitle().trim().isEmpty()) {
            System.out.println("Title is invalid!");
            return;
        }
        applicationStageHistoryDAO.update(history);
    }

    // Delete an application stage history by ID
    public void deleteApplicationStageHistory(int jobPostingId) {
        if (jobPostingId <= 0) {
            System.out.println("Invalid job posting ID for deletion!");
            return;
        }
        applicationStageHistoryDAO.delete(jobPostingId);
    }
}
