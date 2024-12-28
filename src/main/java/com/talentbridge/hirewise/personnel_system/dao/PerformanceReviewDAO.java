package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.personnel_system.model.PerformanceReview;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zahid
 */
public class PerformanceReviewDAO {

    // CREATE
    public void insert(PerformanceReview pr) {
        String sql = "INSERT INTO PerformanceReview (employee_id, review_date, performance_score, comments) "
                + "VALUES (?, ?, ?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, pr.getEmployeeId());
            if (pr.getReviewDate() != null) {
                ps.setDate(2, new java.sql.Date(pr.getReviewDate().getTime()));
            } else {
                ps.setNull(2, Types.DATE);
            }
            ps.setInt(3, pr.getPerformanceScore());
            ps.setString(4, pr.getComments());

            ps.executeUpdate();
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    pr.setReviewId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public PerformanceReview findById(int reviewId) {
        String sql = "SELECT review_id, employee_id, review_date, performance_score, comments "
                + "FROM PerformanceReview WHERE review_id=?";
        PerformanceReview pr = null;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, reviewId);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    pr = mapRowToPerformanceReview(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pr;
    }

    // READ ALL
    public List<PerformanceReview> findAll() {
        String sql = "SELECT review_id, employee_id, review_date, performance_score, comments FROM PerformanceReview";
        List<PerformanceReview> list = new ArrayList<>();
        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                PerformanceReview pr = mapRowToPerformanceReview(rs);
                list.add(pr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // UPDATE
    public void update(PerformanceReview pr) {
        String sql = "UPDATE PerformanceReview SET employee_id=?, review_date=?, performance_score=?, comments=? "
                + "WHERE review_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, pr.getEmployeeId());
            if (pr.getReviewDate() != null) {
                ps.setDate(2, new java.sql.Date(pr.getReviewDate().getTime()));
            } else {
                ps.setNull(2, Types.DATE);
            }
            ps.setInt(3, pr.getPerformanceScore());
            ps.setString(4, pr.getComments());
            ps.setInt(5, pr.getReviewId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int reviewId) {
        String sql = "DELETE FROM PerformanceReview WHERE review_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, reviewId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<PerformanceReview> getEmployeeReviews(int employeeId) {
        String sql = "SELECT review_id, employee_id, review_date, performance_score, comments "
                   + "FROM PerformanceReview WHERE employee_id = ?";
        List<PerformanceReview> reviews = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    PerformanceReview review = mapRowToPerformanceReview(rs);
                    reviews.add(review);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return reviews;
    }

    private PerformanceReview mapRowToPerformanceReview(ResultSet rs) throws SQLException {
        PerformanceReview pr = new PerformanceReview();
        pr.setReviewId(rs.getInt("review_id"));
        pr.setEmployeeId(rs.getInt("employee_id"));

        Date reviewDate = rs.getDate("review_date");
        if (reviewDate != null) {
            pr.setReviewDate(new java.util.Date(reviewDate.getTime()));
        }

        pr.setPerformanceScore(rs.getInt("performance_score"));
        pr.setComments(rs.getString("comments"));
        return pr;
    }
}
