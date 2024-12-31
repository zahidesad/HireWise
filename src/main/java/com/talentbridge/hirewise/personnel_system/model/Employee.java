package com.talentbridge.hirewise.personnel_system.model;


import com.talentbridge.hirewise.user.User;
import com.talentbridge.hirewise.personnel_system.dao.DepartmentDAO;
import com.talentbridge.hirewise.user.UserDAO;
import com.talentbridge.hirewise.personnel_system.dao.PositionDAO;

import java.util.Date;

/**
 *
 * @author zahid
 */
public class Employee {


    private int employeeId;
    private int userId;
    private int departmentId;
    private int positionId;
    private Integer originalApplicantId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date hireDate;
    private String employmentStatus;

    public Employee() {
    }

    public Employee(int departmentId, int positionId, Integer originalApplicantId,
            String lastName, String firstName, String email, String phone,
            Date hireDate, String employmentStatus, Integer userId) {
        this.departmentId = departmentId;
        this.positionId = positionId;
        this.originalApplicantId = originalApplicantId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.phone = phone;
        this.hireDate = hireDate;
        this.employmentStatus = employmentStatus;
        this.userId = userId;
    }

    public Department getDepartment() {
        // departmentId = int
        if (this.departmentId <= 0) {
            return null;
        }
        DepartmentDAO dao = new DepartmentDAO();
        return dao.findById(this.departmentId);
    }

    public User getUser() {
        if (this.userId <= 0) {
            return null;
        }
        UserDAO dao = new UserDAO();
        return dao.findById(this.userId);
    }

    public Position getPosition() {
        if (this.positionId <= 0) {
            return null;
        }
        PositionDAO dao = new PositionDAO();
        return dao.findById(this.positionId);
    }

    /*
    public Applicant getOriginalApplicant() {
        
    }
     */
    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public Integer getOriginalApplicantId() {
        return originalApplicantId;
    }

    public void setOriginalApplicantId(Integer originalApplicantId) {
        this.originalApplicantId = originalApplicantId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
}

