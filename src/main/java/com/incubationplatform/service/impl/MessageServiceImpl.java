package com.incubationplatform.service.impl;

import com.incubationplatform.pojo.Message;
import com.incubationplatform.dao.MessageDao;
import com.incubationplatform.service.IMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lcf
 * @since 2019-02-28
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageDao, Message> implements IMessageService {

}
