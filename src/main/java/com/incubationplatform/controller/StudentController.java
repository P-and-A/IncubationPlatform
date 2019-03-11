package com.incubationplatform.controller;


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
    @RequestMapping("/login")
    public String login(){
        return "login";
    }



}

