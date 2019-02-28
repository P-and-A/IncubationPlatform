package com.incubationplatform.service.impl;

import com.incubationplatform.pojo.Admin;
import com.incubationplatform.dao.AdminDao;
import com.incubationplatform.service.IAdminService;
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
public class AdminServiceImpl extends ServiceImpl<AdminDao, Admin> implements IAdminService {

}
