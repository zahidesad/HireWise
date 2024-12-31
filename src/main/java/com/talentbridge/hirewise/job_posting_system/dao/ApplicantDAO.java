package com.talentbridge.hirewise.job_posting_system.dao;

import com.talentbridge.hirewise.connection.DBConnection;
import com.talentbridge.hirewise.job_posting_system.model.Applicant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zahid
 */
public class ApplicantDAO {
     // CREATE
    public void insert(Applicant applicant) {
        String sql = "INSERT INTO Applicant (user_id, first_name, last_name, email, phone, cv_id) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, applicant.getUserId());
            ps.setString(2, applicant.getFirstName());
            ps.setString(3, applicant.getLastName());
            ps.setString(4, applicant.getEmail());
            ps.setString(5, applicant.getPhone());
            ps.setInt(6, applicant.getCvId());

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    applicant.setApplicantId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public Applicant findById(int applicantId) {
        String sql = "SELECT applicant_id, user_id, first_name, last_name, email, phone, cv_id FROM Applicant WHERE applicant_id=?";
        Applicant applicant = null;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, applicantId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    applicant = mapRowToApplicant(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return applicant;
    }

    // READ ALL
    public List<Applicant> findAll() {
        String sql = "SELECT applicant_id, user_id, first_name, last_name, email, phone, cv_id FROM Applicant";
        List<Applicant> applicants = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Applicant applicant = mapRowToApplicant(rs);
                applicants.add(applicant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return applicants;
    }

    // UPDATE
    public void update(Applicant applicant) {
        String sql = "UPDATE Applicant SET user_id=?, first_name=?, last_name=?, email=?, phone=?, cv_id=? WHERE applicant_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, applicant.getUserId());
            ps.setString(2, applicant.getFirstName());
            ps.setString(3, applicant.getLastName());
            ps.setString(4, applicant.getEmail());
            ps.setString(5, applicant.getPhone());
            ps.setInt(6, applicant.getCvId());
            ps.setInt(7, applicant.getApplicantId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int applicantId) {
        String sql = "DELETE FROM Applicant WHERE applicant_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, applicantId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Applicant mapRowToApplicant(ResultSet rs) throws SQLException {
        Applicant applicant = new Applicant();
        applicant.setApplicantId(rs.getInt("applicant_id"));
        applicant.setUserId(rs.getInt("user_id"));
        applicant.setFirstName(rs.getString("first_name"));
        applicant.setLastName(rs.getString("last_name"));
        applicant.setEmail(rs.getString("email"));
        applicant.setPhone(rs.getString("phone"));
        applicant.setCvId(rs.getInt("cv_id"));
        return applicant;
    }
}
