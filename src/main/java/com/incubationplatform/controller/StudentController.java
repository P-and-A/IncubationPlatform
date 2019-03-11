package com.incubationplatform.controller;


import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.pojo.Student;
import com.incubationplatform.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lcf
 * @since 2019-02-28
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    @RequestMapping("/person")
    public ServerResponse getUserInfo(){
        Student user = (Student) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        ServerResponse serverResponse=iStudentService.getStudentById(user.getId());
        return serverResponse;
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }



    @RequestMapping("/person/submit")
    public ServerResponse updateUserInfo(Student student){
        Student user = (Student) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        student.setId(user.getId());
        iStudentService.updateStudentInfo(student);
        return null;
    }

    @RequestMapping("/student/change_password")
    public ServerResponse updateUserPassword(String newPassword,String oldPassword){
        Student user = (Student) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        iStudentService.updatePassword(user,newPassword,oldPassword);
        return null;
    }
}

