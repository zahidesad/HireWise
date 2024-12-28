/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.model;

import com.talentbridge.hirewise.job_posting_system.dao.ApplicationDAO;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class ApplicationStageHistory {
    private int stageHistoryId;
    private int applicationId;
    private String stageName;
    private String changedData;
    private String comments;

    /**
     * @return the stageHistoryId
     */
    public int getStageHistoryId() {
        return stageHistoryId;
    }
    
    
    public Application getApplication() {
       
        if (this.applicationId <= 0) {
            return null;
        }
        ApplicationDAO dao = new ApplicationDAO();
        return dao.findById(this.applicationId);
    }
    
    /**
     * @param stageHistoryId the stageHistoryId to set
     */
    public void setStageHistoryId(int stageHistoryId) {
        this.stageHistoryId = stageHistoryId;
    }

    /**
     * @return the applicationId
     */
    public int getApplicationId() {
        return applicationId;
    }

    /**
     * @param applicationId the applicationId to set
     */
    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * @return the stageName
     */
    public String getStageName() {
        return stageName;
    }

    /**
     * @param stageName the stageName to set
     */
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * @return the changedData
     */
    public String getChangedData() {
        return changedData;
    }

    /**
     * @param changedData the changedData to set
     */
    public void setChangedData(String changedData) {
        this.changedData = changedData;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
    
    
 
    
   
}
