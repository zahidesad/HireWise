package com.talentbridge.hirewise;

import com.talentbridge.hirewise.UserDAO;
import com.talentbridge.hirewise.User;
/**
 *
 * @author zahid
 */

import java.util.List;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void addUser(User user) {
        // Basit validasyon
        if (user.getUsername() == null || user.getUsername().trim().isEmpty()) {
            System.out.println("Username is required.");
            return;
        }
        if (user.getPassword() == null || user.getPassword().trim().isEmpty()) {
            System.out.println("Password is required.");
            return;
        }
        // Şifre hashing? vs. ekleyebilirsiniz

        userDAO.insert(user);
    }

    public User getUserById(int userId) {
        return userDAO.findById(userId);
    }

    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    public void updateUser(User user) {
        userDAO.update(user);
    }

    public void deleteUser(int userId) {
        userDAO.delete(userId);
    }
}
