package com.demo1;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;

/**
 * @author yaoyuanliang
 * @date 2018/4/23
 * 初始化工作流表结构
 */
public class ActCreateTable {
    public static void main(String[] args) {
        //创建一个流程引擎配置对象
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createStandaloneProcessEngineConfiguration();
        //配置数据源
        configuration.setJdbcDriver("com.mysql.jdbc.Driver");
        configuration.setJdbcUrl("jdbc:mysql://localhost:3306/activiti?useUnicode=true&characterEncoding=UTF-8");
        configuration.setJdbcUsername("root");
        configuration.setJdbcPassword("12345678");
        //设置自动建表
        /**
         public static final String DB_SCHEMA_UPDATE_FALSE = "false";不能自动创建表，需要表存在
         public static final String DB_SCHEMA_UPDATE_CREATE_DROP = "create-drop";先删除表再创建表
         public static final String DB_SCHEMA_UPDATE_TRUE = "true";如果表不存在，自动创建表
         */
        configuration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        //创建一个流程引擎对象，在创建流程引擎对象过程中会自动创建表
        ProcessEngine processEngine =configuration.buildProcessEngine();

        System.out.println("TEST " + "ActCreateTable.main");
    }
}
