package com.lqq.service.impl;

import com.lqq.entity.EasybuyNews;
import com.lqq.mapper.EasybuyNewsDAO;
import com.lqq.service.EasybuyNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EasybuyNewsServiceImpl implements EasybuyNewsService {
    @Autowired
    private EasybuyNewsDAO easybuyNewsDAO;

    @Override
    public List<EasybuyNews> findAll() {
        return easybuyNewsDAO.findAll();
    }

    @Override
    public EasybuyNews findByid(Integer id) {
        return easybuyNewsDAO.selectByPrimaryKey(id);
    }
}
