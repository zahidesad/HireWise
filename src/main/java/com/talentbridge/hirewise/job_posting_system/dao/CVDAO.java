/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.dao;
import com.talentbridge.hirewise.connection.DBConnection;
import com.talentbridge.hirewise.job_posting_system.model.CV;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class CVDAO {
    // CREATE
    public void insert(CV cv) {
        String sql = "INSERT INTO CV (title, about, email, phone, external_source) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, cv.getTitle());
            ps.setString(2, cv.getAbout());
            ps.setString(3, cv.getEmail());
            ps.setString(4, cv.getPhone());
            ps.setString(5, cv.getExternalSource());

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    cv.setCvId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public CV findById(int cvId) {
        String sql = "SELECT cv_id, title, about, email, phone, external_source FROM CV WHERE cv_id=?";
        CV cv = null;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, cvId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    cv = mapRowToCV(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cv;
    }

    // READ ALL
    public List<CV> findAll() {
        String sql = "SELECT cv_id, title, about, email, phone, external_source FROM CV";
        List<CV> cvs = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                CV cv = mapRowToCV(rs);
                cvs.add(cv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cvs;
    }

    // UPDATE
    public void update(CV cv) {
        String sql = "UPDATE CV SET title=?, about=?, email=?, phone=?, external_source=? WHERE cv_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, cv.getTitle());
            ps.setString(2, cv.getAbout());
            ps.setString(3, cv.getEmail());
            ps.setString(4, cv.getPhone());
            ps.setString(5, cv.getExternalSource());
            ps.setInt(6, cv.getCvId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int cvId) {
        String sql = "DELETE FROM CV WHERE cv_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, cvId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private CV mapRowToCV(ResultSet rs) throws SQLException {
        CV cv = new CV();
        cv.setCvId(rs.getInt("cv_id"));
        cv.setTitle(rs.getString("title"));
        cv.setAbout(rs.getString("about"));
        cv.setEmail(rs.getString("email"));
        cv.setPhone(rs.getString("phone"));
        cv.setExternalSource(rs.getString("external_source"));
        return cv;
    }
}
