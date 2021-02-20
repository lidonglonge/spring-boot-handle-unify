package com.ldl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ldl.entity.UserinfoEntity;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lidonglonge@163.com
 * @since 2021-02-02
 */
public interface UserinfoService extends IService<UserinfoEntity> {

    /**
     * 查询条件是否是新的登记人
     * @param userinfoEntity
     * @return 返回查询结果
     */
    public List<UserinfoEntity> ifThereIsA(UserinfoEntity userinfoEntity);


}
