package com.lqq.mapper;

import com.lqq.entity.EasybuyNews;

import java.util.List;


/**
 * EasybuyNewsDAO继承基类
 */
public interface EasybuyNewsDAO extends MyBatisBaseDao<EasybuyNews,Integer> {
        List<EasybuyNews> findAll();
}