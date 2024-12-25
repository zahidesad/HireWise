package com.talentbridge.hirewise.personnel_system.dao;

import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.personnel_system.model.Position;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zahid
 */
public class PositionDAO {

    // CREATE
    public void insert(Position pos) {
        String sql = "INSERT INTO Position (department_id, position_title, position_description, base_salary) "
                + "VALUES (?, ?, ?, ?)";

        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, pos.getDepartmentId());
            ps.setString(2, pos.getPositionTitle());
            ps.setString(3, pos.getPositionDescription());
            ps.setDouble(4, pos.getBaseSalary());

            ps.executeUpdate();
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    pos.setPositionId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public Position findById(int positionId) {
        String sql = "SELECT position_id, department_id, position_title, position_description, base_salary "
                + "FROM Position WHERE position_id=?";
        Position pos = null;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, positionId);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    pos = mapRowToPosition(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pos;
    }

    // READ ALL
    public List<Position> findAll() {
        String sql = "SELECT position_id, department_id, position_title, position_description, base_salary FROM Position";
        List<Position> list = new ArrayList<>();
        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Position pos = mapRowToPosition(rs);
                list.add(pos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // UPDATE
    public void update(Position pos) {
        String sql = "UPDATE Position SET department_id=?, position_title=?, position_description=?, base_salary=? "
                + "WHERE position_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, pos.getDepartmentId());
            ps.setString(2, pos.getPositionTitle());
            ps.setString(3, pos.getPositionDescription());
            ps.setDouble(4, pos.getBaseSalary());
            ps.setInt(5, pos.getPositionId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int positionId) {
        String sql = "DELETE FROM Position WHERE position_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, positionId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Position mapRowToPosition(ResultSet rs) throws SQLException {
        Position pos = new Position();
        pos.setPositionId(rs.getInt("position_id"));
        pos.setDepartmentId(rs.getInt("department_id"));
        pos.setPositionTitle(rs.getString("position_title"));
        pos.setPositionDescription(rs.getString("position_description"));
        pos.setBaseSalary(rs.getDouble("base_salary"));
        return pos;
    }
}
