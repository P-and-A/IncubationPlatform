package com.incubationplatform.service;

import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.pojo.Project;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lcf
 * @since 2019-02-28
 */
public interface IProjectService extends IService<Project> {

    ServerResponse reviewProject(Integer projectId, Integer adminId, String opinion, Integer status);
}
