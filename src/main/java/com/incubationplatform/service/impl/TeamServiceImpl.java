package com.incubationplatform.service.impl;

import com.incubationplatform.pojo.Team;
import com.incubationplatform.dao.TeamDao;
import com.incubationplatform.service.ITeamService;
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
public class TeamServiceImpl extends ServiceImpl<TeamDao, Team> implements ITeamService {

}
