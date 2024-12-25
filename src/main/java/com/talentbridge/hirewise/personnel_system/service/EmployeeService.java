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
}
