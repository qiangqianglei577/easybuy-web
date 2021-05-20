package com.lqq.mapper;

import com.lqq.entity.EasybuyProduct;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * EasybuyProductDAO继承基类
 */
public interface EasybuyProductDAO extends MyBatisBaseDao<EasybuyProduct, Integer> {
    //查询一级菜单商品
    List<EasybuyProduct> findByProductid(@Param("Productid") Integer Productid);
    //根据ID查询商品
    EasybuyProduct findByid(@Param("id") Integer id);
    //根据名字模糊查询
    List<EasybuyProduct> findByProductName(@Param("ProductName") String ProductName);

}