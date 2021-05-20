package com.lqq.service;

import com.lqq.entity.EasybuyProductCategory;

import java.util.List;

public interface EasybuyProductCategoryService {
    List<EasybuyProductCategory> findBytype(Integer type);
    List<EasybuyProductCategory> findByParentid(Integer id);
}
