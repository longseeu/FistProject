package edu.lzzy.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestDBConnector implements DBconnector{


    @Override
    public void configgure() {
        System.out.println("数据库配置环境 test");
    }
}
