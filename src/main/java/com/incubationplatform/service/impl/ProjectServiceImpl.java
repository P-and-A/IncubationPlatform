package com.incubationplatform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.incubationplatform.common.Const;
import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.dao.AdminDao;
import com.incubationplatform.dao.ProjectTecherDao;
import com.incubationplatform.dao.StudentProjectDao;
import com.incubationplatform.pojo.*;
import com.incubationplatform.dao.ProjectDao;
import com.incubationplatform.service.IProjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.incubationplatform.vo.ProjectExcelVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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

    @Autowired
    private StudentProjectDao studentProjectDao;

    @Autowired
    private ProjectTecherDao projectTecherDao;

    public ServerResponse reviewProject(Integer projectId, Integer adminId, String opinion, Integer status){
        Project project = projectDao.selectById(projectId);
        Admin admin = adminDao.selectById(adminId);
        if (admin != null){
            if (status == Const.ProjectStatus.CollegePass.getCode() || status == Const.ProjectStatus.CollegeNoPass.getCode()){
                project.setCollegeOpinionDetail(opinion);
                project.setCollegeOpinionHandlerTime(LocalDateTime.now());
                project.setCollegeOpinionHandler(admin.getName());
                project.setStatus(Const.ProjectStatus.getStatusByCode(status));
            }else if (status == Const.ProjectStatus.CollegePass.getCode() || status == Const.ProjectStatus.CollegeNoPass.getCode()){
                project.setUniversityOpinionDetail(opinion);
                project.setUniversityOpinionHandingTime(LocalDateTime.now());
                project.setUniversityOpinionHandler(admin.getName());
                project.setStatus(Const.ProjectStatus.getStatusByCode(status));
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

    public ServerResponse submitProject(Project project, List<String> team, List<String> teacherList){
        if (project != null){
            String uuid = UUID.randomUUID().toString();
            project.setId(uuid);
            int resultCount = projectDao.insert(project);
            if(resultCount == 0){
                return ServerResponse.createByErrorMessage("项目提交失败");
            }
            for (String studentId : team){
                uuid = UUID.randomUUID().toString();
                StudentProject studentProject = new StudentProject();
                studentProject.setId(uuid);
                studentProject.setUserId(studentId);
                studentProject.setProductId(project.getId());
                studentProject.setCreateTime(LocalDateTime.now());
                studentProjectDao.insert(studentProject);
            }
            for (String teacherId : teacherList){
                uuid = UUID.randomUUID().toString();
                ProjectTecher projectTecher = new ProjectTecher();
                projectTecher.setId(uuid);
                projectTecher.setTeacherId(teacherId);
                projectTecher.setProjectId(project.getId());
                projectTecher.setCreateTime(LocalDateTime.now());
                projectTecherDao.insert(projectTecher);
            }
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByErrorMessage("项目参数有误");
    }

    public ServerResponse getProjectByStatus(Integer page,Integer status){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("status",status);
        if (page!=null){
            IPage projects = projectDao.selectPage(new Page<>(page,10),queryWrapper);
            return ServerResponse.createBySuccess(projects);
        }else {
            IPage projects = projectDao.selectPage(new Page<>(1,10),queryWrapper);
            return ServerResponse.createBySuccess(projects);
        }
    }





//    QueryWrapper queryWrapper=new QueryWrapper<>().eq("is_enable",1);
//        queryWrapper.eq("is_enable",1);
//        if (page!=null){
//        IPage admins = adminDao.selectPage(new Page<>(page,10),queryWrapper);
//        return ServerResponse.createBySuccess(admins);
//    }else {
//        IPage admins = adminDao.selectPage(new Page<>(1,10),queryWrapper);
//        return ServerResponse.createBySuccess(admins);
//    }

    private List<ProjectExcelVo> assembleProjectExcelVos(){


        return null;
    }

}
