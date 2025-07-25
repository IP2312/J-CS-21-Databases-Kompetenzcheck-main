package org.example.dao;

import org.example.connector.DBConnector;
import org.example.model.PM;

import java.sql.*;

public class PMDAOImpl implements PMDAO {
    @Override
    public PM get(int id) {
        return null;
    }

    @Override
    public int insert(PM pm) {
        String sql = "INSERT INTO PM (location) VALUES (?)";
        int newId = 0;
        try (PreparedStatement ps = DBConnector.getInstance().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, pm.getLocation());
            ps.executeUpdate();

            ResultSet generatedKey = ps.getGeneratedKeys();
                if (generatedKey.next()){
                    newId = generatedKey.getInt(1);
            }

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("PM already exists!");
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Couldn't insert PM into database!", e);
        }
        return newId;
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
