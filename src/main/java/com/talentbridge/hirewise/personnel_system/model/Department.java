package com.talentbridge.hirewise.personnel_system.model;

/**
 *
 * @author zahid
 */

public class Department {
    private int departmentId;
    private String departmentName;
    private String departmentDescription;

    // Getters and Setters
    public int getDepartmentId() { return departmentId; }
    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }

    public String getDepartmentDescription() { return departmentDescription; }
    public void setDepartmentDescription(String departmentDescription) { this.departmentDescription = departmentDescription; }
}
