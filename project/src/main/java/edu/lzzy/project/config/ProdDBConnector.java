package edu.lzzy.project.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Prod")
public class ProdDBConnector implements DBconnector{


    @Override
    public void configgure() {
        System.out.println("数据库配置环境 prod");
    }
}
