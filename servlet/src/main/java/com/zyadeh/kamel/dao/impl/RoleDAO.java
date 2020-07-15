package com.zyadeh.kamel.dao.impl;

import com.zyadeh.kamel.dao.Dao;
import com.zyadeh.kamel.entities.Role;
import com.zyadeh.kamel.exceptions.DAOException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static com.zyadeh.kamel.statics.ConstantHolder.LAST_INSERT;
import static com.zyadeh.kamel.statics.ConstantHolder.ROLE_INSERT;
import static com.zyadeh.kamel.statics.ConstantHolder.ROLE_SELECT_BY_ID;

public class RoleDAO extends Dao<Role> {

    @Override
    public boolean update(Role entity) throws DAOException {
        return false;
    }

    @Override
    public int insert(Role entity) throws DAOException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(ROLE_INSERT)) {
            preparedStatement.setInt(1, entity.getId());
            preparedStatement.setString(2, entity.getRole());
            preparedStatement.executeUpdate();
            return 0;
        } catch (SQLException ex) {
            throw new DAOException("exception during insert role");
        }
    }

    @Override
    public void delete(Role entity) throws DAOException {

    }

    @Override
    public Role selectById(int id) throws DAOException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(ROLE_SELECT_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                Role role = new Role();
                role.setId(resultSet.getInt("id"));
                role.setRole(resultSet.getString("role"));
                return role;
            }
            return null;
        } catch (SQLException e) {
            throw new DAOException("exception during select by id");
        }
    }

    @Override
    public List<Role> select() throws DAOException {
        return null;
    }

    @Override
    public Role selectByLogin(String login, String password) throws DAOException {
        return null;
    }

    @Override
    protected int getLastInsertId() throws DAOException {
        return 0;
    }
}
