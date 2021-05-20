package com.lqq.service.impl;

import com.lqq.entity.EasybuyProduct;
import com.lqq.mapper.EasybuyProductDAO;
import com.lqq.service.EasybuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EasybuyProductServiceImpl implements EasybuyProductService {

    @Autowired
    private EasybuyProductDAO easybuyProductDAO;

    @Override
   public List<EasybuyProduct> findByProductid(Integer Productid) {
        return easybuyProductDAO.findByProductid(Productid);
    }

    @Override
    public EasybuyProduct findByid(Integer id) {
        return easybuyProductDAO.findByid(id);
    }

    @Override
    public List<EasybuyProduct> findByProdutName(String ProductName) {
        return easybuyProductDAO.findByProductName(ProductName);
    }

}
