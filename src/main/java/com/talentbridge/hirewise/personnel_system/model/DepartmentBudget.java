package com.talentbridge.hirewise.personnel_system.model;

/**
 *
 * @author Lenovo
 */
public class DepartmentBudget {
     private int budgetId;
    private int departmentId;
    private int fiscalYear;
    private double totalBudget;
    private double allocatedForSalaries;
    private double allocatedForHiring;

    // Getters and Setters
    public int getBudgetId() { return budgetId; }
    public void setBudgetId(int budgetId) { this.budgetId = budgetId; }

    public int getDepartmentId() { return departmentId; }
    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }

    public int getFiscalYear() { return fiscalYear; }
    public void setFiscalYear(int fiscalYear) { this.fiscalYear = fiscalYear; }

    public double getTotalBudget() { return totalBudget; }
    public void setTotalBudget(double totalBudget) { this.totalBudget = totalBudget; }

    public double getAllocatedForSalaries() { return allocatedForSalaries; }
    public void setAllocatedForSalaries(double allocatedForSalaries) { this.allocatedForSalaries = allocatedForSalaries; }

    public double getAllocatedForHiring() { return allocatedForHiring; }
    public void setAllocatedForHiring(double allocatedForHiring) { this.allocatedForHiring = allocatedForHiring; }
}
