package com.vcautotest.datacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Joie Chen 2019/07/24
 */
@EnableSwagger2
@SpringBootApplication
public class TestdatacenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestdatacenterApplication.class, args);
    }
}
