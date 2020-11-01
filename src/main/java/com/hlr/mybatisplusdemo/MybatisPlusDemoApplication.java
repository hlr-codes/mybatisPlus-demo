package com.hlr.mybatisplusdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springblade.core.tool.config.RedisTemplateConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//blade-core-tool中存在RedisTemplateConfiguration配置类，这里将它排除，否则会加载
@SpringBootApplication(exclude = RedisTemplateConfiguration.class)
@MapperScan("com.hlr.mybatisplusdemo.mapper")
public class MybatisPlusDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDemoApplication.class, args);
    }

}
