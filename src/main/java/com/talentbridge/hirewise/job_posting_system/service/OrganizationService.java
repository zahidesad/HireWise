/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.service;
import com.talentbridge.hirewise.job_posting_system.dao.OrganizationDAO;
import com.talentbridge.hirewise.job_posting_system.model.Organization;
import java.util.List;
/**
 *
 * @author PC
 */
public class OrganizationService {
    private OrganizationDAO organizationDAO = new OrganizationDAO();

    // Get all organizations
    public List<Organization> getAllOrganizations() {
        return organizationDAO.findAll();
    }

    // Get all organizations for a specific CV
    public List<Organization> getOrganizationsByCvId(int cvId) {
        return organizationDAO.findByCvId(cvId);
    }

    // Add a new organization
    public void addOrganization(int cvId, String organizationName, String organizationDescription, java.util.Date startDate, java.util.Date endDate) {
        // Validate mandatory fields
        if (cvId > 0 && organizationName != null && !organizationName.trim().isEmpty()) {
            Organization organization = new Organization();
            organization.setCvId(cvId);
            organization.setOrganizationName(organizationName);
            organization.setOrganizationDescription(organizationDescription);
            organization.setStartDate(startDate);
            organization.setEndDate(endDate);
            organizationDAO.insert(organization);
        } else {
            System.out.println("Invalid CV ID or organization name!");
        }
    }

    // Update an existing organization
    public void updateOrganization(int organizationId, String newOrganizationName, String newOrganizationDescription, java.util.Date newStartDate, java.util.Date newEndDate) {
        Organization organization = organizationDAO.findById(organizationId);
        if (organization != null) {
            organization.setOrganizationName(newOrganizationName);
            organization.setOrganizationDescription(newOrganizationDescription);
            organization.setStartDate(newStartDate);
            organization.setEndDate(newEndDate);
            organizationDAO.update(organization);
        } else {
            System.out.println("Organization not found with ID: " + organizationId);
        }
    }

    // Delete an organization by ID
    public void deleteOrganization(int organizationId) {
        if (organizationDAO.findById(organizationId) != null) {
            organizationDAO.delete(organizationId);
        } else {
            System.out.println("Organization not found with ID: " + organizationId);
        }
    }

    // Delete all organizations for a specific CV
    public void deleteOrganizationsByCvId(int cvId) {
        List<Organization> organizations = organizationDAO.findByCvId(cvId);
        if (!organizations.isEmpty()) {
            organizationDAO.deleteByCvId(cvId);
        } else {
            System.out.println("No organizations found for CV ID: " + cvId);
        }
    }
}
