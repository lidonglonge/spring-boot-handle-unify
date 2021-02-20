package com.ldl.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ldl.dao.UserinfoDao;
import com.ldl.entity.UserinfoEntity;
import com.ldl.service.UserinfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lidonglonge@163.com
 * @since 2021-02-02
 */
@Slf4j
@Service
public class UserinfoServiceImpl extends ServiceImpl<UserinfoDao, UserinfoEntity> implements UserinfoService {

    @Resource
    private UserinfoDao userinfoDao;

    @Override
    public List<UserinfoEntity> ifThereIsA(UserinfoEntity userinfoEntity) {
        Map<String, String> userinfoEntityMap = new HashMap<>();
        userinfoEntityMap.put("username", userinfoEntity.getUsername());
        userinfoEntityMap.put("userphone", userinfoEntity.getUserphone());
        userinfoEntityMap.put("wxnum", userinfoEntity.getWxnum());
        QueryWrapper<UserinfoEntity> userinfoEntityQueryWrapper = new QueryWrapper<UserinfoEntity>().allEq(userinfoEntityMap);
        List<UserinfoEntity> userinfoEntities = userinfoDao.selectList(userinfoEntityQueryWrapper);
        log.info("查询访客存在记录 :" +  userinfoEntities.toString());
        return userinfoEntities;
    }

    /**
     * 以最后修改登记时间倒序
     * @return
     */
    @Override
    public List<UserinfoEntity> list(){
        QueryWrapper<UserinfoEntity> userinfoEntityQueryWrapper = new QueryWrapper<UserinfoEntity>();
        userinfoEntityQueryWrapper.orderByDesc("updatatime");
        IPage<UserinfoEntity> page = new Page<>(1, 100);
        IPage<UserinfoEntity> pageEntity = page(page, userinfoEntityQueryWrapper);
        return pageEntity.getRecords();
    }
}
