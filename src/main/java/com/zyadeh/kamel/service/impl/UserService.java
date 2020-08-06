package com.zyadeh.kamel.service.impl;

import com.zyadeh.kamel.dao.Dao;
import com.zyadeh.kamel.dao.impl.RoleDAO;
import com.zyadeh.kamel.dao.impl.UserDAO;
import com.zyadeh.kamel.entities.Role;
import com.zyadeh.kamel.entities.User;
import com.zyadeh.kamel.exceptions.DAOException;
import com.zyadeh.kamel.exceptions.ServiceException;
import com.zyadeh.kamel.service.CRUDService;

public class UserService extends CRUDService<User> {

    private Dao<User> dao = new UserDAO();
    private Dao<Role> roleDao = new RoleDAO();


    @Override
    public void create(User entity) throws ServiceException {
        try {
            int id = dao.insert(entity);
            Role role = entity.getRole();
            role.setId(id);
            roleDao.insert(role);
        } catch (DAOException e) {
            throw new ServiceException("user can't insert");
        }
    }

    @Override
    public User read(int id) throws ServiceException {
        return null;
    }

    @Override
    public void update(User entity) throws ServiceException {

    }

    @Override
    public void delete(User entity) throws ServiceException {

    }

    public User login(User entity) throws ServiceException {
        try {
            User user = dao.selectByLogin(entity.getLogin(), entity.getPassword());
            Role role = roleDao.selectById(user.getId());
            user.setRole(role);
            return user;
        } catch (DAOException e) {
            throw new ServiceException("user can't login");
        }
    }
}
