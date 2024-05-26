package com.qingaren.middlewara.dynamic.thread.pool.sdk.config;

import com.qingaren.middlewara.dynamic.thread.pool.sdk.domain.DynamicThreadPoolService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @projectName: dynamic-thread-pool
 * @author: QingAren
 * @description: 动态配置入口
 * @github https://https://github.com/ABaiMate
 * @date: 2024-05-23 18:07
 */

@Configuration
public class DynamicThreadPoolAutoConfig {

    private final Logger logger = LoggerFactory.getLogger(DynamicThreadPoolAutoConfig.class);

    private String applicationName;

    // 拉取线程池
    @Bean("dynamicThreadPollService")
    public DynamicThreadPoolService dynamicThreadPollService(ApplicationContext applicationContext, Map<String, ThreadPoolExecutor> threadPoolExecutorMap){
        applicationName = applicationContext.getEnvironment().getProperty("spring.application.name");

        if(StringUtils.isBlank(applicationName)){
            applicationName = "缺省的";
            logger.warn("动态线程池，启动提示。SpringBoot 应用未配置 spring.application.name 无法获取到应用名称！");
        }



        return new DynamicThreadPoolService(applicationName, threadPoolExecutorMap);
    }
}
