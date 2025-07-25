package org.example.controller;

import org.example.connector.DBConnector;
import org.example.view.View;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PMControllerTest {


    @BeforeAll
    public static void init(){
     DBConnector.setTestMode(true);
    }
    @AfterAll
    public static void close(){
        DBConnector.setTestMode(false);
    }

    @BeforeEach
    public void cleanDB() throws SQLException {
        Connection con = DBConnector.getInstance();
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM pm");
        stmt.executeUpdate("DELETE FROM person ");
        stmt.executeUpdate("DELETE FROM address");
        stmt.close();
        con.close();
    }


    @Test
    public void addPMTest(){
        String simulatedUserInput = "TestLocation\n";
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        View view = new View();
        PMController pmController = new PMController(view);
        pmController.addPM(true);
    }

}
