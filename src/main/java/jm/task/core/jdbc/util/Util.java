package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/preproject1.1.2";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "3242114124";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connection OK");
        } catch (ClassNotFoundException e) {
            System.out.println("Где-то по пути был classpath error.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Ошибка соединения с базой данных.");
            e.printStackTrace();
        }
        return connection;
    }
}
