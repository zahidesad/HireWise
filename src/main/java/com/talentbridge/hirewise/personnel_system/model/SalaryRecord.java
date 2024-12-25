package com.talentbridge.hirewise.personnel_system.model;

import com.talentbridge.hirewise.personnel_system.dao.EmployeeDAO;
import java.util.Date;

/**
 *
 * @author zahid
 */
public class SalaryRecord {

    private int salaryRecordId;
    private int employeeId;
    private Date effectiveDate;
    private double salaryAmount;

    public SalaryRecord() {
    }

    public SalaryRecord(int employeeId, Date effectiveDate, double salaryAmount) {
        this.employeeId = employeeId;
        this.effectiveDate = effectiveDate;
        this.salaryAmount = salaryAmount;
    }
    
    public Employee getEmployee() {
        if (this.employeeId <= 0) {
            return null; 
        }
        EmployeeDAO dao = new EmployeeDAO();
        return dao.findById(this.employeeId);
    }

    public int getSalaryRecordId() {
        return salaryRecordId;
    }

    public void setSalaryRecordId(int salaryRecordId) {
        this.salaryRecordId = salaryRecordId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
