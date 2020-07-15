package com.zyadeh.kamel.service.impl;

import com.zyadeh.kamel.entities.Role;
import com.zyadeh.kamel.exceptions.ServiceException;
import com.zyadeh.kamel.service.CRUDService;

public class RoleService extends CRUDService<Role> {

    @Override
    public void create(Role entity) throws ServiceException {
        Role r = new Role();
    }

    @Override
    public Role read(int id) throws ServiceException {
        return null;
    }

    @Override
    public void update(Role entity) throws ServiceException {

    }

    @Override
    public void delete(Role entity) throws ServiceException {

    }
}
