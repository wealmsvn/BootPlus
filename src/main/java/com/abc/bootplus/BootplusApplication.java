package com.abc.bootplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@MapperScan("com.abc.bootplus.dao")
@SpringBootApplication
public class BootplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootplusApplication.class, args);
    }

}
