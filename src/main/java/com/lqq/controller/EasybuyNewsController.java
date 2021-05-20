package com.lqq.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lqq.entity.EasybuyNews;
import com.lqq.response.RespBean;
import com.lqq.service.EasybuyNewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/EasybuyNews")
@CrossOrigin
@Api(value = "新闻的控制层")
public class EasybuyNewsController {
    @Autowired
    private EasybuyNewsService easybuyNewsService;

    @ApiOperation(value = "查询全部新闻")
    @GetMapping(value = "/findAll")
    public RespBean findAll( @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum, 10);
        List<EasybuyNews> list =easybuyNewsService.findAll();
        PageInfo<EasybuyNews> pageInfo=new PageInfo<>(list);
        return RespBean.sucesses("查询成功",pageInfo);
    }

    @ApiOperation(value = "根据Id查询新闻数据")
    @GetMapping(value = "findByid")
    public RespBean findByid(@RequestParam(value = "id") Integer id){
        EasybuyNews easybuyNews = easybuyNewsService.findByid(id);
        return RespBean.sucesses("查询成功",easybuyNews);
    }



}
