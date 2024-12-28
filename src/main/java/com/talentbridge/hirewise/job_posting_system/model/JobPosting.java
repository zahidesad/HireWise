/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.model;

import com.talentbridge.hirewise.personnel_system.dao.EmployeeDAO;
import com.talentbridge.hirewise.personnel_system.dao.PositionDAO;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.Position;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class JobPosting {
    private int jobPostingId;
    private int positionId;
    private int postedBy;
    private String title;
    private String description;
    private Date postingDate;
    private Date expiryDate;
    private String status;
    
    public Position getPosition() {
        
        if (this.positionId <= 0) {
            return null;
        }
        PositionDAO dao = new PositionDAO();
        return dao.findById(this.positionId);
    }
    
    public Employee getEmployee(){
        if(this.postedBy<=0){
            return null;
        }
       EmployeeDAO dao = new EmployeeDAO();
       return dao.findById(this.postedBy);
    }

    public int getJobPostingId() {
        return jobPostingId;
    }

    public void setJobPostingId(int jobPostingId) {
        this.jobPostingId = jobPostingId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(int postedBy) {
        this.postedBy = postedBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
