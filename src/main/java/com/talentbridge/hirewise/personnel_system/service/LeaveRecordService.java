package com.talentbridge.hirewise.personnel_system.service;

import com.talentbridge.hirewise.personnel_system.dao.LeaveRecordDAO;
import com.talentbridge.hirewise.personnel_system.model.LeaveRecord;

/**
 *
 * @author zahid
 */
import java.util.List;

public class LeaveRecordService {

    private LeaveRecordDAO leaveRecordDAO = new LeaveRecordDAO();

    public void addLeaveRecord(LeaveRecord lr) {
        // Örneğin leaveType kontrolü
        if (lr.getLeaveType() == null || lr.getLeaveType().trim().isEmpty()) {
            System.out.println("Leave type is required.");
            return;
        }
        leaveRecordDAO.insert(lr);
    }

    public LeaveRecord getLeaveRecordById(int leaveId) {
        return leaveRecordDAO.findById(leaveId);
    }

    public List<LeaveRecord> getAllLeaveRecords() {
        return leaveRecordDAO.findAll();
    }

    public void updateLeaveRecord(LeaveRecord lr) {
        leaveRecordDAO.update(lr);
    }

    public void deleteLeaveRecord(int leaveId) {
        leaveRecordDAO.delete(leaveId);
    }
}
