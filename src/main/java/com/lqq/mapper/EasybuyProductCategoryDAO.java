package com.lqq.mapper;

import com.lqq.entity.EasybuyProductCategory;
import org.apache.ibatis.annotations.Param;


import java.util.List;

/**
 * EasybuyProductCategoryDAO继承基类
 */

public interface EasybuyProductCategoryDAO extends MyBatisBaseDao<EasybuyProductCategory,Integer> {

    List<EasybuyProductCategory> findByType(@Param("type") Integer type);

    List<EasybuyProductCategory> findByParentid(@Param("id") Integer id);

}