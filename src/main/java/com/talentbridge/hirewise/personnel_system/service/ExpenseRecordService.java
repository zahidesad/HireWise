package com.talentbridge.hirewise.personnel_system.service;

import com.talentbridge.hirewise.personnel_system.dao.ExpenseRecordDAO;
import com.talentbridge.hirewise.personnel_system.model.ExpenseRecord;
import java.util.List;
/**
 *
 * @author emirs
 */

public class ExpenseRecordService {

    private final ExpenseRecordDAO expenseRecordDAO;

    public ExpenseRecordService() {
        this.expenseRecordDAO = new ExpenseRecordDAO();
    }

    public void addExpenseRecord(ExpenseRecord record) {
        if (record == null || record.getAmount() <= 0 || record.getExpenseDate() == null) {
            throw new IllegalArgumentException("Invalid expense record details provided.");
        }
        expenseRecordDAO.insert(record);
    }

    public ExpenseRecord getExpenseRecordById(int expenseId) {
        if (expenseId <= 0) {
            throw new IllegalArgumentException("Invalid expense ID.");
        }
        ExpenseRecord record = expenseRecordDAO.findById(expenseId);
        if (record == null) {
            throw new RuntimeException("Expense record with ID " + expenseId + " not found.");
        }
        return record;
    }

    public List<ExpenseRecord> getAllExpenseRecords() {
        return expenseRecordDAO.findAll();
    }

    public void updateExpenseRecord(ExpenseRecord record) {
        if (record == null || record.getExpenseId() <= 0) {
            throw new IllegalArgumentException("Invalid expense record details for update.");
        }
        ExpenseRecord existingRecord = expenseRecordDAO.findById(record.getExpenseId());
        if (existingRecord == null) {
            throw new RuntimeException("Expense record with ID " + record.getExpenseId() + " does not exist.");
        }
        expenseRecordDAO.update(record);
    }

    public void deleteExpenseRecord(int expenseId) {
        if (expenseId <= 0) {
            throw new IllegalArgumentException("Invalid expense ID.");
        }
        ExpenseRecord existingRecord = expenseRecordDAO.findById(expenseId);
        if (existingRecord == null) {
            throw new RuntimeException("Expense record with ID " + expenseId + " does not exist.");
        }
        expenseRecordDAO.delete(expenseId);
    }
    
    public Object getReferance(ExpenseRecord record){
        return expenseRecordDAO.getReferance(record);
    }
}
