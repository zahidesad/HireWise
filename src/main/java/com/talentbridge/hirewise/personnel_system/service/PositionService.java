package com.talentbridge.hirewise.personnel_system.service;

import com.talentbridge.hirewise.personnel_system.dao.PositionDAO;
import com.talentbridge.hirewise.personnel_system.model.Position;

/**
 *
 * @author zahid
 */
import java.util.List;

public class PositionService {

    private PositionDAO positionDAO = new PositionDAO();

    public void addPosition(Position pos) {
        // Validasyon
        if (pos.getPositionTitle() == null || pos.getPositionTitle().trim().isEmpty()) {
            System.out.println("Position title is required.");
            return;
        }
        positionDAO.insert(pos);
    }

    public Position getPositionById(int positionId) {
        return positionDAO.findById(positionId);
    }

    public List<Position> getAllPositions() {
        return positionDAO.findAll();
    }

    public void updatePosition(Position pos) {
        positionDAO.update(pos);
    }

    public void deletePosition(int positionId) {
        positionDAO.delete(positionId);
    }

    public List<Position> getPositionsByDepartmentId(int deptId) {
        return positionDAO.findByDepartmentId(deptId);
    }

}
