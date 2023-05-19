package com.dme.modules.entrance;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author shang
 * @date 2023-05-19-20:37
 */
@ComponentScan(value = "com.dme.modules")
@MapperScan(value = "com.dme.modules.dao")
@SpringBootApplication
public class EentranceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EentranceApplication.class, args);
    }
}
