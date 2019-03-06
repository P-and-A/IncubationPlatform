package com.incubationplatform.controller;

import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liaochaofan
 * @date 2019/3/5 20:36
 */
@Controller
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private IProjectService iProjectService;

    @RequestMapping("/{adminId}/save_review_status")
    @ResponseBody
    public ServerResponse reviewProject(Integer productId, @PathVariable Integer adminId, String opinion, Integer status){
        return iProjectService.reviewProject(productId, adminId, opinion, status);
    }
}
