package com.lqq.controller;



import com.lqq.entity.EasybuyProduct;
import com.lqq.entity.EasybuyProductCategory;
import com.lqq.response.RespBean;
import com.lqq.service.EasybuyProductCategoryService;
import com.lqq.service.EasybuyProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping(value = "/EasybuyProductCategor")
@CrossOrigin
public class EasybuyProductCategoryController {

    @Autowired
    private EasybuyProductCategoryService easybuyProductCategoryService;

    @Autowired
    private EasybuyProductService easybuyProductService;


    @GetMapping(value = "/findBytype")
    public RespBean findBytype(@RequestParam(value = "type") Integer type){
        List<EasybuyProductCategory> list = easybuyProductCategoryService.findBytype(type);
        for (EasybuyProductCategory e:list) {
                List<EasybuyProductCategory> list1 = easybuyProductCategoryService.findByParentid(e.getId());
                e.setChildren(list1);
            for (EasybuyProductCategory e1:list1) {
                List<EasybuyProductCategory> list2 = easybuyProductCategoryService.findByParentid(e1.getId());
                e1.setChildren(list2);
            }
        }
        return RespBean.sucesses("查询成功",list);
    }

    @GetMapping(value = "/findBytypeAndProductid")
    public RespBean findBytypeAndProductid(@RequestParam(value = "type") Integer type){
        List<EasybuyProductCategory> list = easybuyProductCategoryService.findBytype(type);
        for (EasybuyProductCategory e:list) {
            List<EasybuyProductCategory> list1 = easybuyProductCategoryService.findByParentid(e.getId());
            List<EasybuyProduct> list2 = easybuyProductService.findByProductid(e.getId());
            e.setChildren(list1);
            e.setLb(list2);
        }
        return RespBean.sucesses("查询成功",list);
    }


}
