package com.talentbridge.hirewise.job_posting_system.service;


import com.talentbridge.hirewise.job_posting_system.dao.ApplicantDAO;
import com.talentbridge.hirewise.job_posting_system.model.Applicant;
import java.util.List;

/**
 *
 * @author zahid
 */
public class ApplicantService {

    private ApplicantDAO applicantDAO = new ApplicantDAO();

    // Create a new applicant
    public void addApplicant(Applicant applicant) {
        // Validate applicant email
        if (applicant.getEmail() == null || applicant.getEmail().trim().isEmpty()) {
            System.out.println("Applicant email is invalid!");
            return;
        }
        applicantDAO.insert(applicant);
    }

    // Get an applicant by ID
    public Applicant getApplicantById(int applicantId) {
        return applicantDAO.findById(applicantId);
    }

    // Get all applicants
    public List<Applicant> getAllApplicants() {
        return applicantDAO.findAll();
    }

    // Update an applicant
    public void updateApplicant(Applicant applicant) {
        // Validate applicant details before updating
        if (applicant.getApplicantId() <= 0) {
            System.out.println("Invalid applicant ID!");
            return;
        }
        applicantDAO.update(applicant);
    }

    // Delete an applicant by ID
    public void deleteApplicant(int applicantId) {
        if (applicantId <= 0) {
            System.out.println("Invalid applicant ID for deletion!");
            return;
        }
        applicantDAO.delete(applicantId);
    }
    
    // Get an applicant by User ID
public Applicant getApplicantByUserId(int userId) {
    if (userId <= 0) {
        System.out.println("Invalid user ID!");
        return null;
    }
    return applicantDAO.getApplicantByUserId(userId);
}
}
