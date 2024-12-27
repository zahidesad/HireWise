package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.job_posting_system.dao.ApplicationDAO;
import com.talentbridge.hirewise.personnel_system.model.Employee;
import com.talentbridge.hirewise.personnel_system.model.ExpenseRecord;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author emirs
 */

public class ExpenseRecordDAO {

    public void insert(ExpenseRecord record) {
        String sql = "INSERT INTO ExpenseRecord (department_id, expense_type, amount, expense_date, reference_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, record.getDepartmentId());
            ps.setString(2, record.getExpenseType());
            ps.setDouble(3, record.getAmount());
            ps.setDate(4, new java.sql.Date(record.getExpenseDate().getTime()));
            ps.setInt(5, record.getReferenceId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ExpenseRecord findById(int expenseId) {
        String sql = "SELECT expense_id, department_id, expense_type, amount, expense_date, reference_id FROM ExpenseRecord WHERE expense_id = ?";
        ExpenseRecord record = null;
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, expenseId);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    record = new ExpenseRecord();
                    record.setExpenseId(rs.getInt("expense_id"));
                    record.setDepartmentId(rs.getInt("department_id"));
                    record.setExpenseType(rs.getString("expense_type"));
                    record.setAmount(rs.getDouble("amount"));
                    record.setExpenseDate(rs.getDate("expense_date"));
                    record.setReferenceId(rs.getInt("reference_id"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return record;
    }

    public List<ExpenseRecord> findAll() {
        String sql = "SELECT expense_id, department_id, expense_type, amount, expense_date, reference_id FROM ExpenseRecord";
        List<ExpenseRecord> records = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                ExpenseRecord record = new ExpenseRecord();
                record.setExpenseId(rs.getInt("expense_id"));
                record.setDepartmentId(rs.getInt("department_id"));
                record.setExpenseType(rs.getString("expense_type"));
                record.setAmount(rs.getDouble("amount"));
                record.setExpenseDate(rs.getDate("expense_date"));
                record.setReferenceId(rs.getInt("reference_id"));
                records.add(record);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return records;
    }

    public void update(ExpenseRecord record) {
        String sql = "UPDATE ExpenseRecord SET department_id = ?, expense_type = ?, amount = ?, expense_date = ?, reference_id = ? WHERE expense_id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, record.getDepartmentId());
            ps.setString(2, record.getExpenseType());
            ps.setDouble(3, record.getAmount());
            ps.setDate(4, new java.sql.Date(record.getExpenseDate().getTime()));
            ps.setInt(5, record.getReferenceId());
            ps.setInt(6, record.getExpenseId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int expenseId) {
        String sql = "DELETE FROM ExpenseRecord WHERE expense_id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, expenseId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Object getReferance(ExpenseRecord record){
        
        Object ref = null;
        if(record.getExpenseType().equals("Salary")){
            EmployeeDAO e = new EmployeeDAO();
            ref = e.findById(record.getReferenceId());
        }else if(record.getExpenseType().equals("Recruitment")){
            ApplicationDAO e = new ApplicationDAO();
            ref = e.findById(record.getReferenceId());
        }else{
            System.out.println("Unknown ExpenseType");
        }
        return ref;
    }
}
