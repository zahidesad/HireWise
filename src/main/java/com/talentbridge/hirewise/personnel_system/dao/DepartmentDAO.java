package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.personnel_system.model.Department;
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
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

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
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try ( ResultSet rs = ps.executeQuery()) {
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

        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

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
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

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
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
