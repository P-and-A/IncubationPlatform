package com.incubationplatform.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.collect.Lists;
import com.incubationplatform.common.Const;
import com.incubationplatform.common.ServerResponse;
import com.incubationplatform.pojo.Sort;
import com.incubationplatform.dao.SortDao;
import com.incubationplatform.service.ISortService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lcf
 * @since 2019-06-26
 */
@Service
public class SortServiceImpl extends ServiceImpl<SortDao, Sort> implements ISortService {
    @Autowired
    private SortDao sortDao;

    /**
     * 置顶
     * @param classification
     * @param projectId
     * @return
     */
    public ServerResponse toTop(String classification,String projectId){
        Map<String,Object> columMap = new HashMap<>();
        columMap.put("classification", classification);
        Sort sort = sortDao.selectById(projectId);
        if (sort == null){
            return ServerResponse.createByError();
        }
        List<Sort> sortList = sortDao.selectList(new QueryWrapper<Sort>().orderByDesc("order"));
        for (Sort item : sortList){
            if (item.getOrder() > sort.getOrder()){
                item.setOrder(item.getId()-1);
            }else if (item.getOrder() < sort.getOrder()){
                item.setOrder(item.getOrder()+1);
            }else {
                item.setOrder(1);
            }
            sortDao.updateById(item);
        }
        return ServerResponse.createBySuccess("置顶成功");
    }

    public ServerResponse addSort(Sort sort){
        int num = sortDao.selectCount(new QueryWrapper<Sort>().eq("classification",sort.getClassification()));
        if (num == 10){
            return ServerResponse.createByErrorMessage("增加失败");
        }
        sort.setOrder(num+1);
        int code = sortDao.insert(sort);
        if (code > 0){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByErrorMessage("增加失败");
    }

    public ServerResponse delSort(String classification,String projectId){
        Map<String,Object> columMap = new HashMap<>();
        columMap.put("classification", classification);
        Sort sort = sortDao.selectById(projectId);
        if (sort == null){
            return ServerResponse.createByError();
        }
        List<Sort> sortList = sortDao.selectList(new QueryWrapper<Sort>().orderByDesc("order"));
        for (Sort item : sortList){
            if (item.getOrder() > sort.getOrder()){
                item.setOrder(item.getId()-1);
                sortDao.updateById(item);
            }else if (item.getOrder() == sort.getOrder()){
                sortDao.deleteById(item.getId());
            }
        }
        return ServerResponse.createBySuccess("置顶成功");
    }
}
