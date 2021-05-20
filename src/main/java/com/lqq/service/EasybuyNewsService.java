package com.lqq.service;

import com.lqq.entity.EasybuyNews;

import java.util.List;
import java.util.Optional;

public interface EasybuyNewsService {
    List<EasybuyNews> findAll();
    EasybuyNews findByid(Integer id);
}
