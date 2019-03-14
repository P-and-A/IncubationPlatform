package com.incubationplatform.controller;


import com.incubationplatform.common.Const;
import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lcf
 * @since 2019-02-28
 */
@Controller
@RequestMapping("/colleage")
public class ColleageController {
    @Autowired
    private IProjectService iProjectService;

    @RequestMapping("/{adminId}/save_review_status")
    @ResponseBody
    public ServerResponse reviewProject(Integer projectId,@PathVariable Integer adminId, String opinion, Integer status){
        return iProjectService.reviewProject(projectId, adminId, opinion, status);
    }



//    @RequestMapping("{adminId}/project")
//    public String



}

