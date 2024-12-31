package com.talentbridge.hirewise.user;

import com.talentbridge.hirewise.user.UserDAO;
import com.talentbridge.hirewise.user.User;
/**
 *
 * @author zahid
 */

import java.util.List;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public Object addUser(User user) {
        // Basit validasyon
        if (user.getUsername() == null || user.getUsername().trim().isEmpty()) {
            System.out.println("Username is required.");
            return "Username is required.";
        }
        if (user.getPassword() == null || user.getPassword().trim().isEmpty()) {
            System.out.println("Password is required.");
            return "Password is required.";
        }
        // Şifre hashing? vs. ekleyebilirsiniz

        userDAO.insert(user);
        return user;
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
    
    public User authenticate(String username, String password) {
        User user = userDAO.login(username, password);
        if (user == null) {
            throw new RuntimeException("Invalid username or password.");
        }
        return user;
    }
}
