package com.incubationplatform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.incubationplatform.common.Const;
import com.incubationplatform.common.ResponseCode;
import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.dao.MessageDao;
import com.incubationplatform.dao.MessageVideoDao;
import com.incubationplatform.pojo.Link;
import com.incubationplatform.pojo.Message;
import com.incubationplatform.pojo.MessageVideo;
import com.incubationplatform.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liaochaofan
 * @date 2019/3/3 15:50
 */
@Service
public class HomeServiceImpl implements IHomeService {
    @Autowired
    private MessageDao messageDao;
    @Autowired
    private MessageVideoDao messageVideoDao;
    public ServerResponse<List<Message>> getMessage(){
        Map<String,Object> columMap = new HashMap<>();
        columMap.put("classification", Const.MessageClassification.ANNOUNCEMENTS);
        List<Message> messageList = messageDao.selectByMap(columMap);
        if (messageList.size() > 0){
            return ServerResponse.createBySuccess(messageList);
        }
        return ServerResponse.createByErrorMessage("出错信息");
    }

    public ServerResponse getAnnualMeetings(){
        List<MessageVideo> messageVideoList = messageVideoDao.selectList(new QueryWrapper<MessageVideo>()
                                                                            .orderByDesc("create_time"));
        if (messageVideoList.size() > 0){
            return ServerResponse.createBySuccess(messageVideoList);
        }
        return ServerResponse.createByErrorMessage("信息出错");
    }
}
