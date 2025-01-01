package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.connection.DBConnection;
import com.talentbridge.hirewise.personnel_system.model.Task;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author zahid
 */
public class TaskDAO {

    public void insert(Task task) {
        String sql = "INSERT INTO Task (assigned_to, task_name, task_description, start_date, end_date, status) "
                + "VALUES (?, ?, ?, ?, ?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, task.getAssignedTo());
            ps.setString(2, task.getTaskName());
            ps.setString(3, task.getTaskDescription());
            if (task.getStartDate() != null) {
                ps.setDate(4, new java.sql.Date(task.getStartDate().getTime()));
            } else {
                ps.setNull(4, Types.DATE);
            }
            if (task.getEndDate() != null) {
                ps.setDate(5, new java.sql.Date(task.getEndDate().getTime()));
            } else {
                ps.setNull(5, Types.DATE);
            }
            ps.setString(6, task.getStatus());

            ps.executeUpdate();
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    task.setTaskId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Task findById(int taskId) {
        String sql = "SELECT task_id, assigned_to, task_name, task_description, start_date, end_date, status "
                + "FROM Task WHERE task_id = ?";
        Task task = null;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, taskId);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    task = mapRowToTask(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return task;
    }

    public List<Task> findAll() {
        String sql = "SELECT task_id, assigned_to, task_name, task_description, start_date, end_date, status FROM Task";
        List<Task> list = new ArrayList<>();
        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Task t = mapRowToTask(rs);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void update(Task task) {
        String sql = "UPDATE Task SET assigned_to=?, task_name=?, task_description=?, start_date=?, end_date=?, status=? "
                + "WHERE task_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, task.getAssignedTo());
            ps.setString(2, task.getTaskName());
            ps.setString(3, task.getTaskDescription());
            if (task.getStartDate() != null) {
                ps.setDate(4, new java.sql.Date(task.getStartDate().getTime()));
            } else {
                ps.setNull(4, Types.DATE);
            }
            if (task.getEndDate() != null) {
                ps.setDate(5, new java.sql.Date(task.getEndDate().getTime()));
            } else {
                ps.setNull(5, Types.DATE);
            }
            ps.setString(6, task.getStatus());
            ps.setInt(7, task.getTaskId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int taskId) {
        String sql = "DELETE FROM Task WHERE task_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, taskId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Task> getEmployeeTasks(int employeeId) {
        String sql = "SELECT task_id, assigned_to, task_name, task_description, start_date, end_date, status "
                   + "FROM Task WHERE assigned_to = ?";
        List<Task> tasks = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, employeeId);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Task task = mapRowToTask(rs);
                    tasks.add(task);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tasks;
    }

    private Task mapRowToTask(ResultSet rs) throws SQLException {
        Task task = new Task();
        task.setTaskId(rs.getInt("task_id"));
        task.setAssignedTo(rs.getInt("assigned_to"));
        task.setTaskName(rs.getString("task_name"));
        task.setTaskDescription(rs.getString("task_description"));

        Date start = rs.getDate("start_date");
        if (start != null) {
            task.setStartDate(new java.util.Date(start.getTime()));
        }
        Date end = rs.getDate("end_date");
        if (end != null) {
            task.setEndDate(new java.util.Date(end.getTime()));
        }

        task.setStatus(rs.getString("status"));
        return task;
    }
    
    public List<Task> getFilteredTasks(int employeeId, String status, String orderBy) {
    List<Task> tasks = new ArrayList<>();
    String storedProcedure = "{call GetFilteredTasks(?, ?, ?)}"; // The stored procedure name

    try (Connection conn = DBConnection.getConnection();
         CallableStatement cs = conn.prepareCall(storedProcedure)) {

        // Set the parameters for the stored procedure
        cs.setInt(1, employeeId);
        if (status != null && !status.isEmpty()) {
            cs.setString(2, status); // Set the status if provided
        } else {
            cs.setNull(2, Types.VARCHAR); // If no status, set it as NULL
        }
        cs.setString(3, orderBy); // OrderBy: 'start_date' or 'end_date'

        // Execute the stored procedure and process the result set
        try (ResultSet rs = cs.executeQuery()) {
            while (rs.next()) {
                Task task = mapRowToTask(rs);
                tasks.add(task);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return tasks;
}
}
