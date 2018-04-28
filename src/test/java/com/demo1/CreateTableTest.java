package com.demo1;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.junit.Test;

/**
 * @author yaoyuanliang
 * @date 2018/4/23
 */
public class CreateTableTest {
    /**
     * 使用框架提供的自动建表（提供配置文件）---配置文件activiti-context.xml可以从框架提供的例子程序中获取
     */
    @Test
    public void test1() {
        String resource = "activiti-context.xml";// 配置文件名称
        String beanName = "processEngineConfiguration";// 配置id值
        ProcessEngineConfiguration conf =ProcessEngineConfiguration
                .createProcessEngineConfigurationFromResource(resource,beanName);
        ProcessEngine processEngine =conf.buildProcessEngine();
    }
    /**
     * 使用框架提供的自动建表（使用配置文件）
     */
    @Test
    public void test3() {
        ProcessEngine processEngine =ProcessEngines.getDefaultProcessEngine();
    }
}
