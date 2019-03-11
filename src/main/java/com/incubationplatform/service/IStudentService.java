package com.incubationplatform.service;

import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.pojo.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lcf
 * @since 2019-02-28
 */
public interface IStudentService extends IService<Student> {
    public ServerResponse getStudentById(String id);
    public ServerResponse updatePassword(Student student,String newPassword,String oldPassword);
    public ServerResponse updateStudentInfo(Student student);

}
