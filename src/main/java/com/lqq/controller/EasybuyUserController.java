package com.lqq.controller;


import com.lqq.entity.EasybuyUser;
import com.lqq.pojo.Security;
import com.lqq.response.RespBean;
import com.lqq.service.EasybuyUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;

@RestController
@CrossOrigin
@RequestMapping(value = "/EasybuyUser")
@ApiOperation(value = "用户登录控制层")

public class EasybuyUserController {
    @Autowired
    private EasybuyUserService easybuyUserService;

    @ApiOperation(value = "用户登录")
    @PostMapping(value = "/userLogin")
    public RespBean userLogin(@RequestParam("loginName") String name,
                              @RequestParam("password")String password){
        EasybuyUser Name = easybuyUserService.findByName(name);
        if (Name!=null){
            EasybuyUser easybuyUser = easybuyUserService.userLogin(name, Security.md5Hex(password));
            if(easybuyUser!=null){
                return RespBean.sucesses("登录成功",easybuyUser);
            }else{
                return RespBean.error("用户名或密码不正确，请重新登录");
            }
        }else{
            return RespBean.error("用户名不存在");
        }
    }

    @ApiOperation(value = "用户注册")
    @PostMapping(value = "/userRegister")
    public RespBean userRegister(EasybuyUser easybuyUser){
        String password=easybuyUser.getPassword();
        easybuyUser.setPassword(Security.md5Hex(password));
        int res = easybuyUserService.addUser(easybuyUser);
        if (res>0){
            return RespBean.sucesses("注册成功");
        }else {
            return RespBean.error("注册失败");
        }
    }




}
