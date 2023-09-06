package com.psbc.dams.classification.framework.web.service;

import com.psbc.dams.classification.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.psbc.dams.classification.system.service.ISysConfigService;

/**
 * classification首创 html调用 thymeleaf 实现参数管理
 * 
 * @author classification
 */
@Service
public class ConfigService
{
    @Autowired
    private ISysConfigService configService;

    /**
     * 根据键名查询参数配置信息
     * 
     * @param configKey 参数键名
     * @return 参数键值
     */
    public String getKey(String configKey)
    {
        return configService.selectConfigByKey(configKey);
    }
}
