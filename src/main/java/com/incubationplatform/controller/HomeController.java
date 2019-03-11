package com.incubationplatform.controller;

import com.incubationplatform.common.Const;
import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.service.IHomeService;
import com.incubationplatform.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liaochaofan
 * @date 2019/3/3 15:44
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private IHomeService iHomeService;

    @Autowired
    private IMessageService iMessageService;

    @RequestMapping("")
    @ResponseBody
    public ServerResponse home(){
        return iHomeService.getHomeMessage();
    }

    @RequestMapping("/message")
    @ResponseBody
    public ServerResponse getMessage(){
        return iHomeService.getMessage();
    }

    @RequestMapping("/new")
    @ResponseBody
    public ServerResponse getNew(){
        Map<String,Object> messageCondition = new HashMap<>();
        messageCondition.put("classification", Const.MessageClassification.NEW);
        return ServerResponse.createBySuccess(iMessageService.listByMap(messageCondition));
    }

    @RequestMapping("/annual_meeting")
    @ResponseBody
    public ServerResponse getAnnualMeetings(){
        return iHomeService.getAnnualMeetings();
    }

}
