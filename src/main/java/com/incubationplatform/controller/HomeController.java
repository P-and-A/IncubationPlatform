package com.incubationplatform.controller;

import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liaochaofan
 * @date 2019/3/3 15:44
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private IHomeService iHomeService;

    @RequestMapping("/message")
    @ResponseBody
    public ServerResponse getMessage(){
        return iHomeService.getMessage();
    }

    @RequestMapping("/annual_meeting")
    @ResponseBody
    public ServerResponse getAnnualMeetings(){
        return iHomeService.getAnnualMeetings();
    }

}
