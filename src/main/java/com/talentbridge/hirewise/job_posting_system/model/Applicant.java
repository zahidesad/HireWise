package com.talentbridge.hirewise.job_posting_system.model;

import com.talentbridge.hirewise.User;
import com.talentbridge.hirewise.UserDAO;
import com.talentbridge.hirewise.job_posting_system.dao.CVDAO;

/**
 *
 * @author zahid
 */
public class Applicant {
    private int applicantId;
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int cvId; // Foreign Key reference to CV

    
    public CV getCV() {
       
        if (this.cvId <= 0) {
            return null;
        }
        CVDAO dao = new CVDAO();
        return dao.findById(this.cvId);
    }
    
    public User getUser(){
        
        if (this.userId <= 0) {
            return null;
        }
        UserDAO dao = new UserDAO();
        return dao.findById(this.userId);
    }
    
    
    // Getters and Setters
    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }
    
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCvId() {
        return cvId;
    }

    public void setCvId(int cvId) {
        this.cvId = cvId;
    }
}
