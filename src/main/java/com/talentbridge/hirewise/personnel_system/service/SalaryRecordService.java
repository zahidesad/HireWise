package com.talentbridge.hirewise.personnel_system.service;

import com.talentbridge.hirewise.personnel_system.dao.SalaryRecordDAO;
import com.talentbridge.hirewise.personnel_system.model.SalaryRecord;

/**
 *
 * @author zahid
 */
import java.util.List;

public class SalaryRecordService {

    private SalaryRecordDAO salaryRecordDAO = new SalaryRecordDAO();

    public void addSalaryRecord(SalaryRecord sr) {
        // Basit validasyon örneği
        if (sr.getSalaryAmount() <= 0) {
            System.out.println("Salary must be greater than 0");
            return;
        }
        salaryRecordDAO.insert(sr);
    }

    public SalaryRecord getSalaryRecordById(int salaryRecordId) {
        return salaryRecordDAO.findById(salaryRecordId);
    }

    public List<SalaryRecord> getAllSalaryRecords() {
        return salaryRecordDAO.findAll();
    }

    public void updateSalaryRecord(SalaryRecord sr) {
        salaryRecordDAO.update(sr);
    }

    public void deleteSalaryRecord(int salaryRecordId) {
        salaryRecordDAO.delete(salaryRecordId);
    }
}
