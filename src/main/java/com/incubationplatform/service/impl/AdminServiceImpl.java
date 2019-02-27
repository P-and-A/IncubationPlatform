package com.incubationplatform.service.impl;

import com.incubationplatform.pojo.Admin;
import com.incubationplatform.dao.AdminMapper;
import com.incubationplatform.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lcf
 * @since 2019-02-27
 */
@Service("iAdminService")
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
