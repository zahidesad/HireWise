package com.talentbridge.hirewise.personnel_system.model;

import com.talentbridge.hirewise.personnel_system.dao.DepartmentDAO;

/**
 *
 * @author zahid
 */
public class Position {

    private int positionId;
    private int departmentId;
    private String positionTitle;
    private String positionDescription;
    private double baseSalary;

    public Position() {
    }

    public Position(int departmentId, String positionTitle, String positionDescription, double baseSalary) {
        this.departmentId = departmentId;
        this.positionTitle = positionTitle;
        this.positionDescription = positionDescription;
        this.baseSalary = baseSalary;
    }

    // Employee.java içinde:
    public Department getDepartment() {
        // departmentId = int
        if (this.departmentId <= 0) {
            return null; // Geçersiz ya da yok
        }
        DepartmentDAO dao = new DepartmentDAO();
        return dao.findById(this.departmentId);
    }

    // Getters & Setters ...
    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getPositionTitle() {
        return positionTitle;
    }

    public void setPositionTitle(String positionTitle) {
        this.positionTitle = positionTitle;
    }

    public String getPositionDescription() {
        return positionDescription;
    }

    public void setPositionDescription(String positionDescription) {
        this.positionDescription = positionDescription;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
