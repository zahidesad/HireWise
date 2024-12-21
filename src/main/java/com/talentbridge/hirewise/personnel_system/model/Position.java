/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.personnel_system.model;

/**
 *
 * @author Lenovo
 */
public class Position {
    private int positionId;
    private int departmentId;
    private String positionTitle;
    private String positionDescription;
    private double baseSalary;

    // Getters and Setters
    public int getPositionId() { return positionId; }
    public void setPositionId(int positionId) { this.positionId = positionId; }

    public int getDepartmentId() { return departmentId; }
    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }

    public String getPositionTitle() { return positionTitle; }
    public void setPositionTitle(String positionTitle) { this.positionTitle = positionTitle; }

    public String getPositionDescription() { return positionDescription; }
    public void setPositionDescription(String positionDescription) { this.positionDescription = positionDescription; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
}
