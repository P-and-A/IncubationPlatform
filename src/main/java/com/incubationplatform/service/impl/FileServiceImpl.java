package com.incubationplatform.service.impl;

import com.incubationplatform.pojo.File;
import com.incubationplatform.dao.FileDao;
import com.incubationplatform.service.IFileService;
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
public class FileServiceImpl extends ServiceImpl<FileDao, File> implements IFileService {

}
