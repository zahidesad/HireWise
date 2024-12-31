/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.dao;

import com.talentbridge.hirewise.connection.DBConnection;
import com.talentbridge.hirewise.job_posting_system.model.Application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class ApplicationDAO {
    
     // CREATE
    public void insert(Application application) {
        String sql = "INSERT INTO Application (applicant_id, job_posting_id, application_date, current_stage, last_updated) "
                + "VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, application.getApplicantId());
            ps.setInt(2, application.getJobPostingId());
            ps.setDate(3, application.getApplicationDate());
            ps.setString(4, application.getCurrentStage());
            ps.setDate(5, application.getLastUpdated());

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    application.setApplicationId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public Application findById(int applicationId) {
        String sql = "SELECT application_id, applicant_id, job_posting_id, application_date, current_stage, last_updated "
                + "FROM Application WHERE application_id=?";
        Application application = null;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, applicationId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    application = mapRowToApplication(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return application;
    }

    // READ ALL
    public List<Application> findAll() {
        String sql = "SELECT application_id, applicant_id, job_posting_id, application_date, current_stage, last_updated "
                + "FROM Application";
        List<Application> applications = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Application application = mapRowToApplication(rs);
                applications.add(application);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return applications;
    }

    // UPDATE
    public void update(Application application) {
        String sql = "UPDATE Application SET applicant_id=?, job_posting_id=?, application_date=?, current_stage=?, last_updated=? "
                + "WHERE application_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, application.getApplicantId());
            ps.setInt(2, application.getJobPostingId());
            ps.setString(3, application.getApplicationDate().toString());
            ps.setString(4, application.getCurrentStage());
            ps.setString(5, application.getLastUpdated().toString());
            ps.setInt(6, application.getApplicationId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int applicationId) {
        String sql = "DELETE FROM Application WHERE application_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, applicationId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    

    private Application mapRowToApplication(ResultSet rs) throws SQLException {
        Application application = new Application();
        application.setApplicationId(rs.getInt("application_id"));
        application.setApplicantId(rs.getInt("applicant_id"));
        application.setJobPostingId(rs.getInt("job_posting_id"));
        application.setApplicationDate(rs.getDate("application_date"));
        application.setCurrentStage(rs.getString("current_stage"));
        application.setLastUpdated(rs.getDate("last_updated"));
        return application;
    }
    
}
