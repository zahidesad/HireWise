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
        if (budget == null || budget.getTotalBudget() <= 0) {
            throw new IllegalArgumentException("Invalid budget details provided.");
        }
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
        DepartmentBudget existingBudget = departmentBudgetDAO.findById(budget.getBudgetId());
        if (existingBudget == null) {
            throw new RuntimeException("Budget with ID " + budget.getBudgetId() + " does not exist.");
        }
        departmentBudgetDAO.update(budget);
    }

    public void deleteDepartmentBudget(int budgetId) {
        if (budgetId <= 0) {
            throw new IllegalArgumentException("Invalid budget ID.");
        }
        DepartmentBudget existingBudget = departmentBudgetDAO.findById(budgetId);
        if (existingBudget == null) {
            throw new RuntimeException("Budget with ID " + budgetId + " does not exist.");
        }
        departmentBudgetDAO.delete(budgetId);
    }

    public List<DepartmentBudget> getBudgetsByDepartmentId(int departmentId) {
        return departmentBudgetDAO.findByDepartmentId(departmentId);
    }
}
