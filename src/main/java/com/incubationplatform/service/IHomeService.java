package com.incubationplatform.service;

import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.pojo.Message;

import java.util.List;

/**
 * @author liaochaofan
 * @date 2019/3/3 15:51
 */
public interface IHomeService {
    public ServerResponse getHomeMessage();

    public ServerResponse<List<Message>> getMessage();

    public ServerResponse getAnnualMeetings();


}
