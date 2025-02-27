package com.talentbridge.hirewise.user;

import com.talentbridge.hirewise.connection.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zahid
 */
public class UserDAO {

    // CREATE
    public void insert(User user) {
        String sql = "INSERT INTO [Users] (username, [password], email, role) VALUES (?, ?, ?, ?)";

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getRole());

            ps.executeUpdate();
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    user.setUserId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ by ID
    public User findById(int userId) {
        String sql = "SELECT user_id, username, [password], email, role, created_at, updated_at "
                + "FROM [Users] WHERE user_id = ?";
        User user = null;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, userId);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    user = mapRowToUser(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    // READ ALL
    public List<User> findAll() {
        String sql = "SELECT user_id, username, [password], email, role, created_at, updated_at FROM [Users]";
        List<User> list = new ArrayList<>();
        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                User user = mapRowToUser(rs);
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // UPDATE
    public void update(User user) {
        String sql = "UPDATE [Users] SET username=?, [password]=?, email=?, role=? WHERE user_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getRole());
            ps.setInt(5, user.getUserId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int userId) {
        String sql = "DELETE FROM [Users] WHERE user_id = ?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, userId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User login(String username, String password) {
        String sql = "SELECT user_id, username, [password], email, role, created_at, updated_at "
                + "FROM [Users] WHERE username = ? AND [password] = ?";
        User user = null;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);

            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    user = mapRowToUser(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    // Yardımcı metod
    private User mapRowToUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setUserId(rs.getInt("user_id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setEmail(rs.getString("email"));
        user.setRole(rs.getString("role"));
        user.setCreatedAt(rs.getTimestamp("created_at"));
        user.setUpdatedAt(rs.getTimestamp("updated_at"));
        return user;
    }
}
