/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.personnel_system.model;

/**
 *
 * @author Lenovo
 */
public class DepartmentBudget {
     private int budgetId;
    private int departmentId;
    private String fiscalYear;
    private double totalBudget;
    private double allocatedForSalaries;
    private double allocatedForHiring;

    // Getters and Setters
    public int getBudgetId() { return budgetId; }
    public void setBudgetId(int budgetId) { this.budgetId = budgetId; }

    public int getDepartmentId() { return departmentId; }
    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }

    public String getFiscalYear() { return fiscalYear; }
    public void setFiscalYear(String fiscalYear) { this.fiscalYear = fiscalYear; }

    public double getTotalBudget() { return totalBudget; }
    public void setTotalBudget(double totalBudget) { this.totalBudget = totalBudget; }

    public double getAllocatedForSalaries() { return allocatedForSalaries; }
    public void setAllocatedForSalaries(double allocatedForSalaries) { this.allocatedForSalaries = allocatedForSalaries; }

    public double getAllocatedForHiring() { return allocatedForHiring; }
    public void setAllocatedForHiring(double allocatedForHiring) { this.allocatedForHiring = allocatedForHiring; }
}
