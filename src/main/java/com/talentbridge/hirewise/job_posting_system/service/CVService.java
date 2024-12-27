/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.service;
import com.talentbridge.hirewise.job_posting_system.dao.CVDAO;
import com.talentbridge.hirewise.job_posting_system.model.CV;
/**
 *
 * @author PC
 */
public class CVService {
    private CVDAO cvDAO = new CVDAO();

    // Get all CVs
    public List<CV> getAllCVs() {
        return cvDAO.findAll();
    }

    // Add a new CV
    public void addCV(String title, String about, String email, String phone, String externalSource) {
        // Validate mandatory fields
        if (title != null && !title.trim().isEmpty() && email != null && !email.trim().isEmpty()) {
            CV cv = new CV();
            cv.setTitle(title);
            cv.setAbout(about);
            cv.setEmail(email);
            cv.setPhone(phone);
            cv.setExternalSource(externalSource);
            cvDAO.insert(cv);
        } else {
            System.out.println("CV title or email is invalid!");
        }
    }

    // Update an existing CV
    public void updateCV(int cvId, String newTitle, String newAbout, String newEmail, String newPhone, String newExternalSource) {
        CV cv = cvDAO.findById(cvId);
        if (cv != null) {
            cv.setTitle(newTitle);
            cv.setAbout(newAbout);
            cv.setEmail(newEmail);
            cv.setPhone(newPhone);
            cv.setExternalSource(newExternalSource);
            cvDAO.update(cv);
        } else {
            System.out.println("CV not found with ID: " + cvId);
        }
    }

    // Delete a CV by ID
    public void deleteCV(int cvId) {
        if (cvDAO.findById(cvId) != null) {
            cvDAO.delete(cvId);
        } else {
            System.out.println("CV not found with ID: " + cvId);
        }
    }

    // Get CV by ID
    public CV getCVById(int cvId) {
        CV cv = cvDAO.findById(cvId);
        if (cv == null) {
            System.out.println("CV not found with ID: " + cvId);
        }
        return cv;
    }

    // Get all skills associated with a CV
    public List<Skill> getCvSkills(int cvId) {
        SkillDAO skillDAO = new SkillDAO();
        return skillDAO.findByCvId(cvId);
    }

    // Get all organizations associated with a CV
    public List<Organization> getCvOrganizations(int cvId) {
        OrganizationDAO organizationDAO = new OrganizationDAO();
        return organizationDAO.findByCvId(cvId);
    }
}
