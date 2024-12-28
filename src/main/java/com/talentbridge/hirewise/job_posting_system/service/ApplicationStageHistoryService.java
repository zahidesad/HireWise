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
       private ApplicationStageHistoryDAO dao= new ApplicationStageHistoryDAO();

    public ApplicationStageHistoryService() {
        this.dao = new ApplicationStageHistoryDAO();
    }

    // Add a new stage history
    public void addStageHistory(ApplicationStageHistory history) {
        if (history == null || history.getApplicationId() <= 0) {
            throw new IllegalArgumentException("Invalid stage history data.");
        }
        dao.insert(history);
    }

    // Get stage history by ID
    public ApplicationStageHistory getStageHistoryById(int stageHistoryId) {
        if (stageHistoryId <= 0) {
            throw new IllegalArgumentException("Invalid Stage History ID.");
        }
        ApplicationStageHistory history = dao.findById(stageHistoryId);
        if (history == null) {
            throw new RuntimeException("Stage History not found with ID: " + stageHistoryId);
        }
        return history;
    }

    // Get all stage histories
    public List<ApplicationStageHistory> getAllStageHistories() {
        List<ApplicationStageHistory> histories = dao.findAll();
        if (histories.isEmpty()) {
            throw new RuntimeException("No stage histories found.");
        }
        return histories;
    }

    // Update an existing stage history
    public void updateStageHistory(ApplicationStageHistory history) {
        if (history == null || history.getStageHistoryId() <= 0) {
            throw new IllegalArgumentException("Invalid stage history data for update.");
        }
        ApplicationStageHistory existingHistory = dao.findById(history.getStageHistoryId());
        if (existingHistory == null) {
            throw new RuntimeException("Stage History not found with ID: " + history.getStageHistoryId());
        }
        dao.update(history);
    }

    // Delete stage history by ID
    public void deleteStageHistory(int stageHistoryId) {
        if (stageHistoryId <= 0) {
            throw new IllegalArgumentException("Invalid Stage History ID.");
        }
        ApplicationStageHistory existingHistory = dao.findById(stageHistoryId);
        if (existingHistory == null) {
            throw new RuntimeException("Stage History not found with ID: " + stageHistoryId);
        }
        dao.delete(stageHistoryId);
    }

    // Get stage histories for a specific application ID
    public List<ApplicationStageHistory> getStageHistoriesByApplicationId(int applicationId) {
        if (applicationId <= 0) {
            throw new IllegalArgumentException("Invalid Application ID.");
        }

        List<ApplicationStageHistory> histories = dao.findAll(); // Update DAO to have findByApplicationId if required
        histories.removeIf(history -> history.getApplicationId() != applicationId);

        if (histories.isEmpty()) {
            throw new RuntimeException("No stage histories found for Application ID: " + applicationId);
        }

        return histories;
    }
}
