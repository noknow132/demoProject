package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description Springboot的启动类
 */
@SpringBootApplication
@ComponentScan("com.study")
public class Application {

    public static void main(String[]args){
        //一行代码即可启动服务。
        SpringApplication.run(Application.class,args);
    }
}
