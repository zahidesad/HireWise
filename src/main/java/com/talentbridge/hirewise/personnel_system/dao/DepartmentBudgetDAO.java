package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.personnel_system.model.DepartmentBudget;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author emirs
 */

public class DepartmentBudgetDAO {

    public void insert(DepartmentBudget budget) {
        String sql = "INSERT INTO DepartmentBudget (department_id, fiscal_year, total_budget, allocated_for_salaries, allocated_for_hiring) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, budget.getDepartmentId());
            ps.setInt(2, budget.getFiscalYear());
            ps.setDouble(3, budget.getTotalBudget());
            ps.setDouble(4, budget.getAllocatedForSalaries());
            ps.setDouble(5, budget.getAllocatedForHiring());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public DepartmentBudget findById(int budgetId) {
        String sql = "SELECT budget_id, department_id, fiscal_year, total_budget, allocated_for_salaries, allocated_for_hiring FROM DepartmentBudget WHERE budget_id = ?";
        DepartmentBudget budget = null;
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, budgetId);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    budget = new DepartmentBudget();
                    budget.setBudgetId(rs.getInt("budget_id"));
                    budget.setDepartmentId(rs.getInt("department_id"));
                    budget.setFiscalYear(rs.getInt("fiscal_year"));
                    budget.setTotalBudget(rs.getDouble("total_budget"));
                    budget.setAllocatedForSalaries(rs.getDouble("allocated_for_salaries"));
                    budget.setAllocatedForHiring(rs.getDouble("allocated_for_hiring"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return budget;
    }

    public List<DepartmentBudget> findAll() {
        String sql = "SELECT budget_id, department_id, fiscal_year, total_budget, allocated_for_salaries, allocated_for_hiring FROM DepartmentBudget";
        List<DepartmentBudget> budgets = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                DepartmentBudget budget = new DepartmentBudget();
                budget.setBudgetId(rs.getInt("budget_id"));
                budget.setDepartmentId(rs.getInt("department_id"));
                budget.setFiscalYear(rs.getInt("fiscal_year"));
                budget.setTotalBudget(rs.getDouble("total_budget"));
                budget.setAllocatedForSalaries(rs.getDouble("allocated_for_salaries"));
                budget.setAllocatedForHiring(rs.getDouble("allocated_for_hiring"));
                budgets.add(budget);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return budgets;
    }

    public void update(DepartmentBudget budget) {
        String sql = "UPDATE DepartmentBudget SET department_id = ?, fiscal_year = ?, total_budget = ?, allocated_for_salaries = ?, allocated_for_hiring = ? WHERE budget_id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, budget.getDepartmentId());
            ps.setInt(2, budget.getFiscalYear());
            ps.setDouble(3, budget.getTotalBudget());
            ps.setDouble(4, budget.getAllocatedForSalaries());
            ps.setDouble(5, budget.getAllocatedForHiring());
            ps.setInt(6, budget.getBudgetId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int budgetId) {
        String sql = "DELETE FROM DepartmentBudget WHERE budget_id = ?";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, budgetId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<DepartmentBudget> findByDepartmentId(int deptId) {
    String sql = "SELECT budget_id, department_id, fiscal_year, total_budget, allocated_for_salaries, allocated_for_hiring "
               + "FROM DepartmentBudget WHERE department_id = ?";
    List<DepartmentBudget> budgets = new ArrayList<>();
    try (Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, deptId);
        try (ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                DepartmentBudget b = new DepartmentBudget();
                b.setBudgetId(rs.getInt("budget_id"));
                b.setDepartmentId(rs.getInt("department_id"));
                b.setFiscalYear(rs.getInt("fiscal_year"));
                b.setTotalBudget(rs.getDouble("total_budget"));
                b.setAllocatedForSalaries(rs.getDouble("allocated_for_salaries"));
                b.setAllocatedForHiring(rs.getDouble("allocated_for_hiring"));
                budgets.add(b);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return budgets;
}

}
