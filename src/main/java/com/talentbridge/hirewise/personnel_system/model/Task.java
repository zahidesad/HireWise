package com.talentbridge.hirewise.personnel_system.model;

import com.talentbridge.hirewise.personnel_system.dao.EmployeeDAO;
import java.util.Date;

/**
 *
 * @author zahid
 */
public class Task {

    private int taskId;
    private int assignedTo;
    private String taskName;
    private String taskDescription;
    private Date startDate;
    private Date endDate;
    private String status;

    public Task() {
    }

    public Task(int assignedTo, String taskName, String taskDescription,
            Date startDate, Date endDate, String status) {
        this.assignedTo = assignedTo;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Employee getAssignedEmployee() {
        if (this.assignedTo <= 0) {
            return null;
        }
        EmployeeDAO dao = new EmployeeDAO();
        return dao.findById(this.assignedTo);
    }

    // Getters & Setters ...
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(int assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
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
