package com.incubationplatform.dao;

import com.incubationplatform.pojo.Message;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lcf
 * @since 2019-02-27
 */
@Mapper
public interface MessageMapper extends BaseMapper<Message> {

}
