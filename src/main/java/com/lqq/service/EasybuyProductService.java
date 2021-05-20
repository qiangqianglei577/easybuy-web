package com.lqq.service;

import com.lqq.entity.EasybuyProduct;


import java.util.List;

public interface EasybuyProductService {
    List<EasybuyProduct> findByProductid(Integer Productid);
    EasybuyProduct findByid(Integer id);
    List<EasybuyProduct> findByProdutName(String ProductName);
}
