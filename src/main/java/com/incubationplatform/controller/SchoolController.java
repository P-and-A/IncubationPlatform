package com.incubationplatform.controller;

import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.pojo.Admin;
import com.incubationplatform.service.IAdminService;
import com.incubationplatform.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author liaochaofan
 * @date 2019/3/5 20:36
 */
@Controller
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    private IProjectService iProjectService;
    @Autowired
    private IAdminService adminService;

    @RequestMapping("/{adminId}/save_review_status")
    @ResponseBody
    public ServerResponse reviewProject(Integer productId, @PathVariable Integer adminId, String opinion, Integer status){
        return iProjectService.reviewProject(productId, adminId, opinion, status);
    }

    @RequestMapping("/{adminId}/update_admin")
    @ResponseBody
    public ServerResponse updateAdmin(@PathVariable Integer adminId, Admin admin){
        return null;
    }

    @RequestMapping("/{adminId}/add_admin")
    @ResponseBody
    public ServerResponse addAdmin(Admin admin){
        return adminService.addAdmin(admin);
    }

    @RequestMapping("/{adminId}/delete_admin")
    @ResponseBody
    public ServerResponse deleteAdmin(Admin admin){
        return adminService.removeAdmin(admin);
    }

    @RequestMapping("/{adminId}/get_admin")
    @ResponseBody
    public ServerResponse getAdmin(@RequestParam(required = false) Integer page,@RequestParam(required = false) String status){
        return adminService.getAdmin(page,status);
    }

    @RequestMapping("/{adminId}/query_admin")
    public ServerResponse queryAdmin(Integer page,Admin admin){
        return adminService.queryAdmin(admin,page);
    }
}
