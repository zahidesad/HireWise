/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.dao;
import com.talentbridge.hirewise.DBConnection;
import com.talentbridge.hirewise.job_posting_system.model.Skill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC
 */
public class SkillDAO {
   // CREATE
    public void insert(Skill skill) {
        String sql = "INSERT INTO Skill (cv_id, skill_name, skill_area) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, skill.getCvId());
            ps.setString(2, skill.getSkillName());
            ps.setString(3, skill.getSkillArea());

            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    skill.setSkillId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public Skill findById(int skillId) {
        String sql = "SELECT skill_id, cv_id, skill_name, skill_area FROM Skill WHERE skill_id=?";
        Skill skill = null;
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, skillId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    skill = mapRowToSkill(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return skill;
    }

    // READ ALL BY CV ID
    public List<Skill> findByCvId(int cvId) {
        String sql = "SELECT skill_id, cv_id, skill_name, skill_area FROM Skill WHERE cv_id=?";
        List<Skill> skills = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, cvId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Skill skill = mapRowToSkill(rs);
                    skills.add(skill);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return skills;
    }

    // READ ALL
    public List<Skill> findAll() {
        String sql = "SELECT skill_id, cv_id, skill_name, skill_area FROM Skill";
        List<Skill> skills = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Skill skill = mapRowToSkill(rs);
                skills.add(skill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return skills;
    }

    // UPDATE
    public void update(Skill skill) {
        String sql = "UPDATE Skill SET cv_id=?, skill_name=?, skill_area=? WHERE skill_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, skill.getCvId());
            ps.setString(2, skill.getSkillName());
            ps.setString(3, skill.getSkillArea());
            ps.setInt(4, skill.getSkillId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int skillId) {
        String sql = "DELETE FROM Skill WHERE skill_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, skillId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE ALL BY CV ID
    public void deleteByCvId(int cvId) {
        String sql = "DELETE FROM Skill WHERE cv_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, cvId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Skill mapRowToSkill(ResultSet rs) throws SQLException {
        Skill skill = new Skill();
        skill.setSkillId(rs.getInt("skill_id"));
        skill.setCvId(rs.getInt("cv_id"));
        skill.setSkillName(rs.getString("skill_name"));
        skill.setSkillArea(rs.getString("skill_area"));
        return skill;
    } 
}
