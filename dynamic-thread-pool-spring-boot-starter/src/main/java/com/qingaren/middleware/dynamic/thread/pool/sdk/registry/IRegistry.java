package com.qingaren.middleware.dynamic.thread.pool.sdk.registry;

import com.qingaren.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

/**
 * @projectName: dynamic-thread-pool
 * @author: QingAren
 * @description: 接口注册中心
 * @github https://https://github.com/ABaiMate
 * @date: 2024-05-27 10:38
 */
public interface IRegistry {

    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);
}
