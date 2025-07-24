package org.example.dao;

import org.example.connector.DBConnector;
import org.example.model.PM;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class PMDAOImpl implements PMDAO {
    @Override
    public PM get(int id) {
        return null;
    }

    @Override
    public int insert(PM pm) {
        String sql = "INSERT INTO PM (location) VALUES (?)";
        try (PreparedStatement ps = DBConnector.getInstance().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, pm.getLocation());
            ps.executeUpdate();
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("PM already exists!");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Couldn't insert PM into database!", e);

        }
        return 0;
    }

    @Override
    public int update(PM pm) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
