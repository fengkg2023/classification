package com.psbc.dams.classification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * 启动程序
 * , MongoAutoConfiguration.class
 * @author classification
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class})
@EnableAsync
@ComponentScan("com")
public class ClassificationApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        ConfigurableApplicationContext context = SpringApplication.run(ClassificationApplication.class, args);
        printKeyLoadMessage(context);
    }

    /**
     * 获取Key加载信息
     */
    public static boolean printKeyLoadMessage(ConfigurableApplicationContext context) {
        ConfigurableEnvironment environment = context.getEnvironment();
        // 项目端口
        String port = environment.getProperty("server.port");
        // 项目路径
        String contextPath = environment.getProperty("server.servlet.context-path");
        // 项目名称
        // String projectFinalName = environment.getProperty("server.servlet.context-path");
        return true;
    }


    public static void printInitBean(ConfigurableApplicationContext context){
        // 打印所有的Bean
        // String[] beanNames = context.getBeanDefinitionNames();
        // 打印所有添加该注解的bean
        String[] beanNames = context.getBeanNamesForAnnotation(Component.class);
        System.out.println("bean总数:{}"+context.getBeanDefinitionCount());
        int i = 0;
        for (String str : beanNames) {
            System.out.println("{},beanName:{}"+(++i)+str);
        }
    }
}