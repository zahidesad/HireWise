/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.dao;

import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.job_posting_system.model.JobPosting;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class JobPostingDAO {
    // CREATE
    public void insert(JobPosting jobPosting) {
        String sql = "INSERT INTO JobPosting (position_id, posted_by, title, description, posting_date, expiry_date, status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, jobPosting.getPositionId());
            ps.setInt(2, jobPosting.getPostedBy());
            ps.setString(3, jobPosting.getTitle());
            ps.setString(4, jobPosting.getDescription());

            if (jobPosting.getPostingDate() != null) {
                ps.setDate(5, new java.sql.Date(jobPosting.getPostingDate().getTime()));
            } else {
                ps.setNull(5, Types.DATE);
            }

            if (jobPosting.getExpiryDate() != null) {
                ps.setDate(6, new java.sql.Date(jobPosting.getExpiryDate().getTime()));
            } else {
                ps.setNull(6, Types.DATE);
            }

            ps.setString(7, jobPosting.getStatus());

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    jobPosting.setJobPostingId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public JobPosting findById(int jobPostingId) {
        String sql = "SELECT job_posting_id, position_id, posted_by, title, description, posting_date, expiry_date, status "
                + "FROM JobPosting WHERE job_posting_id=?";
        JobPosting jobPosting = null;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, jobPostingId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    jobPosting = mapRowToJobPosting(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jobPosting;
    }

    // READ ALL
    public List<JobPosting> findAll() {
        String sql = "SELECT job_posting_id, position_id, posted_by, title, description, posting_date, expiry_date, status "
                + "FROM JobPosting";
        List<JobPosting> jobPostings = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                JobPosting jobPosting = mapRowToJobPosting(rs);
                jobPostings.add(jobPosting);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jobPostings;
    }

    // UPDATE
    public void update(JobPosting jobPosting) {
        String sql = "UPDATE JobPosting SET position_id=?, posted_by=?, title=?, description=?, posting_date=?, expiry_date=?, status=? "
                + "WHERE job_posting_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, jobPosting.getPositionId());
            ps.setInt(2, jobPosting.getPostedBy());
            ps.setString(3, jobPosting.getTitle());
            ps.setString(4, jobPosting.getDescription());

            if (jobPosting.getPostingDate() != null) {
                ps.setDate(5, new java.sql.Date(jobPosting.getPostingDate().getTime()));
            } else {
                ps.setNull(5, Types.DATE);
            }

            if (jobPosting.getExpiryDate() != null) {
                ps.setDate(6, new java.sql.Date(jobPosting.getExpiryDate().getTime()));
            } else {
                ps.setNull(6, Types.DATE);
            }

            ps.setString(7, jobPosting.getStatus());
            ps.setInt(8, jobPosting.getJobPostingId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int jobPostingId) {
        String sql = "DELETE FROM JobPosting WHERE job_posting_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, jobPostingId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // FILTER BY TITLE AND STATUS
public List<JobPosting> filterJobPostings(String titleFilter, String statusFilter) {
    String sql = "SELECT job_posting_id, position_id, posted_by, title, description, posting_date, expiry_date, status "
               + "FROM JobPosting WHERE 1=1";

    // Dynamically build the WHERE clause based on the filters
    if (titleFilter != null && !titleFilter.trim().isEmpty()) {
        sql += " AND title LIKE ?";
    }
    if (statusFilter != null && !statusFilter.trim().isEmpty()) {
        sql += " AND status = ?";
    }

    List<JobPosting> jobPostings = new ArrayList<>();
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        int paramIndex = 1;
        if (titleFilter != null && !titleFilter.trim().isEmpty()) {
            ps.setString(paramIndex++, "%" + titleFilter + "%");
        }
        if (statusFilter != null && !statusFilter.trim().isEmpty()) {
            ps.setString(paramIndex++, statusFilter);
        }

        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                JobPosting jobPosting = mapRowToJobPosting(rs);
                jobPostings.add(jobPosting);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return jobPostings;
}
    

    private JobPosting mapRowToJobPosting(ResultSet rs) throws SQLException {
        JobPosting jobPosting = new JobPosting();
        jobPosting.setJobPostingId(rs.getInt("job_posting_id"));
        jobPosting.setPositionId(rs.getInt("position_id"));
        jobPosting.setPostedBy(rs.getInt("posted_by"));
        jobPosting.setTitle(rs.getString("title"));
        jobPosting.setDescription(rs.getString("description"));

        Date postingDate = rs.getDate("posting_date");
        if (postingDate != null) {
            jobPosting.setPostingDate(new java.util.Date(postingDate.getTime()));
        }

        Date expiryDate = rs.getDate("expiry_date");
        if (expiryDate != null) {
            jobPosting.setExpiryDate(new java.util.Date(expiryDate.getTime()));
        }

        jobPosting.setStatus(rs.getString("status"));
        return jobPosting;
    }
}
