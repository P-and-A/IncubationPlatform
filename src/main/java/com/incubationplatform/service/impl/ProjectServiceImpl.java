package com.incubationplatform.service.impl;

import com.incubationplatform.pojo.Project;
import com.incubationplatform.dao.ProjectDao;
import com.incubationplatform.service.IProjectService;
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
public class ProjectServiceImpl extends ServiceImpl<ProjectDao, Project> implements IProjectService {

}
