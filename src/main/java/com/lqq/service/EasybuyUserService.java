package com.lqq.service;

import com.lqq.entity.EasybuyUser;

public interface EasybuyUserService {
    EasybuyUser userLogin(String name,String password);
    EasybuyUser findByName(String name);
    int addUser(EasybuyUser easybuyUser);
}
