package com.talentbridge.hirewise.personnel_system.service;

import com.talentbridge.hirewise.personnel_system.dao.TaskDAO;
import com.talentbridge.hirewise.personnel_system.model.Task;

import java.util.List;

/**
 *
 * @author zahid
 */
public class TaskService {

    private TaskDAO taskDAO = new TaskDAO();

    public void addTask(Task task) {
        if (task.getTaskName() == null || task.getTaskName().trim().isEmpty()) {
            System.out.println("Task name is required.");
            return;
        }
        taskDAO.insert(task);
    }

    public Task getTaskById(int taskId) {
        return taskDAO.findById(taskId);
    }

    public List<Task> getAllTasks() {
        return taskDAO.findAll();
    }

    public void updateTask(Task task) {
        taskDAO.update(task);
    }

    public void deleteTask(int taskId) {
        taskDAO.delete(taskId);
    }
    
    public List<Task> getEmployeeTasks(int employeeId) {
        List<Task> tasks = taskDAO.getEmployeeTasks(employeeId);
        return tasks;
    }
}
