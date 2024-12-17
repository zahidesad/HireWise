package com.talentbridge.hirewise;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author zahid
 */
public class DBConnection {
    
    private static String URL;
    private static String USER;
    private static String PASSWORD;

    static {
        try (InputStream input = DBConnection.class.getResourceAsStream("/config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            URL = prop.getProperty("DB_URL");
            USER = prop.getProperty("DB_USER");
            PASSWORD = prop.getProperty("DB_PASSWORD");

            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
