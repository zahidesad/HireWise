package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.personnel_system.model.LeaveRecord;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zahid
 */
public class LeaveRecordDAO {

    public void insert(LeaveRecord lr) {
        String sql = "INSERT INTO LeaveRecord (employee_id, approved_by, leave_type, start_date, end_date, status) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, lr.getEmployeeId());
            if (lr.getApprovedBy() != null) {
                ps.setInt(2, lr.getApprovedBy());
            } else {
                ps.setNull(2, Types.INTEGER);
            }
            ps.setString(3, lr.getLeaveType());
            if (lr.getStartDate() != null) {
                ps.setDate(4, new java.sql.Date(lr.getStartDate().getTime()));
            } else {
                ps.setNull(4, Types.DATE);
            }
            if (lr.getEndDate() != null) {
                ps.setDate(5, new java.sql.Date(lr.getEndDate().getTime()));
            } else {
                ps.setNull(5, Types.DATE);
            }
            ps.setString(6, lr.getStatus());

            ps.executeUpdate();
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    lr.setLeaveId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public LeaveRecord findById(int leaveId) {
        String sql = "SELECT leave_id, employee_id, approved_by, leave_type, start_date, end_date, status "
                + "FROM LeaveRecord WHERE leave_id = ?";
        LeaveRecord lr = null;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, leaveId);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    lr = mapRowToLeaveRecord(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lr;
    }

    public List<LeaveRecord> findAll() {
        String sql = "SELECT leave_id, employee_id, approved_by, leave_type, start_date, end_date, status FROM LeaveRecord";
        List<LeaveRecord> list = new ArrayList<>();

        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                LeaveRecord lr = mapRowToLeaveRecord(rs);
                list.add(lr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void update(LeaveRecord lr) {
        String sql = "UPDATE LeaveRecord SET employee_id=?, approved_by=?, leave_type=?, start_date=?, end_date=?, status=? "
                + "WHERE leave_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, lr.getEmployeeId());
            if (lr.getApprovedBy() != null) {
                ps.setInt(2, lr.getApprovedBy());
            } else {
                ps.setNull(2, Types.INTEGER);
            }
            ps.setString(3, lr.getLeaveType());
            if (lr.getStartDate() != null) {
                ps.setDate(4, new java.sql.Date(lr.getStartDate().getTime()));
            } else {
                ps.setNull(4, Types.DATE);
            }
            if (lr.getEndDate() != null) {
                ps.setDate(5, new java.sql.Date(lr.getEndDate().getTime()));
            } else {
                ps.setNull(5, Types.DATE);
            }
            ps.setString(6, lr.getStatus());
            ps.setInt(7, lr.getLeaveId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int leaveId) {
        String sql = "DELETE FROM LeaveRecord WHERE leave_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, leaveId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private LeaveRecord mapRowToLeaveRecord(ResultSet rs) throws SQLException {
        LeaveRecord lr = new LeaveRecord();
        lr.setLeaveId(rs.getInt("leave_id"));
        lr.setEmployeeId(rs.getInt("employee_id"));

        int approved = rs.getInt("approved_by");
        lr.setApprovedBy(rs.wasNull() ? null : approved);

        lr.setLeaveType(rs.getString("leave_type"));

        Date start = rs.getDate("start_date");
        if (start != null) {
            lr.setStartDate(new java.util.Date(start.getTime()));
        }
        Date end = rs.getDate("end_date");
        if (end != null) {
            lr.setEndDate(new java.util.Date(end.getTime()));
        }

        lr.setStatus(rs.getString("status"));
        return lr;
    }
}
