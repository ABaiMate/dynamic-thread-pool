package com.qingaren.middleware.dynamic.thread.pool.sdk.domain;

import com.qingaren.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @projectName: dynamic-thread-pool
 * @author: QingAren
 * @description: 动态线程池服务
 * @github https://https://github.com/ABaiMate
 * @date: 2024-05-26 10:38
 */

public interface IDynamicThreadPoolService {

    /**
     * @param :
      * @return List<ThreadPoolConfigEntity>
     * @author QingAren
     * @description 查询线程池集合
     * @date 2024-05-26 10:46
     */
    List<ThreadPoolConfigEntity> queryThreadPoolList();

    /**
     * @param threadPoolName:
      * @return ThreadPoolConfigEntity
     * @author QingAren
     * @description 通过名称查询线程池配置
     * @date 2024-05-26 10:48
     */
    ThreadPoolConfigEntity queryThreadPoolConfigByName(String threadPoolName);

    /**
     * @param threadPoolConfigEntity:
      * @return void
     * @author QingAren
     * @description 修改线程
     * @date 2024-05-26 10:49
     */
    void updateThreadPoolConfig(ThreadPoolConfigEntity threadPoolConfigEntity);
}
