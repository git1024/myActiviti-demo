package com.demo11;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author yaoyuanliang
 * @date 2018/4/28
 */
public class ReceiveTaskTest {

    ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
    /**部署流程定义（从inputStream）*/
    @Test
    public void deploymentProcessDefinition_inputStream(){

        InputStream inputStreamBpmn = this.getClass().getResourceAsStream("/receiveTask/receiveTask.bpmn");
        InputStream inputStreamPng = this.getClass().getResourceAsStream("/receiveTask/receiveTask.png");
        Deployment deployment = processEngine.getRepositoryService()//与流程定义和部署对象相关的Service
                .createDeployment()//创建一个部署对象
                .name("接收活动任务")//添加部署的名称
                .addInputStream("receiveTask.bpmn", inputStreamBpmn)//
                .addInputStream("receiveTask.png", inputStreamPng)//
                .deploy();//完成部署
        System.out.println("部署ID："+deployment.getId());//
        System.out.println("部署名称："+deployment.getName());//
    }




}
