package com.talentbridge.hirewise.job_posting_system.dao;

import com.talentbridge.hirewise.connection.DBConnection;
import com.talentbridge.hirewise.job_posting_system.model.Organization;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class OrganizationDAO {

    // CREATE
    public void insert(Organization organization) {
        String sql = "INSERT INTO Organization (cv_id, start_date, end_date, organization_name, organization_description) VALUES (?, ?, ?, ?, ?)";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, organization.getCvId());

            if (organization.getStartDate() != null) {
                ps.setDate(2, new java.sql.Date(organization.getStartDate().getTime()));
            } else {
                ps.setNull(2, Types.DATE);
            }

            if (organization.getEndDate() != null) {
                ps.setDate(3, new java.sql.Date(organization.getEndDate().getTime()));
            } else {
                ps.setNull(3, Types.DATE);
            }

            ps.setString(4, organization.getOrganizationName());
            ps.setString(5, organization.getOrganizationDescription());

            ps.executeUpdate();
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    organization.setOrganizationId(rs.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ BY ID
    public Organization findById(int organizationId) {
        String sql = "SELECT organization_id, cv_id, start_date, end_date, organization_name, organization_description FROM Organization WHERE organization_id=?";
        Organization organization = null;
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, organizationId);
            try ( ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    organization = mapRowToOrganization(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return organization;
    }

    // READ ALL BY CV ID
    public List<Organization> findByCvId(int cvId) {
        String sql = "SELECT organization_id, cv_id, start_date, end_date, organization_name, organization_description FROM Organization WHERE cv_id=?";
        List<Organization> organizations = new ArrayList<>();
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, cvId);
            try ( ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Organization organization = mapRowToOrganization(rs);
                    organizations.add(organization);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return organizations;
    }

    // READ ALL
    public List<Organization> findAll() {
        String sql = "SELECT organization_id, cv_id, start_date, end_date, organization_name, organization_description FROM Organization";
        List<Organization> organizations = new ArrayList<>();
        try ( Connection conn = DBConnection.getConnection();  Statement stmt = conn.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Organization organization = mapRowToOrganization(rs);
                organizations.add(organization);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return organizations;
    }

    // UPDATE
    public void update(Organization organization) {
        String sql = "UPDATE Organization SET cv_id=?, start_date=?, end_date=?, organization_name=?, organization_description=? WHERE organization_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, organization.getCvId());

            if (organization.getStartDate() != null) {
                ps.setDate(2, new java.sql.Date(organization.getStartDate().getTime()));
            } else {
                ps.setNull(2, Types.DATE);
            }

            if (organization.getEndDate() != null) {
                ps.setDate(3, new java.sql.Date(organization.getEndDate().getTime()));
            } else {
                ps.setNull(3, Types.DATE);
            }

            ps.setString(4, organization.getOrganizationName());
            ps.setString(5, organization.getOrganizationDescription());
            ps.setInt(6, organization.getOrganizationId());

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int organizationId) {
        String sql = "DELETE FROM Organization WHERE organization_id=?";
        try ( Connection conn = DBConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, organizationId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Organization mapRowToOrganization(ResultSet rs) throws SQLException {
        Organization organization = new Organization();
        organization.setOrganizationId(rs.getInt("organization_id"));
        organization.setCvId(rs.getInt("cv_id"));

        Date startDate = rs.getDate("start_date");
        if (startDate != null) {
            organization.setStartDate(new java.util.Date(startDate.getTime()));
        }

        Date endDate = rs.getDate("end_date");
        if (endDate != null) {
            organization.setEndDate(new java.util.Date(endDate.getTime()));
        }

        organization.setOrganizationName(rs.getString("organization_name"));
        organization.setOrganizationDescription(rs.getString("organization_description"));
        return organization;
    }

    public void deleteByCvId(int cvId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
