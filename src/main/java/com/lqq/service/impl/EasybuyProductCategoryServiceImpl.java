package com.lqq.service.impl;

import com.lqq.entity.EasybuyProductCategory;
import com.lqq.mapper.EasybuyProductCategoryDAO;
import com.lqq.service.EasybuyProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasybuyProductCategoryServiceImpl implements EasybuyProductCategoryService {

    @Autowired
    private EasybuyProductCategoryDAO easybuyProductCategoryDAO;

    @Override
    public List<EasybuyProductCategory> findBytype(Integer type) {
        return easybuyProductCategoryDAO.findByType(type);
    }

    @Override
    public List<EasybuyProductCategory> findByParentid(Integer id) {
        return easybuyProductCategoryDAO.findByParentid(id);
    }
}
