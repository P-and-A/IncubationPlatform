package com.incubationplatform.controller;


import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.pojo.Student;
import com.incubationplatform.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

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
        ServerResponse serverResponse=iStudentService.updateStudentInfo(student);
        return serverResponse;
    }

    @RequestMapping("/student/change_password")
    public ServerResponse updateUserPassword(String newPassword,String oldPassword){
        Student user = (Student) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        ServerResponse serverResponse=iStudentService.updatePassword(user,newPassword,oldPassword);
        return serverResponse;
    }
}

