package com.lqq.service.impl;

import com.lqq.entity.EasybuyUser;
import com.lqq.mapper.EasybuyUserDAO;
import com.lqq.service.EasybuyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EasybuyUserServiceImpl implements EasybuyUserService {
    @Autowired
    private EasybuyUserDAO easybuyUserDAO;

    @Override
    public EasybuyUser userLogin(String name, String password) {
        return easybuyUserDAO.findByNameAndPassword(name,password);
    }

    @Override
    public EasybuyUser findByName(String name) {
        return easybuyUserDAO.findByName(name);
    }

    @Override
    public int addUser(EasybuyUser easybuyUser) {
        return easybuyUserDAO.insert(easybuyUser);
    }
}
