package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.connection.DBConnection;
import com.talentbridge.hirewise.personnel_system.model.Department;
import com.talentbridge.hirewise.personnel_system.model.DepartmentBudget;
import com.talentbridge.hirewise.personnel_system.model.ExpenseRecord;
import com.talentbridge.hirewise.personnel_system.model.Position;
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
public class DepartmentDAO {

    public void insert(Department dept) {
        String sql = "INSERT INTO Department (department_name, department_description) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, dept.getDepartmentName());
            ps.setString(2, dept.getDepartmentDescription());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Department findById(int id) {
        String sql = "SELECT department_id, department_name, department_description FROM Department WHERE department_id = ?";
        Department department = null;
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    department = new Department();
                    department.setDepartmentId(rs.getInt("department_id"));
                    department.setDepartmentName(rs.getString("department_name"));
                    department.setDepartmentDescription(rs.getString("department_description"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return department;
    }

    public List<Department> findAll() {
        String sql = "SELECT department_id, department_name, department_description FROM Department";
        List<Department> departments = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Department d = new Department();
                d.setDepartmentId(rs.getInt("department_id"));
                d.setDepartmentName(rs.getString("department_name"));
                d.setDepartmentDescription(rs.getString("department_description"));
                departments.add(d);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departments;
    }

    public void update(Department dept) {
        String sql = "UPDATE Department SET department_name = ?, department_description = ? WHERE department_id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, dept.getDepartmentName());
            ps.setString(2, dept.getDepartmentDescription());
            ps.setInt(3, dept.getDepartmentId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM Department WHERE department_id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Position> departmentPositions(int departmentID) {
        String sql = "SELECT * FROM Position p, Department d WHERE d.department_id=? AND p.department_id=d.department_id";
        List<Position> positions = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, departmentID); // Setting the parameter for department_id

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Position p = new Position();
                    p.setPositionId(rs.getInt("position_id"));
                    p.setDepartmentId(rs.getInt("department_id"));
                    p.setPositionTitle(rs.getString("position_title"));
                    p.setPositionDescription(rs.getString("position_description"));
                    p.setBaseSalary(rs.getInt("base_salary"));
                    positions.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return positions;
    }
    
    public List<ExpenseRecord> departmentExpenseRecords(int departmentID) {
        String sql = "SELECT * FROM ExpensesRecord e, Department d WHERE d.department_id=? AND e.department_id=d.department_id";
        List<ExpenseRecord> records = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, departmentID); // Setting the parameter for department_id

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    ExpenseRecord e = new ExpenseRecord();
                    e.setExpenseId(rs.getInt("expense_id"));
                    e.setDepartmentId(rs.getInt("department_id"));
                    e.setExpenseType(rs.getString("expense_type"));
                    e.setAmount(rs.getInt("amount"));
                    e.setExpenseDate(rs.getDate("expense_date"));
                    e.setReferenceId(rs.getInt("reference_id"));
                    records.add(e);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return records;
    }
    
    public List<DepartmentBudget> departmentBudgetHistory(int departmentID) {
        String sql = "SELECT * FROM DepartmentBudget b, Department d WHERE d.department_id=? AND b.department_id=d.department_id";
        List<DepartmentBudget> records = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, departmentID); // Setting the parameter for department_id

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    DepartmentBudget b = new DepartmentBudget();
                    b.setBudgetId(rs.getInt("budget_id"));
                    b.setDepartmentId(rs.getInt("department_id"));
                    b.setFiscalYear(rs.getInt("fiscal_year"));
                    b.setTotalBudget(rs.getInt("total_budget"));
                    b.setAllocatedForSalaries(rs.getInt("allocated_for_salaries"));
                    b.setAllocatedForHiring(rs.getInt("allocated_for_hiring"));
                    records.add(b);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return records;
    }
}
