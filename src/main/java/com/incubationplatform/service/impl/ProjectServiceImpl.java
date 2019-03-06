package com.incubationplatform.service.impl;

import com.incubationplatform.common.Const;
import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.dao.AdminDao;
import com.incubationplatform.pojo.Admin;
import com.incubationplatform.pojo.Project;
import com.incubationplatform.dao.ProjectDao;
import com.incubationplatform.service.IProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;
import java.util.Date;

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
    @Autowired
    private ProjectDao projectDao;

    @Autowired
    private AdminDao adminDao;

    public ServerResponse reviewProject(Integer projectId, Integer adminId, String opinion, Integer status){
        Project project = projectDao.selectById(projectId);
        Admin admin = adminDao.selectById(adminId);
        if (admin != null){
            if (status == Const.ProjectStatus.CollegePass.getCode() || status == Const.ProjectStatus.CollegeNoPass.getCode()){
                project.setCollegeOpinionDetail(opinion);
                project.setCollegeOpinionHandlerTime(LocalDateTime.now());
                project.setCollegeOpinionHandler(admin.getName());
            }else if (status == Const.ProjectStatus.CollegePass.getCode() || status == Const.ProjectStatus.CollegeNoPass.getCode()){
                project.setUniversityOpinionDetail(opinion);
                project.setUniversityOpinionHandingTime(LocalDateTime.now());
                project.setUniversityOpinionHandler(admin.getName());
            }else {
                return ServerResponse.createByErrorMessage("项目状态无效");
            }
            int resultCount = projectDao.insert(project);
            if (resultCount > 0){
                return ServerResponse.createBySuccessMessage("审核状态保存成功");
            }
            return ServerResponse.createBySuccessMessage("审核状态保存失败");
        }
        return ServerResponse.createByErrorMessage("此管理员不存在");
    }


}
