package org.example.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static boolean isTestMode = false;
    private static DBConnector connector = null;

    private String username = "root";
    private String password = "9Y9tpOo2bBQpO5";
    private Connection connection;

    public static void setTestMode(boolean testMode){
        isTestMode = testMode;
    }


    public DBConnector() throws SQLException {
         String dbName =  isTestMode ? "pmtest" : "pm";
         String url = "jdbc:mysql://localhost:3306/" + dbName;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Driver "com.mysql.cj.jdbc.Driver" laden
            connection = DriverManager.getConnection(url, username, password); // Verbindung mit der Datenbank herstellen und in Variable connection speichern
        } catch (Exception e){
            e.printStackTrace();
            throw new SQLException("Database Connection couldn't be established!", e);
        }
    }

    public static Connection getInstance() throws SQLException {
        if (connector == null){
            connector = new DBConnector();
        } else if (connector.connection.isClosed()){
            connector = new DBConnector();
        }
        return connector.connection;
    }
}
