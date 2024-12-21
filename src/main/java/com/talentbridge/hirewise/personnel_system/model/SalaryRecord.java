/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.personnel_system.model;

/**
 *
 * @author Lenovo
 */
public class SalaryRecord {
    private int salaryRecordId;
    private int employeeId;
    private String effectiveDate;
    private double salaryAmount;

    // Getters and Setters
    public int getSalaryRecordId() { return salaryRecordId; }
    public void setSalaryRecordId(int salaryRecordId) { this.salaryRecordId = salaryRecordId; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public String getEffectiveDate() { return effectiveDate; }
    public void setEffectiveDate(String effectiveDate) { this.effectiveDate = effectiveDate; }

    public double getSalaryAmount() { return salaryAmount; }
    public void setSalaryAmount(double salaryAmount) { this.salaryAmount = salaryAmount; }
}

