package com.ldl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ldl.dao")
public class SpringBootHandleUnifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHandleUnifyApplication.class, args);
    }

}
