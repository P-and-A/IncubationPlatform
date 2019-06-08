package com.incubationplatform.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.incubationplatform.common.Const;
import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.pojo.Message;
import com.incubationplatform.pojo.Project;
import com.incubationplatform.service.IMessageService;
import com.incubationplatform.service.IProjectService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author liaochaofan
 * @date 2019/6/1 18:19
 */
@Controller
@RequestMapping("/management/")
public class HomeManagementController {


    @Autowired
    private IMessageService iMessageService;

    @Autowired
    private IProjectService iProjectService;

    @GetMapping("/get_message")
    @ResponseBody
    public ServerResponse getMessagePage(@RequestParam(value = "current",defaultValue = "1") Integer current,
                                         @RequestParam(value = "size",defaultValue = "10") Integer size,
                                         String messageClassification){
        if(messageClassification.equals(Const.MessageClassification.ANNOUNCEMENTS)||
           messageClassification.equals(Const.MessageClassification.CHARACTER_STYLE)||
           messageClassification.equals(Const.MessageClassification.STUDY_SECTION)){
            IPage<Message> messageIPage = iMessageService.page(new Page<Message>(current,size),
                    new QueryWrapper<Message>()
                            .eq("classification", messageClassification)
                            .orderByDesc("create_time"));
            return ServerResponse.createBySuccess(messageIPage);
        }
        return ServerResponse.createByError();
    }

    @GetMapping("/del_message")
    @ResponseBody
    public ServerResponse deleteMessage(String messageId){
        if(iMessageService.removeById(messageId)){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }

    @PostMapping("/update_message")
    @ResponseBody
    public ServerResponse update(Message message){
        if (StringUtils.isBlank(message.getId())){
            return ServerResponse.createByErrorMessage("id不存在");
        }
        if (iMessageService.updateById(message)){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByErrorMessage("更新失败");
    }

    @GetMapping("/message_detail")
    @ResponseBody
    public ServerResponse getMessageDetail(String messageId){
        Message message = iMessageService.getById(messageId);
        if (message != null){
            return ServerResponse.createBySuccess(message);
        }
        return ServerResponse.createByErrorMessage("无法找到");
    }




    @GetMapping("/get_project")
    @ResponseBody
    public ServerResponse getProjectPage(@RequestParam(value = "current",defaultValue = "1") Integer current,
                                         @RequestParam(value = "size",defaultValue = "10") Integer size,
                                         String projectClassification){
        if(projectClassification.equals(Const.ProjectClassification.EXCELLENT_INNOVATE)||
                projectClassification.equals(Const.ProjectClassification.EXCELLENT_PRACTICE)||
                projectClassification.equals(Const.ProjectClassification.EXCELLENT_VENTURE)){
            IPage<Project> projectIPage = iProjectService.page(new Page<Project>(current,size),
                    new QueryWrapper<Project>()
                            .eq("classification", projectClassification)
                            .orderByDesc("create_time"));
            return ServerResponse.createBySuccess(projectIPage);
        }
        return ServerResponse.createByError();
    }

    @GetMapping("/del_project")
    @ResponseBody
    public ServerResponse deleteProject(String projectId){
        if(iMessageService.removeById(projectId)){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }

    @PostMapping("/update_project")
    @ResponseBody
    public ServerResponse update(Project projcet){
        if (StringUtils.isBlank(projcet.getId())){
            return ServerResponse.createByErrorMessage("id不存在");
        }
        if (iProjectService.updateById(projcet)){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByErrorMessage("更新失败");
    }

    @GetMapping("/project_detail")
    @ResponseBody
    public ServerResponse getProjectDetail(String projectId){
        Project project = iProjectService.getById(projectId);
        if (project != null){
            return ServerResponse.createBySuccess(project);
        }
        return ServerResponse.createByErrorMessage("无法找到");
    }
}
