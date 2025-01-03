package com.talentbridge.hirewise.job_posting_system.dao;

import com.talentbridge.hirewise.connection.DBConnection;
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
        String sql = "INSERT INTO ApplicationStageHistory (application_id, stage_name, changed_data, comments) "
                + "VALUES (?, ?, ?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, history.getApplicationId());
            ps.setString(2, history.getStageName());
            ps.setString(3, history.getChangedData());
            ps.setString(4, history.getComments());
            ps.executeUpdate();

            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    history.setStageHistoryId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ by ID
    public ApplicationStageHistory findById(int stageHistoryId) {
        String sql = "SELECT stage_history_id, application_id, stage_name, changed_data, comments "
                + "FROM ApplicationStageHistory WHERE stage_history_id = ?";
        ApplicationStageHistory history = null;

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, stageHistoryId);

            try ( ResultSet rs = ps.executeQuery()) {
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
        String sql = "SELECT stage_history_id, application_id, stage_name, changed_data, comments FROM ApplicationStageHistory";
        List<ApplicationStageHistory> histories = new ArrayList<>();

        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
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
        String sql = "UPDATE ApplicationStageHistory SET application_id = ?, stage_name = ?, changed_data = ?, comments = ? "
                + "WHERE stage_history_id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, history.getApplicationId());
            ps.setString(2, history.getStageName());
            ps.setString(3, history.getChangedData());
            ps.setString(4, history.getComments());
            ps.setInt(5, history.getStageHistoryId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int stageHistoryId) {
        String sql = "DELETE FROM ApplicationStageHistory WHERE stage_history_id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, stageHistoryId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method to map a ResultSet row to an ApplicationStageHistory object
    private ApplicationStageHistory mapRowToApplicationStageHistory(ResultSet rs) throws SQLException {
        ApplicationStageHistory history = new ApplicationStageHistory();
        history.setStageHistoryId(rs.getInt("stage_history_id"));
        history.setApplicationId(rs.getInt("application_id"));
        history.setStageName(rs.getString("stage_name"));
        history.setChangedData(rs.getString("changed_data"));
        history.setComments(rs.getString("comments"));
        return history;
    }
}
