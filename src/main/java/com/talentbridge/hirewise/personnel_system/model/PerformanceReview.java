package com.talentbridge.hirewise.personnel_system.model;


import com.talentbridge.hirewise.personnel_system.dao.EmployeeDAO;


import java.util.Date;

/**
 *
 * @author zahid
 */
public class PerformanceReview {

    private int reviewId;
    private int employeeId;
    private Date reviewDate;
    private int performanceScore;
    private String comments;


    public PerformanceReview() {
    }

    public PerformanceReview(int employeeId, Date reviewDate, int performanceScore, String comments) {
        this.employeeId = employeeId;
        this.reviewDate = reviewDate;
        this.performanceScore = performanceScore;
        this.comments = comments;
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

    // Getters & Setters ...
    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        this.performanceScore = performanceScore;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
