package com.lqq.mapper;

import com.lqq.entity.EasybuyUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * EasybuyUserDAO继承基类
 */

public interface EasybuyUserDAO extends MyBatisBaseDao<EasybuyUser,Integer>  {
    EasybuyUser findByNameAndPassword(@Param("name") String loginName,@Param("password") String password);
    EasybuyUser findByName(@Param("name") String loginName);

}