package com.talentbridge.hirewise.personnel_system.service;

import com.talentbridge.hirewise.personnel_system.dao.EmployeeDAO;
import com.talentbridge.hirewise.personnel_system.model.Employee;

import java.util.List;

/**
 *
 * @author zahid
 */
public class EmployeeService {

    private EmployeeDAO employeeDAO = new EmployeeDAO();

    public void addEmployee(Employee emp) {
        // Örneğin email boş mu, validasyon
        if (emp.getEmail() == null || emp.getEmail().trim().isEmpty()) {
            System.out.println("Email is invalid!");
            return;
        }
        employeeDAO.insert(emp);
    }

    public Employee getEmployeeById(int employeeId) {
        return employeeDAO.findById(employeeId);
    }

    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }

    public void updateEmployee(Employee emp) {
        employeeDAO.update(emp);
    }

    public void deleteEmployee(int employeeId) {
        employeeDAO.delete(employeeId);
    }

    public Employee getEmployeeByUserId(int userId) {
        if (userId <= 0) {
            throw new IllegalArgumentException("Invalid User ID.");
        }
        Employee employee = employeeDAO.findByUserId(userId);
        if (employee == null) {
            throw new RuntimeException("No employee found with User ID: " + userId);
        }
        return employee;
    }

    public String getPositionTitleForEmployee(int employeeId) {
        if (employeeId <= 0) {
            throw new IllegalArgumentException("Invalid Employee ID.");
        }
        String positionTitle = employeeDAO.getEmployeePositionTitle(employeeId);
        if (positionTitle == null) {
            throw new RuntimeException("Position title not found for Employee ID: " + employeeId);
        }
        return positionTitle;
    }

    public int countEmployeesByPositionId(int posId) {
        return employeeDAO.countByPositionId(posId);
    }

    public List<Employee> getAllNonManagerEmployees() {
        return employeeDAO.findAllNonManagers();
    }

}
