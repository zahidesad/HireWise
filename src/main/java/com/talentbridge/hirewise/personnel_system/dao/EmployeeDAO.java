package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.personnel_system.model.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 *
 * @author zahid
 */
public class EmployeeDAO {

    // CREATE
    public void insert(Employee emp) {
        String sql = "INSERT INTO Employee (department_id, position_id, original_applicant_id, "
                + "last_name, first_name, email, phone, hire_date, employment_status, user_id) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, emp.getDepartmentId());
            ps.setInt(2, emp.getPositionId());
            if (emp.getOriginalApplicantId() != null) {
                ps.setInt(3, emp.getOriginalApplicantId());
            } else {
                ps.setNull(3, Types.INTEGER);
            }
            ps.setString(4, emp.getLastName());
            ps.setString(5, emp.getFirstName());
            ps.setString(6, emp.getEmail());
            ps.setString(7, emp.getPhone());
            if (emp.getHireDate() != null) {
                ps.setDate(8, new java.sql.Date(emp.getHireDate().getTime()));
            } else {
                ps.setNull(8, Types.DATE);
            }
            ps.setString(9, emp.getEmploymentStatus());
            ps.setInt(10, emp.getUserId());

            ps.executeUpdate();

            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    emp.setEmployeeId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public Employee findById(int employeeId) {
        String sql = "SELECT employee_id, department_id, position_id, original_applicant_id, "
                + "last_name, first_name, email, phone, hire_date, employment_status, user_id "
                + "FROM Employee WHERE employee_id = ?";

        Employee emp = null;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, employeeId);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    emp = mapRowToEmployee(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    // READ ALL
    public List<Employee> findAll() {
        String sql = "SELECT employee_id, department_id, position_id, original_applicant_id, "
                + "last_name, first_name, email, phone, hire_date, employment_status, user_id "
                + "FROM Employee";

        List<Employee> list = new ArrayList<>();
        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Employee emp = mapRowToEmployee(rs);
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // UPDATE
    public void update(Employee emp) {
        String sql = "UPDATE Employee SET department_id=?, position_id=?, original_applicant_id=?, "
                + "last_name=?, first_name=?, email=?, phone=?, hire_date=?, employment_status=?, user_id=? "
                + "WHERE employee_id=?";

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, emp.getDepartmentId());
            ps.setInt(2, emp.getPositionId());
            if (emp.getOriginalApplicantId() != null) {
                ps.setInt(3, emp.getOriginalApplicantId());
            } else {
                ps.setNull(3, Types.INTEGER);
            }
            ps.setString(4, emp.getLastName());
            ps.setString(5, emp.getFirstName());
            ps.setString(6, emp.getEmail());
            ps.setString(7, emp.getPhone());
            if (emp.getHireDate() != null) {
                ps.setDate(8, new java.sql.Date(emp.getHireDate().getTime()));
            } else {
                ps.setNull(8, Types.DATE);
            }
            ps.setString(9, emp.getEmploymentStatus());
            ps.setInt(10, emp.getUserId());

            ps.setNull(10, Types.INTEGER);

            ps.setInt(11, emp.getEmployeeId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int employeeId) {
        String sql = "DELETE FROM Employee WHERE employee_id=?";

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee findByUserId(int userId) {
        String sql = "SELECT employee_id, department_id, position_id, original_applicant_id, "
                + "last_name, first_name, email, phone, hire_date, employment_status, user_id "
                + "FROM Employee WHERE user_id = ?";

        Employee emp = null;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, userId);

            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    emp = mapRowToEmployee(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;
    }

    // GET EMPLOYEE POSITION TITLE
    public String getEmployeePositionTitle(int employeeId) {
        String sql = "SELECT p.position_title "
                + "FROM Employee e "
                + "INNER JOIN Position p ON e.position_id = p.position_id "
                + "WHERE e.employee_id = ?";

        String positionTitle = null;

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);

            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    positionTitle = rs.getString("position_title");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return positionTitle;
    }

    public int countByPositionId(int positionId) {
        String sql = "SELECT COUNT(*) AS cnt FROM Employee WHERE position_id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, positionId);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("cnt");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // fallback
    }

    private Employee mapRowToEmployee(ResultSet rs) throws SQLException {
        Employee emp = new Employee();
        emp.setEmployeeId(rs.getInt("employee_id"));
        emp.setDepartmentId(rs.getInt("department_id"));
        emp.setPositionId(rs.getInt("position_id"));

        int origApp = rs.getInt("original_applicant_id");
        emp.setOriginalApplicantId(rs.wasNull() ? null : origApp);

        emp.setLastName(rs.getString("last_name"));
        emp.setFirstName(rs.getString("first_name"));
        emp.setEmail(rs.getString("email"));
        emp.setPhone(rs.getString("phone"));

        Date hireDate = rs.getDate("hire_date");
        if (hireDate != null) {
            emp.setHireDate(new java.sql.Date(hireDate.getTime()));
        }

        emp.setEmploymentStatus(rs.getString("employment_status"));

        int user = rs.getInt("user_id");
        emp.setUserId(rs.wasNull() ? null : user);

        return emp;

    }
}
