package com.talentbridge.hirewise.personnel_system.model;


import com.talentbridge.hirewise.personnel_system.dao.EmployeeDAO;


import java.util.Date;

/**
 *
 * @author zahid
 */
public class LeaveRecord {



    private int leaveId;
    private int employeeId;
    private Integer approvedBy;
    private String leaveType;
    private Date startDate;
    private Date endDate;
    private String status;


    public LeaveRecord() {
    }

    public LeaveRecord(int employeeId, Integer approvedBy, String leaveType,
            Date startDate, Date endDate, String status) {
        this.employeeId = employeeId;
        this.approvedBy = approvedBy;
        this.leaveType = leaveType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    // LeaveRecord.java içinde:
    public Employee getEmployee() {
        // employeeId = int
        if (this.employeeId <= 0) {
            return null;
        }
        EmployeeDAO dao = new EmployeeDAO();
        return dao.findById(this.employeeId);
    }

    // LeaveRecord.java içinde:
    public Employee getApprovedByEmployee() {
        if (this.approvedBy == null || this.approvedBy <= 0) {
            return null;
        }
        EmployeeDAO dao = new EmployeeDAO();
        return dao.findById(this.approvedBy);
    }

    // Getters & Setters ...
    public int getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(int leaveId) {
        this.leaveId = leaveId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Integer approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}

