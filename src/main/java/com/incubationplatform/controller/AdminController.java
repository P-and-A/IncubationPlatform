package com.incubationplatform.controller;


import com.incubationplatform.pojo.Admin;
import com.incubationplatform.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lcf
 * @since 2019-02-27
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService iAdminService;
    @RequestMapping("/h")
    @ResponseBody
    public Admin hello(){
        return iAdminService.getById(1);
    }
}

