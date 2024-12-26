/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.dao;

import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.job_posting_system.model.ApplicationStageHistory;
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
public class ApplicationStageHistoryDAO {
    // CREATE
    public void insert(ApplicationStageHistory history) {
        String sql = "INSERT INTO ApplicationStageHistory (job_posting_id, position_id, posted_by, title, description, posting_date, expiry_date, status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, history.getJobPostingId());
            ps.setInt(2, history.getPositionId());
            ps.setInt(3, history.getPostedBy());
            ps.setString(4, history.getTitle());
            ps.setString(5, history.getDescription());
            
            if (history.getPostingDate() != null) {
                ps.setDate(6, new java.sql.Date(history.getPostingDate().getTime()));
            } else {
                ps.setNull(6, Types.DATE);
            }

            if (history.getExpiryDate() != null) {
                ps.setDate(7, new java.sql.Date(history.getExpiryDate().getTime()));
            } else {
                ps.setNull(7, Types.DATE);
            }
            
            ps.setString(8, history.getStatus());

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    history.setJobPostingId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public ApplicationStageHistory findById(int jobPostingId) {
        String sql = "SELECT job_posting_id, position_id, posted_by, title, description, posting_date, expiry_date, status "
                + "FROM ApplicationStageHistory WHERE job_posting_id=?";
        ApplicationStageHistory history = null;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, jobPostingId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    history = mapRowToApplicationStageHistory(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return history;
    }

    // READ ALL
    public List<ApplicationStageHistory> findAll() {
        String sql = "SELECT job_posting_id, position_id, posted_by, title, description, posting_date, expiry_date, status "
                + "FROM ApplicationStageHistory";
        List<ApplicationStageHistory> histories = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ApplicationStageHistory history = mapRowToApplicationStageHistory(rs);
                histories.add(history);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return histories;
    }

    // UPDATE
    public void update(ApplicationStageHistory history) {
        String sql = "UPDATE ApplicationStageHistory SET position_id=?, posted_by=?, title=?, description=?, posting_date=?, expiry_date=?, status=? "
                + "WHERE job_posting_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, history.getPositionId());
            ps.setInt(2, history.getPostedBy());
            ps.setString(3, history.getTitle());
            ps.setString(4, history.getDescription());
            
            if (history.getPostingDate() != null) {
                ps.setDate(5, new java.sql.Date(history.getPostingDate().getTime()));
            } else {
                ps.setNull(5, Types.DATE);
            }

            if (history.getExpiryDate() != null) {
                ps.setDate(6, new java.sql.Date(history.getExpiryDate().getTime()));
            } else {
                ps.setNull(6, Types.DATE);
            }
            
            ps.setString(7, history.getStatus());
            ps.setInt(8, history.getJobPostingId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int jobPostingId) {
        String sql = "DELETE FROM ApplicationStageHistory WHERE job_posting_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, jobPostingId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ApplicationStageHistory mapRowToApplicationStageHistory(ResultSet rs) throws SQLException {
        ApplicationStageHistory history = new ApplicationStageHistory();
        history.setJobPostingId(rs.getInt("job_posting_id"));
        history.setPositionId(rs.getInt("position_id"));
        history.setPostedBy(rs.getInt("posted_by"));
        history.setTitle(rs.getString("title"));
        history.setDescription(rs.getString("description"));
        
        Date postingDate = rs.getDate("posting_date");
        if (postingDate != null) {
            history.setPostingDate(new java.util.Date(postingDate.getTime()));
        }

        Date expiryDate = rs.getDate("expiry_date");
        if (expiryDate != null) {
            history.setExpiryDate(new java.util.Date(expiryDate.getTime()));
        }

        history.setStatus(rs.getString("status"));
        return history;
    }
}
