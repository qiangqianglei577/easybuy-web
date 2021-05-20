package com.lqq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lqq.entity.EasybuyProduct;
import com.lqq.response.RespBean;
import com.lqq.service.EasybuyProductService;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/EasybuyProduct")
@CrossOrigin
public class EasybuyProductController {
    @Autowired
    private EasybuyProductService easybuyProductService;
    

    @ApiOperation(value = "查询单个商品")
    @GetMapping(value = "/findById")
    public RespBean findById(@RequestParam(value = "id") Integer id){
            EasybuyProduct easybuyProduct = easybuyProductService.findByid(id);
            return RespBean.sucesses("查询成功",easybuyProduct);
        }

        @ApiOperation(value = "查询1级or2级or3级菜单")
        @GetMapping(value = "/findByProductid")
    public RespBean findByProductid(@RequestParam("id") Integer id,
                                    @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
            PageHelper.startPage(pageNum,10);
            List<EasybuyProduct> list = easybuyProductService.findByProductid(id);
            PageInfo<EasybuyProduct> pageInfo=new PageInfo<>(list);
            return RespBean.sucesses("查询成功",pageInfo);
        }
        @ApiOperation(value = "根据名字迷糊查询")
        @GetMapping(value = "/findByProductName")
    public RespBean findByProductName(@RequestParam("ProductName") String ProductName,
                                      @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
            PageHelper.startPage(pageNum,10);
            List<EasybuyProduct> list = easybuyProductService.findByProdutName(ProductName);
            PageInfo<EasybuyProduct> pageInfo=new PageInfo<>(list);
            return RespBean.sucesses("查询成功",pageInfo);
        }
    
    
    
}
