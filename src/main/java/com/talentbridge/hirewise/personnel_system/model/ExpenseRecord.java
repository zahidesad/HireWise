package com.talentbridge.hirewise.personnel_system.model;

import java.sql.Date;

/**
 *
 * @author Lenovo
 */
public class ExpenseRecord {
   private int expenseId;
    private int departmentId;
    private String expenseType;
    private double amount;
    private Date expenseDate;
    private int referenceId;

    // Getters and Setters
    public int getExpenseId() { return expenseId; }
    public void setExpenseId(int expenseId) { this.expenseId = expenseId; }

    public int getDepartmentId() { return departmentId; }
    public void setDepartmentId(int departmentId) { this.departmentId = departmentId; }

    public String getExpenseType() { return expenseType; }
    public void setExpenseType(String expenseType) { this.expenseType = expenseType; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public Date getExpenseDate() { return expenseDate; }
    public void setExpenseDate(Date expenseDate) { this.expenseDate = expenseDate; }

    public int getReferenceNo() { return referenceId; }
    public void setReferenceNo(int referenceId) { this.referenceId = referenceId; }
}
