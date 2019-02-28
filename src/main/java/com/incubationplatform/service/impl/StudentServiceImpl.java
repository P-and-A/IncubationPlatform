package com.incubationplatform.service.impl;

import com.incubationplatform.pojo.Student;
import com.incubationplatform.dao.StudentDao;
import com.incubationplatform.service.IStudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements IStudentService {

}
