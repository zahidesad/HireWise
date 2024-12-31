package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.connection.DBConnection;
import com.talentbridge.hirewise.personnel_system.model.SalaryRecord;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zahid
 */
public class SalaryRecordDAO {

    // CREATE
    public void insert(SalaryRecord sr) {
        String sql = "INSERT INTO SalaryRecord (employee_id, effective_date, salary_amount) "
                + "VALUES (?, ?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, sr.getEmployeeId());
            if (sr.getEffectiveDate() != null) {
                ps.setDate(2, new java.sql.Date(sr.getEffectiveDate().getTime()));
            } else {
                ps.setNull(2, Types.DATE);
            }
            ps.setDouble(3, sr.getSalaryAmount());

            ps.executeUpdate();
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    sr.setSalaryRecordId(rs.getInt(1));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public SalaryRecord findById(int salaryRecordId) {
        String sql = "SELECT salary_record_id, employee_id, effective_date, salary_amount "
                + "FROM SalaryRecord WHERE salary_record_id = ?";
        SalaryRecord sr = null;

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, salaryRecordId);

            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    sr = mapRowToSalaryRecord(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sr;
    }

    // READ ALL
    public List<SalaryRecord> findAll() {
        String sql = "SELECT salary_record_id, employee_id, effective_date, salary_amount FROM SalaryRecord";
        List<SalaryRecord> list = new ArrayList<>();

        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                SalaryRecord sr = mapRowToSalaryRecord(rs);
                list.add(sr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // UPDATE
    public void update(SalaryRecord sr) {
        String sql = "UPDATE SalaryRecord SET employee_id=?, effective_date=?, salary_amount=? "
                + "WHERE salary_record_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, sr.getEmployeeId());
            if (sr.getEffectiveDate() != null) {
                ps.setDate(2, new java.sql.Date(sr.getEffectiveDate().getTime()));
            } else {
                ps.setNull(2, Types.DATE);
            }
            ps.setDouble(3, sr.getSalaryAmount());
            ps.setInt(4, sr.getSalaryRecordId());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int salaryRecordId) {
        String sql = "DELETE FROM SalaryRecord WHERE salary_record_id = ?";

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, salaryRecordId);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<SalaryRecord> findByEmployeeId(int employeeId) {
        String sql = "SELECT salary_record_id, employee_id, effective_date, salary_amount "
                   + "FROM SalaryRecord WHERE employee_id = ? ORDER BY effective_date DESC";
        List<SalaryRecord> records = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    SalaryRecord record = new SalaryRecord();
                    record.setSalaryRecordId(rs.getInt("salary_record_id"));
                    record.setEmployeeId(rs.getInt("employee_id"));
                    record.setEffectiveDate(rs.getDate("effective_date"));
                    record.setSalaryAmount(rs.getDouble("salary_amount"));
                    records.add(record);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return records;
    }

    private SalaryRecord mapRowToSalaryRecord(ResultSet rs) throws SQLException {
        SalaryRecord sr = new SalaryRecord();
        sr.setSalaryRecordId(rs.getInt("salary_record_id"));
        sr.setEmployeeId(rs.getInt("employee_id"));

        Date effDate = rs.getDate("effective_date");
        if (effDate != null) {
            sr.setEffectiveDate(new java.util.Date(effDate.getTime()));
        }
        sr.setSalaryAmount(rs.getDouble("salary_amount"));

        return sr;
    }
}
