package com.talentbridge.hirewise.personnel_system.service;

import com.talentbridge.hirewise.personnel_system.dao.DepartmentBudgetDAO;
import com.talentbridge.hirewise.personnel_system.model.DepartmentBudget;
import java.util.List;

/**
 *
 * @author emirs
 */
public class DepartmentBudgetService {

    private final DepartmentBudgetDAO departmentBudgetDAO;

    public DepartmentBudgetService() {
        this.departmentBudgetDAO = new DepartmentBudgetDAO();
    }

    public void addDepartmentBudget(DepartmentBudget budget) {
        validateBudgetFields(budget);
        departmentBudgetDAO.insert(budget);
    }

    public DepartmentBudget getDepartmentBudgetById(int budgetId) {
        if (budgetId <= 0) {
            throw new IllegalArgumentException("Invalid budget ID.");
        }
        DepartmentBudget budget = departmentBudgetDAO.findById(budgetId);
        if (budget == null) {
            throw new RuntimeException("Budget with ID " + budgetId + " not found.");
        }
        return budget;
    }

    public List<DepartmentBudget> getAllDepartmentBudgets() {
        return departmentBudgetDAO.findAll();
    }

    public void updateDepartmentBudget(DepartmentBudget budget) {
        if (budget == null || budget.getBudgetId() <= 0) {
            throw new IllegalArgumentException("Invalid budget details for update.");
        }
        // Var mı
        DepartmentBudget existing = departmentBudgetDAO.findById(budget.getBudgetId());
        if (existing == null) {
            throw new RuntimeException("Budget with ID " + budget.getBudgetId() + " not found.");
        }
        validateBudgetFields(budget);
        departmentBudgetDAO.update(budget);
    }

    public void deleteDepartmentBudget(int budgetId) {
        if (budgetId <= 0) {
            throw new IllegalArgumentException("Invalid budget ID for delete.");
        }
        // Silinecek kaydın varlığını kontrol
        DepartmentBudget existing = departmentBudgetDAO.findById(budgetId);
        if (existing == null) {
            throw new RuntimeException("Budget with ID " + budgetId + " not found.");
        }
        departmentBudgetDAO.delete(budgetId);
    }

    public List<DepartmentBudget> getBudgetsByDepartmentId(int departmentId) {
        return departmentBudgetDAO.findByDepartmentId(departmentId);
    }

    private void validateBudgetFields(DepartmentBudget budget) {
        if (budget.getFiscalYear() <= 0) {
            throw new IllegalArgumentException("Fiscal Year must be positive.");
        }
        if (budget.getTotalBudget() <= 0) {
            throw new IllegalArgumentException("Total Budget must be positive.");
        }
        if (budget.getAllocatedForSalaries() < 0 || budget.getAllocatedForHiring() < 0) {
            throw new IllegalArgumentException("Allocated salaries/hiring cannot be negative.");
        }
        if (budget.getAllocatedForSalaries() > budget.getTotalBudget()) {
            throw new IllegalArgumentException("Salaries allocation cannot exceed total budget.");
        }
        if (budget.getAllocatedForHiring() > budget.getTotalBudget()) {
            throw new IllegalArgumentException("Hiring allocation cannot exceed total budget.");
        }
        if ((budget.getAllocatedForSalaries() + budget.getAllocatedForHiring()) > budget.getTotalBudget()) {
            throw new IllegalArgumentException("Sum of Salaries & Hiring allocations cannot exceed total budget.");
        }
    }
}
